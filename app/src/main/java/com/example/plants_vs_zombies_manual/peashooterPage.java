package com.example.plants_vs_zombies_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class peashooterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peashooter_page);
    }
    public void goToMainPage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToZomiePage(View view) {
        Intent intent = new Intent(this, zombiePage.class);
        startActivity(intent);
    }
    public void goToPlantPage(View view) {
        Intent intent = new Intent(this, plantPage.class);
        startActivity(intent);
    }
}