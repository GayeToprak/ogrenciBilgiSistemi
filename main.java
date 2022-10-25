public class main {
    public static void main(String[] args) {
        teacher t1 = new teacher("sinan hoca", "555", "biyoloji");
        teacher t2 = new teacher("gamze hoca" , "666" , "tarih");
        teacher t3 = new teacher("osman hoca" , "777" , "fizik");

        course biyoloji = new course("biyoloji" , "505" , "biyoloji");
        biyoloji.addTeacher(t1);

        course tarih = new course("tarih" , "606" , "tarih");
        tarih.addTeacher(t2);

        course fizik = new course("fizik" , "707" , "fizik");
        fizik.addTeacher(t3);

        student s1 = new student("Gaye" , "123" , "9" , biyoloji , tarih , fizik );
        s1.addBulkExamNote(100 , 70 , 50);
        s1.isPass();

        student s2 = new student("beyzanur" , "234" ,"9" , biyoloji , tarih , fizik);
        s2.addBulkExamNote(60 , 70 , 100);
        s2.isPass();
    }
}
