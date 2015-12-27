package io.hiplabs.hipstore.api.data;

/**
 * Represents generic record information(id and tomestamp) without including main data of record
 */
public class RecordReference {

    private byte[] id;
    private byte[] timestamp;

    /**
     * Create record reference by given record
     * @param record record
     * @return reference associate with given record
     */
    public static RecordReference fromRecord(Record record) {
        return new RecordReference(record.getId(), record.getTimestamp());
    }

    /**
     * Create reference without timestamp
     * @param id record id
     * @return reference with id and null timestamp
     */
    public static RecordReference newWithoutTimestamp(byte[] id) {
        return new RecordReference(id, null);
    }

    /**
     * Creates record reference by given id and timestamp
     * @param id id of record
     * @param timestamp timestamp of record
     */
    public RecordReference(byte[] id, byte[] timestamp) {
        this.id = id;
        this.timestamp = timestamp;
    }

    /**
     * Retrieve record id
     * @return record id
     */
    public byte[] getId() {
        return id;
    }

    /**
     * Retrieve record timestamp
     * @return record timestamp
     */
    public byte[] getTimestamp() {
        return timestamp;
    }
}
