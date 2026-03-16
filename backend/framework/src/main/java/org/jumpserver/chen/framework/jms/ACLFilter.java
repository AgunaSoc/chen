package org.atherlock.chen.framework.jms;

import org.atherlock.chen.framework.jms.acl.ACLResult;

import java.sql.Connection;

public interface ACLFilter {
    ACLResult commandACLFilter(String command, Connection connection);
}
