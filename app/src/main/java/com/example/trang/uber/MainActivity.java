package com.example.trang.uber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mDriver, mCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDriver= (Button) findViewById(R.id.driver);
        mCustomer= (Button) findViewById(R.id.customer);

        mDriver.setOnClickListener(new View.OnClickListener());

    }
}
