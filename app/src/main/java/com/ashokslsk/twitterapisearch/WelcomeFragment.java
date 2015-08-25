package com.ashokslsk.twitterapisearch;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.app.Fragment;


import com.ashokslsk.twitterapisearch.util.ActivityHelper;

import static com.ashokslsk.twitterapisearch.util.Util.makeToast;

/**
 * Created by Ashu on 25/08/15.
 */
public class WelcomeFragment extends Fragment {

    private EditText editSearch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        editSearch = (EditText) rootView.findViewById(R.id.edit_search_tag);

        Button buttonSearch = (Button) rootView.findViewById(R.id.button_search);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(editSearch.getText())) {
                    SearchResultsFragment fragment = new SearchResultsFragment();
                    Bundle args = new Bundle();
                    args.putString(SearchResultsFragment.ARG_SEARCH_REQUEST, editSearch.getText().toString());
                    fragment.setArguments(args);
                    ActivityHelper.navigateTo(getActivity(), fragment, R.id.container_main);
                } else {
                    makeToast(getActivity(), "Please input a valid word or hashtag to search");
                }
            }
        });
        return rootView;
    }

}
