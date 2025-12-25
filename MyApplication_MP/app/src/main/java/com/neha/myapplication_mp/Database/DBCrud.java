package com.neha.myapplication_mp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBCrud {

    DBHelper dbHelper;

    public DBCrud(Context context) {
        dbHelper = new DBHelper(context);
    }

    //Create Method
    public  long createStudent(String name, int age) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("age", age);
        return  db.insert("Student", null, contentValues);
    }

    //Read method
    public ArrayList<String> getAllStudents  () {
        ArrayList<String> students = new ArrayList<>();

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor cursor = db.rawQuery(
                "select * from Student", null
        );

        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            int age = cursor.getInt(2);

            students.add(id+"-"+name + "-"+age);
        }

        cursor.close();
        return  students;
    }

    //Update method

    public  int updateStudent (int id, String name, int age) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("age", age);

        return  db.update("Student", values, "id =?", new String[]{String.valueOf(id)});
    }

    //Delete method
    public  int deleteStudent(int id) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        return  db.delete(
                "Student",
                "id=?",
                new String[]{String.valueOf(id)}
        );
    }



}



