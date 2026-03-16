package org.atherlock.chen.modules.mariadb;

import org.atherlock.chen.framework.datasource.ConnectionManager;
import org.atherlock.chen.modules.mysql.MysqlResourceBrowser;


public class MariaDBResourceBrowser extends MysqlResourceBrowser {

    public MariaDBResourceBrowser(ConnectionManager connectionManager) {
        super(connectionManager);
    }
}
