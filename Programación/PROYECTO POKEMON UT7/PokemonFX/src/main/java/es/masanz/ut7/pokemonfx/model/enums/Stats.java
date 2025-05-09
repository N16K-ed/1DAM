package es.masanz.ut7.pokemonfx.model.enums;

public enum Stats {

    // TODO 08: Incluir nuevos pokemon. Cuidado, el nombre correcto es muy IMPORTANTE
    BULBASAUR("001", 45, 49, 49, 45, 65, 65, 64),
    IVYSAUR("002",60,62,63,60,80,80,142),
    VENUSAUR("003",59,63,80,58,65,80,236),
    CHARMANDER("004", 39, 52, 43, 65, 60, 50, 65),
    CHARMELEON("005",58,64,58,80,80,65,142),
    CHARIZARD("006",78,84,78,100,109,85,240),
    SQUIRTLE("007", 44, 48, 65, 43, 50, 64, 66),
    WARTORTLE("008",59,63,80,58,65,80,142),
    BLASTOISE("009", 79, 83, 100, 78, 85, 105, 239),
    BIDOOF("399", 59, 45, 40, 31, 35, 40, 50),
    BIBAREL("400", 79, 85, 60, 71, 55, 60, 144),
    BRONZOR("436", 57, 24, 86, 23, 24, 86, 60),
    BRONZONG("437", 67, 89, 116, 33, 79, 116, 188),
    GOLBAT("042", 75, 80, 70, 90, 65, 75, 159),
    CROBAT("169", 85, 90, 80, 130, 70, 80, 241),
    MAGIKARP("129", 20, 10, 55, 80, 15, 20, 40),
    GYARADOS("130", 95, 125, 79, 81, 60, 100, 189),
    GIRATINA("487", 150, 100, 120, 90, 100, 120, 340),
    ;

    public final String numPokedex;
    public final int hp, ataque, defensa, velocidad, ataqueEspecial, defensaEspecial, expBase;

    Stats(String numPokedex, int hp, int ataque, int defensa, int velocidad, int ataqueEspecial, int defensaEspecial, int expBase) {
        this.numPokedex = numPokedex;
        this.hp = hp;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.expBase = expBase;
    }
}
