public class Slytherin extends Hogwarts {
    public Slytherin(String name, int powerMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                " name='" + name + '\'' +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", powerMagic=" + powerMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
    public int sumAbilities (){
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }
    public void compare(Slytherin student) {
        int sum1 = sumAbilities();
        int sum2 = student.sumAbilities();

        if ( sum1 > sum2) {
            System.out.println(name + " лучьший Слизеринец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший Слизеринец, чем " + student.name);
        } else {
            System.out.println(name + " по силам равен " + student.name);
        }
    }
}