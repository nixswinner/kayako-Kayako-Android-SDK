package com.kayako.sdk.android.k5.common.adapter.messengerlist.view;

import android.support.annotation.LayoutRes;
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

import com.kayako.sdk.android.k5.R;

public class InputFeedbackRatingViewHolder extends InputFieldViewHolder {

    public ViewSwitcher goodRatingViewSwitcher;
    public ViewSwitcher badRatingViewSwitcher;

    public View selectedGoodRatingView;
    public View selectedBadRatingView;

    public InputFeedbackRatingViewHolder(View itemView) {
        super(itemView, R.layout.ko__include_messenger_input_field_feedback_rating);
        commonConstructor(itemView);
    }

    public InputFeedbackRatingViewHolder(View itemView, @LayoutRes int layoutResId) {
        super(itemView, layoutResId);
        commonConstructor(itemView);
    }

    private void commonConstructor(View itemView){
        goodRatingViewSwitcher = (ViewSwitcher) itemView.findViewById(R.id.ko__messenger_input_feedback_rating_field_good_view_switcher);
        badRatingViewSwitcher = (ViewSwitcher) itemView.findViewById(R.id.ko__messenger_input_feedback_rating_field_bad_view_switcher);
        selectedGoodRatingView = itemView.findViewById(R.id.ko__messenger_input_feedback_rating_field_good_view_selected);
        selectedBadRatingView = itemView.findViewById(R.id.ko__messenger_input_feedback_rating_field_bad_view_selected);
    }

}
