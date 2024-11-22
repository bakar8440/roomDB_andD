package com.example.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

@Dao
public interface SalaryDao {

//    @Query("select * from salarytable")
//    ArrayList<Salary> getAllSalary();

    @Insert
    void insert(Salary salary);

    @Update
    void update(Salary salary);

    @Delete
    void delete(Salary salary);
}
