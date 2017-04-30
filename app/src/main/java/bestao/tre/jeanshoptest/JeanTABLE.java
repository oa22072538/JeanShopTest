package bestao.tre.jeanshoptest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by kwan_raksasook on 30/4/2560.
 */

public class JeanTABLE {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;
    public JeanTABLE(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();


    }
}
