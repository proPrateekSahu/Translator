package com.example.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> phrases = new ArrayList<>();

        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("Bravo you have done it","kamal kr diya bhaiyaji",R.raw.name));
        phrases.add(new Word("bullshit","kya hal chal hai",R.raw.prateek));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));
        phrases.add(new Word("hey what's up","kya hal chal hai",R.raw.hello));

        CustomAdapter addy2 = new CustomAdapter(this,phrases);
        ListView listView2 = findViewById(R.id.List2);
        listView2.setAdapter(addy2);

    }
}
