package com.example.numbermania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);

        Button btn_1_18 = findViewById(R.id.btn_1_18);
        btn_1_18.setOnClickListener(gameLaunchClickHandler);

        Button btn_1_19 = findViewById(R.id.btn_1_19);
        btn_1_19.setOnClickListener(gameLaunchClickHandler);
    }

    private View.OnClickListener gameLaunchClickHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(GameModeActivity.this, GameMapActivity.class);
            startActivity(intent);
        }
    };
}
