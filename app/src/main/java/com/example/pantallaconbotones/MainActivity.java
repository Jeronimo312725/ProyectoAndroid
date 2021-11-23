package com.example.pantallaconbotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void boton1(View view){
        Toast.makeText(this,"pantalla 1", Toast.LENGTH_SHORT).show() ;
    }

public void boton2(View view){
    Toast.makeText(this,"pantalla 2",Toast.LENGTH_SHORT).show() ;

}
    public void boton3(View view){
        Toast.makeText(this,"pantalla 3",Toast.LENGTH_SHORT).show() ;
    }
    public void boton4(View view){
        Toast.makeText(this,"pantalla 4",Toast.LENGTH_SHORT).show() ;
    }
    public void boton5(View view){
        Toast.makeText(this,"pantalla 5",Toast.LENGTH_SHORT).show() ;
    }
    public void boton6(View view){
        Toast.makeText(this,"pantalla 6",Toast.LENGTH_SHORT).show() ;
    }
}