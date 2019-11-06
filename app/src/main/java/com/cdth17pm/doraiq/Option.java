package com.cdth17pm.doraiq;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Option extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    private final ArrayList<LinhVuc>mListLinhVuc=new ArrayList<>();
    private RecyclerView mRecycleView;
    private LinhVucAdapter mLinhVucAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        mRecycleView=findViewById(R.id.RecycleView_item);
        mLinhVucAdapter=new LinhVucAdapter(this,mListLinhVuc);
        mRecycleView.setAdapter(mLinhVucAdapter);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        if(getSupportLoaderManager().getLoader(0)!=null) {
            getSupportLoaderManager().initLoader(0, null, this);
        }
        getSupportLoaderManager().restartLoader(0,null,this);
    }

    @NonNull
    @Override
    public Loader<String> onCreateLoader(int id, @Nullable Bundle args) {
        return new LinhVucLoader(this);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<String> loader, String data) {
        try {
            JSONObject jsonObject = new JSONObject(data);
            JSONArray itemsArray = jsonObject.getJSONArray("data");
            for(int i=0; i<itemsArray.length(); i++) {
                String mTenLinhVuc = itemsArray.getJSONObject(i).getString("ten_linh_vuc");

                this.mListLinhVuc.add(new LinhVuc(mTenLinhVuc));


            }

            this.mLinhVucAdapter.notifyDataSetChanged();

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onLoaderReset(@NonNull Loader<String> loader) {

    }

    public void Playgame(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        startActivity(intent);
    }
}
