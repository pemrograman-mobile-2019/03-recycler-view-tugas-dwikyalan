package com.example.win10.recyclerviewtugas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SepedaAdapter extends RecyclerView.Adapter<SepedaAdapter.SepedaViewHolder> {


    private ArrayList<Sepeda> dataList;

    public SepedaAdapter(ArrayList<Sepeda> dataList) {
        this.dataList = dataList;
    }

    @Override
    public SepedaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new SepedaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SepedaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtMerk.setText(dataList.get(position).getMerk());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class SepedaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtMerk;

        public SepedaViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtMerk = (TextView) itemView.findViewById(R.id.txt_merk);
        }
    }
}
