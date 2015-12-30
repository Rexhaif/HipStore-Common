package io.hiplabs.hipstore.api.network;

/**
 * Describes network server request consumer
 */
@FunctionalInterface
public interface ServerConsumer<REQ, RSP> {

    /**
     * Consumes request data from on server
     * @param data request data
     * @param sender interface to send response back
     */
    void consume(REQ data, NetworkSender<RSP> sender);

}
