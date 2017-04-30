package bestao.tre.jeanshoptest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kwan_raksasook on 30/4/2560.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Jeans.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE"+
            "(_id integer primary key,User text,tell  text, Email text,Adderss text);";
    private static final String CREATE_JEAN_TAABLE = "create table jeansTABLE"+
            "(_id ineteget primary key,Namejean text,Size text,Price text);";
    private static final String CREATE_ORDER_TABLE = "create table orderTABLE"+
            "(_id ineteget primary key,Namejean text,Size text,Price text,Item text);";
    public MySQLiteOpenHelper(Context context){
        super(context,DATABASE_NAME, null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER_TABLE);
        db.execSQL(CREATE_JEAN_TAABLE);
        db.execSQL(CREATE_ORDER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
