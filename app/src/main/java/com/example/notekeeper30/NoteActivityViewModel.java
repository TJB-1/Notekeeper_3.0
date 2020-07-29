package com.example.notekeeper30;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.example.notekeeper30.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.example.notekeeper30.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT ="com.example.notekeeper30.ORIGINAL_NOTE_TEXT";
    public boolean mIsNewlyCreated = true;

    public String mOriginalNoteCourseId;
    public String mOriginalNoteTitleId;
    public String mOriginalNoteTextId;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitleId);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteTextId);
    }

    public void restoreState(Bundle instate){
        mOriginalNoteCourseId = instate.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitleId = instate.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteTextId = instate.getString(ORIGINAL_NOTE_TEXT);
    }
}

















