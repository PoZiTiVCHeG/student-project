package pro.topmix;

import pro.topmix.domain.Adult;
import pro.topmix.domain.StudentOrder;

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();

        var ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        var answer = 199;
        System.out.println("saveStudentOrder");

        return answer;
    }
    static StudentOrder buildStudetOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Лёха");
        so.setHusband(husband);
        return so;
    }

}
