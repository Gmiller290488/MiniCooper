package com.ctingcter.minicoopergame.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ctingcter.minicoopergame.data.UserContract.UserEntry;
/**
 * Created by CTingCTer on 31/03/2017.
 */

public class UserDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = UserDbHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "user.db";
    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Constructs a new instance of {@link UserDbHelper}.
     *
     * @param context of the app
     */
    public UserDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * This is called when the database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_USERS_TABLE =  "CREATE TABLE " + UserEntry.TABLE_NAME + " ("
                + UserEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + UserEntry.COLUMN_USER_NAME + " TEXT NOT NULL, "
                + UserEntry.COLUMN_USER_GENDER + " TEXT NOT NULL, "
                + UserEntry.COLUMN_USER_AGE + " TEXT NOT NULL, "
                + UserEntry.COLUMN_USER_SCORE + " INTEGER NOT NULL DEFAULT 0);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_USERS_TABLE);
    }

    /**
     * This is called when the database needs to be upgraded.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }

}
