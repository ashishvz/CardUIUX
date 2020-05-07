package com.example.carding;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.MyViewHolder> {
    public Context context;
    public List<TestDataModel> testDataModelList;

    public TestAdapter(Context context,List<TestDataModel> testDataModelList){
        this.context=context;
        this.testDataModelList=testDataModelList;
    }
    @NonNull
    @Override
    public TestAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_card,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TestAdapter.MyViewHolder holder, int position) {
        TestDataModel testDataModel = testDataModelList.get(position);
        holder.titletxt.setText(testDataModel.getTitletxt());
        holder.btn.setIconTint(ColorStateList.valueOf(testDataModel.getColor()));
        holder.cardView.setCardBackgroundColor(testDataModel.getColor());
        holder.btn.setTextColor(testDataModel.getColor());

    }

    @Override
    public int getItemCount() {
        return testDataModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MaterialCardView cardView;
        public MaterialTextView titletxt;
        public MaterialButton btn;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titletxt=itemView.findViewById(R.id.coursetxt);
            cardView=itemView.findViewById(R.id.tcard);
            btn=itemView.findViewById(R.id.testbtn);
        }
    }
}
