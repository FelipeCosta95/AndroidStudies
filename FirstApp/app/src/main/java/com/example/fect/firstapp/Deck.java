package com.example.fect.firstapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Deck {
    int max;
    int current=0;
    List<Card> set = new ArrayList<>();

    public Deck(){
        Random rand = new Random();
        for(int i=0; i< max; i++){
            set.add(new Card(rand.nextInt(3)+1));
            this.current++;
        }}

    public Card dealCard(){
            Card card = set.get(current);
            current--;
            return card;
        }
    }

