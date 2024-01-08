package com.hendisantika.bodymassindex.dto;

import org.junit.jupiter.api.Test;

import static com.hendisantika.bodymassindex.config.Constants.BMI_NORMAL;
import static com.hendisantika.bodymassindex.config.Constants.BMI_OBESITY_CLASS_ONE;
import static com.hendisantika.bodymassindex.config.Constants.BMI_OBESITY_CLASS_THREE;
import static com.hendisantika.bodymassindex.config.Constants.BMI_OBESITY_CLASS_TWO;
import static com.hendisantika.bodymassindex.config.Constants.BMI_OVERWEIGHT;
import static com.hendisantika.bodymassindex.config.Constants.BMI_UNDERWEIGHT;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : body-mass-index
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 1/8/24
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
class ResultDtoTest {
    @Test
    public void bmiUnderweight() {
        ResultDto resultDto = new ResultDto(10);

        assertEquals(resultDto.getDescription(), BMI_UNDERWEIGHT);
    }

    @Test
    public void bmiNormal() {
        ResultDto resultDto = new ResultDto(22);

        assertEquals(resultDto.getDescription(), BMI_NORMAL);
    }

    @Test
    public void bmiOverweight() {
        ResultDto resultDto = new ResultDto(28.5);

        assertEquals(resultDto.getDescription(), BMI_OVERWEIGHT);
    }

    @Test
    public void bmiObesityClassOne() {
        ResultDto resultDto = new ResultDto(33);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_ONE);
    }

    @Test
    public void bmiObesityClassTwo() {
        ResultDto resultDto = new ResultDto(37.7);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_TWO);
    }

    @Test
    public void bmiObesityClassThree() {
        ResultDto resultDto = new ResultDto(44.3);

        assertEquals(resultDto.getDescription(), BMI_OBESITY_CLASS_THREE);
    }
}
