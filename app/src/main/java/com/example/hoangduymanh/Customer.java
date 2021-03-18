package com.example.hoangduymanh;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="Customer")
public class Customer {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name="Name")
    public String Name;

    @ColumnInfo(name="Email")
    public String Email;

    @ColumnInfo(name="Phone")
    public String Phone;

    @ColumnInfo(name = "Gender")
    public int Gender;

}
