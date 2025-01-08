package work8;

/**
 * Main class demonstrating how to work with relational tables.
 */
public class Main {
    public static void main(String[] args) {
        // Factory
        TableLoader loader = new CSVTableLoader();
        RelationalTable loadedTable = loader.loadTable("data.csv");

        System.out.println("Таблиця завантажена з CSV:");
        for (Record record : loadedTable.getRecords()) {
            System.out.println(record);
        }

        // Builder
        TableBuilder builder = new TableBuilder();
        RelationalTable manualTable = builder
                .addRecord(new String[] { "3", "Петро", "Петренко" })
                .addRecord(new String[] { "4", "Юлія", "Тищенко" })
                .build();

        System.out.println("Таблиця створена з використанням Builder:");
        for (Record record : manualTable.getRecords()) {
            System.out.println(record);
        }
    }
}
