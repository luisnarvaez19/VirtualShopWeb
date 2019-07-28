package ve.com.shop.system.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by alejandro on 28/06/2017.
 */


@Entity
@Table(name="users", schema="shop")
public class Users implements java.io.Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
    @Column(name="first_names")
    private String first_names;
    @Column(name="second_names")
    private String second_names;
    @Column(name="username")
    private String username;
    @Column(name="identity_code")
    private String identityCode;
    @Column(name="address")
    private String address;
    @Column(name="email")
    private String email;
    @Column(name="mobile_phone")
    private String mobilePhone;
    @Column(name="local_phone")
    private String localPhone;
    @Column(name="password")
    private String password;
    @Column(name="registration_date")
    private Date registrationDate;
    @Column(name="rol")
    private String rolUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst_names() {
        return first_names;
    }

    public void setFirst_names(String first_names) {
        this.first_names = first_names;
    }

    public String getSecond_names() {
        return second_names;
    }

    public void setSecond_names(String second_names) {
        this.second_names = second_names;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getLocalPhone() {
        return localPhone;
    }

    public void setLocalPhone(String localPhone) {
        this.localPhone = localPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRolUser() {
        return rolUser;
    }

    public void setRolUser(String rolUser) {
        this.rolUser = rolUser;
    }

    public String toString(){
        return "User: "+this.username;
    }
}
