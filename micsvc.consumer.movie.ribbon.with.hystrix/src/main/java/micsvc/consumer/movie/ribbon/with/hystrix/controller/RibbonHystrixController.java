package micsvc.consumer.movie.ribbon.with.hystrix.controller;

import micsvc.consumer.movie.ribbon.with.hystrix.entities.User;
import micsvc.consumer.movie.ribbon.with.hystrix.hystrix.RibbonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.consumer.movie.ribbon.with.hystrix.controller
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 14:07
 */
@RestController
public class RibbonHystrixController {
    @Autowired
    private RibbonHystrixService ribbonHystrixService;
    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonHystrixService.findById(id);
    }
}
