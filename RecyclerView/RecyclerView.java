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
		//线性布局
		//rv.setLayoutManager(new GridLayoutManager(this,3));
		//表格布局 this,3列 默认垂直方向的

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
                vh vssh = (vh) holder;
                if(position<data.length) {
                    vssh.getTv().setText(data[position]);
                }else {
                    String i= Integer.toString(position);
                    //int 转 string
                    vssh.getTv().setText(i);
                }
            }

            @Override
            //设置数量
            public int getItemCount() {
                return 450;
            }

            private String[] data=new String[]{"HELLO","NI HAO","JIEKE","SOLO"};
        });
    }
}
