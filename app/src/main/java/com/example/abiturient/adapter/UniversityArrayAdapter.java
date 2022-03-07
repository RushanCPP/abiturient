package com.example.abiturient.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.example.abiturient.education.University;
import com.example.abiturient.fillers.UniversityFiller;

public class UniversityArrayAdapter extends ArrayAdapter<University> {
    private int resource;
    // "заполнятор" View, который создает front-end-ер
    private UniversityFiller filler;
    public UniversityArrayAdapter(Context context, int resource, University[] objects, UniversityFiller filler) {
        super(context, resource, objects);
        this.resource = resource;
        this.filler = filler;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        University university = getItem(position);
        if (convertView == null) {
            // создаем по resource layout
            convertView = LayoutInflater.from(getContext()).inflate(resource, null);
        }
        // интерфейс реализует front-end, смотря на свои нужды
        filler.fill(convertView, university);
        return convertView;
    }
}
