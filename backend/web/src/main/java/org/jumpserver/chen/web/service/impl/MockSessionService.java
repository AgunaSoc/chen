package org.atherlock.chen.web.service.impl;

import org.atherlock.chen.framework.datasource.DatasourceFactory;
import org.atherlock.chen.framework.session.Session;
import org.atherlock.chen.framework.session.impl.BaseSession;
import org.atherlock.chen.web.config.MockConfig;
import org.atherlock.chen.web.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MockSessionService implements SessionService {

    @Autowired
    private MockConfig mockConfig;

    @Override
    public Session createNewSession(String token, String remoteAddr) {
        var dbType = token != null ? token.toLowerCase() : "mysql";
        var connectInfo = mockConfig.getMockDBInfo(dbType);
        var ds = DatasourceFactory
                .fromConnectInfo(connectInfo);
        return new BaseSession(ds, remoteAddr);
    }
}
