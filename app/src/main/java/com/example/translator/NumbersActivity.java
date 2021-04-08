package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.service.autofill.CustomDescription;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
     MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","ek",R.drawable.number_one,R.raw.hello));
        words.add(new Word("two","do",R.drawable.number_two,R.raw.name));
        words.add(new Word("three","teen",R.drawable.number_three,R.raw.prateek));
        words.add(new Word("four","char",R.drawable.number_four,R.raw.hello));
        words.add(new Word("five","panch",R.drawable.number_five,R.raw.hello));
        words.add(new Word("Six","chah",R.drawable.number_six,R.raw.hello));
        words.add(new Word("Seven","saat",R.drawable.number_seven,R.raw.hello));
        words.add(new Word("Eight","aath",R.drawable.number_eight,R.raw.hello));


        CustomAdapter addy = new CustomAdapter(this,words);
        ListView listView = findViewById(R.id.List);
        listView.setAdapter(addy);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                MediaPlayer player = MediaPlayer.create(NumbersActivity.this,word.getAudioResourceId());
                player.start();
            }
        });


    }
}
