package comp380.csun.you_til;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

//well wthjggk
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonPlus;
    private Button buttonMinus;
    private Button buttonDecimal;
    private Button buttonDivide;
    private Button buttonClear;
    private Button buttonEqual;
    private Button buttonMultiply;
    private TextView textViewAnswer;
    private TextView textViewInput;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private final char EQU= 0;

    //PRACTICE CLEAR
    //private Button clear2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        setupUIViews();

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + "9");
            }
        });





        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInput.setText(textViewInput.getText().toString() + ".");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                textViewAnswer.setText(String.valueOf(val1) + " + ");
                textViewInput.setText(null);
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                textViewAnswer.setText(String.valueOf(val1) + " - ");
                textViewInput.setText(null);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                textViewAnswer.setText(String.valueOf(val1) + " / ");
                textViewInput.setText(null);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                textViewAnswer.setText(String.valueOf(val1) + " * ");
                textViewInput.setText(null);
            }
        });

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    compute();
                    ACTION = EQU;
                    textViewAnswer.setText(textViewAnswer.getText().toString() +  String.valueOf(val2) + "=" + String.valueOf(val1));   // 1 +2 =3
                    textViewInput.setText(null);
                }
            });





        ///////////////////////////////////////////////////////////////////////// I    FIGURED IT OUUUTTT !!!!!!!!!!!!
        /*
        clear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // compute();
                val1 = Double.NaN;                       //I added this part, take off when u want original
                val2 = Double.NaN;                       //I added this part, take off when u want original

                //I added this part, take off when u want original
                textViewAnswer.setText(null);
                textViewInput.setText(null);
            }
        });

         */
        ///////////////////////////////////////////////////////////////////////



            buttonClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //WTF U DON'T NEED THIS
                   // compute();


                    if(textViewInput.getText().length() > 0 )
        {
            CharSequence name = textViewInput.getText().toString();
            textViewInput.setText(name.subSequence(0, name.length()-1 ));



         //   val1 = Double.NaN;                       //I added this part, take off when u want original
         //   val2 = Double.NaN;                       //I added this part, take off when u want original
         //   textViewInput.setText(null);             //I added this part, take off when u want original
         //   textViewAnswer.setText(null);            //I added this part, take off when u want original



        }
        else
        {


            val1 = Double.NaN;
            val2 = Double.NaN;
            textViewInput.setText(null);
            textViewAnswer.setText(null);
        }




    }


});



    }

    public void setupUIViews()
    {
        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        buttonPlus = (Button) findViewById(R.id.button_plus);
        buttonMinus = (Button) findViewById(R.id.button_minus);
        buttonDecimal = (Button) findViewById(R.id.button_decimal);
        buttonDivide = (Button) findViewById(R.id.button_divide);
        buttonMultiply = (Button) findViewById(R.id.button_multiply);
        buttonClear = (Button) findViewById(R.id.button_clear);
        buttonEqual = (Button) findViewById(R.id.button_equal);
        textViewAnswer = (TextView) findViewById(R.id.textView_answer);    //////////////////////////////////
        textViewInput = (TextView) findViewById(R.id.textView_input);      //////////////////////////////////

        // PRACTICE CLEAR
        //clear2=(Button)findViewById(R.id.clear2);
    }

    private void compute()
    {

        if(!Double.isNaN(val1))   // if val1 one is not # it will go to else
        {
            val2 = Double.parseDouble(textViewInput.getText().toString());

            switch(ACTION)
            {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 *  val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;

            }
        }
        else
           {
                val1 = Double.parseDouble(textViewInput.getText().toString());
            }
   }












}
