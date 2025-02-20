package com.kursach.explorejapan;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_layout);

        replaceFragment(new HomeFragment());

        ImageButton mapButton = findViewById(R.id.map_button);
        ImageButton sectionsButton = findViewById(R.id.sections_button);
        ImageButton homeButton = findViewById(R.id.home_button);
        ImageButton tipsButton = findViewById(R.id.tips_button);
        ImageButton infoButton = findViewById(R.id.info_button);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new MapFragment());
            }
        });

        sectionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new SectionsFragment());
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new HomeFragment());
            }
        });

        tipsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new TipsFragment());
            }
        });

        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new InfoFragment());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_content, fragment);
        transaction.commit();
    }
}