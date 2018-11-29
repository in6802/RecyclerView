package com.mydoublej.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<ItemData> arrayList = new ArrayList<>();

    public MyAdapter(ArrayList<ItemData> arrayList) {
        this.arrayList = arrayList;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mName, mNumber;

        public MyViewHolder(@NonNull View itemView, ArrayList<ItemData> arrayList) {
            super(itemView);
            arrayList = arrayList;
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.textName);
            mNumber = itemView.findViewById(R.id.textNumber);
        }
    }

    @NonNull
    @Override
    //onCreateViewHolder 메인에 아이템 연결
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview, viewGroup, false);

        return new MyViewHolder(view);
    }

    // 아이템에 data를 넣어줌
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MyViewHolder myViewHolder =(MyViewHolder)viewHolder;
        myViewHolder.mName.setText(arrayList.get(i).getName());
        myViewHolder.mName.setText(arrayList.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
