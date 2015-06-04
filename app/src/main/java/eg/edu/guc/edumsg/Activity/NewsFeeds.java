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

import eg.edu.guc.edumsg.Model.Tweet;
import eg.edu.guc.edumsg.R;

/**
 * The Class ActivityList is the Fragment class that is launched when the user
 * clicks on Activity option in Left navigation drawer.
 */
public class NewsFeeds extends Fragment
{

    /** The Activity list. */
    private ArrayList<Tweet> actList;

    /* (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_news_feeds, null);

        loadActivities();
        ListView list = (ListView) v.findViewById(R.id.list);
        list.setAdapter(new CutsomAdapter());
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                try {
                    Tweet tweet = actList.get(Integer.parseInt(l + ""));
                    Fragment frag = new PostFrag(tweet);
                    ((MainActivity)getActivity()).actionBar.setTitle(((MainActivity)getActivity()).getLoggedIn().getFirst_name()+ " " + ((MainActivity)getActivity()).getLoggedIn().getLast_name());
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.container, frag).commit();
                } catch (Exception e) {
                }
            }
        });
        return v;
    }


    /**
     * This method currently loads a dummy list of activities. You can write the
     * actual implementation of loading categories.
     */
    private void loadActivities()
    {
        actList = new ArrayList<Tweet>();
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
        public Tweet getItem(int arg0)
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
                        R.layout.news_feeds_item, null);

            TextView lbl = (TextView) v.findViewById(R.id.nf_item_title);
            lbl.setText(((MainActivity)getActivity()).getLoggedIn().getFirst_name()+ " " + ((MainActivity)getActivity()).getLoggedIn().getLast_name());

            lbl = (TextView) v.findViewById(R.id.nf_item_content);
            lbl.setText(getItem(pos).getTweet_text());

            lbl = (TextView) v.findViewById(R.id.nf_item_date);
            lbl.setText(getItem(pos).getCreated_at());

            ImageView img = (ImageView) v.findViewById(R.id.nf_item_img);
            img.setImageResource(R.drawable.feed_img);

            lbl = (TextView) v.findViewById(R.id.nf__item_no_likes);
            lbl.setText(5+"");

            lbl = (TextView) v.findViewById(R.id.nf_item_no_comments);
            lbl.setText(20+"");
            return v;
        }

    }
}
