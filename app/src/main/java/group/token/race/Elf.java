package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Elf {
    private final String name;
    private final int image;
    private final String description;
    private final List<Bonus> bonuses;

    public Elf() {
        this.name = "Elf";
        this.image = R.drawable.fbea5c4d_2323_45f3_9a97_3b62a18f1a1d;
        this.description = "Elves love freedom, variety, and self-expression, so they lean strongly toward the gentler aspects of chaos. They value and protect others' freedom as well as their own, and they are more often good than not.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("DEX", 2));
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() { return image; }

    public List<Bonus> getBonuses() {
        return bonuses;
    }
}
