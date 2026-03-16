package org.atherlock.chen.framework.console.dataview.export;

import org.atherlock.chen.framework.console.dataview.DataViewData;

public interface DataExportInterface {
    void exportData(String path, DataViewData data) throws Exception;
}