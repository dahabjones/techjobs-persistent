package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {

public Employer() {
}
public String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {this.location = location;}

}


