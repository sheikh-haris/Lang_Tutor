package com.shah.langtutor.HIndi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shah.langtutor.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HindiPhrasesFragment extends Fragment {


    public HindiPhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.phrases_list, container,false);
        return rootView;
    }

}
