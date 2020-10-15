package com.artsystem.newsapp.ui.news;

import android.view.View;

import androidx.annotation.NonNull;

import com.artsystem.newsapp.data.NewsItem;
import com.artsystem.newsapp.databinding.ItemNewsImageBinding;
import com.artsystem.newsapp.databinding.ItemNewsTextBinding;

public class ImageViewHolder extends BaseViewHolder {

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(NewsItem item) {

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
