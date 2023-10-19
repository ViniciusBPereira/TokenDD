package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Dragonborn {
    private final String name;
    private final int image;
    private final String description;
    private final List<Bonus> bonuses;

    public Dragonborn() {
        this.name = "Dragonborn";
        this.image = R.drawable._f3ce5a9_4bc4_4156_a917_fd4b11abbdba;
        this.description = "Dragonborn tend to extremes, making a conscious choice for one side or the other in the cosmic war between good and evil. Most dragonborn are good, but those who side with evil can be terrible villains.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("STR", 2));
        bonuses.add(new Bonus("CHA", 1));
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
