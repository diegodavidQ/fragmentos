package diedav.david.diego.fragmentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ComunicacionMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void menu(int boton) {

        Intent in = new Intent(this, ActivityPlaces.class);

        in.putExtra("BOTONPULSADO", boton);

        startActivity(in);
    }

}
