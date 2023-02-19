package com.example.smptwithspring.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*Set all variables to make basic email*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailControllerDTO {
    private String toMail;
    private String message;
    private String subject;
}
