package io.hiplabs.hipstore.api.system;


/**
 * Describes generic layer methods
 */
public interface Layer {

    /**
     * Initialize and start the service by specified context(and config)
     * @param context context for service
     */

    Result initAndStart(LayerContext context);

    /**
     * Stopping service
     */
    Result stop();

}
