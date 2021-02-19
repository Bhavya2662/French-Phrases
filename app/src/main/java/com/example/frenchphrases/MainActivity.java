package com.example.frenchphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void play (View view){
        int id = view.getId();
        String ourId="";
        ourId = view.getResources().getResourceEntryName(id);
        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.frenchphrases");
        mediaPlayer= MediaPlayer.create(this,resourceId);
        mediaPlayer.start();
    }
}