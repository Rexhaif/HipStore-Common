package io.hiplabs.hipstore.common;

import com.codahale.metrics.MetricRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Common predefined representation of environment
 */
public class Environment {

    private static MetricRegistry metrics = new MetricRegistry();

    private static Logger envLogger = LoggerFactory.getLogger("ENV");


    /**
     * Retrieves env MetricsRegistry instance
     * @return main MetricsRegistry instance
     */
    public static MetricRegistry metrics() {
        return metrics;
    }

    /**
     * Retrieve environment-level logger
     * @return env-level logger
     */
    public static Logger log() {
        return envLogger;
    }

}
