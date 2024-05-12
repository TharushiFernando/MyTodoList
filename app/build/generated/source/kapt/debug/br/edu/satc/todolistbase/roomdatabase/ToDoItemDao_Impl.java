package br.edu.satc.todolistbase.roomdatabase;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ToDoItemDao_Impl implements ToDoItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ToDoItem> __insertionAdapterOfToDoItem;

  private final EntityDeletionOrUpdateAdapter<ToDoItem> __deletionAdapterOfToDoItem;

  private final EntityDeletionOrUpdateAdapter<ToDoItem> __updateAdapterOfToDoItem;

  public ToDoItemDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfToDoItem = new EntityInsertionAdapter<ToDoItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `todoitens` (`uid`,`description`,`title`,`complete`) VALUES (?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ToDoItem entity) {
        if (entity.getUid() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getUid());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDescription());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        final Integer _tmp = entity.getComplete() == null ? null : (entity.getComplete() ? 1 : 0);
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfToDoItem = new EntityDeletionOrUpdateAdapter<ToDoItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `todoitens` WHERE `uid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ToDoItem entity) {
        if (entity.getUid() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getUid());
        }
      }
    };
    this.__updateAdapterOfToDoItem = new EntityDeletionOrUpdateAdapter<ToDoItem>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `todoitens` SET `uid` = ?,`description` = ?,`title` = ?,`complete` = ? WHERE `uid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ToDoItem entity) {
        if (entity.getUid() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getUid());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getDescription());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getTitle());
        }
        final Integer _tmp = entity.getComplete() == null ? null : (entity.getComplete() ? 1 : 0);
        if (_tmp == null) {
          statement.bindNull(4);
        } else {
          statement.bindLong(4, _tmp);
        }
        if (entity.getUid() == null) {
          statement.bindNull(5);
        } else {
          statement.bindLong(5, entity.getUid());
        }
      }
    };
  }

  @Override
  public void insertAll(final ToDoItem... items) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfToDoItem.insert(items);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final ToDoItem item) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfToDoItem.handle(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateToDoItems(final ToDoItem vararg) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfToDoItem.handle(vararg);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public ToDoItem getToDoItem(final String uid) {
    final String _sql = "SELECT * FROM todoitens WHERE uid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (uid == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, uid);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfComplete = CursorUtil.getColumnIndexOrThrow(_cursor, "complete");
      final ToDoItem _result;
      if (_cursor.moveToFirst()) {
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Boolean _tmpComplete;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfComplete)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfComplete);
        }
        _tmpComplete = _tmp == null ? null : _tmp != 0;
        _result = new ToDoItem(_tmpUid,_tmpDescription,_tmpTitle,_tmpComplete);
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
  public List<ToDoItem> getAll() {
    final String _sql = "SELECT * FROM todoitens";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfComplete = CursorUtil.getColumnIndexOrThrow(_cursor, "complete");
      final List<ToDoItem> _result = new ArrayList<ToDoItem>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final ToDoItem _item;
        final Integer _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getInt(_cursorIndexOfUid);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final Boolean _tmpComplete;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfComplete)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfComplete);
        }
        _tmpComplete = _tmp == null ? null : _tmp != 0;
        _item = new ToDoItem(_tmpUid,_tmpDescription,_tmpTitle,_tmpComplete);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
