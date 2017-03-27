package Utilities;

import java.util.*;

// In a full application, it is likely that there will be a lot of asserts or other actions related to products. By making a
// class with the properties of a product, I can initialize that and pass it around for more efficient code
public class TestProduct {

    String name;
    List<String> skus;

    public TestProduct()
    {
        // As with my test user, I'm hard-coding values here that would otherwise be pulled from
        // whatever data source would be appropriate for the product.

        name = "Han Solo in Carbonite Rug";
        skus = new ArrayList<String>();
        skus.add("019FE");
        skus.add("019FES");
    }

    public String getName() {
        return name;
    }

    public List<String> getSkus() {
        return skus;
    }

}
