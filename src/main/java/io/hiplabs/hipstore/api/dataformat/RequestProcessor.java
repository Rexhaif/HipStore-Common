package io.hiplabs.hipstore.api.dataformat;

import io.hiplabs.hipstore.api.system.Result;

/**
 * Request processing for {@link AbstractFilteredDataFormatLayer}
 */
@FunctionalInterface
public interface RequestProcessor {

    /**
     * Process request provided by {@link AbstractFilteredDataFormatLayer}
     * @param request specified-class request instance
     * @return result of processing
     */
    Result process(Object request);

}
