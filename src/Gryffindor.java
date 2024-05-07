public class Gryffindor extends Hogwarts {
    public Gryffindor(String name, int powerMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, powerMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    private int nobility;
    private int honor;
    private int courage;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                " name='" + name + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", powerMagic=" + powerMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int sumAbilities (){
        return nobility + honor + courage;
    }
    public void compare (Gryffindor student) {
        int sum1 = sumAbilities();
        int sum2 = student.sumAbilities();

        if ( sum1 > sum2) {
            System.out.println(name + " лучьший Гриффендорец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший Гриффендорец, чем " + student.name);
        } else {
            System.out.println(name + " по силам равен " + student.name);
        }
    }
}