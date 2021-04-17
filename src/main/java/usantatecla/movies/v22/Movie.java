package usantatecla.movies.v22;

public class Movie {

    private String title;

    private usantatecla.movies.v22.Price price;

    public Movie(String title, usantatecla.movies.v22.Price price) {
        this.title = title;
        this.price = price;
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

}