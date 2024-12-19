package com.myralla.loyalty.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {
    private String firstName;
    private String lastName;
    private String tenantId;
    private String orgKey;
}
