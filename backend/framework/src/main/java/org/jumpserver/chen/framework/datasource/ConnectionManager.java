package org.atherlock.chen.framework.datasource;

import org.atherlock.chen.framework.datasource.entity.DBConnectInfo;
import org.atherlock.chen.framework.datasource.sql.SQLActuator;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionManager {
    String getDriverClassName();
    void ping() throws SQLException;

    String getVersion() throws SQLException;

    String getJDBCUrl();

    String getDisplayJDBCUrl();

    String getJDBCUrl(String database);

    void setDatabaseContext(String database);

    Datasource getDatasource();

    DBConnectInfo getConnectInfo();

    Connection getConnection() throws SQLException;

    Connection getPhysicalConnection() throws SQLException;

    SQLActuator getSqlActuator();

    String getContextKey();

    void close();
}
