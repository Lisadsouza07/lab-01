package com.example.petshop;
import java.util.Date;
public class Happy extends Mood {
    public Happy() {
        super();
    }
    public Happy(Date defaultDate) {
        super(defaultDate);
    }

    @Override
    public String mood() {
        return "Happy";
    }
}