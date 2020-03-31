package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceID;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words_list, int color) {
        super(context, 0, words_list);
        mColorResourceID = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWordPosition = getItem(position);

        LinearLayout linearLayout = listItemView.findViewById(R.id.wrapper);
        int color = ContextCompat.getColor(getContext(), mColorResourceID);
        linearLayout.setBackgroundColor(color);

        TextView tv_for_miwok_words = listItemView.findViewById(R.id.tv_for_miwok_words);
        tv_for_miwok_words.setText(currentWordPosition.getMiwokTranslation());

        TextView tv_for_default_words = listItemView.findViewById(R.id.tv_for_default_words);
        tv_for_default_words.setText(currentWordPosition.getDefaultTranslation());

        ImageView img = listItemView.findViewById(R.id.img);

        if (currentWordPosition.hasImage()) {
            img.setImageResource(currentWordPosition.getImgResourceId());
            img.setVisibility(View.VISIBLE);
        } else {
            img.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
