/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author abayw
 */
public class SearchModel {

    private String serial_no ;
    private String name ;
    private String contact ;
    private String email ;
    private String ol_result ;
    private String al_result;
    private String al_english ;
    private String marks ;
    private String status ;

    public SearchModel() {
    }

    public SearchModel(String serial_no, String name, String contact, String email, String ol_result, String al_result, String al_english, String marks, String status) {
        this.serial_no = serial_no;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.ol_result = ol_result;
        this.al_result = al_result;
        this.al_english = al_english;
        this.marks = marks;
        this.status = status;
    }

    /**
     * @return the serial_no
     */
    public String getSerial_no() {
        return serial_no;
    }

    /**
     * @param serial_no the serial_no to set
     */
    public void setSerial_no(String serial_no) {
        this.serial_no = serial_no;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the ol_result
     */
    public String getOl_result() {
        return ol_result;
    }

    /**
     * @param ol_result the ol_result to set
     */
    public void setOl_result(String ol_result) {
        this.ol_result = ol_result;
    }

    /**
     * @return the al_result
     */
    public String getAl_result() {
        return al_result;
    }

    /**
     * @param al_result the al_result to set
     */
    public void setAl_result(String al_result) {
        this.al_result = al_result;
    }

    /**
     * @return the al_english
     */
    public String getAl_english() {
        return al_english;
    }

    /**
     * @param al_english the al_english to set
     */
    public void setAl_english(String al_english) {
        this.al_english = al_english;
    }

    /**
     * @return the marks
     */
    public String getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(String marks) {
        this.marks = marks;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
