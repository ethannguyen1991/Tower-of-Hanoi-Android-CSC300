package com.example.michaellitman.towersofhanoi;

/**
 * Created by VanNguyen on 3/6/17.
 */

public class Tower {
    private Disk top;
    private int count;

    public Tower()
    {
        this.top = null;
        this.count = 0;
    }

    public void display()
    {
        Disk currDisk = this.top;
        while(currDisk != null)
        {
            currDisk.display();
            currDisk = currDisk.getNextDisk();
        }
        System.out.println("____________");
    }

    public Disk pop()
    {
        Disk diskToReturn = this.top;
        if(this.top != null)
        {
            this.top = this.top.getNextDisk();
            this.count--;
        }
        diskToReturn.setNextDisk(null);
        return diskToReturn;
    }

    public int getCount()
    {
        return count;
    }

    public boolean push(Disk d)
    {
        if(this.top == null)
        {
            this.top = d;
            this.count++;
            return true;
        }
        else
        {
            if(this.top.getSize() > d.getSize())
            {
                d.setNextDisk(this.top);
                this.top = d;
                this.count++;
                return true;
            }
            else
            {
                return false;
            }
        }

    }

}
