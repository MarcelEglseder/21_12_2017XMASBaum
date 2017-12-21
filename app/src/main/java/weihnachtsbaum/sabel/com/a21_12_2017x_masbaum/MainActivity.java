package weihnachtsbaum.sabel.com.a21_12_2017x_masbaum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText eingabe;
    private Button btn_malen;
    private TextView tv_hoehe, tv_zeichnen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_malen = findViewById(R.id.btn_malen);
        eingabe = findViewById(R.id.eingabe);
        tv_zeichnen = findViewById(R.id.tv_zeichnen);


        btn_malen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(eingabe.getText().toString());





                tv_zeichnen.setText(baumzeichnen(value));
            }
        });
    }

    public String baumzeichnen(int value) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < value; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 0; i <value/2 ; i++) {
            sb.append("|");
        }

        return sb.toString();
    }

    


}
