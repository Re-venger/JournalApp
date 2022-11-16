package com.example.contactusingsqlite.db.entity;

import android.provider.BaseColumns;

public class contractDB {



    //    to prevent the accidental instantiation the contract class we make the class as private
    private contractDB() {
    }


    public static class contract implements BaseColumns {
        public static final String TABLE_NAME = "contacts";
        public static final String COLUMN_ID = "contact_id";
        public static final String COLUMN_NAME = "contact_name";
        public static final String COLUMN_EMAIL = "contact_email";
    }

    public static final String CREATE_TABLE = "CREATE TABLE " + contract.TABLE_NAME + "("
            + contract.COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + contract.COLUMN_NAME + "TEXT,"
            + contract.COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
            + ")";

    //    prepare the deletion query for the database
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + contract.TABLE_NAME;

}
