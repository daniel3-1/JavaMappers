package org.example.modelmappers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonCustomDTO {

    private long idDTO;
    private String nameDTO;
    private String lastNameDTO;
    private String emailDTO;
    private byte ageDTO;
    private Character genderDTO;
}
