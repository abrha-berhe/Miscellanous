package com.abrha.friehu.PartialMessageResponse.Exceptiion;

import lombok.Data;

@Data
public class MyIDNotFound  extends RuntimeException{
private String code;
private String message;
}
