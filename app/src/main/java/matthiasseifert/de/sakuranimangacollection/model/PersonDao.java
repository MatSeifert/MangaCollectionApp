package matthiasseifert.de.sakuranimangacollection.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import matthiasseifert.de.sakuranimangacollection.model.Person;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "PERSON".
*/
public class PersonDao extends AbstractDao<Person, Long> {

    public static final String TABLENAME = "PERSON";

    /**
     * Properties of entity Person.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FirstName = new Property(1, String.class, "FirstName", false, "FIRST_NAME");
        public final static Property MiddleName = new Property(2, String.class, "MiddleName", false, "MIDDLE_NAME");
        public final static Property LastName = new Property(3, String.class, "LastName", false, "LAST_NAME");
        public final static Property Gender = new Property(4, String.class, "Gender", false, "GENDER");
    };


    public PersonDao(DaoConfig config) {
        super(config);
    }
    
    public PersonDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"PERSON\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"FIRST_NAME\" TEXT," + // 1: FirstName
                "\"MIDDLE_NAME\" TEXT," + // 2: MiddleName
                "\"LAST_NAME\" TEXT," + // 3: LastName
                "\"GENDER\" TEXT);"); // 4: Gender
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PERSON\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Person entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String FirstName = entity.getFirstName();
        if (FirstName != null) {
            stmt.bindString(2, FirstName);
        }
 
        String MiddleName = entity.getMiddleName();
        if (MiddleName != null) {
            stmt.bindString(3, MiddleName);
        }
 
        String LastName = entity.getLastName();
        if (LastName != null) {
            stmt.bindString(4, LastName);
        }
 
        String Gender = entity.getGender();
        if (Gender != null) {
            stmt.bindString(5, Gender);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Person readEntity(Cursor cursor, int offset) {
        Person entity = new Person( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // FirstName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // MiddleName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // LastName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // Gender
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Person entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFirstName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMiddleName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLastName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGender(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Person entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Person entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}