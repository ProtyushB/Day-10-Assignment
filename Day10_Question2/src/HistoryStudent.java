public class HistoryStudent extends Student{

    int historyMarks;
    int civicsMarks;

    public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
        super(name, address);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
    }

    @Override
    public int getPercentage() {
        return ((historyMarks+civicsMarks)/2);
    }
}
