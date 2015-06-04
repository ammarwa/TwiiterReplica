package eg.edu.guc.edumsg.Activity;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import eg.edu.guc.edumsg.Model.Message;
import eg.edu.guc.edumsg.R;

@SuppressLint("ValidFragment")
public class MsgFrag extends Fragment {

    Message msg;

    public MsgFrag(Message msg) {
        // Required empty public constructor
        this.msg = msg;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_msg, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.message_show_sent_img);
        TextView sender_name = (TextView) v.findViewById(R.id.message_show_sent_name);
        TextView date = (TextView) v.findViewById(R.id.message_show_date);
        TextView subject = (TextView) v.findViewById(R.id.message_show_subject);
        TextView desc = (TextView) v.findViewById(R.id.message_show_desc);
        imageView.setImageResource(Integer.parseInt(msg.getSender_img()));
        sender_name.setText(msg.getSender_name());
        date.setText(msg.getDate());
        subject.setText(msg.getSubject());
        desc.setText(msg.getBody()+"SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage SampleMessage");
        return v;
    }


}
