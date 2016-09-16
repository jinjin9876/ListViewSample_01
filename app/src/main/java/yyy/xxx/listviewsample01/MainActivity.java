package yyy.xxx.listviewsample01;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

	private Context context;
	private ListView listView;
	private MultiplicationListAdapter listAdapter;



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




	}







}
