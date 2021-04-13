package ru.samsung.itschool.mdev.myapplication;

public class MyImage {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MyImage(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
