package pro.topmix;

import pro.topmix.domain.*;
import pro.topmix.mail.MailSender;
import pro.topmix.validator.ChildrenValidator;
import pro.topmix.validator.CityRegisterValidator;
import pro.topmix.validator.StudentValidator;
import pro.topmix.validator.WeddingValidator;

public class StudentOrderValidator {
    public static void main(String[] args) {

        checkAll();

    }

    static void checkAll() {

        while (true) {
            StudentOrder so = readStudentOrder();

            System.out.println("Старт");
            if (so == null){
                break;
            }
            System.out.println("Финиш");

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.succes){
                //continue;
                break;
            }
            AnswerWedding answerWedding = checkWedding(so);
            AnswerChildren answerChildren = checkChildren(so);
            AnswerStudent answerStudent = checkStudent(so);

            sendMail(so);
        }
        System.out.println("Финиш 2");
    }

    static StudentOrder readStudentOrder() {
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so) {
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host 1";
        CityRegisterValidator crv2 = new CityRegisterValidator();
        crv2.hostName = "Host 2";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        AnswerCityRegister ans2 = crv2.checkCityRegister(so);
        return ans1;

    }

    static AnswerWedding checkWedding(StudentOrder so) {
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so) {
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so) {
        StudentValidator sv = new StudentValidator();
        return sv.checkStudent(so);
    }

    static void sendMail(StudentOrder so) {
        new MailSender().sendMail(so);

    }
}
