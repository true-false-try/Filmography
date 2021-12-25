package com.project.filmography.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// Class which finds and representation components
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.project.filmography")
public class WebConfig {

    /**
     * Find representation in the package "webapp"
     * @return viewResolver it's a representation like "films.jsp" and "editPage.jsp"
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
