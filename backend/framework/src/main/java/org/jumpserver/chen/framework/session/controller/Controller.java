package org.atherlock.chen.framework.session.controller;

import org.atherlock.chen.framework.session.controller.dialog.Dialog;
import org.atherlock.chen.framework.session.controller.message.MessageLevel;
import org.atherlock.chen.framework.ws.io.Packet;

public interface Controller {
    void showDialog(Dialog dialog);

    void closeDialog();
    void showMessage(MessageLevel level, String message);

    void handlePacket(Packet packet);
    void sendFile(String fileKey);

}
