package com.example.jpetsche12.mobilemouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTap(view v)
    {
        toast myToast = toast.makeText(getApplicationContext(),
                                        "Click!", toast.LENGTH_LONG);
        myToast.show();
    }
}
