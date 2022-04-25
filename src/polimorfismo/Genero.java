package polimorfismo;

public enum Genero {
    MASCULINO("masculino"),
    FEMININO("feminino"),
    NEUTRO("neutro"),
    HELICOPTERO_DE_COMBATE("helicoptero de combate"),
    OUTRO("outro");

    public static Genero buscarEnum(String sexo){
        Genero[] listaDeGeneros = Genero.values();
        for (Genero genero: listaDeGeneros){
            if(genero.value.equalsIgnoreCase(sexo)){
                return genero;
            }
        }
        return null;
    }
    private String value;

    Genero(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
