public class Product {


    private String prodId;
    private String prodName;
    private double price;


    private int stockQuantity;

    public Product(String prodId, String prodName, double price, int stockQuantity) {
        this.prodId = prodId;
        this.prodName = prodName;

        if (price < 0) {
            this.price = 0.0;
        } 
        
        
        else 
            this.price = price;
        

        if (stockQuantity < 0) 
            this.stockQuantity = 0;
        
        else 
            this.stockQuantity = stockQuantity;
        
    }

    public String getProductId() {
        return prodId;
    }

    public String getProductName() {
        return prodName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductId(String prodId) {
        this.prodId = prodId;
    }

    public void setProductName(String prodName) {
        this.prodName = prodName;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            this.stockQuantity = 0;
        } else {
            this.stockQuantity = stockQuantity;
        }
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }
}