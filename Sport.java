public class Sport {
    String name;
    String type;


    public Sport(String nnn, String ttt) {
        name = nnn;
        System.out.println(nnn);
        type = ttt;
        System.out.println(ttt);
    }

    String strongStatement() {
        return name + " " + "is the best sport ever!";
    }

    String getType() {
        return type;
    }
}
