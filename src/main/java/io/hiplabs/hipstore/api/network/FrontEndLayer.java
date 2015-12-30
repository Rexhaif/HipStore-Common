package io.hiplabs.hipstore.api.network;

import io.hiplabs.hipstore.api.dataformat.DataFormatLayer;
import io.hiplabs.hipstore.api.system.Layer;

/**
 * Describes an request translation layer
 */
public interface FrontEndLayer<REQ, RSP> extends Layer {

    /**
     * Attach NetworkLayer to this front-end layer
     * @param layer NetworkLayer to attach
     */
    void addNetworkLayer(NetworkLayer<REQ, RSP> layer);

    /**
     * Link this front-end layer with specified DataFormatLayer
     * @param layer data format layer
     */
    void linkWithDataFormatLayer(DataFormatLayer layer);

}
