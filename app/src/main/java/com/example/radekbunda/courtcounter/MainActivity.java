package com.example.radekbunda.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA;
    int scoreB;

    /**
     * This method is called when - button is touched - TEAM A
     */

    public void add1point(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void add2points(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void add3points(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView =  findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * This method is called when - button is touched - TEAM B
     */

    public void add1pointB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void add2pointsB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void add3pointsB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreViewB =  findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }
}
