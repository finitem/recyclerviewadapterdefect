package com.merrillogic.recyclerviewadapterchangedefect;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 *
 */
public class FirstViewHolder extends RecyclerView.ViewHolder {

	TextView mTextView;

	public FirstViewHolder(View itemView) {
		super(itemView);
		mTextView = (TextView) itemView.findViewById(R.id.the_text);
	}
}
