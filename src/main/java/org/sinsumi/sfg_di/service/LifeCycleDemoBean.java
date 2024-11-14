package org.sinsumi.sfg_di.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.sinsumi.sfg_di.annotations.CustomMarker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public LifeCycleDemoBean() {
        System.out.println("In Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Setting Bean Name in BeanNameAware");

    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Setting Bean Factory in BeanFactoryAware");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Setting App Context Name in AppContextAware");
    }

    //Needs a custom class implementing BeanPostProcessor
    public void beforeInit(){
        System.out.println("In PreInitialization of BeanPostProcessor using CustomBeanProcessor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("In PostConstruct Method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet of InitializingBean");
    }

    //Needs a custom class implementing BeanPostProcessor
    public void afterInit(){
        System.out.println("In PostInitialization of BeanPostProcessor using CustomBeanProcessor");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println("In PreDistroy Method");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("In distroy of DisposableBean");
    }

}
