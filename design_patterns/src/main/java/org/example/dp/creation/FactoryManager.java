package org.example.dp.creation;

enum ReportLevel{
    BASIC, DETAILED
}
enum ReportType{
    EXCEL, PDF, CSV
        }
interface ReportGenerator{
    void printReport(String message);
}

abstract class AbstractFactory {
    abstract ReportGenerator getReportGenerator(ReportType reportType);
}

class ExcelReport implements ReportGenerator{
    @Override
    public void printReport(String message) {
        System.out.println("Excel report : " + message);
    }
}

class DetailedExcelReport implements ReportGenerator{
    @Override
    public void printReport(String message) {
        System.out.println("Detailed Excel report : " + message);
    }
}
class PdfReport implements ReportGenerator{
    @Override
    public void printReport(String message) {
        System.out.println("Pdf report : " + message);
    }
}
class DetailedPdfReport implements ReportGenerator{
    @Override
    public void printReport(String message) {
        System.out.println("Detailed Pdf report : " + message);
    }
}
class CsvReport implements ReportGenerator{
    @Override
    public void printReport(String message) {
        System.out.println("Csv report : " + message);
    }
}
class DetailedCsvReport implements ReportGenerator{
    @Override
    public void printReport(String message) {
        System.out.println("Detailed Csv report : " + message);
    }
}

class BasicReportFactory extends AbstractFactory {


    @Override
    ReportGenerator getReportGenerator(ReportType reportType) {
        return switch (reportType) {
            case CSV -> new CsvReport();
            case PDF -> new PdfReport();
            case EXCEL -> new ExcelReport();
        };
    }
}

class DetailedReportFactory extends AbstractFactory {
    @Override
    ReportGenerator getReportGenerator(ReportType reportType) {
        return switch(reportType){
            case EXCEL -> new DetailedExcelReport();
            case CSV -> new DetailedCsvReport();
            case PDF -> new DetailedPdfReport();
        };
    }
}

class ReportFactoryGenerator {

    public static AbstractFactory getInstance(ReportLevel level) {
        return switch (level) {
            case BASIC:
                yield new BasicReportFactory();
            case DETAILED:
                yield new DetailedReportFactory();
        };
    }
}

public class FactoryManager {

    public static void main(String[] args) {

        String message = "This is sample report";

        AbstractFactory abstractFactory = ReportFactoryGenerator.getInstance(ReportLevel.DETAILED);
        ReportGenerator reportGenerator = abstractFactory.getReportGenerator(ReportType.PDF);
        reportGenerator.printReport(message);


    }


}
