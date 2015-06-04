package eg.edu.guc.edumsg.Activity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import eg.edu.guc.edumsg.Model.Tweet;
import eg.edu.guc.edumsg.R;

/**
 * Created by ammar on 5/12/15.
 */
@SuppressLint("ValidFragment")
public class PostFrag extends Fragment {

    Tweet tweet;

    public PostFrag(Tweet tweet){
        this.tweet = tweet;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.post_frag, null);
        if (!tweet.getImage_url().equals(""))
        {
            ImageView img = (ImageView) v.findViewById(R.id.imageView1);
            img.setImageResource(R.drawable.feed_img);
        }

        TextView lbl = (TextView) v.findViewById(R.id.textView_ex2);
        lbl.setText(tweet.getCreator().getName());

        lbl = (TextView) v.findViewById(R.id.textView_ex3);
        lbl.setText(tweet.getTweet_text());
        return v;
    }
}
