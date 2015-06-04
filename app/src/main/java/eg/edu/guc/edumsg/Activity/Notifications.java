package eg.edu.guc.edumsg.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import eg.edu.guc.edumsg.R;

/**
 * The Class ActivityList is the Fragment class that is launched when the user
 * clicks on Activity option in Left navigation drawer.
 */
public class Notifications extends Fragment
{

    /** The Activity list. */
    private ArrayList<eg.edu.guc.edumsg.Model.Notifications> actList;

    /* (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_notifications, null);

        loadActivities();
        ListView list = (ListView) v.findViewById(R.id.list);
        list.setAdapter(new CutsomAdapter());
        return v;
    }



    /**
     * This method currently loads a dummy list of activities. You can write the
     * actual implementation of loading categories.
     */
    private void loadActivities()
    {
        actList = new ArrayList<eg.edu.guc.edumsg.Model.Notifications>();
        actList.add(new eg.edu.guc.edumsg.Model.Notifications("Svetin", "liked your photo", "1 hour ago",
                R.drawable.user1 + "", R.drawable.animal1 + ""));
        actList.add(new eg.edu.guc.edumsg.Model.Notifications("Ammar", "liked your photo", "2 hour ago",
                R.drawable.user2 + "", R.drawable.animal2 + ""));
        actList.add(new eg.edu.guc.edumsg.Model.Notifications("Mansour", "Commented on your photo", "3 hour ago",
                R.drawable.user3 + "", R.drawable.animal3 + ""));
        actList.add(new eg.edu.guc.edumsg.Model.Notifications("Mysarah", "liked your photo", "4 hour ago",
                R.drawable.user4 + "", R.drawable.animal4 + ""));
        actList.add(new eg.edu.guc.edumsg.Model.Notifications("Mohamed", "Commented on your photo", "4 hour ago",
                R.drawable.user5 + "", R.drawable.animal5 + ""));
        actList.add(new eg.edu.guc.edumsg.Model.Notifications("Mustafa", "liked your photo", "5 hour ago",
                R.drawable.user6 + "", R.drawable.animal6 + ""));
    }

    /**
     * The Class CutsomAdapter is the adapter class for Activity ListView. The
     * currently implementation of this adapter simply display static dummy
     * contents. You need to write the code for displaying actual contents.
     */
    private class CutsomAdapter extends BaseAdapter
    {

        /* (non-Javadoc)
         * @see android.widget.Adapter#getCount()
         */
        @Override
        public int getCount()
        {
            return actList.size();
        }

        /* (non-Javadoc)
         * @see android.widget.Adapter#getItem(int)
         */
        @Override
        public eg.edu.guc.edumsg.Model.Notifications getItem(int arg0)
        {
            return actList.get(arg0);
        }

        /* (non-Javadoc)
         * @see android.widget.Adapter#getItemId(int)
         */
        @Override
        public long getItemId(int arg0)
        {
            return arg0;
        }

        /* (non-Javadoc)
         * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
         */
        @Override
        public View getView(int pos, View v, ViewGroup arg2)
        {
            if (v == null)
                v = LayoutInflater.from(getActivity()).inflate(
                        R.layout.activity_item, null);

            TextView lbl = (TextView) v.findViewById(R.id.lbl1);
            lbl.setText(getItem(pos).getUser_name());

            lbl = (TextView) v.findViewById(R.id.lbl2);
            lbl.setText(getItem(pos).getContent());

            lbl = (TextView) v.findViewById(R.id.lbl3);
            lbl.setText(getItem(pos).getCreated_at());

            ImageView img = (ImageView) v.findViewById(R.id.img1);
            img.setImageResource(Integer.parseInt(getItem(pos).getUser_img()));

            img = (ImageView) v.findViewById(R.id.img2);
            img.setImageResource(Integer.parseInt(getItem(pos).getNot_img()));
            return v;
        }

    }
}
