package com.artsystem.newsapp.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.artsystem.newsapp.R;
import com.artsystem.newsapp.util.AppSettings;

public class SettingsFragment extends Fragment {


    private RadioGroup rgTheme;
    private RadioButton rbLight,rbDark,rbDarkAmoled;
    private AppSettings settings;


    public SettingsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_settings, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        settings = new AppSettings(getContext());
        initView(view);
    }

    private void initView(View view) {

        rgTheme = view.findViewById(R.id.rg_theme);
        rbDark = view.findViewById(R.id.rb_dark);
        rbLight = view.findViewById(R.id.rb_light);
        rbDarkAmoled = view.findViewById(R.id.rb_amoled);

        switch (settings.getTheme()) {
            case AppSettings.THEME_LIGHT : rbLight.setChecked(true);break;
            case AppSettings.THEME_DARK:  rbDark.setChecked(true);break;
            case AppSettings.THEME_DARK_AMOLED: rbDarkAmoled.setChecked(true);break;
            default: rbLight.setChecked(true);
        }

        rgTheme.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.rb_light : settings.setTheme(AppSettings.THEME_LIGHT);break;
                    case R.id.rb_dark : settings.setTheme(AppSettings.THEME_DARK);break;
                    case R.id.rb_amoled : settings.setTheme(AppSettings.THEME_DARK_AMOLED);break;
                    default: settings.setTheme(AppSettings.THEME_LIGHT);
                }

                getActivity().recreate();


            }
        });




    }
}