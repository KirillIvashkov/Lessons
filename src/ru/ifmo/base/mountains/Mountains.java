package ru.ifmo.base.mountains;

public class Mountains {
    private String name;
    private String country;
    private int height;

    public Mountains(String name, String country, int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 4 && name != null) {
            this.name = name;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() >= 4 && country != null){
        this.country = country;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 100){
        this.height = height;
        }
    }
}
