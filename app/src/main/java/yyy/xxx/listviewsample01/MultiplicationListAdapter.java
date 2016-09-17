package yyy.xxx.listviewsample01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import yyy.xxx.listviewsample01.model.Multiple;

public class MultiplicationListAdapter extends BaseAdapter {

	private Context context;
	private ArrayList<Multiple> dataList = new ArrayList<>();

	public MultiplicationListAdapter(Context context, ArrayList<Multiple> dataList) {
		this.context = context;
		this.dataList = dataList;
	}

	/**
	 * 리스트 토탈 카운트
	 * @return
	 */
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

	/**
	 * 리스트 아이템의 뷰 정의
	 *
	 * @param position
	 * @param convertView
	 * @param parent
	 * @return
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater layoutInflater = LayoutInflater.from(context);
		View view = layoutInflater.inflate(R.layout.view_list_item, null);
		Multiple multiple = dataList.get(position);

		((TextView) view.findViewById(R.id.multiplicand_text)).setText(String.valueOf(multiple.getMultiplicand()));
		((TextView) view.findViewById(R.id.multiplier_text)).setText(String.valueOf(multiple.getMultiplier()));
		((TextView) view.findViewById(R.id.result_text)).setText(String.valueOf(multiple.getResult()));

		return view;
	}

}
