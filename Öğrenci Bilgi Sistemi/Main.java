public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Levent Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Gamze Hoca ", "FZK", "556");
        Teacher t3 = new Teacher("Filiz Hoca ", "MAT", "557");
        Teacher t4 = new Teacher("Handan Hoca", "İNG", "558");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course matematik = new Course("Matematik", "103", "MAT");
        matematik.addTeacher(t3);
        Course ingilizce = new Course("İngilizce", "104", "İNG");
        ingilizce.addTeacher(t4);


        Stuedent s1 = new Stuedent("Caki", "123", "4", tarih, fizik, matematik, ingilizce);
        s1.addBulkExamNote(60, 98, 74, 15);
        s1.addBulkVerbalNotes(80, 60, 90, 10);
        s1.calcAverage();
        s1.printNote();
        s1.isPass();

        Stuedent s2 = new Stuedent("cuki", "277", "4", tarih, fizik, matematik, ingilizce);
        s2.addBulkExamNote(10, 58, 90, 65);
        s2.addBulkVerbalNotes(100, 100, 50, 90);
        s2.calcAverage();
        s2.printNote();
        s2.isPass();

        Stuedent s3 = new Stuedent("Bayır Domuzu", "270", "4", tarih, fizik, matematik, ingilizce);
        s3.addBulkExamNote(10, 58, 60, 65);
        s3.addBulkVerbalNotes(100, 0, 50, 90);
        s3.calcAverage();
        s3.printNote();
        s3.isPass();

    }
}