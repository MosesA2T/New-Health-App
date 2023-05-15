package com.example.ToDoList;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class DAO_Impl implements DAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Entity> __insertionAdapterOfEntity;

  private final EntityDeletionOrUpdateAdapter<Entity> __deletionAdapterOfEntity;

  private final EntityDeletionOrUpdateAdapter<Entity> __updateAdapterOfEntity;

  public DAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEntity = new EntityInsertionAdapter<Entity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `To_Do` (`id`,`title`,`priority`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Entity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPriority());
        }
      }
    };
    this.__deletionAdapterOfEntity = new EntityDeletionOrUpdateAdapter<Entity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `To_Do` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Entity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfEntity = new EntityDeletionOrUpdateAdapter<Entity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `To_Do` SET `id` = ?,`title` = ?,`priority` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Entity value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPriority());
        }
        stmt.bindLong(4, value.getId());
      }
    };
  }

  @Override
  public Object insertTask(final Entity entity, final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object deleteTask(final Entity entity, final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object updateTask(final Entity entity, final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  @Override
  public Object getTasks(final Continuation<? super List<CardInfo>> continuation) {
    final String _sql = "Select * from to_do";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    int _argIndex = 1;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final Object _result;
      if(_cursor.moveToFirst()) {
        _result = new Object();
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    __db.assertNotSuspendingTransaction();
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
