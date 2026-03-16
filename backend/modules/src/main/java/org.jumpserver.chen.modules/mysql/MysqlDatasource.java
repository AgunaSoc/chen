package org.atherlock.chen.modules.mysql;

import com.alibaba.druid.DbType;
import org.atherlock.chen.framework.datasource.DatasourceFactory;
import org.atherlock.chen.framework.datasource.base.BaseDatasource;
import org.atherlock.chen.framework.datasource.entity.DBConnectInfo;

public class MysqlDatasource extends BaseDatasource {

    static {
        DatasourceFactory.Register(MysqlDatasource.class);
    }

    public MysqlDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new MysqlConnectionManager(dbConnectInfo, this);
        this.resourceBrowser = new MysqlResourceBrowser(this.connectionManager);
        this.actionHandler = new MysqlActionHandler();
    }

    @Override
    public String getName() {
        return "mysql";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.mysql;
    }
}
