package com.example.unitconverter;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText inputValue = findViewById(R.id.inputValue);
        Button convertBtn = findViewById(R.id.convertBtn);
        TextView resultText = findViewById(R.id.resultText);

        convertBtn.setOnClickListener(v -> {

            double cm = Double.parseDouble(
                    inputValue.getText().toString());

            double meter = cm / 100;

            resultText.setText("Meters = " + meter);

        });
    }
}