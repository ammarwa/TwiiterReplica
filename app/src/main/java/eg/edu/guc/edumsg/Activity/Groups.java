package eg.edu.guc.edumsg.Activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import eg.edu.guc.edumsg.Model.Group;
import eg.edu.guc.edumsg.R;

/**
 * The Class Profile is the Fragment class that is launched when the user clicks
 * on Profile option in Left navigation drawer.
 * This screen shows user's profile photo and it also shows user's photo and video feeds. 
 */
public class Groups extends Fragment
{

    private ArrayList<Group> groupsList;

    /* (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_groups, null);

        groupsList = new ArrayList<Group>();
        groupsList.add(new Group(R.drawable.anim1+"","GUC","our love :D"));
        groupsList.add(new Group(R.drawable.anim1+"","madrasa","description"));
        groupsList.add(new Group(R.drawable.anim1+"","family","description"));
        groupsList.add(new Group(R.drawable.anim1+"","city","description"));
        groupsList.add(new Group(R.drawable.anim1+"","compound","description"));
        groupsList.add(new Group(R.drawable.anim1+"","MET","description"));
        groupsList.add(new Group(R.drawable.anim1+"","CS","description"));
        groupsList.add(new Group(R.drawable.anim1+"","Mech","description"));
        groupsList.add(new Group(R.drawable.anim1+"","Manag","description"));
        groupsList.add(new Group(R.drawable.anim1+"","Fans","description"));
        ListView list = (ListView) v.findViewById(R.id.group_list);
        list.setAdapter(new CustomAdapter());
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try{
                    Group group = groupsList.get(Integer.parseInt(l + ""));
                    Fragment frag = new GroupFrag(group);
                    ((MainActivity)getActivity()).actionBar.setTitle(group.getName());
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.container, frag).commit();
                } catch (Exception e){}
            }
        });
        return v;
    }

    /**
     * The Class CustomAdapter is the adapter for displaying User's photo and video feeds.
     * The current implementation simply display dummy photo and video feed. You need
     * to change it as per your needs.
     */
    private class CustomAdapter extends BaseAdapter
    {

        /* (non-Javadoc)
         * @see android.widget.Adapter#getCount()
         */
        @Override
        public int getCount()
        {
            return groupsList.size();
        }

        /* (non-Javadoc)
         * @see android.widget.Adapter#getItem(int)
         */
        @Override
        public Group getItem(int arg0)
        {
            return groupsList.get(arg0);
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
                        R.layout.groups_item, null);

            ImageView img = (ImageView) v.findViewById(R.id.group_img);
            img.setImageResource(Integer.parseInt(getItem(pos).getImg()));

            TextView lbl = (TextView) v.findViewById(R.id.group_name);
            lbl.setText(getItem(pos).getName());

            lbl = (TextView) v.findViewById(R.id.group_desc);
            lbl.setText(getItem(pos).getDescription());
            return v;
        }

    }
}
