public class Hufflepuff extends Hogwarts {
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int powerOfMagic, int apparitionDistance, int hardWorking, int loyalty, int honesty) {
        super(firstName, lastName, powerOfMagic, apparitionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nБлагородство " + hardWorking +
                "\nЧесть " + loyalty +
                "\nХрабрость " + honesty + "\n";
    }

    @Override
    protected int sumDepartmentParameters() {
        return hardWorking + loyalty + honesty;
    }
    @Override
    protected String getDepartmentName() {
        return "Пуффендуй";
    }
}
