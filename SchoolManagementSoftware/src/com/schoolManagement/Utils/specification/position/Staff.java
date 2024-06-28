package com.schoolManagement.Utils.specification.position;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Staff extends Position {
    private List<String> AVAILABLE_JOB = new ArrayList<>() {
        {
            add("NURSE");
            add("LIBRARIAN");
            add("SERVER");
            add("SECURITY");
            add("JANITOR");
        }
    };
    private String JOB = "Unknown";

    // Constructor:
    public Staff(){super();}
    public Staff(String JOB){
        super("STAFF");
        setJOB(JOB);
    }

    // Getter and Setter:
    public List<String> getAVAILABLE_JOB() { return AVAILABLE_JOB; }
    public void addAVAILABLE_JOB(String JOB) {
        if (!AVAILABLE_JOB.contains(JOB)) {
            AVAILABLE_JOB.add(JOB);
        }
    }

    public String getJOB() { return JOB; }
    public void setJOB(String JOB) {
        if (AVAILABLE_JOB.contains(JOB)) {
            this.JOB = JOB;
        } else {
            throw new InvalidParameterException("The staff's job you entered is not found in our system. Please double-check and try again.");
        }
    }
    
}
