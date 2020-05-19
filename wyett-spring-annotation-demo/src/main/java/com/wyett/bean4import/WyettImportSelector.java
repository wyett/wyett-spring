package com.wyett.bean4import;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/19 17:47
 * @description: TODO
 */

public class WyettImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.wyett.conditional.component.Dog"};
    }
}
