package kr.hs.emirim.sinyh104.myfirstownapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button mButton;
    int result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mButton=(Button)findViewById(R.id.button);
            mButton.setOnClickListener(this);
         }catch (Exception e){
            e.toString();
        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        Random r=new Random();
        result1=r.nextInt(2);
        try{
            if(result1==0){
             Toast.makeText(MainActivity.this, "하세요!!", Toast.LENGTH_SHORT).show();
             }
            else{
                Toast.makeText(MainActivity.this, "하지마세요!", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e)
        {
            e.toString();
        }
    }
}
