package co.edu.unipiloto.adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StarBuzzDatabasehelper extends SQLiteOpenHelper {

    private static final String DB_NAME="starbuzz";
    private static final int DB_VERSION=1;
    //añadimos un constructor vacio
    public StarBuzzDatabasehelper(Context context) {
        super(context, DB_NAME,null, DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        updateMyDataBase(sqLiteDatabase,0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        updateMyDataBase(sqLiteDatabase, oldVersion, newVersion);
    }
    private static void insertBebida(SQLiteDatabase db, String nombre, String descripcion, int recursoId){
        ContentValues drinkValues = new ContentValues();
        drinkValues.put("NAME", nombre);
        drinkValues.put("DESCRIPTION", descripcion);
        drinkValues.put("IMAGE_RESOURCE_ID", recursoId);
        db.insert("DRINK", null, drinkValues);

    }
    private void updateMyDataBase(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion<1){
            db.execSQL("CREATE TABLE DRINK (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    +"NAME TEXT, "
                    +"DESCRIPTION TEXT, "
                    +"IMAGE_RESOURCE_ID INTEGER);");
            insertBebida(db, "Latte", "Una taza de cafe", R.drawable.latte);
            insertBebida(db, "Cappucchino", "Un Capucchino", R.drawable.cappuccino);
            insertBebida(db, "Filter", "Una taza de filter", R.drawable.filter);

        }

        if(oldVersion<2){
            db.execSQL("ALTER TABLE DRINK  ADD COLUMN FAVORITE NUMERIC;");
        }

    }
}
