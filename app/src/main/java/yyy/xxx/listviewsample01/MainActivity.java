package yyy.xxx.listviewsample01;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
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
		setApplyButton();
	}


	/**
	 * 리스트뷰 초기 세팅 및 리스트뷰와 아답타 연동
	 */
	private void setListView() {
		listView = (ListView) findViewById(R.id.list_view);
		listView.setCacheColorHint(0);

		listAdapter = new MultiplicationListAdapter(context, multipleArrayList);
		listView.setAdapter(listAdapter);
	}


	/**
	 * 적용 버튼 눌렀을때의 동작 정의
	 */
	private void setApplyButton() {
		final EditText multiplicandInputField = (EditText) findViewById(R.id.multiplicand_input_field);
		final EditText multiplierInputField = (EditText) findViewById(R.id.multiplier_input_field);


		findViewById(R.id.apply_button).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String multiplicandInputText = multiplicandInputField.getText().toString();
				String multiplierInputText = multiplierInputField.getText().toString();

				if (!multiplicandInputText.isEmpty() && !multiplierInputText.isEmpty() && Integer.parseInt(multiplicandInputText) > 0 && Integer.parseInt(multiplierInputText) > 0) {
					ArrayList<Multiple> resultList = makeMultipleArrayList(Integer.parseInt(multiplicandInputText), Integer.parseInt(multiplierInputText));
					multipleArrayList.clear();
					multipleArrayList.addAll(resultList);
					listAdapter.notifyDataSetChanged();

					hideKeyboard();
				}
			}
		});
	}


	/**
	 * 곱셈 객체가 들어있는 arraylist를 return 하는 함수
	 *
	 * @param multiplicand
	 * @param multiplier
	 * @return 곱셈 객체 list
	 */
	private ArrayList<Multiple> makeMultipleArrayList(int multiplicand, int multiplier) {
		ArrayList<Multiple> dataList = new ArrayList<>();

		for (int i = 0; i < multiplier; i++) {
			Multiple multiple = new Multiple();
			multiple.setMultiplicand(multiplicand);
			multiple.setMultiplier(i + 1);
			multiple.setResult(multiplicand * (i + 1));
			dataList.add(multiple);
		}

		return dataList;
	}


	/**
	 * 키보드 내리는 유틸리티 함수
	 */
	private void hideKeyboard() {
		View view = getCurrentFocus();
		if (view != null) {
			InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
			imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
		}
	}
}
