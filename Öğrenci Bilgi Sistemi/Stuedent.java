import java.text.DecimalFormat;

public class Stuedent {
    Course c1;
    Course c2;
    Course c3;
    Course c4;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Stuedent(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course c4) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int c1note, int c2note, int c3note, int c4note) {
        if (c1note >= 0 && c1note <= 100) {
            this.c1.note = c1note;
        }
        if (c2note >= 0 && c2note <= 100) {
            this.c2.note = c2note;
        }
        if (c3note >= 0 && c3note <= 100) {
            this.c3.note = c3note;
        }
        if (c4note >= 0 && c4note <= 100) {
            this.c4.note = c4note;
        }
    }

    void addBulkVerbalNotes(int c1VerbNote, int c2VerbNote, int c3VerbNote, int c4VerbNote) {
        if (c1VerbNote >= 0 && c1VerbNote <= 100) {
            this.c1.verbalGrade = c1VerbNote;
        }
        if (c2VerbNote >= 0 && c2VerbNote <= 100) {
            this.c2.verbalGrade = c2VerbNote;
        }
        if (c3VerbNote >= 0 && c3VerbNote <= 100) {
            this.c3.verbalGrade = c3VerbNote;
        }
        if (c4VerbNote >= 0 && c4VerbNote <= 100) {
            this.c4.verbalGrade = c4VerbNote;
        }
    }

    void calcAverage() {
        System.out.println("===============================");
        this.average = ((this.c1.note * 0.8 + this.c1.verbalGrade * 0.2) +
                (this.c2.note * 0.8 + this.c2.verbalGrade * 0.2) +
                (this.c3.note * 0.8 + this.c3.verbalGrade * 0.2) +
                (this.c4.note * 0.8 + this.c4.verbalGrade * 0.2)) / 4.0;
    }

    void printNote() {

        System.out.println(this.c1.name + "Notu : " + (this.c1.note * 0.8 + this.c1.verbalGrade * 0.2));
        System.out.println(this.c2.name + "Notu : " + (this.c2.note * 0.8 + this.c2.verbalGrade * 0.2));
        System.out.println(this.c3.name + "Notu : " + (this.c3.note * 0.8 + this.c3.verbalGrade * 0.2));
        System.out.println(this.c4.name + "Notu : " + (this.c4.note * 0.8 + this.c4.verbalGrade * 0.2));
        System.out.println("Ortalaması     : " + new DecimalFormat().format(this.average));


    }

    void isPass() {
        this.average = (this.c1.note + this.c2.note + this.c3.note + this.c4.note) / 4.0;
        if (this.average > 58) {
            System.out.println("Sınıfı Geçtiniz");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız!");
            this.isPass = false;
        }

    }

}

