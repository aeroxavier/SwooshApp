package kylejimer.lapiz.com.swooshapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
Button btnm;
    Button btnw;
    Button btnc;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btnm=(Button)findViewById(R.id.menss);
        btnw=(Button)findViewById(R.id.womenss);
        btnc=(Button)findViewById(R.id.coedd);

        txt=(TextView)findViewById(R.id.final2);
        Intent intent=getIntent();
        String ch=intent.getStringExtra("mm");

        String ch2=intent.getStringExtra("ww");


        if (ch!= null && ch.equalsIgnoreCase("Men")){
            btnw.setVisibility(View.GONE);
            btnc.setVisibility(View.GONE);
        }
        else if(ch!= null && ch.equalsIgnoreCase("Women")){
            btnm.setVisibility(View.GONE);
            btnc.setVisibility(View.GONE);
        }
        else if(ch!=null && ch.equalsIgnoreCase("Coed")){
            btnm.setVisibility(View.GONE);
            btnw.setVisibility(View.GONE);
        }

        if (ch2!=null && ch2.equalsIgnoreCase("Baller")){

            txt.setText(ch2);
        }
        else if(ch2!=null && ch2.equalsIgnoreCase("Beginner")){
            txt.setText(ch2);
        }

    }


}
