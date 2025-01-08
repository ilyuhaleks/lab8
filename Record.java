package work8;

import java.util.Arrays;

/**
 * Class representing a record in a relational table.
 *
 * Records contain an array of fields and support cloning.
 */
public class Record implements Cloneable {
    private String[] fields;

    /**
     * Constructor to create a record with the specified fields.
     *
     * @param fields array of field values
     */
    public Record(String[] fields) {
        this.fields = fields.clone();
    }

    /**
     * Retrieves the value of a field by its index.
     *
     * @param index the index of the field
     * @return the value of the field
     */
    public String getField(int index) {
        return fields[index];
    }

    /**
     * Sets the value of a field at the specified index.
     *
     * @param index the index of the field
     * @param value the new value of the field
     */
    public void setField(int index, String value) {
        fields[index] = value;
    }

    /**
     * Creates a copy of the current record.
     *
     * @return a cloned copy of the record
     */
    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонування не підтримується", e);
        }
    }

    /**
     * Overrides toString() for readable representation of a record.
     */
    @Override
    public String toString() {
        return Arrays.toString(fields);
    }
}
