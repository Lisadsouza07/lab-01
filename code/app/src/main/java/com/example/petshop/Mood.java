package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date defaultDate;

    public Mood() {
        this.defaultDate = new Date();
    }
    public Mood(Date defaultDate) {
        this.defaultDate = defaultDate;
    }

    public Date getDefaultDate() {
        return defaultDate;
    }

    public void setDefaultDate(Date defaultDate) {
        this.defaultDate = defaultDate;
    }
    public abstract String mood();
}
