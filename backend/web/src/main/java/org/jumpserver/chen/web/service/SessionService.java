package org.atherlock.chen.web.service;


import org.atherlock.chen.framework.session.Session;

public interface SessionService {
    Session createNewSession(String token,String remoteAddr);
}
