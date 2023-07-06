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

    protected abstract int sumDepartmentParameters();

    protected abstract String getDepartmentName();

    protected void compareToDepartmentParameters(Hogwarts otherStudent) {
        if (this.getClass() == otherStudent.getClass()) {
            if (this.sumDepartmentParameters() > otherStudent.sumDepartmentParameters()) {
                System.out.println(this.getFullName() + " лучший студент факультета " + this.getDepartmentName() + " чем " + otherStudent.getFullName());
            } else {
                System.out.println(otherStudent.getFullName() + " лучший студент факультета " + this.getDepartmentName() + " чем " + this.getFullName());
            }
        } else {
            System.out.println("Вы ошиблись, это студенты разных факультетов");
        }
        System.out.println();
    }

    public void compareToCommonParameters(Hogwarts otherStudent) {
        if (this.powerOfMagic > otherStudent.powerOfMagic) {
            System.out.println(this.getFullName() + " обладает бОльей силой магии, чем " + otherStudent.getFullName());
        } else {
            System.out.println(otherStudent.getFullName() + " обладает бОльей силой магии, чем " + this.getFullName());
            if (this.apparitionDistance > otherStudent.apparitionDistance) {
                System.out.println(this.getFullName() + " обладает бОльшим расстоянием трансгрессии, чем " + otherStudent.getFullName());
            } else {
                System.out.println(otherStudent.getFullName() + " обладает бОльшим расстоянием трансгрессии, чем " + this.getFullName());
            }
        }
        System.out.println();
    }

}
