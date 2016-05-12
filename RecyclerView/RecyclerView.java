package com.example.mystady.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv= new RecyclerView(this);
        //初始化RecyclerView
        setContentView(rv);
        //设置contentView

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new RecyclerView.Adapter() {
        //Adapter是连接后端数据和前端显示的适配器接口

            class vh extends RecyclerView.ViewHolder{

                private TextView tv;

                public vh(View itemView) {
                    super(itemView);

                    tv= (TextView) itemView;
                }

                public TextView getTv() {
                    return tv;
                }
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new vh(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                vh vssh =(vh) holder;
                int i=position*2;
                vssh.getTv().setText("Item"+i);
            }

            @Override
            //设置数量
            public int getItemCount() {
                return 100;
            }
        });
    }
}
