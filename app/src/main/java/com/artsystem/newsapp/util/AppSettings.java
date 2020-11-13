package com.artsystem.newsapp.util;

import android.content.Context;
import android.content.SharedPreferences;

public class AppSettings {

    private SharedPreferences prefs;
    private int theme;

    public static final String THEME_KEY="theme";
    public static final int THEME_LIGHT = 0;
    public static final int THEME_DARK = 1;
    public static final int THEME_DARK_AMOLED = 2;

    public AppSettings(Context context) {
        prefs = context.getSharedPreferences("prefApp",Context.MODE_PRIVATE);
        theme = prefs.getInt(THEME_KEY,0); // default theme is 0 = Light Theme index
    }


    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(THEME_KEY,theme);
        editor.commit();
    }
}
