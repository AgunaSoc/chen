package org.atherlock.chen.modules.postgresql;

import com.alibaba.druid.DbType;
import org.atherlock.chen.framework.datasource.DatasourceFactory;
import org.atherlock.chen.framework.datasource.base.BaseDatasource;
import org.atherlock.chen.framework.datasource.entity.DBConnectInfo;

public class PostgresqlDatasource extends BaseDatasource {

    static {
        DatasourceFactory.Register(PostgresqlDatasource.class);
    }

    public PostgresqlDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new PostgresqlConnectionManager(dbConnectInfo, this);
        this.resourceBrowser = new PostgresqlResourceBrowser(this.connectionManager);
        this.actionHandler = new PostgresqlActionHandler();
    }

    @Override
    public String getName() {
        return "postgresql";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.postgresql;
    }
}
