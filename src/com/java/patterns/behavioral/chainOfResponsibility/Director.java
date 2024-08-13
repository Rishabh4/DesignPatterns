package com.java.patterns.behavioral.chainOfResponsibility;

import com.java.patterns.behavioral.chainOfResponsibility.LeaveApplication.Type;

//A concrete handler
public class Director extends Employee {

    public Director(LeaveApprover nextApprover) {
        super("Director", nextApprover);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getType() == Type.PTO) {
            application.approve(getApproverRole());
            return true;
        }
        return false;
    }

}
