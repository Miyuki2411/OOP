// Lớp KLTN generic
class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<?, ?>> {
    private T student;
    private V advisor;
    private String thesisName;

    public KLTN(T student, V advisor, String thesisName) {
        this.student = student;
        this.advisor = advisor;
        this.thesisName = thesisName;
    }

    public T getStudent() { return student; }
    public V getAdvisor() { return advisor; }
    public String getThesisName() { return thesisName; }

    @Override
    public int compareTo(KLTN<?, ?> other) {
        return this.thesisName.compareToIgnoreCase(other.thesisName);
    }

    @Override
    public String toString() {
        return "Đề tài: " + thesisName + "\n" +
                "  Sinh viên: " + student + "\n" +
                "  Hướng dẫn: " + advisor;
    }
}
