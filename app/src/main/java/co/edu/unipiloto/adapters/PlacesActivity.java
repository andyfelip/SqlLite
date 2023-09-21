package co.edu.unipiloto.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlacesActivity extends AppCompatActivity {


    public static final String EXTRA_PLACESID = "placesId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);


        int placesId = (Integer)getIntent().getExtras().get(EXTRA_PLACESID);
        Places place = Places.places[placesId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(place.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(place.getDescription());

        ImageView image = (ImageView) findViewById(R.id.photo);
        image.setImageResource(place.getImageResourceId());
        image.setContentDescription(place.getDescription());


    }
}