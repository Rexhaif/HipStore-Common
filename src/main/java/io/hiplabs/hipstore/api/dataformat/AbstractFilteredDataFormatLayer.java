package io.hiplabs.hipstore.api.dataformat;

import io.hiplabs.hipstore.api.dataformat.sublayers.TempStorageLayer;
import io.hiplabs.hipstore.api.storage.StorageLayer;
import io.hiplabs.hipstore.api.system.LayerContext;
import io.hiplabs.hipstore.api.system.Result;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Simple way to process different request
 */
public abstract class AbstractFilteredDataFormatLayer implements DataFormatLayer {

    private Map<Class, RequestProcessor> processingRules = new HashMap<>();

    @Override
    public abstract void attachTempStorageLayer(TempStorageLayer layer);

    @Override
    public abstract void attachStorageLayer(StorageLayer layer);

    /**
     * Add processing rule for specified class of requests
     * @param requestClass class of request
     * @param processor request processor
     */
    protected void addProcessingRule(Class requestClass, RequestProcessor processor){
        processingRules.put(requestClass, processor);
    }

    @Override
    public Result processRequest(Object request) {
        Result result = null;
        for (Class clazz : processingRules.keySet()) {
            if (clazz.isInstance(request)) {
                result = processingRules.get(clazz).process(request);
            }
        }
        if (result == null) {
            return new Result<>(null, new Throwable("No such Processing rule for this request"));
        } else {
            return result;
        }
    }

    @Override
    public abstract Result<Void> initAndStart(LayerContext context);

    @Override
    public abstract Result<Void> stop();
}
