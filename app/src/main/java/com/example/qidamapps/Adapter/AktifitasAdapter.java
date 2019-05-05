package com.example.qidamapps.Adapter;
/*
 * Tanggal Pengerjaan : 03-05-2019
 * NIM      : 10116055
 * Nama     : Qidam Zola Farhan
 * Kelas    : IF-2 / AKB-2
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.qidamapps.Model.ModelAktifitas;
import com.example.qidamapps.R;

import java.util.ArrayList;

public class AktifitasAdapter extends RecyclerView.Adapter<AktifitasAdapter.ActivitydailyViewHolder> {

    private ArrayList<ModelAktifitas> activitylist;

    public AktifitasAdapter(ArrayList<ModelAktifitas> activitylist){
        this.activitylist = activitylist;
    }

    @NonNull
    @Override
    public AktifitasAdapter.ActivitydailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.aktifitas_layout,parent, false);
        return new ActivitydailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AktifitasAdapter.ActivitydailyViewHolder activitydailyViewHolder, int position) {
        activitydailyViewHolder.txtjudul.setText(activitylist.get(position).getJudul());
        activitydailyViewHolder.txtdeskrpsi.setText(activitylist.get(position).getDeskrpsi());

    }

    @Override
    public int getItemCount() {
        return (activitylist != null) ? activitylist.size() : 0;
    }

    public class ActivitydailyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtjudul,txtdeskrpsi;

        public ActivitydailyViewHolder(@NonNull View itemView){
            super(itemView);

            txtjudul = (TextView) itemView.findViewById(R.id.txt_judul);
            txtdeskrpsi = (TextView) itemView.findViewById(R.id.txt_deskripsi);
        }
    }
}
