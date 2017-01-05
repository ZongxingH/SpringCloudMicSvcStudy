package micsvc.consumer.movie.feign.with.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.consumer.movie.feign
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 12:46
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MovieFeignWithHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieFeignWithHystrixApplication.class, args);
    }
}
