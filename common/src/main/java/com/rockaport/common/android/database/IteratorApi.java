package com.rockaport.common.android.database;

import java.util.List;

public interface IteratorApi<T> {
    T get(int index);

    List<T> asList();

    int count();

    void close();
}
