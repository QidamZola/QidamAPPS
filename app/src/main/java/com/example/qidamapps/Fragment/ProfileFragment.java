package com.example.qidamapps.Fragment;

/*
 * Tanggal Pengerjaan : 02-05-2019
 * NIM      : 10116055
 * Nama     : Qidam Zola Farhan
 * Kelas    : IF-2 / AKB-2
 */
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.qidamapps.R;

public class ProfileFragment extends Fragment {

    private ImageButton ig,fb,maps;
    private Button about;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile,container,false);

        about = (Button) view.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                final Dialog dialog = new Dialog(getActivity());
                dialog.setTitle("About Apps");
                dialog.setContentView(R.layout.activity_about);

                DisplayMetrics metrics = getResources().getDisplayMetrics();
                int width = metrics.widthPixels;
                dialog.getWindow().setLayout((6*width)/7, LinearLayout.LayoutParams.WRAP_CONTENT);

                dialog.show();
            }
        });

        ig = (ImageButton) view.findViewById(R.id.instagramBtn);
        ig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showInstagram();
            }
        });

        fb = (ImageButton) view.findViewById(R.id.facebookBtn);
        fb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showFacebook();
            }
        });


        maps = (ImageButton) view.findViewById(R.id.locationBtn);
        maps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                showLocation();
            }
        });



        return view;
    }
    void showLocation(){
        String gmmIntentUri="https://www.google.com/maps/place/Jl.+Panyingkiran,+Sumedang+Utara,+Kabupaten+Sumedang,+Jawa+Barat+45621/@-6.8439698,107.9219551,17z/data=!3m1!4b1!4m5!3m4!1s0x2e68d1375901129b:0xbf9f041c3daadc2e!8m2!3d-6.8439751!4d107.9241438";
        Intent location = new Intent(Intent.ACTION_VIEW);
        location.setData(Uri.parse(gmmIntentUri));
        startActivity(location);
    }

    void showFacebook(){
        String gmmIntentUri="https://www.facebook.com/qidamzola";
        Intent facebook = new Intent(Intent.ACTION_VIEW);
        facebook.setData(Uri.parse(gmmIntentUri));
        startActivity(facebook);
    }

    void showInstagram(){
        String gmmIntentUri="https://www.instagram.com/qidamzolaaa";
        Intent instagram = new Intent(Intent.ACTION_VIEW);
        instagram.setData(Uri.parse(gmmIntentUri));
        startActivity(instagram);
    }

    void showAbout(){
    }

}
