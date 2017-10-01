package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //Info-some of the activity's values when the activity was previously destroyed
        super.onCreate(savedInstanceState);  //Tells Android to restore those previous values
        setContentView(R.layout.activity_main);  //Puts buttons, text fields, images, etc. on the activity screen
        displayForTeamA(8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  //Creates activity's menu.
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);  //Put items (and perhaps sub-items) in your app's menu
        return true;  //Tells Android to display your app's menu
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {  //When the user taps an item
        //Handle action bar item clicks here.  The action bar will
        //automatically handle clicks on the Home/Up button, as long
        //as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();  //Grabs the code number of whatever item the user tapped

        if (id == R.id.action_settings) {  //Checks to find out if the user tapped this item
            return true;  //Tells Android that the tapping of this menu item has been handled
        }

        return super.onOptionsItemSelected(item);  //Tells Android to do what it normally does by default for menu item tap
    }

    public void addOneForTeamA(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View v){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB(View v){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}