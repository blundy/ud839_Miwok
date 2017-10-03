/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView location = (TextView) findViewById(R.id.location);

        // Set a click listener on that View
        location.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent locationsIntent = new Intent(MainActivity.this, LocationActivity.class);

                // Start the new activity
                startActivity(locationsIntent);
            }
        });

        // Find the View that shows the family category
        TextView sights = (TextView) findViewById(R.id.sights);

        // Set a click listener on that View
       sights.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);

                // Start the new activity
                startActivity(sightsIntent);
            }
        });

        // Find the View that shows the colors category
        TextView activities = (TextView) findViewById(R.id.activities);

        // Set a click listener on that View
        activities.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent activitiesIntent = new Intent(MainActivity.this, ActivitiesActivity.class);

                // Start the new activity
                startActivity(activitiesIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView slideshow = (TextView) findViewById(R.id.slideshow);

        // Set a click listener on that View
        slideshow.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent slideshowIntent = new Intent(MainActivity.this, SlideshowActivity.class);

                // Start the new activity
                startActivity(slideshowIntent);
            }
        });
    }
}
