package githubtest;

public class CD {
    private String title;
    private double price;
    
    
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public String toString(){
        
        String n = System.getProperty("line.separator");
        return getClass().getSimpleName() + n +
                "\ttitle: " + this.title + n +
                "\tprice: " + this.price;
    }
}
