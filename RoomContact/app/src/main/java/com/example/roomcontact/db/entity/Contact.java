package com.example.roomcontact.db.entity;


// This will refer to the data that we are going to store

public class Contact {

//
    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_ID = "contacts_id";
    public static final String COLUMN_NAME = "contacts_name";
    public static final String COLUMN_EMAIL = "contacts_email";


//    Defining the data variables
    private String name;
    private String email;
    private int id;


//    Constructors for the data
    public Contact(){
    }

    public Contact(String name, String email, int id){
        this.name = name;
        this.email = email;
        this.id = id;
    }



//    GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



//    SQL Query to create the table
    public static final String CREATE_TABLE =
        "CREATE TABLE " + TABLE_NAME + "("
        + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
        + COLUMN_NAME + "TEXT,"
        + COLUMN_EMAIL + "DATETIME DEFAULT CURRENT_TIMESTAMP"
        + ")";




}


