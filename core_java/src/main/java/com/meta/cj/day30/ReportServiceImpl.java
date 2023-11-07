package com.meta.cj.day30;

import java.io.Serializable;

abstract class AbstractReportService{
    public abstract void getReport();
}
public class ReportServiceImpl extends AbstractReportService implements Serializable,Cloneable {
    @Override
    public void getReport() {
        System.out.println("Report generated");
    }
}
