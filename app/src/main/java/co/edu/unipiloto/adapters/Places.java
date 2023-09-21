package co.edu.unipiloto.adapters;

public class Places {


    private String name;

    private String description;

    private int ImageResourceId;



    public static final Places[] places = {

            new Places("Nueva York", "Starbuck ubicado en nueva york", R.drawable.lugar1),
            new Places("Los Angeles", "Starbuck ubicado en Los angeles", R.drawable.lugar2),
            new Places("Miamo", "Starbuck ubicado en miami", R.drawable.lugar3)

    };

    private Places(String name, String description, int imageResourceId){

        this.name = name;
        this.description = description;
        this.ImageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String toString(){

        return name;
    }
}
