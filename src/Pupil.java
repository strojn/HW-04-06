// file "Pupil.java"
public class Pupil {
    void study() { System.out.println("Generic study"); }
    void read() { System.out.println("Generic read"); }
    void write() { System.out.println("Generic write"); }
    void relax() { System.out.println("Generic relax"); }
}

class ExcelentPupil extends Pupil {
    void study() {
        System.out.println("Excelent study");
    }
    void read() {
        System.out.println("Excelent read");
    }
    void write() {
        System.out.println("Excelent write");
    }
    void relax() {
        System.out.println("Bad relax");
    }
}
class GoodPupil extends Pupil {
    void study() {
        System.out.println("Good study");
    }
    void read() {
        System.out.println("Good read");
    }
    void write() {
        System.out.println("Good write");
    }
    void relax() {
        System.out.println("Good relax");
    }
}
class BadPupil extends Pupil {
    void study() {
        System.out.println("Bad study");
    }
    void read() {
        System.out.println("Bad read");
    }
    void write() {
        System.out.println("Bad write");
    }
    void relax() {
        System.out.println("Excelent relax");
    }
}