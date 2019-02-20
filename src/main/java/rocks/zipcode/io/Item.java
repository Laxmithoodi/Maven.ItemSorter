package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {

    private  String name;
    private  Double price;
    private Long id;


    public Item() {
        this.name = "";
        this.price= 0.01;
        this.id = 0L;
    }

    public Item(Long id, String name, Double price) {

        this.name = name;
        this.price= price;
        this.id = id;


    }

    public String getName() { return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Long getId() { return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() { return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
