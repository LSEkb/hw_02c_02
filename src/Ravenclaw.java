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

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nУм " + smart +
                "\nМудрость " + wisdom +
                "\nОстроумие " + wit +
                "\nТворчество " + creation + "\n";
    }

    public void compareStudent(Ravenclaw ravenclawStudent) {
        int sumThis = this.smart + this.wisdom + this.wit + this.creation;
        int sumGryffindorStudent = ravenclawStudent.getSmart() + ravenclawStudent.getWisdom() + ravenclawStudent.getWit() + ravenclawStudent.getCreation();
        if (sumThis > sumGryffindorStudent) {
            System.out.println(this.getFullName() + " лучший когтевранец, чем " + ravenclawStudent.getFullName());
        } else {
            System.out.println(ravenclawStudent.getFullName() + " лучший когтевранец, чем " + this.getFullName());
        }
        System.out.println();
    }
}
