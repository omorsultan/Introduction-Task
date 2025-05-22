package practice_problem_04;

public class filterProducts
{
    public void filterProduct(String category)
    {
        System.out.println("Searching for product in category: " + category);
    }
    public void filterProduct(int lowPrice,int highPrice)
    {
        System.out.println("Searching for product between :"+lowPrice +" to "+highPrice);
    }
    public void filterProduct(String brand,boolean isBrand)
    {
        if(isBrand==true)
        {
            System.out.println("Searching for products from band: "+ brand);
        }
        else
            filterProduct(brand);

    }
    public static void main(String[] args) {
filterProducts filter = new filterProducts();
filter.filterProduct("electronics");
    }
}
