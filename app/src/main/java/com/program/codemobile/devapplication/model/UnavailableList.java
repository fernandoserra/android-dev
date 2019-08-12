package com.program.codemobile.devapplication.model;

public class UnavailableList
{
    private String blacklist;

    public String getBlacklist ()
    {
        return blacklist;
    }

    public void setBlacklist (String blacklist)
    {
        this.blacklist = blacklist;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [blacklist = "+blacklist+"]";
    }
}
