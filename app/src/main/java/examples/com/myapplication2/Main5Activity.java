package examples.com.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class Main5Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    Button btn;
    CheckBox checkBox;
    TextView text1,text2;
    int PIZZA = 15000, SPAGHETTI = 13000, SALAD = 9000;
    double DISCOUNT = 0.9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 주문");

        init();

    }



    void init() {
        e1 = (EditText) findViewById(R.id.h3_edit);
        e2 = (EditText) findViewById(R.id.h3_edit2);
        e3 = (EditText) findViewById(R.id.h3_edit3);

        btn = (Button) findViewById(R.id.h3_btn);

        checkBox = (CheckBox) findViewById(R.id.checkBox);

        text1 = (TextView) findViewById(R.id.h3_text);
        text2 = (TextView) findViewById(R.id.h3_text2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int t1 = Integer.parseInt(e1.getText().toString());
                int t2 = Integer.parseInt(e2.getText().toString());
                int t3 = Integer.parseInt(e3.getText().toString());

                int result1 = t1 + t2 + t3;
                int result2 = t1 * PIZZA + t2 * SPAGHETTI + t3 * SALAD;


                if (checkBox.isChecked()) {
                    result2 = (int) (result2 * DISCOUNT);
                }

                text1.setText(result1+"개");
                text2.setText(result2+"원");
            }
        });
    }
}