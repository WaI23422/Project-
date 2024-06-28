package com.schoolManagement.DTO.SchoolMembers;

import java.util.regex.PatternSyntaxException;

import com.schoolManagement.Utils.specification.position.Position;
import com.schoolManagement.Utils.time.Date;

abstract class SchoolMemberDTO {
    private String NAME = "Unknown";
    private String ID = "000000000";        
    private Date BIRTH = new Date();
    private Position POSITION;
    private Date ENROLLMENT = new Date();

    // Constructor:
    public SchoolMemberDTO() {}
    public SchoolMemberDTO(String NAME, String ID, Date BIRTH, String POSITION, Date ENROLLMENT) {
        setName(NAME);
        setId(ID);
        setBirth(BIRTH);
        setPosition(POSITION);
        setEnrolment(ENROLLMENT);
    }

    // Getter and Setter:
    public String getName() { return NAME; }
    public void setName(String NAME) { this.NAME = NAME; }
    
    public String getId() { return ID; }
    public void setId(String ID) { 
        if (ID.matches("([0-9]){9}")) {
            this.ID = ID; 
        } else {
            throw new PatternSyntaxException(ID, "([0-9]){9}", 0);
        }
    }

    public Date getBirth() { return BIRTH; }
    public void setBirth(Date BIRTH) { this.BIRTH = BIRTH;}
    
    public String getPosition() { return POSITION.getROLE(); }
    public void setPosition(String POSITION) {
        this.POSITION.setROLE(POSITION);
    }
    
    public Date getEnrolment() { return ENROLLMENT; }
    public void setEnrolment(Date ENROLLMENT) { this.ENROLLMENT = ENROLLMENT;}
    

    @Override
    public String toString() {
        return "SchoolMember [NAME=" + NAME + ", ID=" + ID + ", BIRTH=" + BIRTH + ", POSITION=" + POSITION
                + ", ENROLLMENT=" + ENROLLMENT + "]";
    }
}
