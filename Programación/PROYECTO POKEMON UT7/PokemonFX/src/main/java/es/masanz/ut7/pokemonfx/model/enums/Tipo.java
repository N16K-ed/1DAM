package es.masanz.ut7.pokemonfx.model.enums;

public enum Tipo {

    // TODO 10: Si se incluyen nuevos tipos de pokemon, se deberan reflejar aqui
    AGUA(new String[]{"PLANTA", "ELECTRICO"}, new String[]{"FUEGO", "ACERO", "AGUA", "HIELO"}, new String[]{}),
    FUEGO(new String[]{"AGUA", "TIERRA", "ROCA"}, new String[]{"BICHO", "ACERO", "FUEGO", "PLANTA", "HIELO", "HADA"}, new String[]{}),
    PLANTA(new String[]{"FUEGO", "VOLADOR", "BICHO", "VENENO", "HIELO"}, new String[]{"AGUA", "PLANTA", "ELECTRICO", "TIERRA"}, new String[]{}),
    NORMAL(new String[]{"LUCHA"}, new String[]{}, new String[]{"FANTASMA"}),
    SINIESTRO(new String[]{"LUCHA", "BICHO", "HADA"}, new String[]{"FANTASMA", "SINIESTRO"}, new String[]{"HADA"}),
    DRAGON(new String[]{"HIELO", "DRAGON", "HADA"}, new String[]{"FUEGO", "AGUA", "PLANTA", "ELECTRICO"}, new String[]{}),
    LUCHA(new String[]{"VOLADOR", "PSIQUICO", "HADA"}, new String[]{"ROCA", "BICHO", "SINIESTRO"}, new String[]{}),
    FANTASMA(new String[]{"FANTASMA", "SINIESTRO"}, new String[]{"VENENO", "BICHO"}, new String[]{"NORMAL", "LUCHA"}),
    PSIQUICO(new String[]{"BICHO", "FANTASMA", "SINIESTRO"}, new String[]{"LUCHA", "PSIQUICO"}, new String[]{}),
    HIELO(new String[]{"LUCHA", "ROCA", "ACERO", "FUEGO"}, new String[]{"HIELO"}, new String[]{}),
    BICHO(new String[]{"VOLADOR", "ROCA", "FUEGO"}, new String[]{"LUCHA", "TIERRA", "PLANTA"}, new String[]{}),
    VENENO(new String[]{"TIERRA", "PSIQUICO"}, new String[]{"LUCHA", "VENENO", "BICHO", "PLANTA", "HADA"}, new String[]{}),
    ROCA(new String[]{"LUCHA", "TIERRA", "ACERO", "AGUA", "PLANTA"}, new String[]{"NORMAL", "VOLADOR", "VENENO", "FUEGO"}, new String[]{}),
    TIERRA(new String[]{"AGUA", "PLANTA", "HIELO"}, new String[]{"VENENO", "ROCA"}, new String[]{"ELECTRICO"}),
    HADA(new String[]{"VENENO", "ACERO"}, new String[]{"LUCHA", "BICHO", "SINIESTRO"}, new String[]{"DRAGON"}),
    ACERO(new String[]{"HADA", "FUEGO", "LUCHA"}, new String[]{"NORMAL", "VOLADOR", "ROCA", "BICHO", "ACERO", "PLANTA", "PSIQUICO", "HIELO", "DRAGON", "HADA"}, new String[]{"VENENO"}),
    VOLADOR(new String[]{"ROCA", "ELECTRICO", "HIELO"}, new String[]{"LUCHA", "BICHO", "PLANTA"}, new String[]{"TIERRA"}),
    ELECTRICO(new String[]{"TIERRA"}, new String[]{"VOLADOR", "ACERO", "ELECTRICO"}, new String[]{}),


    ;

    public final String[] debilidades;
    public final String[] resistencias;
    public final String[] inmunidades;

    Tipo(String[] debilidades, String[] resistencias, String[] inmunidades) {
        this.debilidades = debilidades;
        this.resistencias = resistencias;
        this.inmunidades = inmunidades;
    }

    public boolean recibeDanoDeFormaDebil(String tipoAtaque) {
        return contiene(debilidades, tipoAtaque);
    }

    public boolean recibeDanoDeFormaResistente(String tipoAtaque) {
        return contiene(resistencias, tipoAtaque);
    }

    public boolean esInmuneA(String tipoAtaque) {
        return contiene(inmunidades, tipoAtaque);
    }

    private boolean contiene(String[] array, String tipo) {
        for (String t : array) {
            if (t.equalsIgnoreCase(tipo)) return true;
        }
        return false;
    }
}