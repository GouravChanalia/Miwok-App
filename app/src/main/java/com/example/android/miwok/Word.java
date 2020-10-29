package com.example.android.miwok;

import android.content.Context;
import android.widget.ImageView;

public class Word {
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImg;
    private int mAudio;
    public Word(String english, String miwok,int image,int audio){
        mMiwokTranslation= miwok;
        mEnglishTranslation= english;
        mImg=image;
        mAudio=audio;
    }
    public Word(String english, String miwok,int audio){
        mMiwokTranslation= miwok;
        mEnglishTranslation= english;
        mAudio=audio;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public int getmImg() {
        return mImg;
    }

    public int getmAudio() {
        return mAudio;
    }
}
