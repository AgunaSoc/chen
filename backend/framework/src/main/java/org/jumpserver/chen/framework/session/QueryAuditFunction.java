package org.atherlock.chen.framework.session;


import org.atherlock.chen.framework.datasource.sql.SQLQueryResult;

import java.sql.SQLException;

@FunctionalInterface
public interface QueryAuditFunction {
    SQLQueryResult run() throws SQLException;

}
