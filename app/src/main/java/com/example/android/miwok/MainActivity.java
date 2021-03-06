/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);







        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView phrases = (TextView) findViewById(R.id.phrases);
        TextView family_members = (TextView) findViewById(R.id.family);
        TextView colors = (TextView) findViewById(R.id.colors);

        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent num = new Intent(MainActivity.this,Numbers.class);
                startActivity(num);
            }});
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent phrase = new Intent(MainActivity.this,Phrases.class);
                startActivity(phrase);
            }});
        family_members.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mem = new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(mem);
            }});

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(MainActivity.this,Colors.class);
                startActivity(colors);
            }});

    }
}
