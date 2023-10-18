package group.token;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

import group.token.race.Elf;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Elf elf = new Elf();

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView name = findViewById(R.id.n_race);
        name.setText(elf.getName());

        ImageView img = findViewById(R.id.i_race);
        img.setImageResource(elf.getImage());

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView description = findViewById(R.id.d_race);
        description.setText(elf.getDescription());
    }
}