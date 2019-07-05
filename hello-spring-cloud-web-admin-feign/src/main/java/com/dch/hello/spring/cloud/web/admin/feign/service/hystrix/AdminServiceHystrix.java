package com.dch.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.dch.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * 微服务熔断器开启
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return String.format("Hi you message is %s but request is bad", message);
    }
}
