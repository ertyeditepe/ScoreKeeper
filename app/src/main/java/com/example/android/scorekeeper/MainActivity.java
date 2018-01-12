package com.example.android.scorekeeper;

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
    /** Default values for stats */
    int scoreA = 0;
    int scoreB = 0;
    int totalAttemptsA = 0;
    int totalAttemptsB = 0;
    int totalShotsOnTargetA = 0;
    int totalShotsOnTargetB = 0;
    int totalPassesA = 0;
    int totalPassesB = 0;
    int totalCornersA = 0;
    int totalCornersB = 0;
    int totalFoulsA = 0;
    int totalFoulsB = 0;
    int yellowCardA = 0;
    int yellowCardB =0;
    int redCardA = 0;
    int redCardB = 0;

    /** Increases values for teams */

    public void addAttemptsA(View view) {
        totalAttemptsA = totalAttemptsA + 1;
        displayAttemptsA(totalAttemptsA);
    }
    public void addAttemptsB(View view) {
        totalAttemptsB = totalAttemptsB + 1;
        displayAttemptsB(totalAttemptsB);
    }
    public void addShotsOnTargetA(View view) {
        totalShotsOnTargetA = totalShotsOnTargetA + 1;
        displayShotsOnTargetA(totalShotsOnTargetA);
    }
    public void addShotsOnTargetB(View view) {
        totalShotsOnTargetB = totalShotsOnTargetB + 1;
        displayShotsOnTargetB(totalShotsOnTargetB);
    }
    public void addPassesA(View view) {
        totalPassesA = totalPassesA + 1;
        displayPassesA(totalPassesA);
    }
    public void addPassesB(View view) {
        totalPassesB = totalPassesB + 1;
        displayPassesB(totalPassesB);
    }
    public void addCornerA(View view) {
        totalCornersA = totalCornersA + 1;
        displayCornersA(totalCornersA);
    }
    public void addCornerB(View view) {
        totalCornersB = totalCornersB + 1;
        displayCornersB(totalCornersB);
    }
    public void addFoulsA(View view) {
        totalFoulsA = totalFoulsA + 1;
        displayFoulsA(totalFoulsA);
    }
    public void addFoulsB(View view) {
        totalFoulsB = totalFoulsB + 1;
        displayFoulsB(totalFoulsB);
    }
    public void addYellowCardA(View view) {
        yellowCardA = yellowCardA + 1;
        displayYellowCardA(yellowCardA);
    }
    public void addYellowCardB(View view) {
        yellowCardB = yellowCardB + 1;
        displayYellowCardB(yellowCardB);
    }
    public void addRedCardA(View view) {
        redCardA= redCardA + 1;
        displayRedCardA(redCardA);
    }
    public void addRedCardB(View view) {
        redCardB= redCardB + 1;
        displayRedCardB(redCardB);
    }
    public void addScoreA(View view) {
        scoreA = scoreA + 1;
        displayScoreA(scoreA);
    }
    public void addScoreB(View view) {
        scoreB = scoreB + 1;
        displayScoreB(scoreB);
    }
    /** Resets values */

    public void resetValues(View view) {
        scoreA = 0;
        scoreB = 0;
        totalAttemptsA = 0;
        totalAttemptsB = 0;
        totalShotsOnTargetA = 0;
        totalShotsOnTargetB = 0;
        totalPassesA = 0;
        totalPassesB = 0;
        totalCornersA = 0;
        totalCornersB = 0;
        totalFoulsA = 0;
        totalFoulsB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;
        displayAttemptsA(totalAttemptsA);
        displayAttemptsB(totalAttemptsB);
        displayShotsOnTargetA(totalShotsOnTargetA);
        displayShotsOnTargetB(totalShotsOnTargetB);
        displayPassesA(totalPassesA);
        displayPassesB(totalPassesB);
        displayCornersA(totalCornersA);
        displayCornersB(totalCornersB);
        displayFoulsA(totalFoulsA);
        displayFoulsB(totalFoulsB);
        displayYellowCardA(yellowCardA);
        displayYellowCardB(yellowCardB);
        displayRedCardA(redCardA);
        displayRedCardB(redCardB);
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }

    /** Displays values for stats */

    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamScoreA);
        scoreView.setText(String.valueOf(score));
    } public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamScoreB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayAttemptsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.totalAttemptsA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayAttemptsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.totalAttemptsB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayShotsOnTargetA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsOnTargetA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayShotsOnTargetB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotOnTargetB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPassesA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.totalPassesA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPassesB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.totalPassesB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayCornersA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornersA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayCornersB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornersB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulsB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.foulsB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayYellowCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellowCardB);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedCardA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayRedCardB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.redCardB);
        scoreView.setText(String.valueOf(score));
    }


}
