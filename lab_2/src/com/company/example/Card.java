package com.company.example;

public class Card {

    private int suit;
    private int rank;
    private int order;

    // defautl constructor
    public Card() {
        this.suit = 0;
        this.rank = 0;
        this.order = 0;
    }

    // overloaded constructor
    public Card(int suit, int rank, int order) {
        this.suit = suit;
        this.rank = rank;
        this.order = order;
    }

    // getters and setters
    public String getSuit() {

        String suitString = "";

        switch (this.suit) {
            case 0:
                suitString = "Spades";
                break;
            case 1:
                suitString = "Hearts";
                break;
            case 2:
                suitString = "Clubs";
                break;
            case 3:
                suitString = "Diamonds";
                break;
        }

        return suitString;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String getRank() {

        String rankString = "";

        if (this.rank < 11) {
            rankString = String.valueOf(this.rank);
        }
        else {
            switch (this.rank) {
                case 11:
                    rankString = "J";
                    break;
                case 12:
                    rankString = "Q";
                    break;
                case 13:
                    rankString = "K";
                    break;
                case 14:
                    rankString = "A";
                    break;
            }
        }

        return rankString;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
