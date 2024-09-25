package org.example.modelmappers;

import org.example.modelmappers.dto.PersonCustomDTO;
import org.example.modelmappers.dto.PersonDefaultDTO;
import org.example.modelmappers.entities.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {

    /* Model Mapper - Default*/
    /*public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        Person person = new Person(1L,
                "Daniel",
                "Perez",
                "daniel@gmail.com",
                (byte)25,
                'M');

        System.out.println(person);
        PersonDefaultDTO personDefaultDTO = modelMapper.map(person, PersonDefaultDTO.class);
        System.out.println(personDefaultDTO);
    }*/

    /* Model Mapper - Custom*/
    public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();
        TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class,
                PersonCustomDTO.class);

        propertyMapper.addMapping(Person::getId, PersonCustomDTO::setIdDTO);
        propertyMapper.addMapping(Person::getName, PersonCustomDTO::setNameDTO);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
        propertyMapper.addMapping(Person::getAge, PersonCustomDTO::setAgeDTO);
        propertyMapper.addMapping(Person::getEmail, PersonCustomDTO::setEmailDTO);
        

        Person person = new Person(1L,
                "Daniel",
                "Perez",
                "daniel@gmail.com",
                (byte)25,
                'M');

        System.out.println(person);

        PersonCustomDTO personCustomDTO = propertyMapper.map(person);
        System.out.println(personCustomDTO);
    }
}