package yyy.xxx.listviewsample01;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import yyy.xxx.listviewsample01.model.Multiple;

public class MultiplicationListAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<Multiple> dataList = new ArrayList<>();

	public MultiplicationListAdapter(Context context, ArrayList<Multiple> dataList) {
		this.context = context;
		this.dataList = dataList;
	}

	@Override
	public int getCount() {
		return dataList.size();
	}

	@Override
	public Object getItem(int position) {
		return dataList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {


		return null;
	}

}
