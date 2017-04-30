package bestao.tre.jeanshoptest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by kwan_raksasook on 30/4/2560.
 */

public class OrderTABLE {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDabase,redSqLiteDatabase;
    public  OrderTABLE(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDabase = objMySQLiteOpenHelper.getWritableDatabase();
        redSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }
}
