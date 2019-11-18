package com.example.numbermania;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
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
        fillTableMethod_1_18();
    }

    private void fillTableMethod_1_18() {
        TableRow tr_1 = new TableRow(getApplicationContext());
        tr_1.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.MATCH_PARENT));

        for (int i = 1; i < 10; i++) {
            TextView tv = createTextView(String.valueOf(i));
            tr_1.addView(tv);
        }

        tableLayout.addView(tr_1);

        TableRow tr_2 = new TableRow(getApplicationContext());
        tr_2.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.MATCH_PARENT));

        tr_2.addView(createTextView("1"));
        tr_2.addView(createTextView("0"));
        tr_2.addView(createTextView("1"));
        tr_2.addView(createTextView("1"));
        tr_2.addView(createTextView("1"));
        tr_2.addView(createTextView("2"));
        tr_2.addView(createTextView("1"));
        tr_2.addView(createTextView("3"));
        tr_2.addView(createTextView("1"));
        tableLayout.addView(tr_2);

        TableRow tr_3 = new TableRow(getApplicationContext());
        tr_3.setLayoutParams(new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.MATCH_PARENT));

        tr_3.addView(createTextView("4"));
        tr_3.addView(createTextView("1"));
        tr_3.addView(createTextView("5"));
        tr_3.addView(createTextView("1"));
        tr_3.addView(createTextView("6"));
        tr_3.addView(createTextView("1"));
        tr_3.addView(createTextView("7"));
        tr_3.addView(createTextView("1"));
        tr_3.addView(createTextView("8"));
        tableLayout.addView(tr_3);
    }

    private TextView createTextView(String text) {
        TextView tv = new TextView(getApplicationContext());
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.WHITE);
        tv.setText(text);

        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(2,2,2,2);
        tv.setLayoutParams(layoutParams);

        return tv;
    }
}
