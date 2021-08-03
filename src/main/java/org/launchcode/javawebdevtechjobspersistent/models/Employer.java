package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

@OneToMany (mappedBy = "employer")


private final List<Job> jobs = new ArrayList<>();
public Employer() {
}
public String location;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {this.location = location;}

}


