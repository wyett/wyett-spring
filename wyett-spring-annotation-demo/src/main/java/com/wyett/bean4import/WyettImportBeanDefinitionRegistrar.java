package com.wyett.bean4import;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 17:59
 * @description: TODO
 */

public class WyettImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBean = new RootBeanDefinition("Cat.class");
        registry.registerBeanDefinition("cat", rootBean);

    }
}
