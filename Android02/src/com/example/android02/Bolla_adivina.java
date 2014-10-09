package com.example.android02;

import java.util.Random;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Bolla_adivina extends ActionBarActivity {
	//private TextView texto;
	//private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
    	super.onCreate(savedInstanceState);
    	
    	
    	//boton=(Button)findViewById(R.id.boton);	//boton getAnswerButon
    	
        setContentView(R.layout.activity_bolla_adivina);
        //findViewById
        
        
        /*boton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) 
			{
				String respuesta="si";
				texto.setText(respuesta);
				
			}
		});*/
        
        
        
    }
    
    public void respuestas(View v)
    {
    	RelativeLayout layout = (RelativeLayout)findViewById(R.id.layout);
    	TextView texto=(TextView)findViewById(R.id.texto);//Relacionarlos el elemento del layaout 
    	
    	MagicBall mb = new MagicBall();
		texto.setText(mb.getPrediccion(getResources()));
		String color=mb.color();
		if(color.equals("verde"))
		{
			layout.setBackgroundColor(Color.GREEN);
		}
		else
		{
			if(color.equals("amarillo"))
			{
				layout.setBackgroundColor(Color.YELLOW);
			}
			else
			{
				layout.setBackgroundColor(Color.RED);
			}
		}
		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
    	
    	
    	
        getMenuInflater().inflate(R.menu.bolla_adivina, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
