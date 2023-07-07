public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int powerOfMagic, int apparitionDistance, int nobility, int honor, int bravery) {
        super(firstName, lastName, powerOfMagic, apparitionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nБлагородство " + nobility +
                "\nЧесть " + honor +
                "\nХрабрость " + bravery + "\n";
    }

    public void compareStudent(Gryffindor gryffindorStudent) {
        int sumThis = this.nobility + this.honor + this.bravery;
        int sumGryffindorStudent = gryffindorStudent.getNobility() + gryffindorStudent.getHonor() + gryffindorStudent.getBravery();
        if (sumThis > sumGryffindorStudent) {
            System.out.println(this.getFullName() + " лучший гриффиндорец, чем " + gryffindorStudent.getFullName());
        } else {
            System.out.println(gryffindorStudent.getFullName() + " лучший гриффиндорец, чем " + this.getFullName());
        }
        System.out.println();
    }
}
