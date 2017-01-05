package micsvc.consumer.movie.ribbon.svc;

import micsvc.consumer.movie.ribbon.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.consumer.movie.ribbon.svc
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 12:22
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    public User findById(Long id) {
        // http://服务提供者的serviceId/url
        return this.restTemplate.getForObject("http://micsvc-provider-user/" + id, User.class);
    }
}
