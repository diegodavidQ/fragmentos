package diedav.david.diego.fragmentos;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityPlaces extends AppCompatActivity implements ComunicacionMenu {

    Fragment[] misFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        misFragmentos = new Fragment[3];
        misFragmentos[0] = new VeneciaFragment();
        misFragmentos[1] = new FlorenciaFragment();
        misFragmentos[2] = new ColiseoFragment();


        Bundle extras = getIntent().getExtras();

        menu(extras.getInt("BOTONPULSADO"));

    }


    @Override
    public void menu(int boton) {

        FragmentManager myManager = getFragmentManager();

        android.app.FragmentTransaction myTransaction = myManager.beginTransaction();

        myTransaction.replace(R.id.places,misFragmentos[boton]);

        myTransaction.commit(); //start transaction
    }






}
