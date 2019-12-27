package com.example.android.tourguide.Model;


public class Card {

    private String mCardName;
    private int mCardPicture;

    public Card(String cardName, int cardPicture){
        this.mCardName = cardName;
        this.mCardPicture = cardPicture;
    }

    public String getCardName() {
        return mCardName;
    }

    public int getPicture() {
        return mCardPicture;
    }
}
