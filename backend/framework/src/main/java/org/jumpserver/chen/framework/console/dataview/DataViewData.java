package org.atherlock.chen.framework.console.dataview;

import lombok.Data;
import org.atherlock.chen.framework.datasource.entity.resource.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
public class DataViewData {
    private List<Map<String, Object>> data = new ArrayList<>();
    private List<Field> fields = new ArrayList<>();
}
