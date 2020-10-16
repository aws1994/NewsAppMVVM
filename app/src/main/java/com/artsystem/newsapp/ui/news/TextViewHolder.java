package com.artsystem.newsapp.ui.news;

import android.view.View;

import androidx.annotation.NonNull;

import com.artsystem.newsapp.data.NewsItem;
import com.artsystem.newsapp.databinding.ItemNewsImageBinding;
import com.artsystem.newsapp.databinding.ItemNewsTextBinding;

public class TextViewHolder extends BaseViewHolder {

    ItemNewsTextBinding itemNewsTextBinding;

    public TextViewHolder(@NonNull ItemNewsTextBinding itemNewsTextBinding) {
        super(itemNewsTextBinding.getRoot());
        this.itemNewsTextBinding = itemNewsTextBinding;
    }

    @Override
    public void bindData(NewsItem item) {

        itemNewsTextBinding.setNewsItemText(item);

    }

    @Override
    public ItemNewsTextBinding getItemNewsTextBinding() {
        return null;
    }

    @Override
    public ItemNewsImageBinding getItemNewsImageBinding() {
        return null;
    }
}
