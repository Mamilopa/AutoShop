
package org.packt.primeautosales.entity;

public class User {

private String first;
private String last;
private int age;
private String email;
private boolean newsletter;
private boolean enableNotifications;
private boolean emailNotifications;

    /**
     * @return the first
     */
    public String getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public String getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
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
     * @return the newsletter
     */
    public boolean isNewsletter() {
        return newsletter;
    }

    /**
     * @param newsletter the newsletter to set
     */
    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    /**
     * @return the enableNotifications
     */
    public boolean isEnableNotifications() {
        return enableNotifications;
    }

    /**
     * @param enableNotifications the enableNotifications to set
     */
    public void setEnableNotifications(boolean enableNotifications) {
        this.enableNotifications = enableNotifications;
    }

    /**
     * @return the emailNotifications
     */
    public boolean isEmailNotifications() {
        return emailNotifications;
    }

    /**
     * @param emailNotifications the emailNotifications to set
     */
    public void setEmailNotifications(boolean emailNotifications) {
        this.emailNotifications = emailNotifications;
    }
    
}
