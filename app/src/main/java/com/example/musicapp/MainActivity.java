package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer pianoMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pianoMusic = MediaPlayer.create(this,R.raw.music);
        Switch switch_repeat = (Switch) findViewById(R.id.switch_repeat);
        switch_repeat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                pianoMusic.setLooping(b);
            }
        });
    }

    public void playMusic (View v){
     pianoMusic.start();
    }

    public void pauseMusic (View v){
     if(pianoMusic.isPlaying())
         pianoMusic.pause();
    }

}