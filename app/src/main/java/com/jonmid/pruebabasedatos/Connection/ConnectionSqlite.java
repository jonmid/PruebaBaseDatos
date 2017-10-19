package com.jonmid.pruebabasedatos.Connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.jonmid.pruebabasedatos.Utilities.Utilities;

/**
 * Created by software on 19/10/2017.
 */

public class ConnectionSqlite extends SQLiteOpenHelper {

    final String CREATE_TABLE_USER = "CREATE TABLE users (id INTEGER, name TEXT, phone TEXT)";

    public ConnectionSqlite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // crea la estructura de la tabla
        sqLiteDatabase.execSQL(Utilities.CREATE_TABLE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int versionOld, int versionNew) {
        // Verifica si ya existe una version de la base de datos en el movil
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS users");
        onCreate(sqLiteDatabase);
    }
}
