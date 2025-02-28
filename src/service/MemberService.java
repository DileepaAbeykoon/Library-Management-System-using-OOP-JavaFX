package service;

import model.AddMemberModel;

public class MemberService {
    private AddMemberModel[] members = new AddMemberModel[100]; 
    private int index = 0;  

    public void addMember(AddMemberModel newMember) {
        if (index < members.length) {
            members[index] = newMember;
            index++;  
            System.out.println("Member added successfully!");
        } else {
            System.out.println("Member list is full!");
        }
    }

    public void printSavedMembers() {
        System.out.println("Saved Members:");
        for (int i = 0; i < index; i++) {
            System.out.println(members[i]);
        }
    }
}
