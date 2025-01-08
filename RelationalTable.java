package work8;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a relational table containing a list of records.
 */
public class RelationalTable {
    private final List<Record> records;

    /**
     * Constructor to initialize an empty table.
     */
    public RelationalTable() {
        records = new ArrayList<>();
    }

    /**
     * Adds a record to the table.
     *
     * @param record the record to be added
     *
     */
    public void addRecord(Record record) {
        records.add(record.clone());
    }

    /**
     * Retrieves all records in the table.
     *
     * @return a list of records
     */
    public List<Record> getRecords() {
        return records;
    }
}
