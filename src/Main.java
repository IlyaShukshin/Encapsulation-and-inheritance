public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 95, 80,95,100,90);
        System.out.println(harryPotter);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",92,90,100,70,80);
        System.out.println(hermioneGranger);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли",60,70,70,95,60);
        System.out.println(ronWeasley);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 50, 60, 75, 64,81);
        System.out.println(zachariahSmith);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 75, 80,63,55,81);
        System.out.println(cedricDiggory);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 63,95,58,42,98);
        System.out.println(justinFinchFletchley);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 78, 95, 76,54,63,78);
        System.out.println(zhouChang);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 64, 53, 65,74,97,41);
        System.out.println(padmaPatil);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 88,96,72,61,43,79);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 88, 63,78,85,98,90,100);
        System.out.println(dracoMalfoy);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 81, 65, 55,74,31,28,88);
        System.out.println(grahamMontague);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 54,45, 71,62,43,72,66);
        System.out.println(gregoryGoyle);

        harryPotter.compare(ronWeasley);
        ronWeasley.compare(hermioneGranger);
        justinFinchFletchley.compare(cedricDiggory);
        hermioneGranger.compareMagicProperties(dracoMalfoy);
    }
}