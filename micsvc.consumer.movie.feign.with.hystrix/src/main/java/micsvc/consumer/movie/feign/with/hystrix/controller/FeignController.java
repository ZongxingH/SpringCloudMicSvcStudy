package micsvc.consumer.movie.feign.with.hystrix.controller;

import micsvc.consumer.movie.feign.with.hystrix.client.UserFeignHystrixClient;
import micsvc.consumer.movie.feign.with.hystrix.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.consumer.movie.feign.controller
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 13:37
 */
@RestController
public class FeignController {
    @Autowired
    private UserFeignHystrixClient userFeignHystrixClient;
    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignHystrixClient.findByIdFeign(id);
        return user;
    }
}
