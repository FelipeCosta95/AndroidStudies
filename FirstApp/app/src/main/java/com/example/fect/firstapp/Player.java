package com.example.fect.firstapp;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
  private  int maxCards = 4;
    private Deck deck;

    public void drawCards(){
        for(int i=0;i<this.maxCards;i++){
            if(hand.get(i)==null)
             deck.dealCard();
        }
    }

    public Card getCardInPosition(int i) {
        return hand.get(i);
    }

    public int getMaxCards() {
        return maxCards;
    }

    public void setMaxCards(int maxCards) {
        this.maxCards = maxCards;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;

    }
}
