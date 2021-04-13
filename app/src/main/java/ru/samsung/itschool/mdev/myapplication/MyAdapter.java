package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyItem> {

    private Context context;
    private ArrayList arrayList;

    MyAdapter(ArrayList<MyImage> a, Context c) {
        this.context = c;
        this.arrayList = a;
    }

    @NonNull
    @Override
    public MyItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyItem holder, int position) {
        // загрузить картинки
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyItem extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;

        public MyItem(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById();
            textView = itemView.findViewById();
        }

    }
}
