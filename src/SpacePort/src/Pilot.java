public class Pilot {
    static String name;

    public Pilot(){
        this.name = "one";
    }

    public Pilot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pilot{" + "name='" + name + '\'' + '}';
    }
}
