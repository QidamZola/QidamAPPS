package com.example.qidamapps.Fragment;
/*
 * Tanggal Pengerjaan : 03-05-2019
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
import com.example.qidamapps.Model.ModelAktifitas;
import com.example.qidamapps.Model.ModelKontak;
import com.example.qidamapps.R;

import java.util.ArrayList;

public class DailyFragment extends Fragment {

    private RecyclerView recyclerView,recyclerView1;

    private AktifitasAdapter adapteraktifitas;
    private KontakAdapter adapterkontak;

    private ArrayList<ModelAktifitas> modelaktifitas;
    private ArrayList<ModelKontak> modelkontak;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily,container,false);

        addAktifitas();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recylerdaily);
        adapteraktifitas = new AktifitasAdapter(modelaktifitas);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapteraktifitas);


        addKontak();
        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recylerfriend);
        adapterkontak = new KontakAdapter(modelkontak);
        if(recyclerView1!=null)
        {
            recyclerView1.setAdapter(adapterkontak);
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(),1));
        }

        return view;
    }

    void addAktifitas(){
        modelaktifitas = new ArrayList<>();
        modelaktifitas.add(new ModelAktifitas("05.00","Bangun tidur langsung solat mandi sikat gigi siap siap kuliah"));
        modelaktifitas.add(new ModelAktifitas("06.00","Nyampe kampus sanskuy dulu ngopi sebat sedap sampe jam 7"));
        modelaktifitas.add(new ModelAktifitas("09.00","Beres kelas pertama nongkrong makan ngopi sebat sedap abis "));
        modelaktifitas.add(new ModelAktifitas("13.45","Masuk kelas kedua"));
        modelaktifitas.add(new ModelAktifitas("15.30","Beres kelas kedua nongkrong dulu lah"));
        modelaktifitas.add(new ModelAktifitas("16.30","Pulang ke kosan beraktifitas langsung main game atau main gitar"));

    }

    void addKontak(){
        modelkontak = new ArrayList<>();
        modelkontak.add(new ModelKontak("Qidam Zola Farhan"));
        modelkontak.add(new ModelKontak("Dikky Dermawan"));
        modelkontak.add(new ModelKontak("Rezza Jaya Mukti"));
        modelkontak.add(new ModelKontak("M Hafizh Budiman"));
        modelkontak.add(new ModelKontak("Aldi Muhammad Syafi"));
        modelkontak.add(new ModelKontak("Gitar Tercinta"));
    }
}
