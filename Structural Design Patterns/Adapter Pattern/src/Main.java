public class Main {
    public static void main(String[] args) throws Exception {
        PrinterAdapter printerAdapter = new PrinterAdapter(new LegacyPrinter(), new ModernPrinter());
        printerAdapter.print("Print this confidential data", "modern");
        System.err.println();
        printerAdapter.print("Print this confidential data", "legacy");
    }
}
