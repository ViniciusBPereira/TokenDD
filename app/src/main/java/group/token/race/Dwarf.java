package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Dwarf {
    private final String name;
    private final int image;
    private final String description;
    private final List<Bonus> bonuses;

    public Dwarf() {
        this.name = "Dwarf";
        this.image = R.drawable.cfa5c262_88ad_4360_a6a3_e39216a4199c;
        this.description = "Most dwarves are lawful, believing firmly in the benefits of a well-ordered society. They tend toward good as well, with a strong sense of fair play and a belief that everyone deserves to share in the benefits of a just order.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("CON", 2));
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
