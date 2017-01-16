package com.sino.nextkeyboard;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sino.keyboard.OnKeyActionListener;
import com.sino.keyboard.VehicleNumberKeyboard;

public class MainActivity extends AppCompatActivity {
    private int sdkInt;
    private Activity act;
    VehicleNumberKeyboard keyboard = null;
    private EditText mDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDisplay = (EditText) findViewById(R.id.display);

        final Button vehicle = (Button) findViewById(R.id.vehicle);

        mDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VehicleNumberKeyboard keyboard = new VehicleNumberKeyboard(MainActivity.this, new OnKeyActionListener() {
                    @Override
                    public void onFinish(String input) {
                        mDisplay.setText(input);
                    }

                    @Override
                    public void onProcess(String input) {
                        mDisplay.setText(input);
                    }
                });
                keyboard.setDefaultPlateNumber("");
                keyboard.show(getWindow().getDecorView().getRootView());
            }
        });

        vehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VehicleNumberKeyboard keyboard = new VehicleNumberKeyboard(MainActivity.this, new OnKeyActionListener() {
                    @Override
                    public void onFinish(String input) {
                        mDisplay.setText(input);
                    }

                    @Override
                    public void onProcess(String input) {
                        mDisplay.setText(input);
                    }
                });
                keyboard.setDefaultPlateNumber("");
                keyboard.show(getWindow().getDecorView().getRootView());
            }
        });
    }
}
