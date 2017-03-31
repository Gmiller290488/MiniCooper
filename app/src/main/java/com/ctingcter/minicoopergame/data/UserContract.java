package com.ctingcter.minicoopergame.data;

import android.provider.BaseColumns;

/**
 * Created by CTingCTer on 31/03/2017.
 */

public final class UserContract {

    /**
     * API Contract for the MiniCooper app.
     */

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private UserContract() {
    }

    /**
     * Inner class that defines constant values for the pets database table.
     * Each entry in the table represents a single pet.
     */
    public static final class UserEntry implements BaseColumns {

        /**
         * Name of database table for pets
         */
        public final static String TABLE_NAME = "users";

        /**
         * Unique ID number for the user (only for use in the database table).
         * <p>
         * Type: INTEGER
         */
        public final static String _ID = BaseColumns._ID;

        /**
         * Name of the user.
         * <p>
         * Type: TEXT
         */
        public final static String COLUMN_USER_NAME = "name";

        /**
         * Gender of the user.
         * The only possible values are {@link #GENDER_MALE},
         * or {@link #GENDER_FEMALE}.
         * Type: TEXT
         */
        public final static String COLUMN_USER_GENDER = "gender";

        /**
         * Age of the user.
         * <p>Possible values are {Adult}, or {Child}
         * Type: TEXT
         */
        public final static String COLUMN_USER_AGE = "age";

        /**
         * Score of the User.
         *
         * Type: INT
         */
        public final static String COLUMN_USER_SCORE = "score";



        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 0;
    }
}
