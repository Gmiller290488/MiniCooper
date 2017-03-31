package com.ctingcter.minicoopergame;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ctingcter.minicoopergame.data.UserContract.UserEntry;
import com.ctingcter.minicoopergame.data.UserDbHelper;


/**
 * Created by CTingCTer on 31/03/2017.
 */

public class UsersActivity extends AppCompatActivity {

    // Database helper that will provide us access to database
    private UserDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_collection);

        // To access our database, we instantiate our subclass of SQLiteOpenHelper
        // and pass in the context, which is the curent activity
        mDbHelper = new UserDbHelper(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayDatabaseInfo();
    }

    private void displayDatabaseInfo() {
        // Create and/or open a database to read from it
        SQLiteDatabase db = mDbHelper.getReadableDatabase();

        //Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                UserEntry._ID,
                UserEntry.COLUMN_USER_NAME,
                UserEntry.COLUMN_USER_GENDER,
                UserEntry.COLUMN_USER_AGE,
                        UserEntry.COLUMN_USER_SCORE };

        // Perform a query on the users table
        Cursor cursor = db.query(
                UserEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null);

        /** left it here as phone ceased to work! */

        }
    }

