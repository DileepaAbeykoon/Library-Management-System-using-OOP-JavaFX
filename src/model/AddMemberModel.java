package model;

public class AddMemberModel {
    private String name;
    private String id;
    private String contact;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    public AddMemberModel(String name, String id, String contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    public AddMemberModel() {
    }

    @Override
    public String toString() {
        return "AddMemberModel [contact=" + contact + ", id=" + id + ", name=" + name + "]";
    }



    
    

    
}
