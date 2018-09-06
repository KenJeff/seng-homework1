package basic.app.homework1;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button numOne = findViewById(R.id.Part1);
        numOne.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Part1Activity.class));
        });
        Button numTwo = findViewById(R.id.Part2);
        numTwo.setOnClickListener(w -> {
            startActivity(new Intent(MainActivity.this, Part2Activity.class));
        });
    }

}




