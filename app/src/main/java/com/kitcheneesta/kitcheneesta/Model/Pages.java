package com.kitcheneesta.kitcheneesta.Model;

import com.kitcheneesta.kitcheneesta.R;

/**
 * Created by Jashan on 18/07/2015.
 */
public class Pages {
    private static final int cakePrice = 700;
    private static final int creamPrice = 350;
    private static final OrderObject [] flavours = {
            new OrderObject(R.drawable.red_velvet_cake, "Red Velvet", cakePrice),
            new OrderObject(R.drawable.chocolate_truffle, "Chocolate Truffle", cakePrice),
            new OrderObject(R.drawable.cheescake_base, "Cheescake", cakePrice)
    };
    public static final OrderPage cakePage = new OrderPage("Step 1: Choose a Base Flavour"
            , flavours);
    private static final OrderObject [] creams = {
            new OrderObject(R.drawable.choco_ganache, "Rich Chocolate Ganache",
                    creamPrice),
            new OrderObject(R.drawable.cinnamon_cream, "Cinnamon Cream",
                    creamPrice),
            new OrderObject(R.drawable.choco_cream, "Chocolate Buttercream",
                    creamPrice),
            new OrderObject(R.drawable.oreo_cream, "Oreo Buttercream",
                    creamPrice),
            new OrderObject(R.drawable.lemon_cream, "Rich Lemon Cream",
                    creamPrice),
            new OrderObject(R.drawable.caramel_cream, "Salted Caramel Glaze",
                    creamPrice),
            new OrderObject(R.drawable.honey_cream, "Rich Honey",
                    creamPrice),
            new OrderObject(R.drawable.blueberry_topping, "Blueberry",
                    creamPrice),
            new OrderObject(R.drawable.vanilla_cream, "Vanilla Buttercream",
                    creamPrice)
    };
    public static final OrderPage creamPage = new OrderPage(
            "Step Two: Select a topping", creams
    );
    public static final int [] themePics = {
            R.drawable.simran_birthday_cake,
            R.drawable.flower_cake,
            R.drawable.messi_theme_cake,
            R.drawable.theme_christmas
    };
    private static final OrderObject [] weightObjects = {
            new OrderObject(R.drawable.button_bg, "0.5 Kg Cake - Rs. 600", 600),
            new OrderObject(R.drawable.button_bg, "1 Kg Cake - Rs. 1100", 1100),
            new OrderObject(R.drawable.button_bg, "1.5 Kg Cake - Rs. 1500", 1500),
            new OrderObject(R.drawable.button_bg, "2 Kg Cake - Rs. 1800", 1800),
            new OrderObject(R.drawable.button_bg, "3 Kg Cake - Rs. 2800", 2800)
    };

    public static final OrderPage weights = new OrderPage("Select The Weight of Your Cake",
            weightObjects);
    private static final OrderObject [] sugar = {
            new OrderObject(R.drawable.button_bg, "Yes (add Rs. 100)", 100),
            new OrderObject(R.drawable.button_bg, "No", 0)
    };
    public static final OrderPage sugarPage =
            new OrderPage("Would you like the cake to be Sugarfree?", sugar);
}
