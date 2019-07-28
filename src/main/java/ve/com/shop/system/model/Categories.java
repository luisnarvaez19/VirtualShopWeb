package ve.com.shop.system.model;

import javax.persistence.*;

/**
 * Created by alejandro on 05/07/2017.
 */

@Entity
@Table(name="categories", schema="shop")
public class Categories implements java.io.Serializable{

    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
    @Column(name="category")
    private String category;
    @Column(name="description")
    private String description;
    @Column(name="status")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
