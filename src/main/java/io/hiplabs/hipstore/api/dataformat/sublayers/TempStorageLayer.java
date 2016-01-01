package io.hiplabs.hipstore.api.dataformat.sublayers;

import io.hiplabs.hipstore.api.data.Record;
import io.hiplabs.hipstore.api.system.Layer;

/**
 * Describes an temporary data storage layer for dataformat
 */
public interface TempStorageLayer extends Layer{

    /**
     * Put Record into storage
     * @param record record
     * @return record identifier
     */
    long put(Record record);

    /**
     * Retrieve record from storage
     * @param id record identifier
     * @return associated record or null, if not exist
     */
    Record get(long id);

    /**
     * Updates existed record to new one
     * @param id existed record identifier
     * @param newValue new record value
     */
    void update(long id, Record newValue);

    /**
     * Delete record
     * @param id record identifier
     */
    void delete(long id);

}
