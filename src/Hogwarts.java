public abstract class Hogwarts {
    private String firstName;
    private String lastName;
    private int powerOfMagic;
    private int apparitionDistance;


    public Hogwarts(String firstName, String lastName, int powerOfMagic, int apparitionDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.powerOfMagic = powerOfMagic;
        this.apparitionDistance = apparitionDistance;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "Студент " + firstName + " " + lastName + " качества:\n" +
                "Мощность магии " + powerOfMagic +
                "\nРасстояние трансгрессии " + apparitionDistance;
    }

    public void compareToCommonParameters(Hogwarts otherStudent) {
        if (this.powerOfMagic + this.apparitionDistance > otherStudent.powerOfMagic + otherStudent.apparitionDistance) {
            System.out.println(this.getFullName() + " обладает бОльшей силой магии, чем " + otherStudent.getFullName());
        } else {
            System.out.println(otherStudent.getFullName() + " обладает бОльшей силой магии, чем " + this.getFullName());
        }
        System.out.println();
    }

}
