package com.java.java8.structural.facade.email;

import com.java.java8.structural.facade.email.Template.TemplateType;

public class TemplateFactory {

    public static Template createTemplateFor(TemplateType type) {
        switch (type) {
            case Email:
                return new OrderEmailTemplate();
            default:
                throw new IllegalArgumentException("Unknown TemplateType");
        }

    }
}
