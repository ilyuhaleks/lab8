package work8;

/**
 * Interface for table loaders that load relational tables from files.
 */
public interface TableLoader {
    /**
     * Loads a table from the specified file path.
     *
     * @param filePath the path to the file
     * @return the loaded relational table
     */
    RelationalTable loadTable(String filePath);
}
