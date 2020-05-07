package com.example.carding;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {
    public Context context;
    private List<CourseDataModel> courseDataModelList;

    public CourseAdapter(Context context,List<CourseDataModel> courseDataModelList){
        this.context=context;
        this.courseDataModelList=courseDataModelList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    CourseDataModel courseDataModel = courseDataModelList.get(position);
    holder.titletxt.setText(courseDataModel.getTitletxt());
    holder.pricetxt.setText(courseDataModel.getPricetxt());
    holder.image.setImageResource(courseDataModel.getImage());
    holder.cardView.setCardBackgroundColor(courseDataModel.getBgcolor());
    holder.btn.setTextColor(courseDataModel.getBgcolor());
    holder.btn.setIconTint(ColorStateList.valueOf(courseDataModel.getBgcolor()));
    holder.txt.setTextColor(courseDataModel.getBgcolor());
    }

    @Override
    public int getItemCount() {
        return courseDataModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MaterialCardView cardView;
        public MaterialTextView titletxt,pricetxt,txt;
        public ImageView image;
        public MaterialButton btn;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.fullcard);
            titletxt=itemView.findViewById(R.id.titletxt);
            pricetxt=itemView.findViewById(R.id.pricetxt);
            txt=itemView.findViewById(R.id.txt);
            image=itemView.findViewById(R.id.img);
            btn=itemView.findViewById(R.id.cardbtn);
        }
    }
}
