package io.hiplabs.hipstore.api.system;

/**
 * Represents operation result
 */
public class Result<T> {

    private T result;
    private Throwable cause;

    public static Result EMPTY_SUCCESS_RESULT() {
        return new Result<>(new Object(), null);
    }

    public static Result FAILED_RESULT(Throwable caused) {
        return new Result(null, caused);
    }

    /**
     * Create new result instance
     * @param result result of operation, should be null if operation was failed
     * @param cause throwable of operation fail, should be null if operation was succeed
     */
    public Result(T result, Throwable cause) {
        this.result = result;
        this.cause = cause;
    }

    /**
     * check if operation was succed
     * @return true if operation executed successfully or false if not
     */
    public boolean succeed() {
        return result != null;
    }

    /**
     * Check if exception was caused in execution process
     *          and operation wasn't executed successfully
     * @return true if exeception was caused or false if not
     */
    public boolean failed() {
        return cause != null;
    }

    /**
     * Retrieve operation result
     * @return result of operation
     */
    public T result() {
        return result;
    }

    /**
     * Retrieve operation fail cause
     * @return exception, that was caught in execution
     */
    public Throwable cause() {
        return cause;
    }



}
