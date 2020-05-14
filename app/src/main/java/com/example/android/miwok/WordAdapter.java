package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.nio.InvalidMarkException;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Words> {
    //creating the data model(basically the Wordadapter using oonstructor)
    public WordAdapter(Activity context, ArrayList<Words> words) {
        //use the parent class to create the data model
        super(context, 0, words);

    }

    @NonNull
    @Override
    //modify getView() method to put the view collected from the wordAdapter into the listView
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Words currentWordView = getItem(position);

        TextView TextView1 = (TextView) listItemView.findViewById(R.id.miwok_word);
        assert currentWordView != null;
        TextView1.setText(currentWordView.getMiwok_text());

        TextView TextView2 = (TextView) listItemView.findViewById(R.id.eng_word);
        TextView2.setText(currentWordView.getEng_text());

//        ImageView image_view = (ImageView)listItemView.findViewById(R.id.image_view);
//        image_view.s

        return listItemView;
    }

}
