package pro.topmix.validator;

import pro.topmix.domain.AnswerStudent;
import pro.topmix.domain.StudentOrder;

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so) {
        System.out.println("Студенты проверяются!");
        return new AnswerStudent();
    }
}
