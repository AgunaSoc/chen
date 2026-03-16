package org.atherlock.chen.framework.console.action;

import lombok.Data;

@Data
public abstract class Action {
    private String action;
    private String dataView;
    private Object data;
}
