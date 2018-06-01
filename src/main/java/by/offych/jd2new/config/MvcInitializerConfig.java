package by.offych.jd2new.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcInitializerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    public MvcInitializerConfig() {
        super();
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return super.createRootApplicationContext();
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        return super.createServletApplicationContext();
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ApplicationConfiguration.class};
    }
}
