package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Halfling {
    private String name;
    private int image;
    private String description;
    private List<Bonus> bonuses;

    public Halfling() {
        this.name = "Halfling";
        this.image = R.drawable.dd9536bb_1bd7_4b6c_bed0_d92d9ee81748;
        this.description = "Most halflings are lawful good. As a rule, they are good-hearted and kind, hate to see others in pain, and have no tolerance for oppression. They are also very orderly and traditional, leaning heavily on the support of their community and the comfort of their old ways.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("DEX", 2));
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
