// file "ClassRoom.java"
public class ClassRoom {
    Pupil[] pupils = new Pupil[4];
    int countPupils;
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        countPupils = 4;
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        countPupils = 3;
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        //showNew()
        pupils[3] = new Pupil();
    }
    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        countPupils = 2;
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        //showNew()
        pupils[2] = new Pupil();
        pupils[3] = new Pupil();
    }
    void show() {
        for (int i = 0; i < countPupils; i++) {
            int numPupil = i + 1;
            System.out.println("Учень " + numPupil + ":");
            pupils[i].read();
            pupils[i].write();
            pupils[i].study();
            pupils[i].relax();
        }
    }
    void showNew() {
        for (int i = 0; i < pupils.length; i++) {
            int numPupil = i + 1;
            System.out.println("Учень " + numPupil + ":");
            pupils[i].read();
            pupils[i].write();
            pupils[i].study();
            pupils[i].relax();
        }
    }
}
