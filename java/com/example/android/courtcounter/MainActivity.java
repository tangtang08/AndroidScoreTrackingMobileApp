package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //total for Team Cats
    int scoreTeamC = 0;
    //total for Team Dogs
    int scoreTeamD = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Method called when 3 points added
    public void addThreeForTeamC(View v) {
        scoreTeamC = scoreTeamC + 3;
        displayForTeamC(scoreTeamC);
    }
    // Method called when 2 points added
    public void addTwoForTeamC(View v) {
        scoreTeamC = scoreTeamC + 2;
        displayForTeamC(scoreTeamC);
    }
    // Method called when free points are added
    public void addOneFreeThrow(View v) {
        scoreTeamC = scoreTeamC + 1;
        displayForTeamC(scoreTeamC);
    }
     //Displays the given score for The Cats.
    public void displayForTeamC(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(score));
    }
    // Team Dogs Method called when 3 points added
    public void addThreeForTeamD(View v) {
        scoreTeamD = scoreTeamD + 3;
        displayForTeamD(scoreTeamD);
    }
    // Team Dogs Method called when 2 points added
    public void addTwoForTeamD(View v) {
        scoreTeamD = scoreTeamD + 2;
        displayForTeamD(scoreTeamD);
    }
    // Team Dogs Method called when free points are added
    public void addOneFreeThrowD(View v) {
        scoreTeamD = scoreTeamD + 1;
        displayForTeamD(scoreTeamD);
    }
     //Displays the given score for Team Dogs.
    public void displayForTeamD(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_d_score);
        scoreView.setText(String.valueOf(score));
    }
    //Reset Button Method called
    public void resetScore(View v){
        scoreTeamC = 0;
        scoreTeamD = 0;
        displayForTeamC(scoreTeamC);
        displayForTeamD(scoreTeamD);
    }
}