package com.example.pong2dgame;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game); // Ensure this layout file exists
    }

    // This method is linked to a button or other UI element in the XML layout
    public void startGame(View view) {
        Intent intent = new Intent(GameActivity.this, PongActivity.class); // Ensure PongActivity exists
        startActivity(intent);
    }
}
