package com.hendisantika.bodymassindex.dto;

import org.junit.jupiter.api.Test;

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
}
