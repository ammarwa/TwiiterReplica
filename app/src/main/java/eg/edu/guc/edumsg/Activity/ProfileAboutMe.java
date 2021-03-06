package eg.edu.guc.edumsg.Activity;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import eg.edu.guc.edumsg.Model.User;
import eg.edu.guc.edumsg.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileAboutMe extends Fragment {


    public ProfileAboutMe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile_about_me, container, false);
        TextView name = (TextView) v.findViewById(R.id.prof_name);
        TextView email = (TextView) v.findViewById(R.id.email_profile_info);
        TextView gender = (TextView) v.findViewById(R.id.gender_profile_info);
        TextView country = (TextView) v.findViewById(R.id.country_profile_info);
        TextView dateOfBirth = (TextView) v.findViewById(R.id.date_of_birth_profile_info);
        TextView language = (TextView) v.findViewById(R.id.language_profile_info);
        TextView website = (TextView) v.findViewById(R.id.website_profile_info);
        TextView bio = (TextView) v.findViewById(R.id.bio_profile_info);

        User currentUser = ((MainActivity)getActivity()).getLoggedIn();

        name.setText(currentUser.getFirst_name()+" "+currentUser.getLast_name());
        email.setText(currentUser.getEmail());
        gender.setText(currentUser.getGender());
        country.setText(currentUser.getCountry());
        dateOfBirth.setText(currentUser.getDate_of_birth());
        language.setText(currentUser.getLanguage());
        website.setText(currentUser.getWebsite());
        bio.setText(currentUser.getBio());

        return v;
    }


}
