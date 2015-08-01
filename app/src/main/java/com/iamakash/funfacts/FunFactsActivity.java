package com.iamakash.funfacts;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.*;

public class FunFactsActivity extends Activity {

    private ShakeDetector mShakeDetector;
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;

    private factbook mFactBook = new factbook();
    private colorwheel mcolorwheel = new colorwheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        //declare view variables

        final TextView factlabel = (TextView) findViewById(R.id.facttextView);
        final Button showFactButton = (Button) findViewById(R.id.showfactbutton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getFact();
                //update label with dynamic fact
                factlabel.setText(fact);
                int color = mcolorwheel.getcolor();
                relativeLayout.setBackgroundColor(color);
            }
        };

        showFactButton.setOnClickListener(Listener);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector(new ShakeDetector.OnShakeListener() {
            @Override
            public void onShake() {
                String fact = mFactBook.getFact();
                //update label with dynamic fact
                factlabel.setText(fact);
                int color = mcolorwheel.getcolor();
                relativeLayout.setBackgroundColor(color);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(mShakeDetector, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
        // Registers (mShakeDetector which implements) SensorEventListener
    }

    @Override
    protected void onPause() {
        mSensorManager.unregisterListener(mShakeDetector);
        super.onPause();
    }
}