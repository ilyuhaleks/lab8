package work8;

/**
 * Table loader for reading relational tables from CSV files.
 */
public class CSVTableLoader implements TableLoader {

    /**
     * Loads a table from a CSV file.
     *
     * @param filePath the path to the CSV file
     * @return a RelationalTable object populated with data
     */
    @Override
    public RelationalTable loadTable(String filePath) {
        RelationalTable table = new RelationalTable();

        // Simulated data loading
        table.addRecord(new Record(new String[] { "1", "Сан", "Чі" }));
        table.addRecord(new Record(new String[] { "2", "Чі", "На" }));

        System.out.println("Таблиця успішно завантажена з файлу: " + filePath);
        return table;
    }
}
