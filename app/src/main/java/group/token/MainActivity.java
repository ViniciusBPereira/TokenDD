package group.token;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

import group.token.race.Dragonborn;
import group.token.race.Dwarf;
import group.token.race.Elf;
import group.token.race.Gnome;
import group.token.race.Half_Elf;
import group.token.race.Half_Orc;
import group.token.race.Halfling;
import group.token.race.Human;
import group.token.race.Tiefling;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Elf elf = new Elf();

        TextView name = findViewById(R.id.n_race);
        name.setText(elf.getName());

        ImageView img = findViewById(R.id.i_race);
        img.setImageResource(elf.getImage());

        TextView description = findViewById(R.id.d_race);
        description.setText(elf.getDescription());

        Button b = findViewById(R.id.back);
        b.setVisibility(View.INVISIBLE);
    }

    public void next(View view){
        i++;
        if(i == 1){
            Button b = findViewById(R.id.back);
            b.setVisibility(View.VISIBLE);
            Dwarf dwarf = new Dwarf();
            TextView name = findViewById(R.id.n_race);
            name.setText(dwarf.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(dwarf.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(dwarf.getDescription());
        }else if(i == 2){
            Gnome gnome = new Gnome();
            TextView name = findViewById(R.id.n_race);
            name.setText(gnome.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(gnome.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(gnome.getDescription());
        }else if(i == 3){
            Dragonborn dragonborn = new Dragonborn();
            TextView name = findViewById(R.id.n_race);
            name.setText(dragonborn.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(dragonborn.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(dragonborn.getDescription());
        }else if(i == 4){
            Half_Elf halfElf = new Half_Elf();
            TextView name = findViewById(R.id.n_race);
            name.setText(halfElf.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(halfElf.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(halfElf.getDescription());
        }else if(i == 5){
            Half_Orc halfOrc = new Half_Orc();
            TextView name = findViewById(R.id.n_race);
            name.setText(halfOrc.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(halfOrc.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(halfOrc.getDescription());
        }else if(i == 6){
            Halfling halfling = new Halfling();
            TextView name = findViewById(R.id.n_race);
            name.setText(halfling.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(halfling.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(halfling.getDescription());
        }else if(i == 7){
            Tiefling tiefling = new Tiefling();
            TextView name = findViewById(R.id.n_race);
            name.setText(tiefling.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(tiefling.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(tiefling.getDescription());
        }else if(i == 8){
            Button b = findViewById(R.id.next);
            b.setVisibility(View.INVISIBLE);
            Human human = new Human();
            TextView name = findViewById(R.id.n_race);
            name.setText(human.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(human.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(human.getDescription());
        }
    }

    public void back(View view){
        i--;
        if(i == 0){
            Button b = findViewById(R.id.back);
            b.setVisibility(View.INVISIBLE);
            Elf elf = new Elf();
            TextView name = findViewById(R.id.n_race);
            name.setText(elf.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(elf.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(elf.getDescription());
        }else if(i == 1){
            Dwarf dwarf = new Dwarf();
            TextView name = findViewById(R.id.n_race);
            name.setText(dwarf.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(dwarf.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(dwarf.getDescription());
        }else if(i == 2){
            Gnome gnome = new Gnome();
            TextView name = findViewById(R.id.n_race);
            name.setText(gnome.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(gnome.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(gnome.getDescription());
        }else if(i == 3){
            Dragonborn dragonborn = new Dragonborn();
            TextView name = findViewById(R.id.n_race);
            name.setText(dragonborn.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(dragonborn.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(dragonborn.getDescription());
        }else if(i == 4){
            Half_Elf halfElf = new Half_Elf();
            TextView name = findViewById(R.id.n_race);
            name.setText(halfElf.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(halfElf.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(halfElf.getDescription());
        }else if(i == 5){
            Half_Orc halfOrc = new Half_Orc();
            TextView name = findViewById(R.id.n_race);
            name.setText(halfOrc.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(halfOrc.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(halfOrc.getDescription());
        }else if(i == 6){
            Halfling halfling = new Halfling();
            TextView name = findViewById(R.id.n_race);
            name.setText(halfling.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(halfling.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(halfling.getDescription());
        }else if(i == 7){
            Tiefling tiefling = new Tiefling();
            TextView name = findViewById(R.id.n_race);
            name.setText(tiefling.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(tiefling.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(tiefling.getDescription());
            Button b = findViewById(R.id.next);
            b.setVisibility(View.VISIBLE);
        }else if(i == 8) {
            Human human = new Human();
            TextView name = findViewById(R.id.n_race);
            name.setText(human.getName());

            ImageView img = findViewById(R.id.i_race);
            img.setImageResource(human.getImage());

            TextView description = findViewById(R.id.d_race);
            description.setText(human.getDescription());
        }
    }
}