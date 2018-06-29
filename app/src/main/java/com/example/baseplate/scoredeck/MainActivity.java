package com.example.baseplate.scoredeck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreHong=0;
    int scoreChong=0;
    int warningHong=0;
    int warningChong=0;
    int roundNumber=1;
    int roundsHong=0;
    int roundsChong=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Set the number of rounds
    public void addRound(View v){
        int nextRound=roundNumber+=1;
        if(nextRound>=roundNumber){
            if(scoreHong>scoreChong){
                roundsHong++;
                roundsHongWon(roundsHong);
            }else{
                roundsChong++;
                roundsChongWon(roundsChong);
            }
        }
        showRoundNumber(nextRound);
    }
    public void roundsHongWon(int winnerHong){
        TextView hongWon = (TextView) findViewById(R.id.roundsHongWon);
        hongWon.setText(String.valueOf(winnerHong));
    }
    public void roundsChongWon(int winnerChong){
        TextView chongWon = (TextView) findViewById(R.id.roundsChongWon);
        chongWon.setText(String.valueOf(winnerChong));
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
        Toast.makeText(this,"Warnings: "+warningHong, Toast.LENGTH_SHORT).show();
        warningCheck(scoreHong);
        showHong(scoreHong);
    }
    public void warningCheck(int warn){
        if(warningHong==3){
            scoreHong-=1;
        }
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
        Toast.makeText(this, "Warnings: "+warningChong, Toast.LENGTH_SHORT).show();
        warningCheckChong(scoreChong);
        showChong(scoreChong);
    }
    public void warningCheckChong(int warn){
        if(warningChong==3){
            scoreChong-=1;
        }
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
        CheckBox completeReset = (CheckBox) findViewById(R.id.checkbox);
        boolean totalReset = completeReset.isChecked();
        if(totalReset) {
            scoreHong = 0;
            scoreChong = 0;
            warningHong = 0;
            warningChong = 0;
            roundNumber = 1;
            roundsHong = 0;
            roundsChong = 0;
            showHong(scoreHong);
            showChong(scoreChong);
            showRoundNumber(roundNumber);
            roundsHongWon(roundsHong);
            roundsChongWon(roundsChong);
        }
        else{
            scoreHong = 0;
            scoreChong = 0;
            warningHong = 0;
            warningChong = 0;
            showHong(scoreHong);
            showChong(scoreChong);
            showRoundNumber(roundNumber);
        }
    }
}
