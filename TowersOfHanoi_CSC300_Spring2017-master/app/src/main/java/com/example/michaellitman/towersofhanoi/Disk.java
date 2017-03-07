package com.example.michaellitman.towersofhanoi;

/**
 * Created by VanNguyen on 3/6/17.
 */

public class Disk
{
    private int size;
    private String display;
    private Disk nextDisk;

    public Disk(int size)
    {
        this.size = size;
        this.nextDisk = null;
        this.display = "";
        for(int i = 0; i < size; i++)
        {
            this.display = this.display + "=";
        }
    }

    public Disk getNextDisk()
    {
        return nextDisk;
    }

    public void setNextDisk(Disk nextDisk)
    {
        this.nextDisk = nextDisk;
    }

    public int getSize()
    {
        return size;
    }

    public void display()
    {
        System.out.println(display);
    }

}
