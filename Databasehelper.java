package com.example.roomdb;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = Salary.class,exportSchema = false,version = 1)

public abstract class Databasehelper extends RoomDatabase {
    private static final String DB_Name="expensedb";
    private static Databasehelper instance;

    public static synchronized Databasehelper getDB(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context,Databasehelper.class, DB_Name)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }
    public abstract SalaryDao salaryDao();


}
