package com.guy.class24b_andb_6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView main_LST_properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LST_properties = findViewById(R.id.main_LST_properties);

        Imager.initHelper(this);

        ArrayList<Property> properties = DataManager.generate();
        Adapter_Property adapterProperty = new Adapter_Property(properties);
        main_LST_properties.setLayoutManager(new LinearLayoutManager(this));
        main_LST_properties.setItemAnimator(new DefaultItemAnimator());
        main_LST_properties.setAdapter(adapterProperty);


    }
}