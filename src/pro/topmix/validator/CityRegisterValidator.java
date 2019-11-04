package pro.topmix.validator;

import pro.topmix.domain.AnswerCityRegister;
import pro.topmix.domain.StudentOrder;

public class CityRegisterValidator {
    public String hostName;

    public AnswerCityRegister checkCityRegister(StudentOrder so) {
        System.out.println("CityRegister запущен: " + hostName);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.succes = false;
        return ans;
    }
}
