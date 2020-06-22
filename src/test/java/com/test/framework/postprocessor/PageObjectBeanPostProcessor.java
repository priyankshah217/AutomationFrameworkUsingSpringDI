package com.test.framework.postprocessor;

import com.test.framework.annotations.PageObject;
import com.test.framework.pages.IWebDriverAware;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PageObjectBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, @NotNull String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(PageObject.class) && bean instanceof IWebDriverAware) {
            PageFactory.initElements(((IWebDriverAware) bean).getWebDriver(), bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(@NotNull Object bean, @NotNull String beanName) throws BeansException {
        return bean;
    }
}