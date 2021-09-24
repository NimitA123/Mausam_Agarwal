package com.example.mausam;

import android.icu.text.Transliterator;

public interface ItemClickListener {
    void OnItemClick(ResponseDTO responseDTO, int position);
}