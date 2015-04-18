package com.merrillogic.recyclerviewadapterchangedefect;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 *
 */
public class SecondAdapter extends RecyclerView.Adapter {

	@Override
	public void onViewRecycled(RecyclerView.ViewHolder viewholder) {
		//By adding this function, it will now crash.
	}

	@Override
	public SecondViewHolder onCreateViewHolder(ViewGroup parent, int position) {

		return new SecondViewHolder(LayoutInflater.
				from(parent.getContext()).
				inflate(R.layout.anyitem,
						parent,
						false));
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder secondViewHolder, int i) {
		if (secondViewHolder instanceof SecondViewHolder) {
			((SecondViewHolder) secondViewHolder).mTextView.setText("2");
		}
	}


	@Override
	public int getItemCount() {
		//Just say there's one item for simplicity
		return 1;
	}
}
