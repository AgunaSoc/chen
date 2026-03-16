package org.atherlock.chen.modules.dameng;

import com.alibaba.druid.DbType;
import org.atherlock.chen.framework.datasource.DatasourceFactory;
import org.atherlock.chen.framework.datasource.base.BaseDatasource;
import org.atherlock.chen.framework.datasource.entity.DBConnectInfo;

public class DMDatasource extends BaseDatasource {

    static {
        DatasourceFactory.Register(DMDatasource.class);
    }

    public DMDatasource(DBConnectInfo dbConnectInfo) {
        this.connectionManager = new DMConnectionManager(dbConnectInfo, this);
        this.resourceBrowser = new DMResourceBrowser(this.connectionManager);
        this.actionHandler = new DMActionHandler();
    }

    @Override
    public String getName() {
        return "dameng";
    }


    @Override
    public DbType getDruidDbType() {
        return DbType.dm;
    }
}
