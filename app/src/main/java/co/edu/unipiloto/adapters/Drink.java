package co.edu.unipiloto.adapters;

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;


        public static final Drink[] drinks = {

                new Drink("Latte", "A couple of expresso shots with steamed milk", R.drawable.latte),
                new Drink("Capuccino", "Expresso to milk, and a steamed milk foam", R.drawable.cappuccino),
                new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)


        };

        private Drink(String name, String description, int imageResourcedId){

            this.name = name;
            this.description= description;
            this.imageResourceId = imageResourcedId;

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

    @Override
    public String toString() {
        return name;
    }
}


