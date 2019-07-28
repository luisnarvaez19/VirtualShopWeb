package ve.com.shop.system.model;

import javax.persistence.*;

/**
 * Created by alejandro on 29/06/2017.
 */

@Entity
@Table(name="products", schema="shop")
public class Products implements java.io.Serializable{

    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="size")
    private String size;
    @Column(name="color")
    private String color;
    @Column(name="brand")
    private String brand;
    @Column(name="price")
    private Double price;
    @Column(name="existence")
    private Integer existence;
    @Column(name="status")
    private Integer status;
    @ManyToOne
    @JoinColumn(name="idtype")
    private ProductTypes type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getExistence() {
        return existence;
    }

    public void setExistence(Integer existence) {
        this.existence = existence;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ProductTypes getType() {
        return type;
    }

    public void setType(ProductTypes type) {
        this.type = type;
    }
}
