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

    private Button player2Minus5;
    private Button player2Minus;
    private Button player2Plus;
    private Button player2Plus5;

    private Button player3Minus5;
    private Button player3Minus;
    private Button player3Plus;
    private Button player3Plus5;

    private Button player4Minus5;
    private Button player4Minus;
    private Button player4Plus;
    private Button player4Plus5;

    private TextView player1Life;
    private TextView player2Life;
    private TextView player3Life;
    private TextView player4Life;
    private TextView playerLose;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerLose = (TextView) findViewById(R.id.playerLose);




        //PLAYER 1 BUTTONS
        player1Minus5 = (Button) findViewById(R.id.player1Minus5);
        player1Minus = (Button) findViewById(R.id.player1Minus);
        player1Plus = (Button) findViewById(R.id.player1Plus);
        player1Plus5 = (Button) findViewById(R.id.player1Plus5);
        player1Life = (TextView) findViewById(R.id.player1Life);
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



        // PLAYER 2 BUTTONS

        player2Minus5 = (Button) findViewById(R.id.player2Minus5);
        player2Minus = (Button) findViewById(R.id.player2Minus);
        player2Plus = (Button) findViewById(R.id.player2Plus);
        player2Plus5 = (Button) findViewById(R.id.player2Plus5);
        player2Life = (TextView) findViewById(R.id.player2Life);

        player2Minus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(2, player2Life, -5);
            }
        });

        player2Minus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(2, player2Life, -1);
            }
        });

        player2Plus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(2, player2Life, 1);
            }
        });

        player2Plus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(2, player2Life, 5);
            }
        });



        // PLAYER 3 BUTTONS

        player3Minus5 = (Button) findViewById(R.id.player3Minus5);
        player3Minus = (Button) findViewById(R.id.player3Minus);
        player3Plus = (Button) findViewById(R.id.player3Plus);
        player3Plus5 = (Button) findViewById(R.id.player3Plus5);
        player3Life = (TextView) findViewById(R.id.player3Life);

        player3Minus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(3, player3Life, -5);
            }
        });

        player3Minus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(3, player3Life, -1);
            }
        });

        player3Plus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(3, player3Life, 1);
            }
        });

        player3Plus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(3, player3Life, 5);
            }
        });



        // PLAYER 4 BUTTONS

        player4Minus5 = (Button) findViewById(R.id.player4Minus5);
        player4Minus = (Button) findViewById(R.id.player4Minus);
        player4Plus = (Button) findViewById(R.id.player4Plus);
        player4Plus5 = (Button) findViewById(R.id.player4Plus5);
        player4Life = (TextView) findViewById(R.id.player4Life);

        player4Minus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(4, player4Life, -5);
            }
        });

        player4Minus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(4, player4Life, -1);
            }
        });

        player4Plus.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(4, player4Life, 1);
            }
        });

        player4Plus5.setOnClickListener( new Button.OnClickListener() {
            public void onClick(View v) {
                adjustLife(4, player4Life, 5);
            }
        });





    }

    // Private helper class
    // Takes player number (1-4, for displaying PLAYER # LOSES label), player life TextView, and amount to change
    private void adjustLife(int playerNumber, TextView playerLife, int change) {
        int currentValue = Integer.parseInt(playerLife.getText().toString());
        playerLife.setText("" + (currentValue + change));
        if(currentValue + change <= 0) {
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
