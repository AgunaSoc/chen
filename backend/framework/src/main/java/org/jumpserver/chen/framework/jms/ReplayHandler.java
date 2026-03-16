package org.atherlock.chen.framework.jms;

import org.atherlock.chen.framework.jms.exception.ReplayException;

public interface ReplayHandler {

    void init();

    void release() throws ReplayException;

    void writeRow(String row);

    void writeInput(String input);
    void writeOutput(String input);
}
