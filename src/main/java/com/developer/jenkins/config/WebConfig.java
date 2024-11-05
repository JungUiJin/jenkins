package com.developer.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:30000")
                /* Ingress 설정 시 단일 진입점을 사용하므로 CORS 처리가 불필요함.
                *  다만 다른 CORS 처리가 필요할 가능성을 염두에 두고 코드만 남겨놓았음. */
                .allowedOrigins()
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
    }
}
