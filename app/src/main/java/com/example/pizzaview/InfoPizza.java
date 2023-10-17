package com.example.pizzaview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoPizza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pizza);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nom = extras.getString("pizza_nom");
            int imageResource = extras.getInt("pizza_image");
            String description = extras.getString("pizza_description");
            String details = extras.getString("detailsIngred");
            String preparation = extras.getString("preparation");


            TextView nomTextView = findViewById(R.id.nom);
            ImageView imageImageView = findViewById(R.id.img);
            TextView descriptionTextView = findViewById(R.id.description1);
            TextView preparationView = findViewById(R.id.prepration1);
            TextView ing = findViewById(R.id.ingrediant);

            nomTextView.setText(nom);
            imageImageView.setImageResource(imageResource);
            descriptionTextView.setText(description);
            preparationView .setText(preparation);
            ing.setText(details);
        }
    }
}