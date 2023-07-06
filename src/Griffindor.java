public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String firstName, String lastName, int powerOfMagic, int apparitionDistance, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerOfMagic, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nБлагородство " + nobility +
                "\nЧесть " + honor +
                "\nХрабрость " + bravery + "\n";
    }

    @Override
    protected int sumDepartmentParameters() {
        return nobility + honor + bravery;
    }

    @Override
    protected String getDepartmentName() {
        return "Гриффиндор";
    }
}
