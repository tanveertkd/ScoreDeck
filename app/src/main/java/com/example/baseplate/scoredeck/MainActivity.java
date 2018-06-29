package com.example.baseplate.scoredeck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreHong=0;
    int scoreChong=0;
    int warningHong=0;
    int warningChong=0;
    int roundNumber=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Set the number of rounds
    public void addRound(View v){
        roundNumber+=1;
        showRoundNumber(roundNumber);
    }
    public void subRound(View v){
        if(roundNumber==1){
            Toast.makeText(this,"Match must have at least one round", Toast.LENGTH_SHORT).show();
            return;
        }
        roundNumber-=1;
        showRoundNumber(roundNumber);
    }
    public void showRoundNumber(int rounds)
    {
        TextView round=(TextView) findViewById(R.id.roundnumber);
        round.setText(String.valueOf(rounds));
    }
    //Add points for Hong
    public void addOneHong(View v){
        scoreHong+=1;
        showHong(scoreHong);
    }
    public void addTwoHong(View v){
        scoreHong+=2;
        showHong(scoreHong);
    }
    public void addThreeHong(View v){
        scoreHong+=3;
        showHong(scoreHong);
    }
    public void addFourHong(View v){
        scoreHong+=4;
        showHong(scoreHong);
    }
    public void addFiveHong(View v){
        scoreHong+=5;
        showHong(scoreHong);
    }
    public void addWarningHong(View v){
        warningHong+=1;
    }
    //Substract for Hong
    public void subOneHong(View v){
        scoreHong-=1;
        showHong(scoreHong);
    }
    public void subTwoHong(View v){
        scoreHong-=2;
        showHong(scoreHong);
    }
    public void subThreeHong(View v){
        scoreHong-=3;
        showHong(scoreHong);
    }
    public void subFourHong(View v){
        scoreHong-=4;
        showHong(scoreHong);
    }
    public void subFiveHong(View v){
        scoreHong-=5;
        showHong(scoreHong);
    }
    public void subWarningHong(View v){
        warningHong-=1;
    }
    public void showHong(int Score){
        TextView hongScore=(TextView) findViewById(R.id.hongS);
        hongScore.setText(String.valueOf(Score));
    }

    //Add points for Chong

    public void addOneChong(View v){
        scoreChong+=1;
        showChong(scoreChong);
    }
    public void addTwoChong(View v){
        scoreChong+=2;
        showChong(scoreChong);
    }
    public void addThreeChong(View v){
        scoreChong+=3;
        showChong(scoreChong);
    }
    public void addFourChong(View v){
        scoreChong+=4;
        showChong(scoreChong);
    }
    public void addFiveChong(View v){
        scoreChong+=5;
        showChong(scoreChong);
    }
    public void addWarningChong(View v){
        warningChong+=1;
    }
    //Substract for Chong
    public void subOneChong(View v){
        scoreChong-=1;
        showChong(scoreChong);
    }
    public void subTwoChong(View v){
        scoreChong-=2;
        showChong(scoreChong);
    }
    public void subThreeChong(View v){
        scoreChong-=3;
        showChong(scoreChong);
    }
    public void subFourChong(View v){
        scoreChong-=4;
        showChong(scoreChong);
    }
    public void subFiveChong(View v){
        scoreChong-=5;
        showChong(scoreChong);
    }
    public void subWarningChong(View v){
        warningChong-=1;
    }
    public void showChong(int Score){
        TextView chongScore=(TextView) findViewById(R.id.chongS);
        chongScore.setText(String.valueOf(Score));
    }
    public void resetBtn(View v){
        //ImageView resetScores=(ImageView) findViewById(R.id.reset);
        scoreHong=0;
        scoreChong=0;
        showHong(scoreHong);
        showChong(scoreChong);
    }
}
