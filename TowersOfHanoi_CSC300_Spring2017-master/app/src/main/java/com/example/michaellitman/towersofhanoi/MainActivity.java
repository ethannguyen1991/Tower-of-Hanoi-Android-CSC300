package com.example.michaellitman.towersofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity
{
    private ViewGroup stagingArea; //represents are where popped disk waits for destination
    private ViewGroup tower0; //vertical linear layout - represents far left tower
    private ViewGroup tower1; //vertical linear layout - represents middle tower
    private ViewGroup tower2; //vertical linear layout - represents far right tower

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.stagingArea = (ViewGroup)this.findViewById(R.id.stagingArea);
        this.tower0 = (ViewGroup)this.findViewById(R.id.tower0);
        this.tower1 = (ViewGroup)this.findViewById(R.id.tower1);
        this.tower2 = (ViewGroup)this.findViewById(R.id.tower2);
    }

    public void tower0ButtonPressed(View v)
    {
        System.out.println("*****************Clicked!!!!!");
        if(this.tower0.getChildCount() > 0)
        {
            View temp = this.tower0.getChildAt(0);
            this.tower0.removeViewAt(0);
            this.stagingArea.addView(temp);
        }
        else if(this.tower0.getChildCount() == 0)
        {
            View temp = this.stagingArea.getChildAt(0);
            this.stagingArea.removeViews(0,1);
            this.tower0.addView(temp);

        }

    }
    public void tower1ButtonPressed(View v)
    {
        System.out.println("*****************Clicked!!!!!");
        if(this.tower1.getChildCount() > 0)
        {
            View temp = this.tower1.getChildAt(0);
            this.tower1.removeViewAt(0);
            this.stagingArea.addView(temp);
        }
        else if(this.tower1.getChildCount() == 0)
        {
            View temp = this.stagingArea.getChildAt(0);
            this.stagingArea.removeViews(0,1);
            this.tower1.addView(temp);

        }
    }
    public void tower2ButtonPressed(View v)
    {
        System.out.println("*****************Clicked!!!!!");
        if(this.tower2.getChildCount() > 0)
        {
            View temp = this.tower2.getChildAt(0);
            this.tower2.removeViewAt(0);
            this.stagingArea.addView(temp);
        }
        else if(this.tower2.getChildCount() == 0)
        {
            View temp = this.stagingArea.getChildAt(0);
            this.stagingArea.removeViews(0,1);
            this.tower2.addView(temp);

        }
    }
}
