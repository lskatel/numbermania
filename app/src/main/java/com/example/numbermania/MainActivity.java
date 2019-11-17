package com.example.numbermania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_new_game = findViewById(R.id.btn_new_game);
        btn_new_game.setOnClickListener(newGameClickHandler);
    }

    private View.OnClickListener newGameClickHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, GameModeActivity.class);
            startActivity(intent);
        }
    };
}
