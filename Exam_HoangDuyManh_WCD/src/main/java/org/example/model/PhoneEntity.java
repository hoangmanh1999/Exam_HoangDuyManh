package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "phone")
public class PhoneEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int ID;

@Column(name = "Name")
private String Name;

@Column(name="Brand")
private String Brand;

@Column(name = "Price")
private  int Price;

@Column(name = "Description")
private String Description;

public PhoneEntity(){

}
public PhoneEntity(String Name,String Brand,int Price,String Description){
this.Name=Name;
this.Brand=Brand;
this.Description=Description;
this.Price=Price;
}
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
