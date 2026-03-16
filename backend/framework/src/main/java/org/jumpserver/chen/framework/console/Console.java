package org.atherlock.chen.framework.console;


import org.atherlock.chen.framework.ws.io.Packet;
import org.atherlock.chen.framework.console.entity.request.Connect;

public interface Console {
    String getTitle();
    String getNodeKey();
    void onInit(Connect connect);

    void handle(Packet packet);

    void close();
}
