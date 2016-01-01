package io.hiplabs.hipstore.api.storage;

import io.hiplabs.hipstore.api.data.Record;
import io.hiplabs.hipstore.api.data.RecordReference;
import io.hiplabs.hipstore.api.system.Layer;

import java.util.Collection;

/**
 * Describes an data caching layer
 */
public interface CacheLayer extends Layer {

    /**
     * Inserts record into cache
     * @param record record to cache
     * @return reference of record
     */
    RecordReference put(Record record);

    /**
     * Inserts multiply records into cache
     * @param records collection of records
     * @return collection of keys
     */
    Collection<RecordReference> putAll(Collection<Record> records);

    /**
     * Retrieves record from cache
     * @param reference reference of record
     * @return record from cache
     */
    Record get(RecordReference reference);

    /**
     * Retrieves multiply records from cache
     * @param references collection of reference
     * @return collection of records
     */
    Collection<Record> getAll(Collection<RecordReference> references);

    /**
     * Check if associated record exist in cache
     * @param reference reference of record to check
     * @return true if exist or false, if not
     */
    boolean isInCache(RecordReference reference);

    /**
     * Set livetime for all post-inserted records
     * @param liveTime time to life in milliseconds
     */
    void setLiveTime(int liveTime);

}
