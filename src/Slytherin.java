public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int powerHungry;

    public Slytherin(String firstName, String lastName, int powerOfMagic, int apparitionDistance, int cunning, int determination, int ambition, int ingenuity, int powerHungry) {
        super(firstName, lastName, powerOfMagic, apparitionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.powerHungry = powerHungry;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Хитрость " + cunning +
                "\nРешительность " + determination +
                "\nАмбициозность " + ambition +
                "\nНаходчивость " + ingenuity +
                "\nЖажда власти " + powerHungry + "\n";
    }

    @Override
    protected int sumDepartmentParameters() {
        return cunning + determination + ambition + ingenuity + powerHungry;
    }
    @Override
    protected String getDepartmentName() {
        return "Слизерин";
    }
}
