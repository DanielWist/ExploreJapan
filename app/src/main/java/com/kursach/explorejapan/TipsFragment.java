package com.kursach.explorejapan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TipsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tips, container, false);

        TextView tvTopic1 = view.findViewById(R.id.tvTopic1);
        TextView tvContent1 = view.findViewById(R.id.tvContent1);

        TextView tvTopic2 = view.findViewById(R.id.tvTopic2);
        TextView tvContent2 = view.findViewById(R.id.tvContent2);

        TextView tvTopic3 = view.findViewById(R.id.tvTopic3);
        TextView tvContent3 = view.findViewById(R.id.tvContent3);

        TextView tvTopic4 = view.findViewById(R.id.tvTopic4);
        TextView tvContent4 = view.findViewById(R.id.tvContent4);

        TextView tvTopic5 = view.findViewById(R.id.tvTopic5);
        TextView tvContent5 = view.findViewById(R.id.tvContent5);

        TextView tvTopic6 = view.findViewById(R.id.tvTopic6);
        TextView tvContent6 = view.findViewById(R.id.tvContent6);

        tvTopic1.setOnClickListener(v -> {
            if (tvContent1.getVisibility() == View.GONE) {
                tvContent1.setVisibility(View.VISIBLE);
            } else {
                tvContent1.setVisibility(View.GONE);
            }
        });

        tvTopic2.setOnClickListener(v -> {
            if (tvContent2.getVisibility() == View.GONE) {
                tvContent2.setVisibility(View.VISIBLE);
            } else {
                tvContent2.setVisibility(View.GONE);
            }
        });

        tvTopic3.setOnClickListener(v -> {
            if (tvContent3.getVisibility() == View.GONE) {
                tvContent3.setVisibility(View.VISIBLE);
            } else {
                tvContent3.setVisibility(View.GONE);
            }
        });

        tvTopic4.setOnClickListener(v -> {
            if (tvContent4.getVisibility() == View.GONE) {
                tvContent4.setVisibility(View.VISIBLE);
            } else {
                tvContent4.setVisibility(View.GONE);
            }
        });

        tvTopic5.setOnClickListener(v -> {
            if (tvContent5.getVisibility() == View.GONE) {
                tvContent5.setVisibility(View.VISIBLE);
            } else {
                tvContent5.setVisibility(View.GONE);
            }
        });

        tvTopic6.setOnClickListener(v -> {
            if (tvContent6.getVisibility() == View.GONE) {
                tvContent6.setVisibility(View.VISIBLE);
            } else {
                tvContent6.setVisibility(View.GONE);
            }
        });

        return view;
    }
}

