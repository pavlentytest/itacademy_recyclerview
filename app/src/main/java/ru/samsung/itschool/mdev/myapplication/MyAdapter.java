package ru.samsung.itschool.mdev.myapplication;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyItem> {

    @NonNull
    @Override
    public MyItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyItem holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyItem extends RecyclerView.ViewHolder {

        public MyItem(@NonNull View itemView) {
            super(itemView);
        }
    }
}
