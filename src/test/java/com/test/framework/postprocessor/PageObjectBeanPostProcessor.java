package com.test.framework.postprocessor;

import com.test.framework.annotations.PageObject;
import com.test.framework.lib.DriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PageObjectBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private DriverFactory driverFactory;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(PageObject.class)) {
            PageFactory.initElements(driverFactory.getDriver(), bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        if (bean.getClass().isAnnotationPresent(PageObject.class)) {
//            PageFactory.initElements(new AppiumFieldDecorator(driverFactory.getDriver()), bean);
//        }
        return bean;
    }
}