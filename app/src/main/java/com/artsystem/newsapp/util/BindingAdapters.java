package com.artsystem.newsapp.util;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.artsystem.newsapp.R;
import com.bumptech.glide.Glide;

public class BindingAdapters {

//    here we create our custom binding adapter like so

    @BindingAdapter("glide_url")
    public static void loadImg(ImageView imageView,String url) {
        // we will  use glide library to load the image from a url
        Glide.with(imageView.getContext()).load(url).into(imageView);
        // now let's use this adapter in our xml file
    }

    @BindingAdapter("glide_circular")
    public static void loadUserImg(ImageView view,String url) {

        // glide can make any image in a circular format with ease
        Glide.with(view.getContext()).load(url).circleCrop().into(view);

    }


    @BindingAdapter("set_background")
    public static void setBackground(ImageView view,String color) {

        switch (color) {
            case "RED" : view.setBackgroundColor(view.getContext().getResources().getColor(R.color.red));
            break;
            case "BLACK" : view.setBackgroundColor(view.getContext().getResources().getColor(R.color.black));
            break;
            case "YELLOW" : view.setBackgroundColor(view.getContext().getResources().getColor(R.color.yellow));
            break;
            case "BLUE" : view.setBackgroundColor(view.getContext().getResources().getColor(R.color.blue));
            break;
            case "PURPLE" : view.setBackgroundColor(view.getContext().getResources().getColor(R.color.purple));
            break;
            default: view.setBackgroundColor(view.getContext().getResources().getColor(R.color.red));
        }

    }

}
