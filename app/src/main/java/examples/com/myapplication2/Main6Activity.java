package examples.com.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    EditText e1, e2;
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");

        init();
    }

    void init(){
        e1 = (EditText)findViewById(R.id.h4_edit);
        e2 = (EditText)findViewById(R.id.h4_edit2);

        btn1 = (Button)findViewById(R.id.h4_btn);
        btn2 = (Button)findViewById(R.id.h4_btn2);
        btn3 = (Button)findViewById(R.id.h4_btn3);
        btn4 = (Button)findViewById(R.id.h4_btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                if(s1 == null || s2 == null || s1.equals("") || s2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }else{
                    int result = Integer.parseInt(s1)+Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는 "+result+"입니다",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                if(s1 == null || s2 == null || s1.equals("") || s2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }else{
                    int result = Integer.parseInt(s1)-Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(), "더하기 빼기 결과는 "+result+"입니다",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                if(s1 == null || s2 == null || s1.equals("") || s2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }else{
                    int result = Integer.parseInt(s1)*Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(), "곱하기 계산 결과는 "+result+"입니다",Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();

                if(s1 == null || s2 == null || s1.equals("") || s2.equals("")){
                    Toast.makeText(getApplicationContext(),"값을 입력하세요.",Toast.LENGTH_SHORT).show();
                }else{
                    double result = (double)Integer.parseInt(s1)/Integer.parseInt(s2);
                    Toast.makeText(getApplicationContext(), "나누기 계산 결과는 "+result+"입니다",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}
