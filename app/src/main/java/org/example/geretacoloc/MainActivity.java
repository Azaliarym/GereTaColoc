package org.example.geretacoloc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    // Initialisation des boutons

    Button btnAgenda;
    Button btnBlocNotes;
    Button btnRegleDeVie;
    Button btnLoyer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Quand l'écran est créée liée les boutons

        btnAgenda = (Button) findViewById(R.id.btnAgenda);
        btnBlocNotes = (Button) findViewById(R.id.btnBlocNote);
        btnRegleDeVie = (Button) findViewById(R.id.btnRegleDeVie);
        btnLoyer = (Button) findViewById(R.id.btnLoyer);

        //attente d'un event

        btnAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Appeler l'écran charge sur clique du btnAgenda.


                Intent intent = new Intent(MainActivity.this,Agenda.class);
               startActivity(intent);
            }
        });



        btnBlocNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Appeler l'écran charge sur clique du btnBlocNotes.


                Intent intent = new Intent(MainActivity.this,BlocNotes.class);
                startActivity(intent);
            }
        });



        btnRegleDeVie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Appeler l'écran charge sur clique du btnRegleDeVie.


                Intent intent = new Intent(MainActivity.this,RegleDeVie.class);
                startActivity(intent);
            }
        });



        btnLoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Appeler l'écran charge sur clique du btnLoyer.


                Intent intent = new Intent(MainActivity.this,ChargeTotal.class);
                startActivity(intent);
            }
        });

    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
