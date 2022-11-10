package com.hfab.notetoselfapp_eml;

import java.util.ArrayList;

public class NoteDatabase {

    private static ArrayList<Note> notes;

    public static ArrayList<Note> getNotes()
    {
        if(notes == null)
        {
            loadData();
        }

        return notes;
    }

    public static void loadData()
    {
        notes = new ArrayList<Note>();

        ArrayList<String> titles = new ArrayList<String>();
        titles.add("Finish Lab 8");
        titles.add("Study for Finals");
        titles.add("Write a resume");
        titles.add("Tutor someone");
        titles.add("Hand in resume");
        titles.add("Checking if this program works");
        titles.add("Will I get a job?");
        titles.add("Will Austin finish HW 8?");
        titles.add("Will I finish HW 8?");
        titles.add("Create a time machine");

        ArrayList<String> status = new ArrayList<String>();
        status.add("Idea");
        status.add("Idea");
        status.add("To-Do");
        status.add("To-Do");
        status.add("Important");
        status.add("Idea");
        status.add("Idea");
        status.add("Idea");
        status.add("Important");
        status.add("To-Do");

        ArrayList<String> descriptions = new ArrayList<String>();
        descriptions.add("Dr.Ryan needs a Lab done by Thursday - try to complete it now!");
        descriptions.add("Begins studying for finals.");
        descriptions.add("Begin writing a resume.");
        descriptions.add("Have someone sign up for tutortrac.");
        descriptions.add("Hand resume to companies.");
        descriptions.add("Make sure the program is working.");
        descriptions.add("Maybe I need a job.");
        descriptions.add("I should ask Austin about that!");
        descriptions.add("I've only got one day to try!");
        descriptions.add("Try to create a time machine.");


        for (int i=0; i < titles.size(); i++)
        {
            notes.add(new Note(titles.get(i), status.get(i), descriptions.get(i)));
        }

    }




}
