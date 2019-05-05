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

import com.example.qidamapps.Model.ModelKontak;
import com.example.qidamapps.R;

import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.ActivitydailyViewHolder> {

    private ArrayList<ModelKontak> kontaklist;

    public KontakAdapter(ArrayList<ModelKontak> kontaklist){

        this.kontaklist = kontaklist;

    }

    @NonNull
    @Override
    public KontakAdapter.ActivitydailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.kontak_layout,parent, false);
        return new ActivitydailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter.ActivitydailyViewHolder activitydailyViewHolder, int position) {
        activitydailyViewHolder.txtnamateman.setText(kontaklist.get(position).getNamateman());

    }

    @Override
    public int getItemCount() {
        return (kontaklist != null) ? kontaklist.size() : 0;
    }

    public class ActivitydailyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnamateman;

        public ActivitydailyViewHolder(@NonNull View itemView){
            super(itemView);

            txtnamateman = (TextView) itemView.findViewById(R.id.txt_namateman);
        }
    }
}
