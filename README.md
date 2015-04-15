# recyclerviewadapterdefect
A sample project to display a problem that can be encountered with recyclerviews.

If you have a recyclerview with an adapter that implements viewholders of a certain type, then call:

recyclerView.setAdapter(differentAdapter)

and differentAdapter both:

1. Uses a type of ViewHolder that is not a subclass of the initial adapter's viewholder
2. Implements onViewRecycled(ViewHolderType viewHolder)

then your app will crash when the recycler attempts to call onViewRecycled(...) with the incorrect view type during the adapter change.
