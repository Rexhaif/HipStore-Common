package io.hiplabs.hipstore.api.network;

/**
 * Wrap server consumer to/from specific protocol
 */
public interface ProtocolWrapper<REQ, RSP, FREQ, FRSP> {

    /**
     * Convert specified consumer to another protocol
     * @param origin original consumer to convert
     * @return converted consumer
     */
    ServerConsumer<FREQ, FRSP> wrapConsumer(ServerConsumer<REQ, RSP> origin);

}
