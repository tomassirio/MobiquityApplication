package com.mobiquity.utils;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class ErrorDetails {
    private Date timestamp;
    private String error_code;
    private String error_message;
    private String path;

}