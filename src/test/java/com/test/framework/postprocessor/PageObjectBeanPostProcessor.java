package com.test.framework.postprocessor;

import com.test.framework.annotations.PageObject;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PageObjectBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private WebDriver webDriver;

    @Override
    public Object postProcessBeforeInitialization(Object bean, @NotNull String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(PageObject.class)) {
            PageFactory.initElements(webDriver, bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(@NotNull Object bean, @NotNull String beanName) throws BeansException {
        return bean;
    }
}