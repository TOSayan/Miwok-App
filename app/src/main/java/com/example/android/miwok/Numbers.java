package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> words = new ArrayList<Words>();
//        Words w = new Words("lutti","one");
        //creating an arraylist named words where each element is of type Words...
        words.add(new Words("lutti", "one"));
        words.add(new Words("otiiko", "two"));
        words.add(new Words("tolookosu", "three"));
        words.add(new Words("oyyisa", "four"));
        words.add(new Words("massokka", "five"));
        words.add(new Words("temmokka", "six"));
        words.add(new Words("kenekaku", "seven"));
        words.add(new Words("kawinta", "eight"));
        words.add(new Words("we'e", "nine"));
        words.add(new Words("tolookosu", "ten"));


        //creating view and adding dynamically from java class
//        using recycling

        WordAdapter custom_itemsAdapter = new WordAdapter(this, words);  //custom arrayAdapter inherited from ArrayAdapter<Words>
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(custom_itemsAdapter);//creatin the connection between dataAdapter and listView

    }
}
