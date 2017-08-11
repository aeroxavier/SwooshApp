package kylejimer.lapiz.com.swooshapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
Button btnd;
    Button ball;
    Button noob;
public static final String KEY_="ww";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnd=(Button)findViewById(R.id.finish);
        btnd.setVisibility(View.GONE);

    }

    public void Clicked(View v){

        btnd.setVisibility(View.VISIBLE);
        btnd.setEnabled(true);
        btnd.setClickable(true);

    }
    public void Final(View v){
        ball=(Button)findViewById(R.id.ball);
        noob=(Button)findViewById(R.id.beg);
        if(ball.isPressed()){
            Intent b=new Intent(Main3Activity.this,Main4Activity.class);
            b.putExtra(KEY_,"Baller");

        }
        else if(noob.isPressed()){

            Intent n=new Intent(Main3Activity.this,Main4Activity.class);
            n.putExtra(KEY_,"Beginner");

        }

        startActivity(new Intent(Main3Activity.this, Main4Activity.class));




    }
}
