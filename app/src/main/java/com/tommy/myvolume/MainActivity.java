package com.tommy.myvolume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText edt_length,edt_width,edt_high;
    Button calculate;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_high = findViewById(R.id.edit_high);
        edt_length = findViewById(R.id.edit_length);
        edt_width = findViewById(R.id.edit_width);
        calculate = findViewById(R.id.btn_hitung);
        result = findViewById(R.id.hasil_hitung);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.btn_hitung){

                String input_length = edt_high.getText().toString().trim();
                String input_high = edt_high.getText().toString().trim();
                String input_width = edt_width.getText().toString().trim();

                Double length = buatDouble(input_length);
                Double high = buatDouble(input_high);
                Double width = buatDouble(input_width);


                Double hasil = high * length * width ;
                result.setText(String.valueOf(hasil));



        }
    }

    private Double buatDouble(String str)
    {
        try{
            return  Double.valueOf(str);
        }catch (NumberFormatException e){
            return null;
        }
    }
}
