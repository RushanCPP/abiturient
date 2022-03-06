package com.example.abiturient;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abiturient.Education.University;

public class UniversityFragment extends Fragment {
    // TODO: разобраться как передать информацию о нажатом вузе фрагменту!!!
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_university, container, false);
        // TODO: сделать нормальное заполнение View
        new UniversityFiller() {
            @Override
            public void fill(View view, University university) {
                ((TextView)view.findViewById(R.id.name_university)).setText(university.getName());
                ((TextView)view.findViewById(R.id.name_headmaster)).setText(university.getHeadmasterName());
            }
        }.fill(view, new University());
        return view;
    }
}