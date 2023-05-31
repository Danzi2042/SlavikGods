package com.example.slavicgods;

public class God {
    private String name; // поле названия
    private String godDescription; // поле описания бога
    private int godResource; // поле ресурса бога

    // конструктор
    public God(String name, String godDescription, int godResource) {
        this.name = name;
        this.godDescription = godDescription;
        this.godResource = godResource;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGodDescription() {
        return godDescription;
    }

    public void setGodDescription(String godDescription) {
        this.godDescription = godDescription;
    }

    public int getGodResource() {
        return godResource;
    }

    public void setGodResource(int godResource) {
        this.godResource = godResource;
    }
}

