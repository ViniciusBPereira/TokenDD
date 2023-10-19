package group.token.race;

import java.util.ArrayList;
import java.util.List;

import group.token.R;
import group.token.race.buff.Bonus;

public class Gnome {
    private String name;
    private int image;
    private String description;
    private List<Bonus> bonuses;

    public Gnome() {
        this.name = "Gnome";
        this.image = R.drawable._2a0e15c_52f3_4af9_95ff_384ac6df58ae;
        this.description = "Gnomes are most often good. Those who tend toward law are sages, engineers, researchers, scholars, investigators, or inventors. Those who tend toward chaos are minstrels, tricksters, wanderers, or fanciful jewelers. Gnomes are good-hearted, and even the tricksters among them are more playful than vicious.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("INT", 2));
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
