package examples.com.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    EditText e1, e2;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("온도변환기");
        init();
    }
    public void init(){
        btn1 = (Button) findViewById(R.id.h2_btn);
        btn2 = (Button) findViewById(R.id.h2_btn2);
        e1 = (EditText)findViewById(R.id.h2_edit);
        e2 = (EditText)findViewById(R.id.h2_edit2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e1.getText().toString();
                double result = Integer.parseInt(temp)*1.8 + 32;
                Toast.makeText(getApplicationContext(),"화씨 온도는 " + result + "도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e2.getText().toString();
                double result = (Integer.parseInt(temp)-32)/(1.8);
                Toast.makeText(getApplicationContext(),"섭씨 온도는 "+result+"도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
