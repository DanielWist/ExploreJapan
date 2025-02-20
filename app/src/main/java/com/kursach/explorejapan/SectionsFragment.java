package com.kursach.explorejapan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SectionsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sections, container, false);

        TextView tvTopic1 = view.findViewById(R.id.tvTopic1);
        LinearLayout section1Content = view.findViewById(R.id.section1Content);

        LinearLayout subTopic1_1Container = view.findViewById(R.id.subTopic1_1Container);
        TextView tvDescription1_1 = view.findViewById(R.id.tvDescription1_1);
        ImageView tvImage1_1 = view.findViewById(R.id.tvImage1_1);

        LinearLayout subTopic1_2Container = view.findViewById(R.id.subTopic1_2Container);
        TextView tvDescription1_2 = view.findViewById(R.id.tvDescription1_2);
        ImageView tvImage1_2 = view.findViewById(R.id.tvImage1_2);

        LinearLayout subTopic1_3Container = view.findViewById(R.id.subTopic1_3Container);
        TextView tvDescription1_3 = view.findViewById(R.id.tvDescription1_3);
        ImageView tvImage1_3 = view.findViewById(R.id.tvImage1_3);

        LinearLayout subTopic1_4Container = view.findViewById(R.id.subTopic1_4Container);
        TextView tvDescription1_4 = view.findViewById(R.id.tvDescription1_4);
        ImageView tvImage1_4 = view.findViewById(R.id.tvImage1_4);

        TextView tvTopic2 = view.findViewById(R.id.tvTopic2);
        LinearLayout section2Content = view.findViewById(R.id.section2Content);

        LinearLayout subTopic2_1Container = view.findViewById(R.id.subTopic2_1Container);
        TextView tvDescription2_1 = view.findViewById(R.id.tvDescription2_1);
        ImageView tvImage2_1 = view.findViewById(R.id.tvImage2_1);

        LinearLayout subTopic2_2Container = view.findViewById(R.id.subTopic2_2Container);
        TextView tvDescription2_2 = view.findViewById(R.id.tvDescription2_2);
        ImageView tvImage2_2 = view.findViewById(R.id.tvImage2_2);

        LinearLayout subTopic2_3Container = view.findViewById(R.id.subTopic2_3Container);
        TextView tvDescription2_3 = view.findViewById(R.id.tvDescription2_3);
        ImageView tvImage2_3 = view.findViewById(R.id.tvImage2_3);

        TextView tvTopic3 = view.findViewById(R.id.tvTopic3);
        LinearLayout section3Content = view.findViewById(R.id.section3Content);
        LinearLayout livingCostContent = view.findViewById(R.id.livingCostContent);

        TextView tvTopic4 = view.findViewById(R.id.tvTopic4);
        LinearLayout section4Content = view.findViewById(R.id.section4Content);

        LinearLayout subTopic4_1Container = view.findViewById(R.id.subTopic4_1Container);
        TextView tvDescription4_1 = view.findViewById(R.id.tvDescription4_1);
        ImageView tvImage4_1 = view.findViewById(R.id.tvImage4_1);

        LinearLayout subTopic4_2Container = view.findViewById(R.id.subTopic4_2Container);
        TextView tvDescription4_2 = view.findViewById(R.id.tvDescription4_2);
        ImageView tvImage4_2 = view.findViewById(R.id.tvImage4_2);

        LinearLayout subTopic4_3Container = view.findViewById(R.id.subTopic4_3Container);
        TextView tvDescription4_3 = view.findViewById(R.id.tvDescription4_3);
        ImageView tvImage4_3 = view.findViewById(R.id.tvImage4_3);

        TextView tvTopic5 = view.findViewById(R.id.tvTopic5);
        LinearLayout section5Content = view.findViewById(R.id.section5Content);

        LinearLayout subTopic5_1Container = view.findViewById(R.id.subTopic5_1Container);
        TextView tvDescription5_1 = view.findViewById(R.id.tvDescription5_1);
        ImageView tvImage5_1 = view.findViewById(R.id.tvImage5_1);

        LinearLayout subTopic5_2Container = view.findViewById(R.id.subTopic5_2Container);
        TextView tvDescription5_2 = view.findViewById(R.id.tvDescription5_2);
        ImageView tvImage5_2 = view.findViewById(R.id.tvImage5_2);

        TextView tvTopic6 = view.findViewById(R.id.tvTopic6);
        LinearLayout section6Content = view.findViewById(R.id.section6Content);

        LinearLayout subTopic6_1Container = view.findViewById(R.id.subTopic6_1Container);
        TextView tvDescription6_1 = view.findViewById(R.id.tvDescription6_1);
        ImageView tvImage6_1 = view.findViewById(R.id.tvImage6_1);

        LinearLayout subTopic6_2Container = view.findViewById(R.id.subTopic6_2Container);
        TextView tvDescription6_2 = view.findViewById(R.id.tvDescription6_2);
        ImageView tvImage6_2 = view.findViewById(R.id.tvImage6_2);

        LinearLayout subTopic6_3Container = view.findViewById(R.id.subTopic6_3Container);
        TextView tvDescription6_3 = view.findViewById(R.id.tvDescription6_3);
        ImageView tvImage6_3 = view.findViewById(R.id.tvImage6_3);

        TextView tvTopic7 = view.findViewById(R.id.tvTopic7);
        LinearLayout section7Content = view.findViewById(R.id.section7Content);

        LinearLayout subTopic7_1Container = view.findViewById(R.id.subTopic7_1Container);
        TextView tvDescription7_1 = view.findViewById(R.id.tvDescription7_1);
        ImageView tvImage7_1 = view.findViewById(R.id.tvImage7_1);

        LinearLayout subTopic7_2Container = view.findViewById(R.id.subTopic7_2Container);
        TextView tvDescription7_2 = view.findViewById(R.id.tvDescription7_2);
        ImageView tvImage7_2 = view.findViewById(R.id.tvImage7_2);

        LinearLayout subTopic7_3Container = view.findViewById(R.id.subTopic7_3Container);
        TextView tvDescription7_3 = view.findViewById(R.id.tvDescription7_3);
        ImageView tvImage7_3 = view.findViewById(R.id.tvImage7_3);

        TextView tvTopic8 = view.findViewById(R.id.tvTopic8);
        LinearLayout section8Content = view.findViewById(R.id.section8Content);

        LinearLayout subTopic8_1Container = view.findViewById(R.id.subTopic8_1Container);
        TextView tvDescription8_1 = view.findViewById(R.id.tvDescription8_1);
        ImageView tvImage8_1 = view.findViewById(R.id.tvImage8_1);

        LinearLayout subTopic8_2Container = view.findViewById(R.id.subTopic8_2Container);
        TextView tvDescription8_2 = view.findViewById(R.id.tvDescription8_2);
        ImageView tvImage8_2 = view.findViewById(R.id.tvImage8_2);

        LinearLayout subTopic8_3Container = view.findViewById(R.id.subTopic8_3Container);
        TextView tvDescription8_3 = view.findViewById(R.id.tvDescription8_3);
        ImageView tvImage8_3 = view.findViewById(R.id.tvImage8_3);

        TextView tvTopic9 = view.findViewById(R.id.tvTopic9);
        LinearLayout section9Content = view.findViewById(R.id.section9Content);

        LinearLayout subTopic9_1Container = view.findViewById(R.id.subTopic9_1Container);
        TextView tvDescription9_1 = view.findViewById(R.id.tvDescription9_1);
        ImageView tvImage9_1 = view.findViewById(R.id.tvImage9_1);

        LinearLayout subTopic9_2Container = view.findViewById(R.id.subTopic9_2Container);
        TextView tvDescription9_2 = view.findViewById(R.id.tvDescription9_2);
        ImageView tvImage9_2 = view.findViewById(R.id.tvImage9_2);

        LinearLayout subTopic9_3Container = view.findViewById(R.id.subTopic9_3Container);
        TextView tvDescription9_3 = view.findViewById(R.id.tvDescription9_3);
        ImageView tvImage9_3 = view.findViewById(R.id.tvImage9_3);

        TextView tvTopic10 = view.findViewById(R.id.tvTopic10);
        LinearLayout section10Content = view.findViewById(R.id.section10Content);

        LinearLayout subTopic10_1Container = view.findViewById(R.id.subTopic10_1Container);
        TextView tvDescription10_1 = view.findViewById(R.id.tvDescription10_1);
        ImageView tvImage10_1 = view.findViewById(R.id.tvImage10_1);

        LinearLayout subTopic10_2Container = view.findViewById(R.id.subTopic10_2Container);
        TextView tvDescription10_2 = view.findViewById(R.id.tvDescription10_2);
        ImageView tvImage10_2 = view.findViewById(R.id.tvImage10_2);

        LinearLayout subTopic10_3Container = view.findViewById(R.id.subTopic10_3Container);
        TextView tvDescription10_3 = view.findViewById(R.id.tvDescription10_3);
        ImageView tvImage10_3 = view.findViewById(R.id.tvImage10_3);

        TextView tvTopic11 = view.findViewById(R.id.tvTopic11);
        LinearLayout section11Content = view.findViewById(R.id.section11Content);

        LinearLayout subTopic11_1Container = view.findViewById(R.id.subTopic11_1Container);
        TextView tvDescription11_1 = view.findViewById(R.id.tvDescription11_1);
        ImageView tvImage11_1 = view.findViewById(R.id.tvImage11_1);

        LinearLayout subTopic11_2Container = view.findViewById(R.id.subTopic11_2Container);
        TextView tvDescription11_2 = view.findViewById(R.id.tvDescription11_2);
        ImageView tvImage11_2 = view.findViewById(R.id.tvImage11_2);

        LinearLayout subTopic11_3Container = view.findViewById(R.id.subTopic11_3Container);
        TextView tvDescription11_3 = view.findViewById(R.id.tvDescription11_3);
        ImageView tvImage11_3 = view.findViewById(R.id.tvImage11_3);

        TextView tvTopic12 = view.findViewById(R.id.tvTopic12);
        LinearLayout section12Content = view.findViewById(R.id.section12Content);

        LinearLayout subTopic12_1Container = view.findViewById(R.id.subTopic12_1Container);
        TextView tvDescription12_1 = view.findViewById(R.id.tvDescription12_1);
        ImageView tvImage12_1 = view.findViewById(R.id.tvImage12_1);

        LinearLayout subTopic12_2Container = view.findViewById(R.id.subTopic12_2Container);
        TextView tvDescription12_2 = view.findViewById(R.id.tvDescription12_2);
        ImageView tvImage12_2 = view.findViewById(R.id.tvImage12_2);

        LinearLayout subTopic12_3Container = view.findViewById(R.id.subTopic12_3Container);
        TextView tvDescription12_3 = view.findViewById(R.id.tvDescription12_3);
        ImageView tvImage12_3 = view.findViewById(R.id.tvImage12_3);

        TextView tvTopic13 = view.findViewById(R.id.tvTopic13);
        LinearLayout section13Content = view.findViewById(R.id.section13Content);

        LinearLayout subTopic13_1Container = view.findViewById(R.id.subTopic13_1Container);
        TextView tvDescription13_1 = view.findViewById(R.id.tvDescription13_1);
        ImageView tvImage13_1 = view.findViewById(R.id.tvImage13_1);

        LinearLayout subTopic13_2Container = view.findViewById(R.id.subTopic13_2Container);
        TextView tvDescription13_2 = view.findViewById(R.id.tvDescription13_2);
        ImageView tvImage13_2 = view.findViewById(R.id.tvImage13_2);

        LinearLayout subTopic13_3Container = view.findViewById(R.id.subTopic13_3Container);
        TextView tvDescription13_3 = view.findViewById(R.id.tvDescription13_3);
        ImageView tvImage13_3 = view.findViewById(R.id.tvImage13_3);

        TextView tvTopic14 = view.findViewById(R.id.tvTopic14);
        LinearLayout section14Content = view.findViewById(R.id.section14Content);

        LinearLayout subTopic14_1Container = view.findViewById(R.id.subTopic14_1Container);
        TextView tvDescription14_1 = view.findViewById(R.id.tvDescription14_1);
        ImageView tvImage14_1 = view.findViewById(R.id.tvImage14_1);

        TextView tvTopic15 = view.findViewById(R.id.tvTopic15);
        LinearLayout section15Content = view.findViewById(R.id.section15Content);

        LinearLayout subTopic15_1Container = view.findViewById(R.id.subTopic15_1Container);
        ImageView tvImage15_1 = view.findViewById(R.id.tvImage15_1);
        TextView tvDescription15_1 = view.findViewById(R.id.tvDescription15_1);
        TextView tvPrice15_1 = view.findViewById(R.id.tvPrice15_1);
        TextView tvSchedule15_1 = view.findViewById(R.id.tvSchedule15_1);
        TextView tvInterestingFact15_1 = view.findViewById(R.id.tvInterestingFact15_1);
        TextView tvInterestingFact_Description15_1 = view.findViewById(R.id.tvInterestingFact_Description15_1);
        ImageView tvImage15_2 = view.findViewById(R.id.tvImage15_2);

        LinearLayout subTopic15_2Container = view.findViewById(R.id.subTopic15_2Container);
        ImageView tvImage15_3 = view.findViewById(R.id.tvImage15_3);
        TextView tvDescription15_2 = view.findViewById(R.id.tvDescription15_2);
        TextView tvPrice15_2 = view.findViewById(R.id.tvPrice15_2);
        TextView tvSchedule15_2 = view.findViewById(R.id.tvSchedule15_2);
        TextView tvInterestingFact15_2 = view.findViewById(R.id.tvInterestingFact15_2);
        TextView tvInterestingFact_Description15_2 = view.findViewById(R.id.tvInterestingFact_Description15_2);
        ImageView tvImage15_4 = view.findViewById(R.id.tvImage15_4);

        LinearLayout subTopic15_3Container = view.findViewById(R.id.subTopic15_3Container);
        ImageView tvImage15_5 = view.findViewById(R.id.tvImage15_5);
        TextView tvDescription15_3 = view.findViewById(R.id.tvDescription15_3);
        TextView tvPrice15_3 = view.findViewById(R.id.tvPrice15_3);
        TextView tvSchedule15_3 = view.findViewById(R.id.tvSchedule15_3);
        TextView tvInterestingFact15_3 = view.findViewById(R.id.tvInterestingFact15_3);
        TextView tvInterestingFact_Description15_3 = view.findViewById(R.id.tvInterestingFact_Description15_3);
        ImageView tvImage15_6 = view.findViewById(R.id.tvImage15_6);

        LinearLayout subTopic15_4Container = view.findViewById(R.id.subTopic15_4Container);
        ImageView tvImage15_7 = view.findViewById(R.id.tvImage15_7);
        TextView tvDescription15_4 = view.findViewById(R.id.tvDescription15_4);
        TextView tvPrice15_4 = view.findViewById(R.id.tvPrice15_4);
        TextView tvSchedule15_4 = view.findViewById(R.id.tvSchedule15_4);
        TextView tvInterestingFact15_4 = view.findViewById(R.id.tvInterestingFact15_4);
        TextView tvInterestingFact_Description15_4 = view.findViewById(R.id.tvInterestingFact_Description15_4);
        ImageView tvImage15_8 = view.findViewById(R.id.tvImage15_8);

        TextView tvTopic16 = view.findViewById(R.id.tvTopic16);
        LinearLayout section16Content = view.findViewById(R.id.section16Content);

        LinearLayout subTopic16_1Container = view.findViewById(R.id.subTopic16_1Container);
        ImageView tvImage16_1 = view.findViewById(R.id.tvImage16_1);
        TextView tvDescription16_1 = view.findViewById(R.id.tvDescription16_1);
        TextView tvPrice16_1 = view.findViewById(R.id.tvPrice16_1);
        TextView tvSchedule16_1 = view.findViewById(R.id.tvSchedule16_1);
        TextView tvInterestingFact16_1 = view.findViewById(R.id.tvInterestingFact16_1);
        TextView tvInterestingFact_Description16_1 = view.findViewById(R.id.tvInterestingFact_Description16_1);
        ImageView tvImage16_2 = view.findViewById(R.id.tvImage16_2);

        LinearLayout subTopic16_2Container = view.findViewById(R.id.subTopic16_2Container);
        ImageView tvImage16_3 = view.findViewById(R.id.tvImage16_3);
        TextView tvDescription16_2 = view.findViewById(R.id.tvDescription16_2);
        TextView tvPrice16_2 = view.findViewById(R.id.tvPrice16_2);
        TextView tvSchedule16_2 = view.findViewById(R.id.tvSchedule16_2);
        TextView tvInterestingFact16_2 = view.findViewById(R.id.tvInterestingFact16_2);
        TextView tvInterestingFact_Description16_2 = view.findViewById(R.id.tvInterestingFact_Description16_2);
        ImageView tvImage16_4 = view.findViewById(R.id.tvImage16_4);

        LinearLayout subTopic16_3Container = view.findViewById(R.id.subTopic16_3Container);
        ImageView tvImage16_5 = view.findViewById(R.id.tvImage16_5);
        TextView tvDescription16_3 = view.findViewById(R.id.tvDescription16_3);
        TextView tvPrice16_3 = view.findViewById(R.id.tvPrice16_3);
        TextView tvSchedule16_3 = view.findViewById(R.id.tvSchedule16_3);
        TextView tvInterestingFact16_3 = view.findViewById(R.id.tvInterestingFact16_3);
        TextView tvInterestingFact_Description16_3 = view.findViewById(R.id.tvInterestingFact_Description16_3);
        ImageView tvImage16_6 = view.findViewById(R.id.tvImage16_6);

        LinearLayout subTopic16_4Container = view.findViewById(R.id.subTopic16_4Container);
        ImageView tvImage16_7 = view.findViewById(R.id.tvImage16_7);
        TextView tvDescription16_4 = view.findViewById(R.id.tvDescription16_4);
        TextView tvPrice16_4 = view.findViewById(R.id.tvPrice16_4);
        TextView tvSchedule16_4 = view.findViewById(R.id.tvSchedule16_4);
        TextView tvInterestingFact16_4 = view.findViewById(R.id.tvInterestingFact16_4);
        TextView tvInterestingFact_Description16_4 = view.findViewById(R.id.tvInterestingFact_Description16_4);
        ImageView tvImage16_8 = view.findViewById(R.id.tvImage16_8);

        TextView tvTopic17 = view.findViewById(R.id.tvTopic17);
        LinearLayout section17Content = view.findViewById(R.id.section17Content);

        LinearLayout subTopic17_1Container = view.findViewById(R.id.subTopic17_1Container);
        ImageView tvImage17_1 = view.findViewById(R.id.tvImage17_1);
        TextView tvDescription17_1 = view.findViewById(R.id.tvDescription17_1);
        TextView tvPrice17_1 = view.findViewById(R.id.tvPrice17_1);
        TextView tvSchedule17_1 = view.findViewById(R.id.tvSchedule17_1);
        TextView tvInterestingFact17_1 = view.findViewById(R.id.tvInterestingFact17_1);
        TextView tvInterestingFact_Description17_1 = view.findViewById(R.id.tvInterestingFact_Description17_1);
        ImageView tvImage17_2 = view.findViewById(R.id.tvImage17_2);

        LinearLayout subTopic17_2Container = view.findViewById(R.id.subTopic17_2Container);
        ImageView tvImage17_3 = view.findViewById(R.id.tvImage17_3);
        TextView tvDescription17_2 = view.findViewById(R.id.tvDescription17_2);
        TextView tvPrice17_2 = view.findViewById(R.id.tvPrice17_2);
        TextView tvSchedule17_2 = view.findViewById(R.id.tvSchedule17_2);
        TextView tvInterestingFact17_2 = view.findViewById(R.id.tvInterestingFact17_2);
        TextView tvInterestingFact_Description17_2 = view.findViewById(R.id.tvInterestingFact_Description17_2);
        ImageView tvImage17_4 = view.findViewById(R.id.tvImage17_4);

        LinearLayout subTopic17_3Container = view.findViewById(R.id.subTopic17_3Container);
        ImageView tvImage17_5 = view.findViewById(R.id.tvImage17_5);
        TextView tvDescription17_3 = view.findViewById(R.id.tvDescription17_3);
        TextView tvPrice17_3 = view.findViewById(R.id.tvPrice17_3);
        TextView tvSchedule17_3 = view.findViewById(R.id.tvSchedule17_3);
        TextView tvInterestingFact17_3 = view.findViewById(R.id.tvInterestingFact17_3);
        TextView tvInterestingFact_Description17_3 = view.findViewById(R.id.tvInterestingFact_Description17_3);
        ImageView tvImage17_6 = view.findViewById(R.id.tvImage17_6);

        LinearLayout subTopic17_4Container = view.findViewById(R.id.subTopic17_4Container);
        ImageView tvImage17_7 = view.findViewById(R.id.tvImage17_7);
        TextView tvDescription17_4 = view.findViewById(R.id.tvDescription17_4);
        TextView tvPrice17_4 = view.findViewById(R.id.tvPrice17_4);
        TextView tvSchedule17_4 = view.findViewById(R.id.tvSchedule17_4);
        TextView tvInterestingFact17_4 = view.findViewById(R.id.tvInterestingFact17_4);
        TextView tvInterestingFact_Description17_4 = view.findViewById(R.id.tvInterestingFact_Description17_4);
        ImageView tvImage17_8 = view.findViewById(R.id.tvImage17_8);

        tvTopic1.setOnClickListener(v -> {
            if (section1Content.getVisibility() == View.GONE) {
                section1Content.setVisibility(View.VISIBLE);
            } else {
                section1Content.setVisibility(View.GONE);
            }
        });

        tvTopic2.setOnClickListener(v -> {
            if (section2Content.getVisibility() == View.GONE) {
                section2Content.setVisibility(View.VISIBLE);
            } else {
                section2Content.setVisibility(View.GONE);
            }
        });

        tvTopic3.setOnClickListener(v -> {
            if (section3Content.getVisibility() == View.GONE) {
                section3Content.setVisibility(View.VISIBLE);
                livingCostContent.setVisibility(View.VISIBLE);
            } else {
                section3Content.setVisibility(View.GONE);
                livingCostContent.setVisibility(View.GONE);
            }
        });

        tvTopic4.setOnClickListener(v -> {
            if (section4Content.getVisibility() == View.GONE) {
                section4Content.setVisibility(View.VISIBLE);
            } else {
                section4Content.setVisibility(View.GONE);
            }
        });

        tvTopic5.setOnClickListener(v -> {
            if (section5Content.getVisibility() == View.GONE) {
                section5Content.setVisibility(View.VISIBLE);
            } else {
                section5Content.setVisibility(View.GONE);
            }
        });

        tvTopic6.setOnClickListener(v -> {
            if (section6Content.getVisibility() == View.GONE) {
                section6Content.setVisibility(View.VISIBLE);
            } else {
                section6Content.setVisibility(View.GONE);
            }
        });

        tvTopic7.setOnClickListener(v -> {
            if (section7Content.getVisibility() == View.GONE) {
                section7Content.setVisibility(View.VISIBLE);
            } else {
                section7Content.setVisibility(View.GONE);
            }
        });

        tvTopic8.setOnClickListener(v -> {
            if (section8Content.getVisibility() == View.GONE) {
                section8Content.setVisibility(View.VISIBLE);
            } else {
                section8Content.setVisibility(View.GONE);
            }
        });

        tvTopic9.setOnClickListener(v -> {
            if (section9Content.getVisibility() == View.GONE) {
                section9Content.setVisibility(View.VISIBLE);
            } else {
                section9Content.setVisibility(View.GONE);
            }
        });

        tvTopic10.setOnClickListener(v -> {
            if (section10Content.getVisibility() == View.GONE) {
                section10Content.setVisibility(View.VISIBLE);
            } else {
                section10Content.setVisibility(View.GONE);
            }
        });

        tvTopic11.setOnClickListener(v -> {
            if (section11Content.getVisibility() == View.GONE) {
                section11Content.setVisibility(View.VISIBLE);
            } else {
                section11Content.setVisibility(View.GONE);
            }
        });

        tvTopic12.setOnClickListener(v -> {
            if (section12Content.getVisibility() == View.GONE) {
                section12Content.setVisibility(View.VISIBLE);
            } else {
                section12Content.setVisibility(View.GONE);
            }
        });

        tvTopic13.setOnClickListener(v -> {
            if (section13Content.getVisibility() == View.GONE) {
                section13Content.setVisibility(View.VISIBLE);
            } else {
                section13Content.setVisibility(View.GONE);
            }
        });

        tvTopic14.setOnClickListener(v -> {
            if (section14Content.getVisibility() == View.GONE) {
                section14Content.setVisibility(View.VISIBLE);
            } else {
                section14Content.setVisibility(View.GONE);
            }
        });

        tvTopic15.setOnClickListener(v -> {
            if (section15Content.getVisibility() == View.GONE) {
                section15Content.setVisibility(View.VISIBLE);
            } else {
                section15Content.setVisibility(View.GONE);
            }
        });

        tvTopic16.setOnClickListener(v -> {
            if (section16Content.getVisibility() == View.GONE) {
                section16Content.setVisibility(View.VISIBLE);
            } else {
                section16Content.setVisibility(View.GONE);
            }
        });

        tvTopic17.setOnClickListener(v -> {
            if (section17Content.getVisibility() == View.GONE) {
                section17Content.setVisibility(View.VISIBLE);
            } else {
                section17Content.setVisibility(View.GONE);
            }
        });

        subTopic1_1Container.setOnClickListener(v -> {
            if (tvDescription1_1.getVisibility() == View.GONE && tvImage1_1.getVisibility() == View.GONE) {
                tvDescription1_1.setVisibility(View.VISIBLE);
                tvImage1_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription1_1.setVisibility(View.GONE);
                tvImage1_1.setVisibility(View.GONE);
            }
        });

        subTopic1_2Container.setOnClickListener(v -> {
            if (tvDescription1_2.getVisibility() == View.GONE && tvImage1_2.getVisibility() == View.GONE) {
                tvDescription1_2.setVisibility(View.VISIBLE);
                tvImage1_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription1_2.setVisibility(View.GONE);
                tvImage1_2.setVisibility(View.GONE);
            }
        });

        subTopic1_3Container.setOnClickListener(v -> {
            if (tvDescription1_3.getVisibility() == View.GONE && tvImage1_3.getVisibility() == View.GONE) {
                tvDescription1_3.setVisibility(View.VISIBLE);
                tvImage1_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription1_3.setVisibility(View.GONE);
                tvImage1_3.setVisibility(View.GONE);
            }
        });

        subTopic1_4Container.setOnClickListener(v -> {
            if (tvDescription1_4.getVisibility() == View.GONE && tvImage1_4.getVisibility() == View.GONE) {
                tvDescription1_4.setVisibility(View.VISIBLE);
                tvImage1_4.setVisibility(View.VISIBLE);
            } else {
                tvDescription1_4.setVisibility(View.GONE);
                tvImage1_4.setVisibility(View.GONE);
            }
        });

        subTopic2_1Container.setOnClickListener(v -> {
            if (tvDescription2_1.getVisibility() == View.GONE && tvImage2_1.getVisibility() == View.GONE) {
                tvDescription2_1.setVisibility(View.VISIBLE);
                tvImage2_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription2_1.setVisibility(View.GONE);
                tvImage2_1.setVisibility(View.GONE);
            }
        });

        subTopic2_2Container.setOnClickListener(v -> {
            if (tvDescription2_2.getVisibility() == View.GONE && tvImage2_2.getVisibility() == View.GONE) {
                tvDescription2_2.setVisibility(View.VISIBLE);
                tvImage2_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription2_2.setVisibility(View.GONE);
                tvImage2_2.setVisibility(View.GONE);
            }
        });

        subTopic2_3Container.setOnClickListener(v -> {
            if (tvDescription2_3.getVisibility() == View.GONE && tvImage2_3.getVisibility() == View.GONE) {
                tvDescription2_3.setVisibility(View.VISIBLE);
                tvImage2_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription2_3.setVisibility(View.GONE);
                tvImage2_3.setVisibility(View.GONE);
            }
        });

        subTopic4_1Container.setOnClickListener(v -> {
            if (tvDescription4_1.getVisibility() == View.GONE && tvImage4_1.getVisibility() == View.GONE) {
                tvDescription4_1.setVisibility(View.VISIBLE);
                tvImage4_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription4_1.setVisibility(View.GONE);
                tvImage4_1.setVisibility(View.GONE);
            }
        });

        subTopic4_2Container.setOnClickListener(v -> {
            if (tvDescription4_2.getVisibility() == View.GONE && tvImage4_2.getVisibility() == View.GONE) {
                tvDescription4_2.setVisibility(View.VISIBLE);
                tvImage4_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription4_2.setVisibility(View.GONE);
                tvImage4_2.setVisibility(View.GONE);
            }
        });

        subTopic4_3Container.setOnClickListener(v -> {
            if (tvDescription4_3.getVisibility() == View.GONE && tvImage4_3.getVisibility() == View.GONE) {
                tvDescription4_3.setVisibility(View.VISIBLE);
                tvImage4_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription4_3.setVisibility(View.GONE);
                tvImage4_3.setVisibility(View.GONE);
            }
        });

        subTopic5_1Container.setOnClickListener(v -> {
            if (tvDescription5_1.getVisibility() == View.GONE && tvImage5_1.getVisibility() == View.GONE) {
                tvDescription5_1.setVisibility(View.VISIBLE);
                tvImage5_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription5_1.setVisibility(View.GONE);
                tvImage5_1.setVisibility(View.GONE);
            }
        });

        subTopic5_2Container.setOnClickListener(v -> {
            if (tvDescription5_2.getVisibility() == View.GONE && tvImage5_2.getVisibility() == View.GONE) {
                tvDescription5_2.setVisibility(View.VISIBLE);
                tvImage5_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription5_2.setVisibility(View.GONE);
                tvImage5_2.setVisibility(View.GONE);
            }
        });

        subTopic6_1Container.setOnClickListener(v -> {
            if (tvDescription6_1.getVisibility() == View.GONE && tvImage6_1.getVisibility() == View.GONE) {
                tvDescription6_1.setVisibility(View.VISIBLE);
                tvImage6_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription6_1.setVisibility(View.GONE);
                tvImage6_1.setVisibility(View.GONE);
            }
        });

        subTopic6_2Container.setOnClickListener(v -> {
            if (tvDescription6_2.getVisibility() == View.GONE && tvImage6_2.getVisibility() == View.GONE) {
                tvDescription6_2.setVisibility(View.VISIBLE);
                tvImage6_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription6_2.setVisibility(View.GONE);
                tvImage6_2.setVisibility(View.GONE);
            }
        });

        subTopic6_3Container.setOnClickListener(v -> {
            if (tvDescription6_3.getVisibility() == View.GONE && tvImage6_3.getVisibility() == View.GONE) {
                tvDescription6_3.setVisibility(View.VISIBLE);
                tvImage6_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription6_3.setVisibility(View.GONE);
                tvImage6_3.setVisibility(View.GONE);
            }
        });

        subTopic7_1Container.setOnClickListener(v -> {
            if (tvDescription7_1.getVisibility() == View.GONE && tvImage7_1.getVisibility() == View.GONE) {
                tvDescription7_1.setVisibility(View.VISIBLE);
                tvImage7_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription7_1.setVisibility(View.GONE);
                tvImage7_1.setVisibility(View.GONE);
            }
        });

        subTopic7_2Container.setOnClickListener(v -> {
            if (tvDescription7_2.getVisibility() == View.GONE && tvImage7_2.getVisibility() == View.GONE) {
                tvDescription7_2.setVisibility(View.VISIBLE);
                tvImage7_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription7_2.setVisibility(View.GONE);
                tvImage7_2.setVisibility(View.GONE);
            }
        });

        subTopic7_3Container.setOnClickListener(v -> {
            if (tvDescription7_3.getVisibility() == View.GONE && tvImage7_3.getVisibility() == View.GONE) {
                tvDescription7_3.setVisibility(View.VISIBLE);
                tvImage7_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription7_3.setVisibility(View.GONE);
                tvImage7_3.setVisibility(View.GONE);
            }
        });

        subTopic8_1Container.setOnClickListener(v -> {
            if (tvDescription8_1.getVisibility() == View.GONE && tvImage8_1.getVisibility() == View.GONE) {
                tvDescription8_1.setVisibility(View.VISIBLE);
                tvImage8_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription8_1.setVisibility(View.GONE);
                tvImage8_1.setVisibility(View.GONE);
            }
        });

        subTopic8_2Container.setOnClickListener(v -> {
            if (tvDescription8_2.getVisibility() == View.GONE && tvImage8_2.getVisibility() == View.GONE) {
                tvDescription8_2.setVisibility(View.VISIBLE);
                tvImage8_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription8_2.setVisibility(View.GONE);
                tvImage8_2.setVisibility(View.GONE);
            }
        });

        subTopic8_3Container.setOnClickListener(v -> {
            if (tvDescription8_3.getVisibility() == View.GONE && tvImage8_3.getVisibility() == View.GONE) {
                tvDescription8_3.setVisibility(View.VISIBLE);
                tvImage8_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription8_3.setVisibility(View.GONE);
                tvImage8_3.setVisibility(View.GONE);
            }
        });

        subTopic9_1Container.setOnClickListener(v -> {
            if (tvDescription9_1.getVisibility() == View.GONE && tvImage9_1.getVisibility() == View.GONE) {
                tvDescription9_1.setVisibility(View.VISIBLE);
                tvImage9_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription9_1.setVisibility(View.GONE);
                tvImage9_1.setVisibility(View.GONE);
            }
        });

        subTopic9_2Container.setOnClickListener(v -> {
            if (tvDescription9_2.getVisibility() == View.GONE && tvImage9_2.getVisibility() == View.GONE) {
                tvDescription9_2.setVisibility(View.VISIBLE);
                tvImage9_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription9_2.setVisibility(View.GONE);
                tvImage9_2.setVisibility(View.GONE);
            }
        });

        subTopic9_3Container.setOnClickListener(v -> {
            if (tvDescription9_3.getVisibility() == View.GONE && tvImage9_3.getVisibility() == View.GONE) {
                tvDescription9_3.setVisibility(View.VISIBLE);
                tvImage9_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription9_3.setVisibility(View.GONE);
                tvImage9_3.setVisibility(View.GONE);
            }
        });

        subTopic10_1Container.setOnClickListener(v -> {
            if (tvDescription10_1.getVisibility() == View.GONE && tvImage10_1.getVisibility() == View.GONE) {
                tvDescription10_1.setVisibility(View.VISIBLE);
                tvImage10_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription10_1.setVisibility(View.GONE);
                tvImage10_1.setVisibility(View.GONE);
            }
        });

        subTopic10_2Container.setOnClickListener(v -> {
            if (tvDescription10_2.getVisibility() == View.GONE && tvImage10_2.getVisibility() == View.GONE) {
                tvDescription10_2.setVisibility(View.VISIBLE);
                tvImage10_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription10_2.setVisibility(View.GONE);
                tvImage10_2.setVisibility(View.GONE);
            }
        });

        subTopic10_3Container.setOnClickListener(v -> {
            if (tvDescription10_3.getVisibility() == View.GONE && tvImage10_3.getVisibility() == View.GONE) {
                tvDescription10_3.setVisibility(View.VISIBLE);
                tvImage10_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription10_3.setVisibility(View.GONE);
                tvImage10_3.setVisibility(View.GONE);
            }
        });

        subTopic11_1Container.setOnClickListener(v -> {
            if (tvDescription11_1.getVisibility() == View.GONE && tvImage11_1.getVisibility() == View.GONE) {
                tvDescription11_1.setVisibility(View.VISIBLE);
                tvImage11_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription11_1.setVisibility(View.GONE);
                tvImage11_1.setVisibility(View.GONE);
            }
        });

        subTopic11_2Container.setOnClickListener(v -> {
            if (tvDescription11_2.getVisibility() == View.GONE && tvImage11_2.getVisibility() == View.GONE) {
                tvDescription11_2.setVisibility(View.VISIBLE);
                tvImage11_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription11_2.setVisibility(View.GONE);
                tvImage11_2.setVisibility(View.GONE);
            }
        });

        subTopic11_3Container.setOnClickListener(v -> {
            if (tvDescription11_3.getVisibility() == View.GONE && tvImage11_3.getVisibility() == View.GONE) {
                tvDescription11_3.setVisibility(View.VISIBLE);
                tvImage11_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription11_3.setVisibility(View.GONE);
                tvImage11_3.setVisibility(View.GONE);
            }
        });

        subTopic12_1Container.setOnClickListener(v -> {
            if (tvDescription12_1.getVisibility() == View.GONE && tvImage12_1.getVisibility() == View.GONE) {
                tvDescription12_1.setVisibility(View.VISIBLE);
                tvImage12_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription12_1.setVisibility(View.GONE);
                tvImage12_1.setVisibility(View.GONE);
            }
        });

        subTopic12_2Container.setOnClickListener(v -> {
            if (tvDescription12_2.getVisibility() == View.GONE && tvImage12_2.getVisibility() == View.GONE) {
                tvDescription12_2.setVisibility(View.VISIBLE);
                tvImage12_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription12_2.setVisibility(View.GONE);
                tvImage12_2.setVisibility(View.GONE);
            }
        });

        subTopic12_3Container.setOnClickListener(v -> {
            if (tvDescription12_3.getVisibility() == View.GONE && tvImage12_3.getVisibility() == View.GONE) {
                tvDescription12_3.setVisibility(View.VISIBLE);
                tvImage12_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription12_3.setVisibility(View.GONE);
                tvImage12_3.setVisibility(View.GONE);
            }
        });

        subTopic13_1Container.setOnClickListener(v -> {
            if (tvDescription13_1.getVisibility() == View.GONE && tvImage13_1.getVisibility() == View.GONE) {
                tvDescription13_1.setVisibility(View.VISIBLE);
                tvImage13_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription13_1.setVisibility(View.GONE);
                tvImage13_1.setVisibility(View.GONE);
            }
        });

        subTopic13_2Container.setOnClickListener(v -> {
            if (tvDescription13_2.getVisibility() == View.GONE && tvImage13_2.getVisibility() == View.GONE) {
                tvDescription13_2.setVisibility(View.VISIBLE);
                tvImage13_2.setVisibility(View.VISIBLE);
            } else {
                tvDescription13_2.setVisibility(View.GONE);
                tvImage13_2.setVisibility(View.GONE);
            }
        });

        subTopic13_3Container.setOnClickListener(v -> {
            if (tvDescription13_3.getVisibility() == View.GONE && tvImage13_3.getVisibility() == View.GONE) {
                tvDescription13_3.setVisibility(View.VISIBLE);
                tvImage13_3.setVisibility(View.VISIBLE);
            } else {
                tvDescription13_3.setVisibility(View.GONE);
                tvImage13_3.setVisibility(View.GONE);
            }
        });

        subTopic14_1Container.setOnClickListener(v -> {
            if (tvDescription14_1.getVisibility() == View.GONE && tvImage14_1.getVisibility() == View.GONE) {
                tvDescription14_1.setVisibility(View.VISIBLE);
                tvImage14_1.setVisibility(View.VISIBLE);
            } else {
                tvDescription14_1.setVisibility(View.GONE);
                tvImage14_1.setVisibility(View.GONE);
            }
        });

        subTopic15_1Container.setOnClickListener(v -> {
            if (tvImage15_1.getVisibility() == View.GONE &&
                    tvDescription15_1.getVisibility() == View.GONE &&
                    tvPrice15_1.getVisibility() == View.GONE &&
                    tvSchedule15_1.getVisibility() == View.GONE &&
                    tvInterestingFact15_1.getVisibility() == View.GONE &&
                    tvInterestingFact_Description15_1.getVisibility() == View.GONE &&
                    tvImage15_2.getVisibility() == View.GONE) {
                tvImage15_1.setVisibility(View.VISIBLE);
                tvDescription15_1.setVisibility(View.VISIBLE);
                tvPrice15_1.setVisibility(View.VISIBLE);
                tvSchedule15_1.setVisibility(View.VISIBLE);
                tvInterestingFact15_1.setVisibility(View.VISIBLE);
                tvInterestingFact_Description15_1.setVisibility(View.VISIBLE);
                tvImage15_2.setVisibility(View.VISIBLE);
            } else {
                tvImage15_1.setVisibility(View.GONE);
                tvDescription15_1.setVisibility(View.GONE);
                tvPrice15_1.setVisibility(View.GONE);
                tvSchedule15_1.setVisibility(View.GONE);
                tvInterestingFact15_1.setVisibility(View.GONE);
                tvInterestingFact_Description15_1.setVisibility(View.GONE);
                tvImage15_2.setVisibility(View.GONE);

            }
        });

        subTopic15_2Container.setOnClickListener(v -> {
            if (tvImage15_3.getVisibility() == View.GONE &&
                    tvDescription15_2.getVisibility() == View.GONE &&
                    tvPrice15_2.getVisibility() == View.GONE &&
                    tvSchedule15_2.getVisibility() == View.GONE &&
                    tvInterestingFact15_2.getVisibility() == View.GONE &&
                    tvInterestingFact_Description15_2.getVisibility() == View.GONE &&
                    tvImage15_4.getVisibility() == View.GONE) {
                tvImage15_3.setVisibility(View.VISIBLE);
                tvDescription15_2.setVisibility(View.VISIBLE);
                tvPrice15_2.setVisibility(View.VISIBLE);
                tvSchedule15_2.setVisibility(View.VISIBLE);
                tvInterestingFact15_2.setVisibility(View.VISIBLE);
                tvInterestingFact_Description15_2.setVisibility(View.VISIBLE);
                tvImage15_4.setVisibility(View.VISIBLE);
            } else {
                tvImage15_3.setVisibility(View.GONE);
                tvDescription15_2.setVisibility(View.GONE);
                tvPrice15_2.setVisibility(View.GONE);
                tvSchedule15_2.setVisibility(View.GONE);
                tvInterestingFact15_2.setVisibility(View.GONE);
                tvInterestingFact_Description15_2.setVisibility(View.GONE);
                tvImage15_4.setVisibility(View.GONE);

            }
        });

        subTopic15_3Container.setOnClickListener(v -> {
            if (tvImage15_5.getVisibility() == View.GONE &&
                    tvDescription15_3.getVisibility() == View.GONE &&
                    tvPrice15_3.getVisibility() == View.GONE &&
                    tvSchedule15_3.getVisibility() == View.GONE &&
                    tvInterestingFact15_3.getVisibility() == View.GONE &&
                    tvInterestingFact_Description15_3.getVisibility() == View.GONE &&
                    tvImage15_6.getVisibility() == View.GONE) {
                tvImage15_5.setVisibility(View.VISIBLE);
                tvDescription15_3.setVisibility(View.VISIBLE);
                tvPrice15_3.setVisibility(View.VISIBLE);
                tvSchedule15_3.setVisibility(View.VISIBLE);
                tvInterestingFact15_3.setVisibility(View.VISIBLE);
                tvInterestingFact_Description15_3.setVisibility(View.VISIBLE);
                tvImage15_6.setVisibility(View.VISIBLE);
            } else {
                tvImage15_5.setVisibility(View.GONE);
                tvDescription15_3.setVisibility(View.GONE);
                tvPrice15_3.setVisibility(View.GONE);
                tvSchedule15_3.setVisibility(View.GONE);
                tvInterestingFact15_3.setVisibility(View.GONE);
                tvInterestingFact_Description15_3.setVisibility(View.GONE);
                tvImage15_6.setVisibility(View.GONE);

            }
        });

        subTopic15_4Container.setOnClickListener(v -> {
            if (tvImage15_7.getVisibility() == View.GONE &&
                    tvDescription15_4.getVisibility() == View.GONE &&
                    tvPrice15_4.getVisibility() == View.GONE &&
                    tvSchedule15_4.getVisibility() == View.GONE &&
                    tvInterestingFact15_4.getVisibility() == View.GONE &&
                    tvInterestingFact_Description15_4.getVisibility() == View.GONE &&
                    tvImage15_8.getVisibility() == View.GONE) {
                tvImage15_7.setVisibility(View.VISIBLE);
                tvDescription15_4.setVisibility(View.VISIBLE);
                tvPrice15_4.setVisibility(View.VISIBLE);
                tvSchedule15_4.setVisibility(View.VISIBLE);
                tvInterestingFact15_4.setVisibility(View.VISIBLE);
                tvInterestingFact_Description15_4.setVisibility(View.VISIBLE);
                tvImage15_8.setVisibility(View.VISIBLE);
            } else {
                tvImage15_7.setVisibility(View.GONE);
                tvDescription15_4.setVisibility(View.GONE);
                tvPrice15_4.setVisibility(View.GONE);
                tvSchedule15_4.setVisibility(View.GONE);
                tvInterestingFact15_4.setVisibility(View.GONE);
                tvInterestingFact_Description15_4.setVisibility(View.GONE);
                tvImage15_8.setVisibility(View.GONE);

            }
        });

        subTopic16_1Container.setOnClickListener(v -> {
            if (tvImage16_1.getVisibility() == View.GONE &&
                    tvDescription16_1.getVisibility() == View.GONE &&
                    tvPrice16_1.getVisibility() == View.GONE &&
                    tvSchedule16_1.getVisibility() == View.GONE &&
                    tvInterestingFact16_1.getVisibility() == View.GONE &&
                    tvInterestingFact_Description16_1.getVisibility() == View.GONE &&
                    tvImage16_2.getVisibility() == View.GONE) {
                tvImage16_1.setVisibility(View.VISIBLE);
                tvDescription16_1.setVisibility(View.VISIBLE);
                tvPrice16_1.setVisibility(View.VISIBLE);
                tvSchedule16_1.setVisibility(View.VISIBLE);
                tvInterestingFact16_1.setVisibility(View.VISIBLE);
                tvInterestingFact_Description16_1.setVisibility(View.VISIBLE);
                tvImage16_2.setVisibility(View.VISIBLE);
            } else {
                tvImage16_1.setVisibility(View.GONE);
                tvDescription16_1.setVisibility(View.GONE);
                tvPrice16_1.setVisibility(View.GONE);
                tvSchedule16_1.setVisibility(View.GONE);
                tvInterestingFact16_1.setVisibility(View.GONE);
                tvInterestingFact_Description16_1.setVisibility(View.GONE);
                tvImage16_2.setVisibility(View.GONE);

            }
        });

        subTopic16_2Container.setOnClickListener(v -> {
            if (tvImage16_3.getVisibility() == View.GONE &&
                    tvDescription16_2.getVisibility() == View.GONE &&
                    tvPrice16_2.getVisibility() == View.GONE &&
                    tvSchedule16_2.getVisibility() == View.GONE &&
                    tvInterestingFact16_2.getVisibility() == View.GONE &&
                    tvInterestingFact_Description16_2.getVisibility() == View.GONE &&
                    tvImage16_4.getVisibility() == View.GONE) {
                tvImage16_3.setVisibility(View.VISIBLE);
                tvDescription16_2.setVisibility(View.VISIBLE);
                tvPrice16_2.setVisibility(View.VISIBLE);
                tvSchedule16_2.setVisibility(View.VISIBLE);
                tvInterestingFact16_2.setVisibility(View.VISIBLE);
                tvInterestingFact_Description16_2.setVisibility(View.VISIBLE);
                tvImage16_4.setVisibility(View.VISIBLE);
            } else {
                tvImage16_3.setVisibility(View.GONE);
                tvDescription16_2.setVisibility(View.GONE);
                tvPrice16_2.setVisibility(View.GONE);
                tvSchedule16_2.setVisibility(View.GONE);
                tvInterestingFact16_2.setVisibility(View.GONE);
                tvInterestingFact_Description16_2.setVisibility(View.GONE);
                tvImage16_4.setVisibility(View.GONE);

            }
        });

        subTopic16_3Container.setOnClickListener(v -> {
            if (tvImage16_5.getVisibility() == View.GONE &&
                    tvDescription16_3.getVisibility() == View.GONE &&
                    tvPrice16_3.getVisibility() == View.GONE &&
                    tvSchedule16_3.getVisibility() == View.GONE &&
                    tvInterestingFact16_3.getVisibility() == View.GONE &&
                    tvInterestingFact_Description16_3.getVisibility() == View.GONE &&
                    tvImage16_6.getVisibility() == View.GONE) {
                tvImage16_5.setVisibility(View.VISIBLE);
                tvDescription16_3.setVisibility(View.VISIBLE);
                tvPrice16_3.setVisibility(View.VISIBLE);
                tvSchedule16_3.setVisibility(View.VISIBLE);
                tvInterestingFact16_3.setVisibility(View.VISIBLE);
                tvInterestingFact_Description16_3.setVisibility(View.VISIBLE);
                tvImage16_6.setVisibility(View.VISIBLE);
            } else {
                tvImage16_5.setVisibility(View.GONE);
                tvDescription16_3.setVisibility(View.GONE);
                tvPrice16_3.setVisibility(View.GONE);
                tvSchedule16_3.setVisibility(View.GONE);
                tvInterestingFact16_3.setVisibility(View.GONE);
                tvInterestingFact_Description16_3.setVisibility(View.GONE);
                tvImage16_6.setVisibility(View.GONE);

            }
        });

        subTopic16_4Container.setOnClickListener(v -> {
            if (tvImage16_7.getVisibility() == View.GONE &&
                    tvDescription16_4.getVisibility() == View.GONE &&
                    tvPrice16_4.getVisibility() == View.GONE &&
                    tvSchedule16_4.getVisibility() == View.GONE &&
                    tvInterestingFact16_4.getVisibility() == View.GONE &&
                    tvInterestingFact_Description16_4.getVisibility() == View.GONE &&
                    tvImage16_8.getVisibility() == View.GONE) {
                tvImage16_7.setVisibility(View.VISIBLE);
                tvDescription16_4.setVisibility(View.VISIBLE);
                tvPrice16_4.setVisibility(View.VISIBLE);
                tvSchedule16_4.setVisibility(View.VISIBLE);
                tvInterestingFact16_4.setVisibility(View.VISIBLE);
                tvInterestingFact_Description16_4.setVisibility(View.VISIBLE);
                tvImage16_8.setVisibility(View.VISIBLE);
            } else {
                tvImage16_7.setVisibility(View.GONE);
                tvDescription16_4.setVisibility(View.GONE);
                tvPrice16_4.setVisibility(View.GONE);
                tvSchedule16_4.setVisibility(View.GONE);
                tvInterestingFact16_4.setVisibility(View.GONE);
                tvInterestingFact_Description16_4.setVisibility(View.GONE);
                tvImage16_8.setVisibility(View.GONE);

            }
        });

        subTopic17_1Container.setOnClickListener(v -> {
            if (tvImage17_1.getVisibility() == View.GONE &&
                    tvDescription17_1.getVisibility() == View.GONE &&
                    tvPrice17_1.getVisibility() == View.GONE &&
                    tvSchedule17_1.getVisibility() == View.GONE &&
                    tvInterestingFact17_1.getVisibility() == View.GONE &&
                    tvInterestingFact_Description17_1.getVisibility() == View.GONE &&
                    tvImage17_2.getVisibility() == View.GONE) {
                tvImage17_1.setVisibility(View.VISIBLE);
                tvDescription17_1.setVisibility(View.VISIBLE);
                tvPrice17_1.setVisibility(View.VISIBLE);
                tvSchedule17_1.setVisibility(View.VISIBLE);
                tvInterestingFact17_1.setVisibility(View.VISIBLE);
                tvInterestingFact_Description17_1.setVisibility(View.VISIBLE);
                tvImage17_2.setVisibility(View.VISIBLE);
            } else {
                tvImage17_1.setVisibility(View.GONE);
                tvDescription17_1.setVisibility(View.GONE);
                tvPrice17_1.setVisibility(View.GONE);
                tvSchedule17_1.setVisibility(View.GONE);
                tvInterestingFact17_1.setVisibility(View.GONE);
                tvInterestingFact_Description17_1.setVisibility(View.GONE);
                tvImage17_2.setVisibility(View.GONE);

            }
        });

        subTopic17_2Container.setOnClickListener(v -> {
            if (tvImage17_3.getVisibility() == View.GONE &&
                    tvDescription17_2.getVisibility() == View.GONE &&
                    tvPrice17_2.getVisibility() == View.GONE &&
                    tvSchedule17_2.getVisibility() == View.GONE &&
                    tvInterestingFact17_2.getVisibility() == View.GONE &&
                    tvInterestingFact_Description17_2.getVisibility() == View.GONE &&
                    tvImage17_4.getVisibility() == View.GONE) {
                tvImage17_3.setVisibility(View.VISIBLE);
                tvDescription17_2.setVisibility(View.VISIBLE);
                tvPrice17_2.setVisibility(View.VISIBLE);
                tvSchedule17_2.setVisibility(View.VISIBLE);
                tvInterestingFact17_2.setVisibility(View.VISIBLE);
                tvInterestingFact_Description17_2.setVisibility(View.VISIBLE);
                tvImage17_4.setVisibility(View.VISIBLE);
            } else {
                tvImage17_3.setVisibility(View.GONE);
                tvDescription17_2.setVisibility(View.GONE);
                tvPrice17_2.setVisibility(View.GONE);
                tvSchedule17_2.setVisibility(View.GONE);
                tvInterestingFact17_2.setVisibility(View.GONE);
                tvInterestingFact_Description17_2.setVisibility(View.GONE);
                tvImage17_4.setVisibility(View.GONE);

            }
        });

        subTopic17_3Container.setOnClickListener(v -> {
            if (tvImage17_5.getVisibility() == View.GONE &&
                    tvDescription17_3.getVisibility() == View.GONE &&
                    tvPrice17_3.getVisibility() == View.GONE &&
                    tvSchedule17_3.getVisibility() == View.GONE &&
                    tvInterestingFact17_3.getVisibility() == View.GONE &&
                    tvInterestingFact_Description17_3.getVisibility() == View.GONE &&
                    tvImage17_6.getVisibility() == View.GONE) {
                tvImage17_5.setVisibility(View.VISIBLE);
                tvDescription17_3.setVisibility(View.VISIBLE);
                tvPrice17_3.setVisibility(View.VISIBLE);
                tvSchedule17_3.setVisibility(View.VISIBLE);
                tvInterestingFact17_3.setVisibility(View.VISIBLE);
                tvInterestingFact_Description17_3.setVisibility(View.VISIBLE);
                tvImage17_6.setVisibility(View.VISIBLE);
            } else {
                tvImage17_5.setVisibility(View.GONE);
                tvDescription17_3.setVisibility(View.GONE);
                tvPrice17_3.setVisibility(View.GONE);
                tvSchedule17_3.setVisibility(View.GONE);
                tvInterestingFact17_3.setVisibility(View.GONE);
                tvInterestingFact_Description17_3.setVisibility(View.GONE);
                tvImage17_6.setVisibility(View.GONE);

            }
        });

        subTopic17_4Container.setOnClickListener(v -> {
            if (tvImage17_7.getVisibility() == View.GONE &&
                    tvDescription17_4.getVisibility() == View.GONE &&
                    tvPrice17_4.getVisibility() == View.GONE &&
                    tvSchedule17_4.getVisibility() == View.GONE &&
                    tvInterestingFact17_4.getVisibility() == View.GONE &&
                    tvInterestingFact_Description17_4.getVisibility() == View.GONE &&
                    tvImage17_8.getVisibility() == View.GONE) {
                tvImage17_7.setVisibility(View.VISIBLE);
                tvDescription17_4.setVisibility(View.VISIBLE);
                tvPrice17_4.setVisibility(View.VISIBLE);
                tvSchedule17_4.setVisibility(View.VISIBLE);
                tvInterestingFact17_4.setVisibility(View.VISIBLE);
                tvInterestingFact_Description17_4.setVisibility(View.VISIBLE);
                tvImage17_8.setVisibility(View.VISIBLE);
            } else {
                tvImage17_7.setVisibility(View.GONE);
                tvDescription17_4.setVisibility(View.GONE);
                tvPrice17_4.setVisibility(View.GONE);
                tvSchedule17_4.setVisibility(View.GONE);
                tvInterestingFact17_4.setVisibility(View.GONE);
                tvInterestingFact_Description17_4.setVisibility(View.GONE);
                tvImage17_8.setVisibility(View.GONE);

            }
        });


        return view;
    }
}





