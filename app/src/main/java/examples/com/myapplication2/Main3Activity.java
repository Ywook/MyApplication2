package examples.com.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    int YEAR = 2017;
    EditText e1, e2;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이계산기");
        init();
    }

    public void init(){
        btn1 = (Button) findViewById(R.id.age_btn);
        btn2 = (Button) findViewById(R.id.age_btn2);
        e1 = (EditText)findViewById(R.id.age_edit);
        e2 = (EditText)findViewById(R.id.age_edit2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e1.getText().toString();
                int age = YEAR - Integer.parseInt(temp) + 1;
                Toast.makeText(getApplicationContext(),"당신의 나이는 " + age + "세 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e2.getText().toString();
                int result = YEAR - Integer.parseInt(temp) +1;
                Toast.makeText(getApplicationContext(),"당신의 태어난 해는 "+result+"년 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
