package com.example.ahmed.letsdothis;

class Lists {
    int id;
    String list_name;

    // constructors
    public Lists() {

    }

    public Lists(String list_name) {
        this.list_name = list_name;
    }

    public Lists(int id, String list_name) {
        this.id = id;
        this.list_name = list_name;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String list_name) {
        this.list_name = list_name;
    }

    // getter
    public int getId() {
        return this.id;
    }

    public String getListName() {
        return this.list_name;
    }
}
