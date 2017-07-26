package jh.com.example.pep.loginfirebase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import jh.com.example.pep.loginfirebase.Objetos.Car;
import jh.com.example.pep.loginfirebase.Objetos.FirebaseReferences;

public class MainActivity extends AppCompatActivity {

    Button botonCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonCar = (Button) findViewById(R.id.boton_car);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference tutorialRef = database.getReference(FirebaseReferences.TUTORIAL_REFERENCE);

        botonCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Car car = new Car("Ford","Javier",4,5);
                tutorialRef.child(FirebaseReferences.CAR_REFERENCE).push().setValue(car);
            }
        });
    }
}