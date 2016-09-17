package yyy.xxx.listviewsample01;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import yyy.xxx.listviewsample01.model.Multiple;

public class MainActivity extends AppCompatActivity {

	private Context context;

	private ListView listView;
	private MultiplicationListAdapter listAdapter;
	private ArrayList<Multiple> multipleArrayList = new ArrayList<>();


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		context = this;

		setView();
	}


	/**
	 * 레이아웃, 뷰 기본 세팅
	 * 액티비티의 뷰 타입의 멤버변수(전역변수)에 값 할당
	 * 뷰에 클릭리스너 연결
	 * 리스트뷰 세팅
	 */
	private void setView() {
		setListView();
//		setApplyButton();
	}


	/**
	 * 리스트뷰 초기 세팅 및 리스트뷰와 아답타 연동
	 */
	private void setListView(){
		listView = (ListView) findViewById(R.id.list_view);
		listView.setCacheColorHint(0);
		listView.setDivider(null);
		listView.setDividerHeight(0);
		listView.setSelector(null);

		listAdapter = new MultiplicationListAdapter(context, multipleArrayList);
		listView.setAdapter(listAdapter);
	}


	private void setInputTextLayout(){

	}







}
