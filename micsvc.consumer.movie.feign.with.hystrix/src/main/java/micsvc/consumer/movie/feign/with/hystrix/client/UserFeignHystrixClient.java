package micsvc.consumer.movie.feign.with.hystrix.client;

import micsvc.consumer.movie.feign.with.hystrix.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Introduction:  在Feign中使用Hystrix是非常简单的事情，因为Feign已经集成了Hystrix。我们使用
 *                microservice-consumer-movie-feign-with-hystrix项目的代码做一点修改，将其中的
 *                UserClient.java修改为如下即可
 * Package Name:  micsvc.consumer.movie.feign.client
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 13:34
 */
@FeignClient(name = "micsvc-provider-user", fallback = UserFeignHystrixClient.HystrixClientFallback.class)
public interface UserFeignHystrixClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
    /**
     * 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类
     放入Feign的接口中，当然也可以单独写一个fallback类。
     * @author eacdy
     */
    @Component
    static class HystrixClientFallback implements UserFeignHystrixClient {
        private static final Logger LOGGER = LoggerFactory.getLogger
                (HystrixClientFallback.class);
        /**
         * hystrix fallback方法
         * @param id id
         * @return 默认的用户
         */
        @Override
        public User findByIdFeign(Long id) {
            HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
                    User user = new User();
            user.setId(-1L);
            user.setUsername("default username");
            user.setAge(0);
            return user;
        }
    }
}
