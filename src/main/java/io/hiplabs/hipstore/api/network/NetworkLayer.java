package io.hiplabs.hipstore.api.network;

import io.hiplabs.hipstore.api.system.Layer;

/**
 * Describes an network requests consumer
 */
public interface NetworkLayer<REQ, RSP> extends Layer {

    /**
     * Add request consume
     * @param consumer server consumer
     */
    void addNetworkConsumer(ServerConsumer<REQ, RSP> consumer);

}
