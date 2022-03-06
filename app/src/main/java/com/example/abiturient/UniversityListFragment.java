package com.example.abiturient;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class UniversityListFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_university_list, container, false);
        ListView listView = view.findViewById(R.id.university_list_fragment_list);
        // TODO: переход к информации о вузе при нажатии
        //       c передачей данных о нажатом вузе!!!!!!
        return view;
    }
}