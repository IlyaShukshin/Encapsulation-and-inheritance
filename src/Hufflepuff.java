public class Hufflepuff extends Hogwarts {
    public Hufflepuff(String name, int powerMagic, int transgressionDistance, int hardWork, int loyalty, int honor) {
        super(name, powerMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    private int hardWork;
    private int loyalty;
    private int honor;

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                " name='" + name + '\'' +
                ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                ", powerMagic=" + powerMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int sumAbilities (){
        return hardWork + loyalty + honor;
    }
    public void compare (Hufflepuff student) {
        int sum1 = sumAbilities();
        int sum2 = student.sumAbilities();

        if ( sum1 > sum2) {
            System.out.println(name + " лучьший Пуффендуец, чем " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший Пуффендуец, чем " + student.name);
        } else {
            System.out.println(name + " по силам равен " + student.name);
        }
    }
}