package com.example.readbooksapp.ui.booksList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.readbooksapp.R;

public class BooksListFragment extends Fragment {

    private BooksListFragmentViewModel booksListViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        booksListViewModel =
                new ViewModelProvider(this).get(BooksListFragmentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_books_list, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        booksListViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}