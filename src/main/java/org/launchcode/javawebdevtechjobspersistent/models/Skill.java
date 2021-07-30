package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @NotBlank(message = "Please enter your skills.")
    @Size(min = 1, max = 1000)
    private String skillDescription;
}
