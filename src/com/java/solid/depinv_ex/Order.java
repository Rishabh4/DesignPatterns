package com.java.solid.depinv_ex;

import java.time.LocalDateTime;

public class Order {

    private final String id;

    private final LocalDateTime dateTime;

    private final double total;

    public Order(String id, LocalDateTime dateTime, double total) {
        this.id = id;
        this.dateTime = dateTime;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", dateTime=" + dateTime + ", total=" + total + "]";
    }

}
