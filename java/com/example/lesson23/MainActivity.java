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
    int count = 0;
//Mytest mytest = new Mytest();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(MY_TAG, "Creating view...");
        Toast.makeText(getApplicationContext(), "Creating view...", Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        //   setContentView(R.layout.activity_second); //Подключение разметки

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        textView.setText("");

        Log.v(MY_TAG, "View Created\n" + matrix.matrixToString(matrix.createMatrix(5, 5)));
    }

    public void GetName(View view) {
        name = editText.getText().toString();
        Unit [] units = new Unit[2];
        String[] str = name.split(" ");// new String[3];
        switch (str[0]) {
            case "robot":
                units[0] = new Robot(str[1],
                        Integer.parseInt(str[2]),
                        Integer.parseInt(str[3]));
                textView.append("Привет, " + units[0].printInfo() + "\n");

                break;
            case "wizard":
                Wizard wizard = new Wizard(str[1],
                        Integer.parseInt(str[2]),
                        Integer.parseInt(str[3]));

                textView.append("Привет, " + wizard.printInfo() + "\n");
                break;
            default:
                textView.setText("Привет, я не понял команды");
        }


        //textView.setText("Привет, "+name+"\n" + matrix.matrixToString(matrix.createMatrix(5, 5)));

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


    public void Close(View view) {
        finish();


    }
}