package moe.echo.grainmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages =  "moe.echo.grainmall.user.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GrainmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallUserApplication.class, args);
    }

}
