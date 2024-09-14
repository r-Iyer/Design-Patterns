public class PrinterAdapter implements IPrinter{
    LegacyPrinter legacyPrinter;
    ModernPrinter modernPrinter;
    public PrinterAdapter(LegacyPrinter legacyPrinter, ModernPrinter modernPrinter) {
        this.legacyPrinter = legacyPrinter;
        this.modernPrinter = modernPrinter;
    }
    @Override
    public void print(String data, String type) {
        if("legacy".equals(type))
            legacyPrinter.legacyPrint(data);
        else
            modernPrinter.modernPrint(data);
    }
    public LegacyPrinter getLegacyPrinter() {
        return legacyPrinter;
    }
    public void setLegacyPrinter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }
 }
