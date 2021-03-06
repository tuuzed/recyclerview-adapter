package com.tuuzed.androidx.list.preference.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ItemToStringFunction<T> {
    @NonNull
    CharSequence invoke(@Nullable T item);
}
