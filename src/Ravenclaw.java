public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String name, int powerMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, powerMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                " name='" + name + '\'' +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                ", powerMagic=" + powerMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public int sumAbilities (){
        return mind + wisdom + wit + creation;
    }
    public void compare (Ravenclaw student) {
        int sum1 = sumAbilities();
        int sum2 = student.sumAbilities();

        if ( sum1 > sum2) {
            System.out.println(name + " лучьший Когтевранец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший Когтевранец, чем " + student.name);
        } else {
            System.out.println(name + " по силам равен " + student.name);
        }
    }
}