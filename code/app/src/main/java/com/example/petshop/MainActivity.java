package com.example.petshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");

        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);

    }

}