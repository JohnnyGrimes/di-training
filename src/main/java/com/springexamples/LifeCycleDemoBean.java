package com.springexamples;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by johnnyGrimes on 17/02/2018.
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is " + s);
    }

    @Override
    public void destroy() throws Exception {

        System.out.println("## The lifecycle bean has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("## Lifecycle bean has its properties set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("## Application context has been set");

    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The post construct annoted method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The predestroy annoted method has been called");
    }

    public void beforeInit() {
        System.out.println("## Before init - called by bean post processor");
    }

    public void afterInit() {
        System.out.println("## After init - called by bean post processor");
    }
}
