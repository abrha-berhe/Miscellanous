package com.abrha.friehu.PartialMessageResponse.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PartialFound implements ResponceTypes {
    private String message;
    private String status;
    private List<IdPairs> body;
}

