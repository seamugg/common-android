package com.rockaport.common.android.database;

import android.content.ContentValues;
import android.support.annotation.Nullable;

public interface DatabaseApi<T, U> {
    T get(U id);

    T get(@Nullable String[] projection,
          @Nullable String selection,
          @Nullable String[] selectionArgs,
          @Nullable String sortOrder) throws GenericDatabaseException;

    T get(@Nullable String selection,
          @Nullable String[] selectionArgs) throws GenericDatabaseException;

    void insert(T object);

    void update(@Nullable ContentValues values,
                @Nullable String where,
                @Nullable String[] selectionArgs);

    void update(T object, @Nullable String where, @Nullable String[] selectionArgs);

    void update(T object);

    void delete(U id);

    IteratorApi<T> getIterator(@Nullable String[] projection,
                               @Nullable String selection,
                               @Nullable String[] selectionArgs,
                               @Nullable String sortOrder);

    // Default projection
    IteratorApi<T> getIterator(@Nullable String selection,
                               @Nullable String[] selectionArgs,
                               @Nullable String sortOrder);

    // Default projection and sort order
    IteratorApi<T> getIterator(@Nullable String selection,
                               @Nullable String[] selectionArgs);

    IteratorApi<T> getIterator();
}
