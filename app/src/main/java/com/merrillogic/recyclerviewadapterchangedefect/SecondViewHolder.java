package com.merrillogic.recyclerviewadapterchangedefect;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 *
 */
public class SecondViewHolder extends RecyclerView.ViewHolder {

	TextView mTextView;

	public SecondViewHolder(View itemView) {
		super(itemView);
		mTextView = (TextView) itemView.findViewById(R.id.the_text);
	}
}
