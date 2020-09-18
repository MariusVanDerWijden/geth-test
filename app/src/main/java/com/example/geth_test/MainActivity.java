package com.example.geth_test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void log(final String s) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tv = findViewById(R.id.hello_world);
                tv.append(s);
                tv.append("\n");
                tv.setTextColor(Color.BLACK);
            }
        });
    }

    public void logFail() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tv = findViewById(R.id.hello_world);
                tv.setTextColor(Color.RED);
            }
        });
    }

    public void logSuccess() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tv = findViewById(R.id.hello_world);
                tv.setTextColor(Color.GREEN);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        log("\n\n");
        try {
            NodeTests.runInfuraTests(this);
            NodeTests.runLesTests(this);
            //WhisperTests.runWhisperTests(this);
            BindingTests.testBinding(this);
        } catch(Exception e) {
            log("Could not connect: " + e.toString());
            e.printStackTrace();
            logFail();
        }
    }
}
