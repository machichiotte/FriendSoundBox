package com.machichi.app.friendsoundbox;

import android.app.Fragment;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        ImageButton one = (ImageButton)rootView.findViewById(R.id.button_soundbox_A);

        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.sonar);
one.setImageResource(R.drawable.benj);
        one.setBackgroundColor(Color.TRANSPARENT);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });


        return rootView;
    }
}
