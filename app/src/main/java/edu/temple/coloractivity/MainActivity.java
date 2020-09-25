package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Color Activity");

        String[] colourStr = new String[9];

        colourStr[0] = "Choose a color";
        colourStr[1] = "Red";
        colourStr[2] = "Cyan";
        colourStr[3] = "Red";
        colourStr[4] = "Gray";
        colourStr[5] = "Magenta";
        colourStr[6] = "Silver";
        colourStr[7] = "Teal";
        colourStr[8] = "Green";

        int[] colourInt = new int[9];

        colourInt[0] = Color.WHITE;
        colourInt[1] = Color.RED;
        colourInt[2] = Color.YELLOW;
        colourInt[3] = Color.CYAN;
        colourInt[4] = Color.GRAY;
        colourInt[5] = Color.MAGENTA;
        colourInt[6] = Color.LTGRAY;
        colourInt[7] = Color.BLUE;
        colourInt[8] = Color.GREEN;

        spinner = findViewById(R.id.spinner);

        final SpinnerAdapter adapter = new SpinnerAdapter(this,colourStr, colourInt);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
                adapterView.setBackgroundColor(Color.WHITE);
            }
        });


    }
}