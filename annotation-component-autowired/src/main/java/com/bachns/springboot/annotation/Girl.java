package com.bachns.springboot.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("girl")
public class Girl {

    public Girl(@Qualifier("naked") Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit outfit;

}
