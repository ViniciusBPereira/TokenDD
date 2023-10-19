package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Human {
    private final String name;
    private final int image;
    private final String description;
    private final List<Bonus> bonuses;

    public Human() {
        this.name = "Human";
        this.image = R.drawable._b5ee33e_bce5_459f_91b1_a6eed4e920eb;
        this.description = "Humans tend toward no particular alignment. The best and the worst are found among them.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("ALL", 1));
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
