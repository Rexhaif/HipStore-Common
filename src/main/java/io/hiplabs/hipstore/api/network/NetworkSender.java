package io.hiplabs.hipstore.api.network;

/**
 * Describes network response send method
 */
@FunctionalInterface
public interface NetworkSender<RSP> {

    /**
     * Sends data to provided by NetworkLayer connection
     * @param data data to send
     */
    void send(RSP data);

}
