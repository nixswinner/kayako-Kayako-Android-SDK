package com.kayako.sdk.android.k5.common.adapter.messengerlist.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.kayako.sdk.android.k5.R;

public class SimpleMessageContinuedOtherViewHolder extends RecyclerView.ViewHolder {

    public TextView message;
    public TextView time;

    public SimpleMessageContinuedOtherViewHolder(View itemView) {
        super(itemView);
        message = (TextView) itemView.findViewById(R.id.ko__message);
        time = (TextView) itemView.findViewById(R.id.ko__time);
    }

}
