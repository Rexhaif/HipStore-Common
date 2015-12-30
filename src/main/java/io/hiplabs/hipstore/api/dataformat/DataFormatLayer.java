package io.hiplabs.hipstore.api.dataformat;

import io.hiplabs.hipstore.api.dataformat.sublayers.TempStorageLayer;
import io.hiplabs.hipstore.api.storage.StorageLayer;
import io.hiplabs.hipstore.api.system.Layer;
import io.hiplabs.hipstore.api.system.Result;

/**
 * Describes an data formatting and ops executing layer
 */
public interface DataFormatLayer extends Layer {

    /**
     * Associate specified temp storage layer with this data format layer
     * @param layer temp storage layer
     */
    void attachTempStorageLayer(TempStorageLayer layer);

    /**
     * Associate specified storage layer with this data format layer
     * @param layer storage layer
     */
    void attachStorageLayer(StorageLayer layer);

    /**
     * Process given request
     * @param request request instance
     * @return result of processing
     */
    Result processRequest(Object request);

}
