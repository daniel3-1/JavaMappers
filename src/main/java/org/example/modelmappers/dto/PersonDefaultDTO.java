package org.example.modelmappers.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PersonDefaultDTO {

    private long id;
    private String name;
    private String lastName;
    private String email;
    private byte age;
    private Character gender;
}
