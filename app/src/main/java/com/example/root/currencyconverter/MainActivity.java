package com.example.root.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //convert method will be activated by a view thats why the parameter is a view object
    public void convert(View view){
        //get the view(edittext)
        EditText dollarview=(EditText) findViewById(R.id.editText);
        //log input to logcat
        Log.i("dollar",dollarview.getText().toString());
    }
}
