package com.schoolManagement.Utils.specification.position;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public abstract class Position {
    private List<String> ROLES = new ArrayList<>(){
        {
            add("STUDENT");
            add("TEACHER");
            add("ADMINISTRATION");
            add("STAFF");
        }   
    };
    private String ROLE = "Unknown";

    // Constructor:
    public Position() {}
    public Position(String ROLE) {setROLE(ROLE);}

    // Getter and Setter:
    public List<String> getROLES() { return ROLES; }
    public void addROLES(String ROLE) {
        ROLE = ROLE.toUpperCase();
        if (!ROLES.contains(ROLE)) { ROLES.add(ROLE); }
    }

    public String getROLE() { return ROLE; }
    public void setROLE(String ROLE) { 
        if (ROLES.contains(ROLE)) {
            this.ROLE = ROLE;
        } else {
            throw new InvalidParameterException("The role you entered is not found in our system. Please double-check and try again.");
        }
    }

    @Override
    public String toString() {
        return ROLE;
    }
    
}
