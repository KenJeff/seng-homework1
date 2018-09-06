package basic.app.homework1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class Part1Activity extends AppCompatActivity {

    private TextInputEditText etColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);

        etColor = findViewById(R.id.et_color);

        Button btnColor = findViewById(R.id.btn_color);
        btnColor.setOnClickListener(v -> change(v));
    }

    public void change(View view) {

        Random obj = new Random();

        int red = obj.nextInt(256);
        int blue = obj.nextInt(256);
        int green = obj.nextInt(256);

        int realColor = Color.argb(255, red, blue, green);
        etColor.setTextColor(realColor);

        String tColor = String.format("#%02x%02x%02x", red, blue, green);
    }
}
