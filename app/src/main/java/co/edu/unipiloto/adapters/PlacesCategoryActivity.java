package co.edu.unipiloto.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlacesCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_category);

    ArrayAdapter<Places> adaptadorLista = new ArrayAdapter<>(
            this,
            android.R.layout.simple_list_item_1,
            Places.places
    );

        ListView lista = (ListView) findViewById(R.id.lista_lugares);
        lista.setAdapter(adaptadorLista);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int posicion, long id) {

                Intent intent = new Intent(PlacesCategoryActivity.this, PlacesActivity.class);
                intent.putExtra(PlacesActivity.EXTRA_PLACESID, (int) id);
                startActivity(intent);
            }
        };
        lista.setOnItemClickListener(itemClickListener);
    }
}