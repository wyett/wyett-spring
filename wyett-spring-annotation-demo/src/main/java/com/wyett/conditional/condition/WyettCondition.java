package com.wyett.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 16:48
 * @description: TODO
 */

public class WyettCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getBeanFactory().containsBean("person") ? true : false;
    }
}
