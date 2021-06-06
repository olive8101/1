package carshalton.pages;

public class TestDataSetup extends ExtendedPageObject{
    public static String getProductName() {
        return productName;
    }

    public static void setProductName(String productName) {
        TestDataSetup.productName = productName;
    }

    public static String productName;
}
