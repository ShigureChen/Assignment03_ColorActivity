package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Color Activity");

        String[] colourStr = new String[10];

        colourStr[0] = "Choose a color";
        colourStr[1] = "Red";
        colourStr[2] = "Yellow";
        colourStr[3] = "Cyan";
        colourStr[4] = "Light Gray";
        colourStr[5] = "Magenta";
        colourStr[6] = "Silver";
        colourStr[7] = "Blue";
        colourStr[8] = "Green";
        colourStr[9] = "Dark Gray";

        final int[] colourInt = new int[10];

        colourInt[0] = Color.WHITE;
        colourInt[1] = Color.RED;
        colourInt[2] = Color.YELLOW;
        colourInt[3] = Color.CYAN;
        colourInt[4] = Color.GRAY;
        colourInt[5] = Color.MAGENTA;
        colourInt[6] = Color.LTGRAY;
        colourInt[7] = Color.BLUE;
        colourInt[8] = Color.GREEN;
        colourInt[9] = Color.DKGRAY;

        spinner = findViewById(R.id.spinner);
        layout = findViewById(R.id.consLayout);
        final ColorAdapter adapter = new ColorAdapter(this,colourStr, colourInt);
        spinner.setAdapter(adapter);
        spinner.bringToFront();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                layout.setBackgroundColor(colourInt[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){

            }
        });


    }
}