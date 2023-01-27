package model;

public class Category extends MainCategory{
    String category_name;

    public Category(String main_category_name, String category_name) {
        super(main_category_name);
        this.category_name = category_name;
    }
}
