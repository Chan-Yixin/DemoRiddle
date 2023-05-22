package sg.edu.rp.c346.id22038283.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    TextView tvQ2;
    Button buttonRevealQ1;
    Button buttonRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.tvQ1);
        buttonRevealQ1 = findViewById(R.id.buttonRevealQ1);
        tvQ2 = findViewById(R.id.tvQ2);
        buttonRevealQ2 = findViewById(R.id.buttonRevealQ2);

        buttonRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Answeractivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
            }
        });

        buttonRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Answeractivity2.class);
                intent.putExtra("Question", "Q2");
                startActivity(intent);
            }
        });
    }
}

