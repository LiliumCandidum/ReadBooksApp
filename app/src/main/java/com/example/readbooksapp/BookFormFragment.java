package com.example.readbooksapp;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

// https://medium.com/androiddevelopers/viewmodels-a-simple-example-ed5ac416317e
public class BookFormFragment extends Fragment {

    private BookFormViewModel mViewModel;

    public static BookFormFragment newInstance() {
        return new BookFormFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.book_form_fragment, container, false);

        Button startDateButton = view.findViewById(R.id.dateStartButton);
        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button endDateButton = view.findViewById(R.id.dateEndButton);
        startDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BookFormViewModel.class);
        // TODO: Use the ViewModel
    }
}