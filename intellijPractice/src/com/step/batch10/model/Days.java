package com.step.batch10.model;

public enum Days {
    SUNDAY("Ravivaar", true),
    MONDAY("Somevaar", false),
    TUESDAY("Mangalvaar", false),
    FRIDAY("Shukrvaar", false),
    SATURDAY("Shanivaar", true);

    private final String marathiName;
    private final boolean isWeekend;

    Days(String marathiName, boolean isWeekend) {
        this.marathiName = marathiName;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getMarathiName() {
        return marathiName;
    }
}
