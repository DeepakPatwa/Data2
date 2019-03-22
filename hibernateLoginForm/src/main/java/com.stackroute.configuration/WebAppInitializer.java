package com.stackroute.configuration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[]{ApplicationContextConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class[]{WebMvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }
}

