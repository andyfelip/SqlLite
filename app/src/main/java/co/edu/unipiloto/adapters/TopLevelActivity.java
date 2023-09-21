package co.edu.unipiloto.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);


        //Crear un escucha on item click

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View itemView, int position, long id) {

                if(position == 0){

                        Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                        startActivity(intent);

                }else if(position == 1){

                        Intent intent = new Intent(TopLevelActivity.this, FodoCategoryActivity.class);
                        startActivity(intent);

                }else if(position == 2){

                        Intent intent = new Intent(TopLevelActivity.this, PlacesCategoryActivity.class);
                        startActivity(intent);

                }


            }
        };

        ListView lista = (ListView) findViewById(R.id._dynamic);
        lista.setOnItemClickListener(itemClickListener);

    }
}