package comp380.csun.you_til;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DiceRollActivity4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView die4Txt = (TextView)findViewById(R.id.die4TextView);
        Button roll4Button = (Button)findViewById(R.id.buttonRollDice4);

        roll4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                die4Txt.setText("");
                int rand = (int)(Math.random()*3);

                if(rand == 0) {
                    die4Txt.setText("1");
                }
                else if(rand == 1) {
                    die4Txt.setText("2");
                }
                else if(rand == 2) {
                    die4Txt.setText("3");
                }
                else if(rand == 3) {
                    die4Txt.setText("3");
                }
                else {
                    die4Txt.setText("error");
                }
            }
        });



    }
}
