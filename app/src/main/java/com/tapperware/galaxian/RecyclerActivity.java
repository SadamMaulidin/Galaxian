package com.tapperware.galaxian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerActivity extends AppCompatActivity {

    //TODO 1 men-generate butterknife untuk recycleview
    @BindView(R.id.my_recyler_view)
    RecyclerView myRecylerView;

    String[] namaClub,detailClub;
    int[] gambarClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        ButterKnife.bind(this);

        //TODO 3 mengisi variable array dari folder res -> Strings,drawable
        namaClub = getResources().getStringArray(R.array.planet_name);
        detailClub = getResources().getStringArray(R.array.planet_detail);
        gambarClub = new int[]{R.drawable.merku, R.drawable.venus, R.drawable.bumi, R.drawable.mars, R.drawable.jupi, R.drawable.saturn, R.drawable.uranus, R.drawable.nept};

        //TODO 4 membuat object dan mengirim data nama,detail,dan gambar ke adapter
        Adapter adapter = new Adapter(RecyclerActivity.this, gambarClub, namaClub, detailClub);

        //TODO 5 men-setting recyclerview dan men-set recyclerview dengan adapter
        myRecylerView.setHasFixedSize(true);
        myRecylerView.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
        myRecylerView.setAdapter(adapter);
    }
}
