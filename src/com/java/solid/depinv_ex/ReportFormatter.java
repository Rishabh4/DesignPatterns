package com.java.solid.depinv_ex;

public interface ReportFormatter {

    void init();

    void addToReport(Order order);

    void finish();

    String getReport();
}
