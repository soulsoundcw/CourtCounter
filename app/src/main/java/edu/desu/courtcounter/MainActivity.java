package edu.desu.courtcounter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the 3 point button is clicked.
     */
    public void increment3a(View view) {
        scoreA = scoreA + 3;
        display(scoreA);
    }

    /**
     * This method is called when the 2 point button is clicked.
     */
    public void increment2a(View view) {
        scoreA = scoreA + 2;
        display(scoreA);
    }

    /**
     * This method is called when Free Throw point button is clicked.
     */
    public void increment1a(View view) {
        scoreA = scoreA + 1;
        display(scoreA);
    }

    /**
     * This method displays Team A score on the screen.
     */
    private void display(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.team_a_score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method is called when the 3 point button is clicked.
     */
    public void increment3b(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    /**
     * This method is called when the 2 point button is clicked.
     */
    public void increment2b(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    /**
     * This method is called when the Free Throw button is clicked.
     */
    public void increment1b(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    /**
     * This method displays Team B score on the screen.
     */
    private void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(
                R.id.team_b_score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void submitReset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayB(0);
        display(0);
    }
}
