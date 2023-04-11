package com.example.plants_vs_zombies_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class plantPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_page);
    }
    public void goToMainPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToZomiePage(View view) {
        Intent intent = new Intent(this, zombiePage.class);
        startActivity(intent);
    }
    public void goToPeashooterPage(View view) {
        Intent intent = new Intent(this, peashooterPage.class);
        startActivity(intent);
    }
    public void goToCherrytPage(View view) {
        Intent intent = new Intent(this, cherryPage.class);
        startActivity(intent);
    }
    public void goToCactusPage(View view) {
        Intent intent = new Intent(this, cactusPage.class);
        startActivity(intent);
    }
    public void goToGarlicPage(View view) {
        Intent intent = new Intent(this, garlicPage.class);
        startActivity(intent);
    }
}