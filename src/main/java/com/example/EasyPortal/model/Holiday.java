package com.example.EasyPortal.model;

public class Holiday {
    private enum Type{
        FEDERAL,FESTIVAL;
    }

    public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

    private final String day;
    private final String reason;
    private final Type type;

    public String getDay() {
        return day;
    }
    public String getReason() {
        return reason;
    }
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "day='" + day + '\'' +
                ", reason='" + reason + '\'' +
                ", type=" + type +
                '}';
    }
}
