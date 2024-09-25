package org.example.modelmappers.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private long id;
    private String name;
    private String lastName;
    private String email;
    private byte age;
    private Character gender;
}
