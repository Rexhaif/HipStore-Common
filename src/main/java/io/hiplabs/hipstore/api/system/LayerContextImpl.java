package io.hiplabs.hipstore.api.system;

import com.codahale.metrics.MetricRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default implementation of layer context
 */
public class LayerContextImpl<T> implements LayerContext<T> {

    private Logger logger;

    private MetricRegistry metrics;

    private T config;

    public LayerContextImpl(T config, String layerTag, MetricRegistry metrics) {
        this.metrics = metrics;
        this.config = config;
        this.logger = LoggerFactory.getLogger(layerTag);
    }

    @Override
    public T config() {
        return config;
    }

    @Override
    public MetricRegistry metrics() {
        return metrics;
    }

    @Override
    public Logger logger() {
        return logger;
    }
}
