package edu.washington.ryanr12.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    private Button player1Minus5;
    private Button player1Minus;
    private Button player1Plus;
    private Button player1Plus5;
    private TextView player1Life;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1Minus5 = (Button) findViewById(R.id.player1Minus5);
        player1Minus = (Button) findViewById(R.id.player1Minus);
        player1Plus = (Button) findViewById(R.id.player1Plus);
        player1Plus5 = (Button) findViewById(R.id.player1Plus5);
        player1Life = (TextView) findViewById(R.id.player1Life);
        //Log.i("UniqueMainActivity", "player1LMinus5: " + player1Minus5.toString()); //+ player1Life.toString());


        // PLAYER 1 BUTTONS
        player1Minus5.setOnClickListener( new Button.OnClickListener() {
           public void onClick(View v) {
               adjustLife(1, player1Life, -5);
           }
        });

        player1Minus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(1, player1Life, -1);
            }
        });

        player1Plus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(1, player1Life, 1);
            }
        });

        player1Plus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(1, player1Life, 5);
            }
        });

    }

    private void adjustLife(int playerNumber, TextView playerLife, int change) {
        //Log.i("UniqueMainActivity", "adjustLife fired");
        //playerLife.setText("CHANGED");

        int currentValue = Integer.parseInt(playerLife.getText().toString());
        playerLife.setText("" + (currentValue + change));
        if(currentValue + change <= 0) {
            TextView playerLose = (TextView) findViewById(R.id.playerLose);
            playerLose.setText("Player" + playerNumber + " LOSES!");
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
