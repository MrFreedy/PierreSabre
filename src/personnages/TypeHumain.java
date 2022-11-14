package personnages;

public enum TypeHumain {
    SAMOURAI, GRANDMERE, COMMERÇANT, TRAITRE, ;

    public String toString(){
        switch(this){
            case SAMOURAI:
                return "samourai";
            case GRANDMERE:
                return "grand-mère";
            case COMMERÇANT:
                return "commercant";
            case TRAITRE:
                return "traitre";
            default:
                return "TypeHumain";
        }
    }



}
