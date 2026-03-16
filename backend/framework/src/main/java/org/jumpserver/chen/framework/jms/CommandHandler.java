package org.atherlock.chen.framework.jms;

import org.atherlock.chen.framework.jms.entity.CommandRecord;

public interface CommandHandler {
    void recordCommand(CommandRecord commandRecord);

}
