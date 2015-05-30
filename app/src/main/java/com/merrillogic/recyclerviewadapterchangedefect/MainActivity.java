package com.merrillogic.recyclerviewadapterchangedefect;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

	RecyclerView mRecyclerView;
	FirstAdapter mFirstAdapter;
	SecondAdapter mSecondAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mRecyclerView = (RecyclerView) findViewById(R.id.recycler);
		mRecyclerView.setLayoutManager(
				new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
		mFirstAdapter = new FirstAdapter();
		mSecondAdapter = new SecondAdapter();
		mRecyclerView.setAdapter(mFirstAdapter);
		Button change_button = (Button) findViewById(R.id.change_adapter_button);
		change_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mRecyclerView.setAdapter(mSecondAdapter);
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		mRecyclerView.setAdapter(mFirstAdapter);
	}
}
