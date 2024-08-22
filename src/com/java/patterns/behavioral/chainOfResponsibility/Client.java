package com.java.patterns.behavioral.chainOfResponsibility;

import com.java.patterns.behavioral.chainOfResponsibility.LeaveApplication.Type;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick)
                .from(LocalDate.now()).to(LocalDate.now().plusDays(4))
                .build();
        System.out.println(application);
        System.out.println("**************************************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        ProjectLead lead = new ProjectLead(manager);
        return lead;
    }

}
