package eg.edu.guc.edumsg.Activity;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eg.edu.guc.edumsg.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewGroup extends Fragment {


    public NewGroup() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_group, container, false);
    }


}
