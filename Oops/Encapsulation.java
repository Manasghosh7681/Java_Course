package Oops;
class Product{
    //private variables
    private int productId;
    private String productName;
    private double price;

    //setter method
    public void  setProductId(int productId){
        this.productId=productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }

    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }
    }

    //getter method
    public int getProductId(){
        return this.productId;
    }
    public String getProductName(){
        return this.productName;
    }
    public double getprice(){
        return this.price;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Product p=new Product();
        p.setProductId(101);
        p.setProductName("Laptop");
        p.setPrice(5000);

        System.out.println("Product Id :"+ p.getProductId());
        System.out.println("Product Name :"+ p.getProductName());
        System.out.println("Price :"+p.getprice());
    }
}
