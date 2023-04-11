package com.example.plants_vs_zombies_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class zombiePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zombie_page);
    }
    public void goToPlantPage(View view) {
        Intent intent = new Intent(this, plantPage.class);
        startActivity(intent);
    }
    public void goToMainPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToZStandartPage(View view) {
        Intent intent = new Intent(this, zStandart.class);
        startActivity(intent);
    }
    public void goToZMinerPage(View view) {
        Intent intent = new Intent(this, zMiner.class);
        startActivity(intent);
    }
    public void goToZDuckPage(View view) {
        Intent intent = new Intent(this, zDuck.class);
        startActivity(intent);
    }
    public void goToZFootballPage(View view) {
        Intent intent = new Intent(this, zFootball.class);
        startActivity(intent);
    }
}