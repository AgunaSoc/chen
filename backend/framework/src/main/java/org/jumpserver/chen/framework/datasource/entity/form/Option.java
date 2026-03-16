package org.atherlock.chen.framework.datasource.entity.form;


import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Option {
    private String label;
    private Object value;
}
