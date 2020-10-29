package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColor;
    public WordAdapter(Activity context, ArrayList<Word> words,int color) {
        super(context, 0, words);
        this.mColor=color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);
        englishTextView.setText(currentWord.getEnglishTranslation());

        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.getmImg()!=0){
        imageView.setImageResource(currentWord.getmImg());
        imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        LinearLayout view=(LinearLayout) listItemView.findViewById(R.id.list_item_group);
        int color = ContextCompat.getColor(getContext(), mColor);
        view.setBackgroundColor(color);

        ImageView btn = (ImageView) listItemView.findViewById(R.id.audio_btn);
        btn.setBackgroundColor(color);

        return listItemView;
    }
}
