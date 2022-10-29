package me.abdc.springvalidation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Book {

    private Long id;

    @NotEmpty
    private String title;

    @Min(0)
    private int price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
