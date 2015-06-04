package eg.edu.guc.edumsg.Activity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eg.edu.guc.edumsg.Model.Group;
import eg.edu.guc.edumsg.R;

/**
 * A simple {@link Fragment} subclass.
 */
@SuppressLint("ValidFragment")
public class GroupFrag extends Fragment {


    Group group;

    public GroupFrag(Group group) {
        // Required empty public constructor
        this.group = group;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_group, container, false);
    }


}
