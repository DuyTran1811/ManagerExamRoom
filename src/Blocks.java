public class Blocks {
    private String nameBlock;
    private float subjectA;
    private float subjectB;
    private float subjectC;
    private Student student;

    public Blocks() {
    }

    public Blocks(String nameBlock,float subjectA, float subjectB,
                  float subjectC, Student student) {
        this.nameBlock = nameBlock;
        this.subjectA = subjectA;
        this.subjectB = subjectB;
        this.subjectC = subjectC;
        this.student = student;
    }

    public String getNameBlock() {
        return nameBlock;
    }

    public float getSubjectA() {
        return subjectA;
    }

    public float getSubjectB() {
        return subjectB;
    }

    public float getSubjectC() {
        return subjectC;
    }

    public Student getStudent() {
        return student;
    }

}
