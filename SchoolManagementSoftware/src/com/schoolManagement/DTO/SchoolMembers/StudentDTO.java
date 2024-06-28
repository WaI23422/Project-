package com.schoolManagement.DTO.SchoolMembers;

import com.schoolManagement.Utils.time.Date;

public class StudentDTO extends SchoolMemberDTO{

    // Constructor:
    public StudentDTO() {super();}
    public StudentDTO(String NAME, String ID, Date BIRTH, Date ENROLLMENT) {
        super(NAME, ID, BIRTH, "Student", ENROLLMENT);
    }
}
