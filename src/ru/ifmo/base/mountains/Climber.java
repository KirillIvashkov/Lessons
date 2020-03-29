package ru.ifmo.base.mountains;

public class Climber {
    private String name;
    private String address;

    public Climber(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( name.length() > 3 && name != null){
        this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address.length() > 5 && address != null){
        this.address = address;
        }
    }
}
