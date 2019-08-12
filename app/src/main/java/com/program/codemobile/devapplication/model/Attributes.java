package com.program.codemobile.devapplication.model;

public class Attributes
{
    private String usage;

    private String displayable;

    private String name;

    private String value;

    public String getUsage ()
    {
        return usage;
    }

    public void setUsage (String usage)
    {
        this.usage = usage;
    }

    public String getDisplayable ()
    {
        return displayable;
    }

    public void setDisplayable (String displayable)
    {
        this.displayable = displayable;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [usage = "+usage+", displayable = "+displayable+", name = "+name+", value = "+value+"]";
    }
}