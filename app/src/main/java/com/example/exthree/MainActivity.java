package com.example.exthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int x=0;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
    }

    public void go(View view) {
        x++;
        btn.setText("click me");
        Toast.makeText(this, x + " ", Toast.LENGTH_SHORT).show();
        if(x==6) {
            btn.setText("Enough to click.Go to new start");
            x = 0;
        }

    }
}
