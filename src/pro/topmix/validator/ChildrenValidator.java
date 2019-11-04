package pro.topmix.validator;

import pro.topmix.domain.AnswerChildren;
import pro.topmix.domain.StudentOrder;

public class ChildrenValidator {

    public AnswerChildren checkChildren(StudentOrder so) {
        System.out.println("Дети проверяются!");
        return new AnswerChildren();
    }
}
