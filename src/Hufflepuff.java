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

    public int getHardWorking() {
        return hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void compareStudent(Hufflepuff hufflepuffStudent) {
        int sumThis = this.hardWorking + this.loyalty + this.honesty;
        int sumGryffindorStudent = hufflepuffStudent.getHardWorking() + hufflepuffStudent.getLoyalty() + hufflepuffStudent.getHonesty();
        if (sumThis > sumGryffindorStudent) {
            System.out.println(this.getFullName() + " лучший пуффендуец, чем " + hufflepuffStudent.getFullName());
        } else {
            System.out.println(hufflepuffStudent.getFullName() + " лучший пуффендуец, чем " + this.getFullName());
        }
        System.out.println();
    }
}
