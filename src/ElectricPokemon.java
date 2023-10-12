import java.util.List;

public class ElectricPokemon extends PokemonGymImpl {
    int hp;


    public ElectricPokemon(String type, List<String> attacks, String name, int hp) {
        super(type, attacks, name);
        this.hp = hp;
    }

    void electroBall(Pokemon name, Pokemon enemy);
    void thunder(Pokemon name, Pokemon enemy);
    void inferno(Pokemon name, Pokemon enemy);
    void voltTackle(Pokemon name, Pokemon enemy);
    void thunderPunch(Pokemon name, Pokemon enemy);

}
