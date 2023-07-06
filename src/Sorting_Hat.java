public class Sorting_Hat {

    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Гарри", "Поттер", 70, 30, 30, 40, 40);
        Griffindor hermioneGranger = new Griffindor("Гермиона", "Грейнджер", 30, 40, 60, 50, 56);
        Griffindor ronWeasley = new Griffindor("Рон", "Уизли", 30, 30, 50, 60, 70);
        Slytherin dracoMalfoy = new Slytherin("Драко", "Малфой", 60, 50, 50, 50, 70, 40, 45);
        Slytherin grahamMontague = new Slytherin("Грэхем", "Монтегю", 40, 20, 35, 56, 70, 30, 50);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 30, 45, 60, 56, 45, 38, 60);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария", "Смит", 45, 30, 56, 60, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 60, 50, 45, 66, 95);
        Hufflepuff justinFinch_Fletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 40, 20, 50, 30, 69);
        Ravenclaw choChang = new Ravenclaw("Чжоу", "Чанг", 60, 30, 70, 30, 30, 60);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 40, 20, 40, 50, 30, 60);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 40, 30, 60, 30, 70, 30);

        System.out.println(harryPotter.toString());

        ronWeasley.compareToCommonParameters(padmaPatil);

        grahamMontague.compareToDepartmentParameters(gregoryGoyle);
        choChang.compareToDepartmentParameters(gregoryGoyle);
    }
}