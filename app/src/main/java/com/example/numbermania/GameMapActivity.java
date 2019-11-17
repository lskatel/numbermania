package com.example.numbermania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class GameMapActivity extends AppCompatActivity {
    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_map);

        tableLayout = findViewById(R.id.table_layout);
        fillTable();
    }

    private void fillTable() {
        TableRow tr = new TableRow(getApplicationContext());

        for (int i = 1; i < 10; i++) {
            TextView textView_1 = new TextView(getApplicationContext());
            textView_1.setGravity(Gravity.CENTER);
            textView_1.setBackgroundColor(0xfff);
            textView_1.setText(String.valueOf(i));

            tr.addView(textView_1);
        }

        tableLayout.addView(tr);
    }
}
