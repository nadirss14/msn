package com.nadirss14.msn.model;

public class SimpleCard {

    private String img_card="";
    private String card_title;
    private String first_word;
    private String time_img;
    private String num_like= "0 dias";

    public SimpleCard(String img_card, String card_title, String first_word, String time_img, String num_like) {
        this.img_card = img_card;
        this.card_title = card_title;
        this.first_word = first_word;
        this.time_img = time_img;
        this.num_like = num_like;
    }

    public String getImg_card() {
        return img_card;
    }

    public void setImg_card(String img_card) {
        this.img_card = img_card;
    }

    public String getCard_title() {
        return card_title;
    }

    public void setCard_title(String card_title) {
        this.card_title = card_title;
    }

    public String getFirst_word() {
        return first_word;
    }

    public void setFirst_word(String first_word) {
        this.first_word = first_word;
    }

    public String getTime_img() {
        return time_img;
    }

    public void setTime_img(String time_img) {
        this.time_img = time_img;
    }

    public String getNum_like() {
        return num_like;
    }

    public void setNum_like(String num_like) {
        this.num_like = num_like;
    }


}
