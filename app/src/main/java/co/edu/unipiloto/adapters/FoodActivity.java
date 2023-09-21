package co.edu.unipiloto.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodId = (Integer)getIntent().getExtras().get(EXTRA_FOODID);
        Foods food = Foods.foods[foodId];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(food.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(food.getDescription());

        ImageView image = (ImageView) findViewById(R.id.photo);
        image.setImageResource(food.getImageResourceId());
        image.setContentDescription(food.getDescription());
    }
}