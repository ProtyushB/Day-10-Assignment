public class ScienceStudent extends Student{

    int phisicsMarks;
    int chemistryMarks;
    int mathsMarks;

    public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {
        super(name, address);
        this.phisicsMarks = phisicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
    }

    @Override
    public int getPercentage() {
        return ((phisicsMarks+chemistryMarks+mathsMarks)/3);
    }
}
