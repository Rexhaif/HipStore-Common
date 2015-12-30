package io.hiplabs.hipstore.api.storage;

import io.hiplabs.hipstore.api.data.Record;
import io.hiplabs.hipstore.api.data.RecordReference;

import io.hiplabs.hipstore.api.system.Layer;
import io.hiplabs.hipstore.api.system.Result;

/**
 * Describes an data storage layer interface
 */
public interface StorageLayer extends Layer{

    /**
     * Associate specified cache layer with this storage
     * @param layer cache layer
     */
    void attachCacheLayer(CacheLayer layer);

    /**
     * Inserts record into storage
     * @param record record
     * @return result of insertion, that contains reference of record
     */
    Result<RecordReference> insert(Record record);

    /**
     * Retrieves record
     * @param reference record reference(timestamp may be null)
     * @return result of operation, that contains record object
     */
    Result<Record> get(RecordReference reference);

    /**
     * Search for record and retrieve reference for it
     * @param id binary id of record
     * @return result of operation, that contains record reference
     */
    Result<RecordReference> getRefByID(byte[] id);

    /**
     * Update record and retrieve new(or same the old) reference for it
     * @param record record to insert
     * @return new(or same the old) reference of updated record
     */
    Result<RecordReference> update(Record record);

    /**
     * Delete record by given reference
     * @param reference record reference(timestamp may be null)
     * @return result of operation
     */
    Result<Void> delete(RecordReference reference);

}
