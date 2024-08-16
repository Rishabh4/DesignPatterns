package com.java.solid.encapsulation_ex.report;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.solid.encapsulation_ex.domain.Format;
import com.java.solid.encapsulation_ex.entity.User;
import com.java.solid.encapsulation_ex.service.UserPersistenceService;

import java.util.Collection;

public class UserReportGenerator {

    public static void main(String... args) {
        UserReportGenerator gen = new UserReportGenerator();
        System.out.println(gen.generateReport(Format.JSON));
    }

    public String generateReport(Format format) {
        UserPersistenceService service = new UserPersistenceService();
        Collection<User> users = service.getAll();
        String report;
        if (format == Format.TEXT) {
            StringBuilder builder = new StringBuilder();
            users.forEach(u -> builder.append(u.getName()).append(" ").append(u.getEmail()).append("\n"));
            report = builder.toString();
        } else if (format == Format.JSON) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                report = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                report = "ERROR";
            }
        } else {
            report = "UNKNOWN FORMAT";
        }
        return report;
    }
}