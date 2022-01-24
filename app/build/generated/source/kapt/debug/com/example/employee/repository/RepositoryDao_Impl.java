package com.example.employee.repository;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.employee.model.RepositoryDetailsResponse;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RepositoryDao_Impl implements RepositoryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RepositoryDetailsResponse> __insertionAdapterOfRepositoryDetailsResponse;

  public RepositoryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRepositoryDetailsResponse = new EntityInsertionAdapter<RepositoryDetailsResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `RepositoryDetailsResponse` (`id`,`node_id`,`name`,`full_name`,`description`,`language`,`stargazers_count`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RepositoryDetailsResponse value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getNode_id() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNode_id());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getFull_name() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFull_name());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLanguage());
        }
        if (value.getStargazers_count() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getStargazers_count());
        }
      }
    };
  }

  @Override
  public void insert(final RepositoryDetailsResponse repository) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepositoryDetailsResponse.insert(repository);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<RepositoryDetailsResponse>> getList(final String keyword) {
    final String _sql = "SELECT * from RepositoryDetailsResponse Where name Like?||'%' ORDER BY name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (keyword == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, keyword);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"RepositoryDetailsResponse"}, false, new Callable<List<RepositoryDetailsResponse>>() {
      @Override
      public List<RepositoryDetailsResponse> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNodeId = CursorUtil.getColumnIndexOrThrow(_cursor, "node_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfStargazersCount = CursorUtil.getColumnIndexOrThrow(_cursor, "stargazers_count");
          final List<RepositoryDetailsResponse> _result = new ArrayList<RepositoryDetailsResponse>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RepositoryDetailsResponse _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpNode_id;
            if (_cursor.isNull(_cursorIndexOfNodeId)) {
              _tmpNode_id = null;
            } else {
              _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFull_name;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFull_name = null;
            } else {
              _tmpFull_name = _cursor.getString(_cursorIndexOfFullName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            final Integer _tmpStargazers_count;
            if (_cursor.isNull(_cursorIndexOfStargazersCount)) {
              _tmpStargazers_count = null;
            } else {
              _tmpStargazers_count = _cursor.getInt(_cursorIndexOfStargazersCount);
            }
            _item = new RepositoryDetailsResponse(_tmpId,_tmpNode_id,_tmpName,_tmpFull_name,_tmpDescription,_tmpLanguage,_tmpStargazers_count);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
