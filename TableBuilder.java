package work8;

/**
 * Builder class for step-by-step creation of a relational table.
 */
public class TableBuilder {
    private final RelationalTable table;

    /**
     * Constructor to initialize an empty table.
     */
    public TableBuilder() {
        table = new RelationalTable();
    }

    /**
     * Adds a record to the table being built.
     *
     * @param fields array of field values for the record
     * @return the current TableBuilder instance for chaining
     */
    public TableBuilder addRecord(String[] fields) {
        table.addRecord(new Record(fields));
        return this;
    }

    /**
     * Builds and returns the constructed table.
     *
     * @return the constructed RelationalTable
     */
    public RelationalTable build() {
        return table;
    }
}
