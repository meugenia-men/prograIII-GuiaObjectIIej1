import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private Float price;
    private Integer stock;
    private List<Author> authors;

    public Book() {
    }

    public Book(String title, Float price, Integer stock, List<Author> authors) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        StringBuilder names = new StringBuilder();
        for (Author author : authors) {
            if (author != null) {
                names.append(author.getName());
                names.append(" ");
                names.append(author.getSurname());
                names.append(" ,");
            }
        }
        return "Libro{" +
                "titulo='" + this.title + '\'' +
                ", precio=" + this.price +
                ", stock=" + this.stock +
                ", autor=" + names +
                '}';
    }

    public String printMessage() {
        StringBuilder names = new StringBuilder();
        for (Author author : authors) {
            if (author != null) {
                names.append(",");
                names.append(author.getName());
                names.append(" ");
                names.append(author.getSurname());
            }
        }
        return "El libro, " + this.title + " de " + names + " - Se vende a " + this.price + " pesos";
    }
}





