package com.hendisantika.bodymassindex.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.experimental.Accessors;

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
@Accessors(chain = true)
@Data
public class UserInfoDto {
    @Min(value = 2, message = "The code must be equal or greater than 3")
    @Max(value = 800, message = "The code must be equal or lower than 800")
    double weight;

    @Min(value = 40, message = "The code must be equal or greater than 40")
    @Max(value = 300, message = "The code must be equal or lower than 300")
    double height;

    public double getComputedHeight() {
        return this.height / 100;
    }

}
