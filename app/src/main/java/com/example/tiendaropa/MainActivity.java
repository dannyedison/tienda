package com.example.tiendaropa;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init ();

    }
    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("Jean Clásico Hombre", "$150.000", R.drawable.pantalon));
        elements.add(new ListElement("Camisa Casual Hombre", "$100.000", R.drawable.camisa));
        elements.add(new ListElement("Gorra Deportiva", "$50.800", R.drawable.gorra));
        elements.add(new ListElement("Camiseta ", "$60.800", R.drawable.camiseta));
        elements.add(new ListElement("Zapato en Cuero", "$160.000", R.drawable.zapato));

        ListAdapter listAdapter  = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}
