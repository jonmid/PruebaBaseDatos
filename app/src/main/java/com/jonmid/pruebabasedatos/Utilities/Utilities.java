package com.jonmid.pruebabasedatos.Utilities;

/**
 * Created by software on 19/10/2017.
 */

public class Utilities {
    public static final String TABLA_NAME = "users";
    public static final String TABLA_FIELD_ID = "id";
    public static final String TABLA_FIELD_NAME = "name";
    public static final String TABLA_FIELD_PHONE = "phone";

    public static final String CREATE_TABLE_USER = "CREATE TABLE "+TABLA_NAME+" ("+TABLA_FIELD_ID+" INTEGER, "+TABLA_FIELD_NAME+" TEXT, "+TABLA_FIELD_PHONE+" TEXT)";
}
