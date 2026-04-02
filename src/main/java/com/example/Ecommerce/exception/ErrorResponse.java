package com.example.Ecommerce.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@Builder

public class ErrorResponse {

    private int status;
    private String message;
    private LocalDateTime timestamp;

    ErrorResponse(int status,String message,LocalDateTime timestamp){
        this.status=status;
        this.message=message;
        this.timestamp=timestamp;
    }

}
