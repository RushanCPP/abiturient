package com.example.abiturient.fagments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.abiturient.MainActivity;
import com.example.abiturient.R;
import com.example.abiturient.adapter.UniversityArrayAdapter;
import com.example.abiturient.database.FakeDataBase;
import com.example.abiturient.education.University;
import com.example.abiturient.fillers.UniversityFiller;


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
        listView.setAdapter(
                new UniversityArrayAdapter(getContext(), R.layout.adapter_item,
                        new FakeDataBase().getData(), new UniversityFiller() {
                    @Override
                    public void fill(View view, University university) {
                        ((TextView)view.findViewById(R.id.name_university)).setText(university.getName());
                    }
                } // TODO: Сказать frontend-еру написать класс
                ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ((MainActivity)getActivity()).
                        setNowUniversity((University) listView.getItemAtPosition(position));
                Navigation.findNavController(view).navigate(R.id.action_universityListFragment_to_universityFragment);
            }
        });
        return view;
    }
}