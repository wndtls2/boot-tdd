package com.gw.boot.springboot.test.dto;

import com.gw.boot.springboot.web.dto.HelloResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        //given
        String name = "testasd#%*";
        int amount = 1000444444;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
