package co.edu.unipiloto.adapters;

public class Foods {


    private String name;
    private String description;
    private int imageResourceId;



    public static final Foods[] foods = {


            new Foods("Dona", "una dona de chocolate, fresa y canela", R.drawable.dona),
            new Foods("Sandwich", "un sandwich de jamon y queso", R.drawable.sandwich),
            new Foods("Galleta", "una galleta de chocolate", R.drawable.galleta)


    };

    private Foods(String name, String description, int ImageResourceId){

        this.name = name;
        this.description = description;
        this.imageResourceId = ImageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString(){
        return name;
    }
}
