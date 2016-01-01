package io.hiplabs.hipstore.api.system;

import com.codahale.metrics.MetricRegistry;
import org.slf4j.Logger;

/**
 * Service layer context
 */
public interface LayerContext<T> {

    /**
     * Retrieve specified layer configuration
     * @return layer configuration
     */
    T config();

    /**
     * Retrieve MetricsRegistry, that associated with this layer
     * @return metrics
     */
    MetricRegistry metrics();

    /**
     * Retrieve layer-associated logger instance
     * @return layer logger
     */
    Logger logger();

}
