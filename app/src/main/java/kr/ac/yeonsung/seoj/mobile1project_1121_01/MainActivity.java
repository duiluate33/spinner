package kr.ac.yeonsung.seoj.mobile1project_1121_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] titles = {"에이지 오브 울트론", "블랙팬서", "블랙위도우", "캡틴 마블", " 시빌 워",
            "엔드 워", "헐크", "라그나로크", "스파이더맨 노웨이홈", "닥터스트레인지" };
    int[] imgIds = {R.drawable.ageofultron,R.drawable.blackpanther,R.drawable.blackw,
            R.drawable.captainmarble,R.drawable.civilwar,R.drawable.endwar,
            R.drawable.hulk,R.drawable.lagna,R.drawable.nowayhome,R.drawable.strange};
    Spinner spinner;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        imgv = findViewById(R.id.imgv);
        //1,2,3번째 오는 인수 종류 기억
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, titles);
        spinner.setAdapter(adapter); //화면에 스피너 모양 확인가능 (이벤트 프로그래밍 제외)
        spinner.setOnItemSelectedListener(spinnerL);
    }
    AdapterView.OnItemSelectedListener spinnerL = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int index, long l) {
            imgv.setImageResource(imgIds[index]);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }

        };

}