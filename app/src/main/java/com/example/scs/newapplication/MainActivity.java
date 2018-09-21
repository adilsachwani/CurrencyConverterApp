package com.example.scs.newapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText dollarAmount;
    Button convertButton;
    TextView convertAmount;
    ImageView dollarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dollarAmount = (EditText) findViewById(R.id.dollar_amount);
        convertButton = (Button) findViewById(R.id.convert_button);
        convertAmount = (TextView) findViewById(R.id.convert_amount);
        dollarImage = (ImageView) findViewById(R.id.dollar_image);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dollarImage.setVisibility(View.GONE);

                int dollar = Integer.parseInt(dollarAmount.getText().toString());
                long convert = Math.round(dollar * 123.3);

                convertAmount.setText("Rs." + convert + "/-");

            }
        });

    }
}
