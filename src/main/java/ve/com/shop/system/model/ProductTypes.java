package ve.com.shop.system.model;

import javax.persistence.*;

/**
 * Created by alejandro on 05/07/2017.
 */

@Entity
@Table(name="product_types", schema="shop")
public class ProductTypes implements java.io.Serializable{

    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="status")
    private Integer status;
    @ManyToOne
    @JoinColumn(name="idcategory")
    private Categories category;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }
}
