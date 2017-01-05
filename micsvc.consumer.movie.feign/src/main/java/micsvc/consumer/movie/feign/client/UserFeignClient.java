package micsvc.consumer.movie.feign.client;

import micsvc.consumer.movie.feign.entities.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Introduction:  使用@FeignClient("microservice-provider-user")
 *                注解绑定microserice-provider-user服务，还可以使用url参数指定一个URL。
 * Package Name:  micsvc.consumer.movie.feign.client
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 13:34
 */
@FeignClient(name = "micsvc-provider-user")
public interface UserFeignClient {
    @RequestMapping("/{id}")
    public User findByIdFeign(@RequestParam("id") Long id);
}
