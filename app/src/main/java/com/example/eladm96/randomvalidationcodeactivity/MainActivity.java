package com.example.eladm96.randomvalidationcodeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //object from validation code
    ValidationCode code;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //new object for the message above the code
        final TextView message = (TextView) findViewById(R.id.message);

        //new object for the code
        final TextView viewCode = (TextView) findViewById(R.id.vCode);

        //new object for the layout image and setting it up
        final ImageView rideAirLogo = (ImageView) findViewById(R.id.rideAirLogo);
        rideAirLogo.setImageResource(R.drawable.ride_air_logo);

        //new object from Validation code
        code = new ValidationCode();

        //input for message
        message.setText("Your validation code is:");
        //input for viewCode
        code.setCode();
        viewCode.setText(code.getCode());

    }
}
