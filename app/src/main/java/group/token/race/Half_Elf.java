package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Half_Elf {
    private final String name;
    private final int image;
    private final String description;
    private final List<Bonus> bonuses;

    public Half_Elf() {
        this.name = "Half-Elf";
        this.image = R.drawable._fab20ef_6767_4aaf_8a2c_076adb0b91e4;
        this.description = "Half-elves share the chaotic bent of their elven heritage. They value both personal freedom and creative expression, demonstrating neither love of leaders nor desire for followers. They chafe at rules, resent others' demands, and sometimes prove unreliable, or at least unpredictable.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("CHA", 2));
        bonuses.add(new Bonus("OPT", 2));
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
