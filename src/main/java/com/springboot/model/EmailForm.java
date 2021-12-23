package com.springboot.model;

public class EmailForm {
    private String addressee;
    private String theme;
    private String message;

    public EmailForm() {}
    public EmailForm(String addressee,String theme, String message){
        this.addressee = addressee;
        this.theme = theme;
        this.message = message;
    }
    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
