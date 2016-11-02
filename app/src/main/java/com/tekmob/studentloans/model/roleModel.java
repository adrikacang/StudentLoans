package com.tekmob.studentloans.model;

/**
 * Created by Asus on 10/28/2016.
 */
public class RoleModel {

    boolean isAdmin;
    boolean isStudent;

    public RoleModel() {

    }

    public RoleModel(boolean isAdmin, boolean isUser) {
        this.isAdmin = isAdmin;
        this.isStudent = isUser;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean user) {
        isStudent = user;
    }
}
