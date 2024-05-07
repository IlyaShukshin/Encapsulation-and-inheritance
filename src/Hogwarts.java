public abstract class Hogwarts {
    protected String name;
    protected int powerMagic;
    protected int transgressionDistance;

    public Hogwarts(String name, int powerMagic, int transgressionDistance) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public  int sumAbilities (){
        return powerMagic + transgressionDistance;
    }
    public void compareMagicProperties (Hogwarts hogwartsStudent) {
        int sum1 = sumAbilities();
        int sum2 = hogwartsStudent.sumAbilities();

        if ( sum1 > sum2) {
            System.out.println(name + " лучьший Хогврдец, чем " + hogwartsStudent.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " худший Хогвардец, чем " + hogwartsStudent.name);
        } else {
            System.out.println(name + " по силам равен " + hogwartsStudent.name);
        }
    }
}