package micsvc.consumer.movie.ribbon.controller;

import micsvc.consumer.movie.ribbon.entities.User;
import micsvc.consumer.movie.ribbon.svc.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.consumer.movie.ribbon.controller
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 12:24
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;
    @GetMapping("/ribbon/{id}")
    public User findById(@PathVariable Long id) {
        return this.ribbonService.findById(id);
    }
}
