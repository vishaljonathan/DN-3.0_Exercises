public class LinearSearch
{
    public static Product linearSearch(Product[] products, String targetName)
    {
        for (Product product : products)
        {
            if (product.getProductName().equals(targetName))
            {
                return product;
            }
        }
        return null; // Product not found
    }
}
