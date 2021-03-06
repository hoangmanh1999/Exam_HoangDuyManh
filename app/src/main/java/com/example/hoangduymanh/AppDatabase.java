package com.example.hoangduymanh;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Customer.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {
private static AppDatabase appDatabase;
public abstract DAO dao();
public static AppDatabase getAppDatabase(Context context){
    if (appDatabase==null){
        appDatabase= Room.databaseBuilder(context,AppDatabase.class,"News").allowMainThreadQueries().build();
    }
    return appDatabase;
}
}
