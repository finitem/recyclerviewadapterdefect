package com.merrillogic.recyclerviewadapterchangedefect;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * It's only necessary to not specify the type if onViewRecycled is called.
 */
public class FirstAdapter extends RecyclerView.Adapter<FirstViewHolder> {

	@Override
	public FirstViewHolder onCreateViewHolder(ViewGroup parent, int position) {
		return new FirstViewHolder(LayoutInflater.
				from(parent.getContext()).
				inflate(R.layout.anyitem,
						parent,
						false));
	}

	@Override
	public void onBindViewHolder(FirstViewHolder firstViewHolder, int i) {
		//pretend we do something
	}


	@Override
	public int getItemCount() {
		//Just say there's one item for simplicity
		return 1;
	}
}
