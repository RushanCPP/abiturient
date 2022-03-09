package com.example.abiturient.fagments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abiturient.MainActivity;
import com.example.abiturient.education.University;
import com.example.abiturient.R;
import com.example.abiturient.fillers.UniversityFiller;

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
            } // TODO: Сказать frontend-еру написать класс
        }.fill(view, ((MainActivity) getActivity()).getNowUniversity());
        return view;
    }
}