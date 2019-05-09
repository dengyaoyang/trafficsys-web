package com.cecgw.cq.trafficsys.trafficsysweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;


/**
 * @author yydeng
 * @version V1.0
 * @since 2019-05-09
 */
@Configuration
public class ThymeleafConfig {

    /**
     * 设置视图解析器
     * @param templateEngine
     * @return
     */
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine);
        resolver.setCharacterEncoding("utf-8");
        return resolver;
    }


}
