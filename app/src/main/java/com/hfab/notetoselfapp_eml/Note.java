package com.hfab.notetoselfapp_eml;

public class Note {

    private String title;
    private String status;
    private String description;

    public Note(String t, String s, String desc)
    {
        title = t;
        status = s;
        description = desc;
    }


    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
