package com.example.android.tourguide.Controller;

import android.content.Context;

import com.example.android.tourguide.Model.Card;
import com.example.android.tourguide.R;

import java.util.ArrayList;
import java.util.List;


public class PlacesData {

    public static List<Card> placeDataFirstTab(Context mcontext) {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card(mcontext.getString(R.string.place_1), R.drawable.elkala));
        cardList.add(new Card(mcontext.getString(R.string.place_2), R.drawable.shati_stanli));
        cardList.add(new Card(mcontext.getString(R.string.place_3), R.drawable.libirary));
        cardList.add(new Card(mcontext.getString(R.string.place_4), R.drawable.roman_theater));


        return cardList;
    }

    public static List<Card> placeDataSecondTab(Context mcontext) {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card(mcontext.getString(R.string.hotel_1), R.drawable.san_hotel));
        cardList.add(new Card(mcontext.getString(R.string.hotel_2), R.drawable.lee));
        cardList.add(new Card(mcontext.getString(R.string.hotel_3), R.drawable.cecil));
        cardList.add(new Card(mcontext.getString(R.string.place_4), R.drawable.tolip));


        return cardList;
    }

    public static List<Card> placeDataThirdTab(Context mcontext) {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card(mcontext.getString(R.string.food_1), R.drawable.by));
        cardList.add(new Card(mcontext.getString(R.string.food_2), R.drawable.country));
        cardList.add(new Card(mcontext.getString(R.string.food_3), R.drawable.cook));
        cardList.add(new Card(mcontext.getString(R.string.food_4), R.drawable.mack));


        return cardList;
    }

    public static List<Card> placeDataFourthTab(Context mcontext) {
        List<Card> cardList = new ArrayList<>();
        cardList.add(new Card(mcontext.getString(R.string.drink_1), R.drawable.braz));
        cardList.add(new Card(mcontext.getString(R.string.drink_2), R.drawable.grand));
        cardList.add(new Card(mcontext.getString(R.string.drink_3), R.drawable.arous));
        cardList.add(new Card(mcontext.getString(R.string.drink_4), R.drawable.star));


        return cardList;
    }
}