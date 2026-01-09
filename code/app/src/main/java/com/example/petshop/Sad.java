package com.example.petshop;
import java.util.Date;
public class Sad extends Mood {
    public Sad() {
        super();
    }

    public Sad(Date defaultDate) {
        super(defaultDate);
    }

    @Override
    public String mood() {
        return "Sad";
    }
}
