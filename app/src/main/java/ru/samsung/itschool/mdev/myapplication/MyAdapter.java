package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyItem> {

    private Context context;
    private ArrayList<MyImage> arrayList;

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
        // загрузить текст
        holder.textView.setText(arrayList.get(position).getName());
        // загрузить
        Picasso.get().load(arrayList.get(position).getUrl()).into(holder.imageView);
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
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }

    }
}
