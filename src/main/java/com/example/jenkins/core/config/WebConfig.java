package com.example.jenkins.core.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.format.datetime.standard.DateTimeFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Manu on 8/3/2018.
 */
public class WebConfig implements WebMvcConfigurer {


    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/*.js/**").addResourceLocations("/static/");
        registry.addResourceHandler("/*.css/**").addResourceLocations("/static/");
        registry.addResourceHandler("/*.jpg/**").addResourceLocations("/static/");
        registry.addResourceHandler("/*.gif/**").addResourceLocations("/static/");
        registry.addResourceHandler("/*.png/**").addResourceLocations("/static/");
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/dashboard").setViewName("dashboard");
        registry.addViewController("/").setViewName("redirect:/dashboard");
    }
    @Bean(name = "validator")
    public javax.validation.Validator localValidatorFactoryBean() {
        return new LocalValidatorFactoryBean();
    }

    @Bean
    public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        return factory;
    }


    @Bean
    public FormattingConversionService conversionService() {
        DefaultFormattingConversionService conversionService =
                new DefaultFormattingConversionService(false);
        DateTimeFormatterRegistrar registrar = new DateTimeFormatterRegistrar();
        registrar.setUseIsoFormat(true);
//        registrar.setDateFormatter(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        registrar.setDateTimeFormatter(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"));
        registrar.registerFormatters(conversionService);
        return conversionService;
    }
}
