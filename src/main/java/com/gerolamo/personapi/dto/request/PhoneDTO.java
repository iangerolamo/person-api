package com.gerolamo.personapi.dto.request;

import com.gerolamo.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhoneDTO {
    private Long id;
    private PhoneType type;
    private String number;
}
