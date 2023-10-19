package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Tiefling {
    private String name;
    private int image;
    private String description;
    private List<Bonus> bonuses;

    public Tiefling() {
        this.name = "Tiefling";
        this.image = R.drawable._f133ae8_16b3_45a1_a212_a4a9c316b7de;
        this.description = "Tieflings might not have an innate tendency toward evil, but many of them end up there. Evil or not, an independent nature inclines many tieflings toward a chaotic alignment.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("INT", 1));
        bonuses.add(new Bonus("CHA", 2));
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public List<Bonus> getBonuses() {
        return bonuses;
    }
}
