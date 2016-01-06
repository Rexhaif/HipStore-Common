package io.hiplabs.hipstore.api.request;

/**
 * Describes basic request interface
 */
public interface Request<RSP_TYPE> {

    /**
     * Required method to send response to client from different layers
     * @param responseData content of response(endpoint-layer should wrap it into custom  protocol response format)
     */
    void sendResponse(RSP_TYPE responseData);

}
