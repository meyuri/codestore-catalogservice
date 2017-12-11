package net.codesity.codestore.CatalogService.core.model.data;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Product implements Comparable<Product>
{
    @Getter @Setter private int id;
    @Getter @Setter private String name;
    @Getter @Setter private String description;
    @Getter @Setter private double price;
    @Getter @Setter private String countryOrigin;
    @Getter @Setter private List<Photo> photos;

    public Product(){

    }

    public Product(int id, String name, String description, double price, String countryOrigin){
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setPrice(price);
        this.setCountryOrigin(countryOrigin);
    }

    public int compareTo(Product o)
    {
        return 0;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }
}
