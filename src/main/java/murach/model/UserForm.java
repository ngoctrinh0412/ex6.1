package murach.model;

import java.io.Serializable;

public class UserForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String dateOfBirth;   // giữ String theo form (yyyy-MM-dd)
    private String heardFrom;
    private boolean wantsUpdates; // <-- boolean để khớp Servlet
    private boolean emailOK;      // <-- boolean
    private String comments;
    private String contactVia;

    public UserForm() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.gender = "";
        this.dateOfBirth = "";
        this.heardFrom = "";
        this.wantsUpdates = false;
        this.emailOK = false;
        this.comments = "";
        this.contactVia = "";
    }

    public UserForm(String firstName, String lastName, String email,
                    String gender, String dateOfBirth, String heardFrom,
                    boolean wantsUpdates, boolean emailOK,
                    String comments, String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.emailOK = emailOK;
        this.comments = comments;
        this.contactVia = contactVia;
    }

    // Getters/Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }

    public boolean isWantsUpdates() { return wantsUpdates; }
    public void setWantsUpdates(boolean wantsUpdates) { this.wantsUpdates = wantsUpdates; }

    public boolean isEmailOK() { return emailOK; }
    public void setEmailOK(boolean emailOK) { this.emailOK = emailOK; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }

    // Helper để hiển thị Yes/No trong JSP (tuỳ chọn)
    public String getWantsUpdatesText() { return wantsUpdates ? "Yes" : "No"; }
    public String getEmailOKText() { return emailOK ? "Yes" : "No"; }
}
