package com.example.android.miwok;

public class Words {
    private  String Miwok_text;
    private  String Eng_text;
    private  int mResourceId;

    public Words(String Miwok_text,String Eng_text) {
        this.Eng_text = Eng_text;
        this.Miwok_text = Miwok_text;
        this.mResourceId = mResourceId;
    }


    public String getEng_text() {
        return Eng_text;
    }

    public String getMiwok_text() {
        return Miwok_text;
    }

    public int getmResourceId() {
        return mResourceId;
    }
}
