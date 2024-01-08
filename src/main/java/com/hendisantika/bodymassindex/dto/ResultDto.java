package com.hendisantika.bodymassindex.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : body-mass-index
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/8/24
 * Time: 15:57
 * To change this template use File | Settings | File Templates.
 */
@Data
public class ResultDto {
    double bmi;

    String description;

    public ResultDto(double bmi) {
        this.bmi = bmi;
        this.description = getBmiRange(this.bmi);
    }

    private String getBmiRange(double bmi) {
        if (bmi < 19) {
            return BMI_UNDERWEIGHT;
        }

        if (bmi >= 19 && bmi < 25) {
            return BMI_NORMAL;
        }

        if (bmi >= 25 && bmi < 30) {
            return BMI_OVERWEIGHT;
        }

        if (bmi >= 30 && bmi < 35) {
            return BMI_OBESITY_CLASS_ONE;
        }

        if (bmi >= 35 && bmi < 40) {
            return BMI_OBESITY_CLASS_TWO;
        }

        return BMI_OBESITY_CLASS_THREE;
    }
}
