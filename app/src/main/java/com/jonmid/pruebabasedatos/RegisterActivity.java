package com.jonmid.pruebabasedatos;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.jonmid.pruebabasedatos.Connection.ConnectionSqlite;
import com.jonmid.pruebabasedatos.Utilities.Utilities;

public class RegisterActivity extends AppCompatActivity {

    EditText editTextId;
    EditText editTextName;
    EditText editTextPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextId = (EditText) findViewById(R.id.id_et_id);
        editTextName = (EditText) findViewById(R.id.id_et_name);
        editTextPhone = (EditText) findViewById(R.id.id_et_phone);
    }

    public void btnClickRegister(View view){
        registerUser();
    }

    public void registerUser(){
        ConnectionSqlite connectionSqlite = new ConnectionSqlite(this, "bd_users", null, 1);
        SQLiteDatabase db = connectionSqlite.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilities.TABLA_FIELD_ID, editTextId.getText().toString());
        values.put(Utilities.TABLA_FIELD_NAME, editTextName.getText().toString());
        values.put(Utilities.TABLA_FIELD_PHONE, editTextPhone.getText().toString());

        // (nombre de la tabla, campo que va retornar, valores a guardar)
        Long idResult = db.insert(Utilities.TABLA_NAME, Utilities.TABLA_FIELD_ID, values);

        Toast.makeText(this, "Id registro: "+idResult, Toast.LENGTH_SHORT).show();
    }
}
