package com.example.hoangduymanh;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface DAO {
    @Insert(onConflict = REPLACE)
    void insert(Customer customer);

    @Query("SELECT * FROM Customer")
    List<Customer> getAllCus();
}
