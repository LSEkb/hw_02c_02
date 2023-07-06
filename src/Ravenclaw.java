public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String firstName, String lastName, int powerOfMagic, int apparitionDistance, int smart, int wisdom, int wit, int creation) {
        super(firstName, lastName, powerOfMagic, apparitionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nУм " + smart +
                "\nМудрость " + wisdom +
                "\nОстроумие " + wit +
                "\nТворчество " + creation + "\n";
    }

    @Override
    protected int sumDepartmentParameters() {
        return smart + wisdom + wit + creation;
    }

    @Override
    protected String getDepartmentName() {
        return "Когтевран";
    }
}
