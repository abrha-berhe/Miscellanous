package com.abrha.friehu.PartialMessageResponse.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AllNotFound implements ResponceTypes{
    private String message;
    private String status;
}
