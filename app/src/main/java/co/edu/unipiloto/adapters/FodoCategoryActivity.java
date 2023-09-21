package co.edu.unipiloto.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FodoCategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fodo_category);


        ArrayAdapter<Foods> adaptadorLista = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Foods.foods

        );


        ListView lista = (ListView) findViewById(R.id.lista_comidas);
        lista.setAdapter(adaptadorLista);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {

                Intent intent = new Intent(FodoCategoryActivity.this, FoodActivity.class);
                intent.putExtra(FoodActivity.EXTRA_FOODID, (int) id);
                startActivity(intent);
            }
        };

        lista.setOnItemClickListener(itemClickListener);


    }

}