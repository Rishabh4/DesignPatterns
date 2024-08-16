package com.java.solid.intersegrega_ex;

import java.util.List;

public interface Employee {

    Long getEmployeeId();

    String getDesignation();

    boolean isProjectOwner(Long projectId);

    List<Employee> getReportees();

    void addReportee(Employee employee);

    void setProjectOwner(Long projectId);

    void removeProjectOwner(Long projectId);
}
