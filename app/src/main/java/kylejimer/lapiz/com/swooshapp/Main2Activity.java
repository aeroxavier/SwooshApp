package kylejimer.lapiz.com.swooshapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
public static final String KEY="mm";
Button btn;
Button btn2;
    Button btnmen;
    Button btnwomen;
    Button btncoed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         btn=(Button)findViewById(R.id.next);
    btn.setVisibility(View.GONE);
        btnmen=(Button)findViewById(R.id.mens);
        btnwomen=(Button)findViewById(R.id.womens);
        btncoed=(Button)findViewById(R.id.coed);
    }
    public void OnClick(View v){

    btn2=(Button)findViewById(R.id.next2);
        btn2.setVisibility(View.GONE);
btn.setVisibility(View.VISIBLE);
        btn.setEnabled(true);
        btn.setClickable(true);
        switch(v.getId()){
            case R.id.mens:  Intent m = new Intent(Main2Activity.this,Main4Activity.class);
                m.putExtra(KEY,"Men");
            case R.id.womens:  Intent w = new Intent(Main2Activity.this,Main4Activity.class);
                w.putExtra(KEY,"Women");
            case R.id.coed:  Intent cd=new Intent(Main2Activity.this,Main4Activity.class);
                cd.putExtra(KEY,"Coed");

        }
    }
    public void Next(View v){


        startActivity(new Intent(Main2Activity.this, Main3Activity.class));

    }
}
