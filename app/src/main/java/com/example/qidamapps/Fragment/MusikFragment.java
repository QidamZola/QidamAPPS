package com.example.qidamapps.Fragment;
/*
 * Tanggal Pengerjaan : 04-05-2019
 * NIM      : 10116055
 * Nama     : Qidam Zola Farhan
 * Kelas    : IF-2 / AKB-2
 */
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qidamapps.Adapter.AktifitasAdapter;
import com.example.qidamapps.Adapter.KontakAdapter;
import com.example.qidamapps.Adapter.MusikAdapter;
import com.example.qidamapps.Model.ModelAktifitas;
import com.example.qidamapps.Model.ModelKontak;
import com.example.qidamapps.Model.ModelMusik;
import com.example.qidamapps.R;

import java.util.ArrayList;

public class MusikFragment extends Fragment {

    private RecyclerView recyclerView;

    private MusikAdapter adaptermusik;

    private ArrayList<ModelMusik> modelmusik;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musik,container,false);

        addMusik();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclermusik);
        adaptermusik = new MusikAdapter(modelmusik);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adaptermusik);

        return view;
    }

    void addMusik(){
        modelmusik = new ArrayList<>();
        modelmusik.add(new ModelMusik("Bring Me The Horizon","Drawn"));
        modelmusik.add(new ModelMusik("Bring Me The Horizon","Shadow Moses"));
        modelmusik.add(new ModelMusik("Bring Me The Horizon","Sleepwalking"));
        modelmusik.add(new ModelMusik("Led Zeppelin","Kashmir"));
        modelmusik.add(new ModelMusik("Led Zeppelin","Rock N Roll"));
        modelmusik.add(new ModelMusik("Led Zeppelin","Black Dog"));
        modelmusik.add(new ModelMusik("The Sigit","Conundrum"));
        modelmusik.add(new ModelMusik("The Beatles","I Saw Her Standing There"));


    }
}
