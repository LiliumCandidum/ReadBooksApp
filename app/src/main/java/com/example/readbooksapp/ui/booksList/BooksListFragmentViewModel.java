package com.example.readbooksapp.ui.booksList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BooksListFragmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BooksListFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}