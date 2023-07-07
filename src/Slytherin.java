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

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public int getPowerHungry() {
        return powerHungry;
    }

    public void compareStudent(Slytherin slytherinStudent) {
        int sumThis = this.cunning + this.determination + this.ambition + this.ingenuity + this.powerHungry;
        int sumGryffindorStudent = slytherinStudent.getCunning() + slytherinStudent.getDetermination() + slytherinStudent.getIngenuity() + slytherinStudent.getIngenuity() + slytherinStudent.getPowerHungry();
        if (sumThis > sumGryffindorStudent) {
            System.out.println(this.getFullName() + " лучший слизеринец, чем " + slytherinStudent.getFullName());
        } else {
            System.out.println(slytherinStudent.getFullName() + " лучший слизеринец, чем " + this.getFullName());
        }
        System.out.println();
    }
}
