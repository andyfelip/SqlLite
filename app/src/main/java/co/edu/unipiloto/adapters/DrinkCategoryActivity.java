package co.edu.unipiloto.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        //crear un array adapter para cargar la fuente de datos


        ArrayAdapter<Drink> adaptadorLista = new ArrayAdapter<>(
                this,
                 android.R.layout.simple_list_item_1,
                 Drink.drinks
        );

        //Definir la salida del adpatador
        ListView lista = (ListView) findViewById(R.id.lista_bebidas);
        lista.setAdapter(adaptadorLista);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemview, int position, long id) {
                Intent intent = new Intent(DrinkCategoryActivity.this, Drink_Activity.class);
                intent.putExtra(Drink_Activity.EXTRA_DRINKID, (int) id);
                startActivity(intent);
            }
        };

        lista.setOnItemClickListener(itemClickListener);
    }
}