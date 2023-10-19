package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Half_Orc {
    private final String name;
    private final int image;
    private final String description;
    private final List<Bonus> bonuses;

    public Half_Orc() {
        this.name = "Half-Orc";
        this.image = R.drawable.d26e06c2_7cc4_4852_b029_8d1abd10921e;
        this.description = "Half-orcs inherit a tendency toward chaos from their orc parents and are not strongly inclined toward good. Half-orcs raised among orcs and willing to live out their lives among them are usually evil.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("STR", 2));
        bonuses.add(new Bonus("CON", 1));
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
