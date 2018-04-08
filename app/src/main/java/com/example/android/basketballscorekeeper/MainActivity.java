package com.example.android.basketballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.basketballscorekeeper.R;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForHome(8);

    }

    int scoreHomeTeam = 0;

    public void addThreeForHome (View v) {
        scoreHomeTeam = scoreHomeTeam + 3;
        displayForHome(scoreHomeTeam);
    }



    public void addTwoForHome (View v) {
        scoreHomeTeam = scoreHomeTeam + 2;
        displayForHome(scoreHomeTeam);
    }

    public void addOneForHome (View v) {
        scoreHomeTeam = scoreHomeTeam + 1;
        displayForHome(scoreHomeTeam);
    }

    public void scoreReset (View v){
        scoreHomeTeam = 0;
        scoreGuestTeam = 0;
        displayForHome(scoreHomeTeam);
        displayForGuest(scoreGuestTeam);
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayForHome(int score) {
        TextView scoreView = findViewById(R.id.score_home_team);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Guest Team.
     */
    public void displayForGuest(int score) {
        TextView scoreView = findViewById(R.id.score_guest_team);
        scoreView.setText(String.valueOf(score));
    }

    int scoreGuestTeam = 0;

    public void addThreeForGuest (View v) {
        scoreGuestTeam = scoreGuestTeam + 3;
        displayForGuest(scoreGuestTeam);
    }



    public void addTwoForGuest (View v) {
        scoreGuestTeam = scoreGuestTeam + 2;
        displayForGuest(scoreGuestTeam);
    }

    public void addOneForGuest (View v) {
        scoreGuestTeam = scoreGuestTeam + 1;
        displayForGuest(scoreGuestTeam);
    }

}
