package com.cdth17pm.doraiq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LinhVucAdapter extends RecyclerView.Adapter<LinhVucAdapter.LinhVucViewHolder> {
    private final ArrayList<LinhVuc> mListLinhVuc;
    private LayoutInflater mInflater;

    public LinhVucAdapter(Context context, ArrayList<LinhVuc> mListLinhVuc) {
        this.mListLinhVuc = mListLinhVuc;
        mInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public LinhVucViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.linhvuc_item,parent,false);
        return new LinhVucViewHolder(itemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull LinhVucViewHolder holder, int position) {
        LinhVuc linhVuc=mListLinhVuc.get(position);
        holder.mTenLinhVuc.setText(linhVuc.getTenLinhVuc());
    }

    @Override
    public int getItemCount() {
        return mListLinhVuc.size();
    }

    public class LinhVucViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        final TextView mTenLinhVuc;
        final LinhVucAdapter linhVucAdapter;
        public LinhVucViewHolder(@NonNull View itemView, LinhVucAdapter linhVucAdapter) {
            super(itemView);
            this.linhVucAdapter=linhVucAdapter;
            this.mTenLinhVuc=itemView.findViewById(R.id.textView_LinhVuc);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
