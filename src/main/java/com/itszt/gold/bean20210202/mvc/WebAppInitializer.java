package com.itszt.gold.bean20210202.mvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**父容器***/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
   /***SpringMVC配置子容器**/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }
   /**获取DispatcherServlet的映射信息***/
   @Override
    protected String[] getServletMappings() {
        return new String[0];
    }


}
