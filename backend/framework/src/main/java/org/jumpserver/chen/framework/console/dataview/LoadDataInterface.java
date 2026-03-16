package org.atherlock.chen.framework.console.dataview;

import org.atherlock.chen.framework.datasource.sql.SQLQueryParams;
import org.atherlock.chen.framework.datasource.sql.SQLQueryResult;

import java.sql.SQLException;

@FunctionalInterface
public interface LoadDataInterface {
    SQLQueryResult loadData(SQLQueryParams params) throws SQLException;
}
