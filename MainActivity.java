package com.example.lesson23;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private final static String MY_TAG = "MainActivity0";
    Matrix matrix = new Matrix();
    TextView textView;
    EditText editText;
    Button button;
    String name;
    int count =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(MY_TAG, "Creating view...");
        Toast.makeText(getApplicationContext(), "Creating view...", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);



        Log.v(MY_TAG, "View Created\n" + matrix.matrixToString(matrix.createMatrix(5, 5)));
    }
    public void GetName(View view) {
         name= editText.getText().toString();
        //textView.setText("Привет, "+name+"\n" + matrix.matrixToString(matrix.createMatrix(5, 5)));
        textView.setText("Привет, "+name+"\n" + (count++));
    }
    @Override
    protected void onStart() {
        Log.v(MY_TAG, "Start Activity");
        Toast.makeText(getApplicationContext(), "Start Activity", Toast.LENGTH_LONG).show();
        super.onStart();
        Log.v(MY_TAG, "Started Activity");
        Toast.makeText(getApplicationContext(), "Started Activity", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStop() {
        Log.v(MY_TAG, "Stop Activity");
        Toast.makeText(getApplicationContext(), "Stop Activity", Toast.LENGTH_LONG).show();
        super.onStop();
        Log.v(MY_TAG, "Stopped Activity");

    }

    @Override
    protected void onRestart() {
        Log.v(MY_TAG, "Restart Activity");
        super.onRestart();
        Log.v(MY_TAG, "Restarted Activity");
    }

    @Override
    protected void onPause() {
        Log.v(MY_TAG, "Pause Activity");
        super.onPause();
        Log.v(MY_TAG, "Paused Activity");
    }

    @Override
    protected void onResume() {
        Log.v(MY_TAG, "Resume Activity");
        super.onResume();
        Log.v(MY_TAG, "Activity  Resume");
    }

    @Override
    protected void onDestroy() {
        Log.v(MY_TAG, "Destroy Activity");
        super.onDestroy();
        Log.v(MY_TAG, "Activity Destroy");
    }


}
