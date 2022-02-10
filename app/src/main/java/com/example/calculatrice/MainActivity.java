package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView num1,num2;
    private Button sum;
    private Button SUB,DIV,MUL;
    private TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1=(TextView) findViewById(R.id.n1);
        num2=(TextView) findViewById(R.id.n2);
        sum=(Button) findViewById(R.id.add);
        SUB=(Button)findViewById(R.id.sub);
        DIV=(Button)findViewById(R.id.div);
        MUL=(Button)findViewById(R.id.mul);

        result=(TextView) findViewById(R.id.res);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(num1.getText().toString());
                int b= Integer.parseInt(num2.getText().toString());
                int s=a+b;
               // int c=a-b;
                result.setText("Answer: "+ String.valueOf(s));
               // result.setText("Answer: "+ String.valueOf(c));



            }
        });
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(num1.getText().toString());
                int b= Integer.parseInt(num2.getText().toString());
                //int s=a+b;
                int c=a-b;
                //result.setText("Answer: "+ String.valueOf(s));
                result.setText("Answer: "+ String.valueOf(c));

            }
        });
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(num1.getText().toString());
                int b= Integer.parseInt(num2.getText().toString());
                //int s=a+b;
                int m=a*b;
                //result.setText("Answer: "+ String.valueOf(s));
                result.setText("Answer: "+ String.valueOf(m));
            }
        });
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a= Integer.parseInt(num1.getText().toString());
                int b= Integer.parseInt(num2.getText().toString());
                //int s=a+b;
                int D=a/b;
                //result.setText("Answer: "+ String.valueOf(s));
                result.setText("Answer: "+ String.valueOf(D));
            }
        });




    }
}