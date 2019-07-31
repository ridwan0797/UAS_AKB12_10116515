package com.school.carisma;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.school.carisma.MainActivity;
import com.school.carisma.Model;
import com.school.carisma.R;

public class SmaActivity extends AppCompatActivity {


    private DatabaseReference mDatabase;
    private RecyclerView mBlogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma);


        mDatabase = FirebaseDatabase.getInstance().getReference().child("SMAN");
        mDatabase.keepSynced(true);

        mBlogList=(RecyclerView)findViewById(R.id.recyclerv_view);
        mBlogList.setHasFixedSize(true);
        mBlogList.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Model, SmaActivity.BlogViewHolder> firebaseRecyclerAdapter= new FirebaseRecyclerAdapter<Model,SmaActivity.BlogViewHolder>
                (Model.class,R.layout.blog_row, SmaActivity.BlogViewHolder.class,mDatabase) {
            @Override
            protected void populateViewHolder(SmaActivity.BlogViewHolder viewHolder, Model model, int position) {

                viewHolder.setNama(model.getNama());
                viewHolder.setAlamat(model.getAlamat());
                viewHolder.setProv(model.getProvinsi());
                viewHolder.setTelp(model.getTelepon());
                viewHolder.setImage(getApplicationContext(),model.image);



            }
        };

        mBlogList.setAdapter(firebaseRecyclerAdapter);
    }

    public static class BlogViewHolder extends RecyclerView.ViewHolder
    {
        View mView;
        public BlogViewHolder(View itemView)
        {
            super(itemView);
            mView=itemView;
        }
        public void setNama(String nama)
        {
            TextView post_title = (TextView)mView.findViewById(R.id.post_title);
            post_title.setText(nama);
        }
        public void setAlamat(String alamat)
        {
            TextView post_desc = (TextView)mView.findViewById(R.id.post_desc);
            post_desc.setText(alamat);
        }
        public void setTelp(String telepon)
        {
            TextView post_telepon = (TextView)mView.findViewById(R.id.post_telpon);
            post_telepon.setText(telepon);
        }
        public void setProv(String provinsi)
        {
            TextView post_prov = (TextView)mView.findViewById(R.id.post_provinsi);
            post_prov.setText(provinsi);
        }

        public void setImage(Context ctx, String image)
        {
            ImageView post_image= (ImageView) mView.findViewById(R.id.post_image);
            Glide.with(ctx).load(image).into(post_image);
        }

    }
}

