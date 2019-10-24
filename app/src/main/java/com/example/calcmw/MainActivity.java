package com.example.calcmw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float a, b, c;
    String sym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("KEY", "STRING");
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        String variable = savedInstanceState.getString("KEY", "DEFAULT STRING VALUE")
    }


    public void nacisnij(View view) {

        TextView liczba = (TextView) findViewById(R.id.wpisz);
        Button presedButton = (Button) view;
        sym = presedButton.getText().toString();
        if (liczba.getText() == "0") {
            liczba.setText("");
        }

        switch(sym) {


            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                liczba.setText(liczba.getText() + sym);
                break;
            case "AC":
                liczba.setText("0");
                break;
            case "+":
                liczba.setText(a+b+"");
                break;
            case "-":
                liczba.setText(a-b+"");
                break;
            case "*":
                liczba.setText(a*b+"");
                break;
            case "/":
                liczba.setText(a/b+"");
                break;
            case "+/-":
                liczba.setText("(-");
                break;
            case ".":
                liczba.setText(".");
                break;
            case "%":
                liczba.setText("%");
                break;
            case "log10":
                break;
            case "x!":
                for (int i=a; a>1; a++){
                    int c * = i;
                }
                liczba.setText(c);
                break;
            case "sqrt(x)":
                break;
            case "x^3":
                liczba.setText(a*a*a+"");
            case "x^2":
                liczba.setText(a*a+"");
        }


    }


}
