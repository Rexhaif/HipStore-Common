package io.hiplabs.hipstore.api.data;

import java.util.UUID;

/**
 * Represents storage record
 */
public class Record {

    private byte[] id;
    private byte[] data;
    private byte[] timestamp;

    /**
     * Creates new record instance by given id, data, timestamp(in binary form)
     * @param id id of record
     * @param data record data
     * @param timestamp timestamp of record
     */
    public Record(byte[] id, byte[] data, byte[] timestamp) {
        this.id = id;
        this.data = data;
        this.timestamp = timestamp;
    }

    /**
     * Retrive binary form of record id
     * @return id associated with this record
     */
    public byte[] getId() {
        return id;
    }

    /**
     * Retrieve binary form of data
     * @return data of this record
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Retrieve binary form of record timestamp
     * @return timestamp associated with this record
     */
    public byte[] getTimestamp() {
        return timestamp;
    }

}
