package FHDW.Models;

public enum Unit {
    NO_UNIT("Einheit nicht definiert"),
    PIECE("Stück"),
    LITER("Liter"),
    KILO("Kilo");

    private final String name;
    Unit(String name){
        this.name = name;
    }

    public static Unit unit(int i){
        int j = 0;
        for(Unit unit: Unit.values()){
            if(j == i){
                return unit;
            }
        }return Unit.NO_UNIT;
    }

    public static Unit parse(String string){
        Unit unit = Unit.NO_UNIT;

        switch (string){
            case "Einheit nicht verfügbar":
                unit = Unit.NO_UNIT;
                break;
            case "Stück":
                unit = Unit.PIECE;
                break;
            case "Liter":
                unit = Unit.LITER;
                break;
            case "Kilo":
                unit = Unit.KILO;
                break;
        }
        return unit;
    }

    public String toString(){
        return this.name;
    }

    public static Unit getUnit (int i){
        int j = 0;
        for(Unit unit: Unit.values()){
            if(j == i){
                return unit;
            }
            j++;
        }return Unit.NO_UNIT;
    }

}
