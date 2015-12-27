package io.hiplabs.hipstore.api.system;

/**
 * Handel's asynchronously operation results
 */
@FunctionalInterface
public interface AsyncHandler<T extends Result> {

    void handle(T result);

}
