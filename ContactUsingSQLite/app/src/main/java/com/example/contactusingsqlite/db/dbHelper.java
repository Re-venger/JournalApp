package com.example.contactusingsqlite.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.contactusingsqlite.Contact;
import com.example.contactusingsqlite.db.entity.contractDB;

import java.util.ArrayList;


public class dbHelper extends SQLiteOpenHelper {

    //    defining the database version and table name
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contact_db";


    //    This is the database Constructor
    public dbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(contractDB.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int old, int newVer) {
        sqLiteDatabase.execSQL(contractDB.DROP_TABLE);
        onCreate(sqLiteDatabase);
    }


    public long insertContact(String name, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(contractDB.contract.COLUMN_NAME, name);
        values.put(contractDB.contract.COLUMN_EMAIL, email);

        long id = db.insert(Contact.TABLE_NAME, null, values);
        db.close();
        return id;
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }




//    Inserting the data into the database

    //    Getting the data from the database
//    public Contact getContact(long id) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.query(Contact.TABLE_NAME,
//                new String[]{
//                        Contact.COLUMN_ID,
//                        Contact.COLUMN_NAME,
//                        Contact.COLUMN_EMAIL},
//                Contact.COLUMN_ID + "=?",
//                new String[]{
//                        String.valueOf(id)
//                },
//                null,
//                null,
//                null,
//                null);
//
//        if (cursor != null)
//            cursor.moveToFirst();
//
//        assert cursor != null;
//        @SuppressLint("Range") Contact contact = new Contact(
//                cursor.getString(cursor.getColumnIndex(Contact.COLUMN_NAME)),
//                cursor.getString(cursor.getColumnIndex(Contact.COLUMN_EMAIL)),
//                cursor.getInt(cursor.getColumnIndex(Contact.COLUMN_ID))
//        );
//        cursor.close();
//        return contact;
//    }
//
////    Get ALL THE CONTACTS
//    @SuppressLint("Range")
//    public ArrayList<Contact> getAllContacts(){
//        ArrayList<Contact> contacts = new ArrayList<>();
//
//        String selectQuery = "SELECT * FROM " + Contact.TABLE_NAME + " ORDER BY " + Contact.COLUMN_ID + " DESC";
//
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//
//        if(cursor.moveToFirst()){
//            do{
//                Contact contact = new Contact();
//                contact.setId(cursor.getInt(cursor.getColumnIndex(Contact.COLUMN_ID)));
//                contact.setName(cursor.getString(cursor.getColumnIndex(Contact.COLUMN_NAME)));
//                contact.setEmail(cursor.getString(cursor.getColumnIndex(Contact.COLUMN_EMAIL)));
//
//                contacts.add(contact);
//            }while (cursor.moveToFirst());
//        }
//        db.close();
//        return  contacts;
//    }
//
//    public int updateContact(Contact contact){
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//
//        values.put(Contact.COLUMN_NAME, contact.getName());
//        values.put(Contact.COLUMN_EMAIL, contact.getEmail());
//
//        return db.update(Contact.TABLE_NAME, values, Contact.COLUMN_ID+ " = ?", new String[]{String.valueOf(contact.getId())});
//    }
//
//    public void deleteContact(Contact contact){
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(Contact.TABLE_NAME, Contact.COLUMN_ID+ " = ? ", new String[]{
//                String.valueOf(contact.getId())});
//
//        db.close();
//    }
}
