package com.example.eladm96.randomvalidationcodeactivity;

import java.util.Random;

/**
 * Created by EladM96 on 08/07/2017.
 */

public class ValidationCode
{

    private int i;               //control variable
    private final int SIZE = 4;  //constant array size
    private int codeArray[];     //array of 4 digits
    private String code = "";    //the code itself
    private Random rnd;

    //build function
    public ValidationCode()
    {
        //build for new array
        codeArray = new int[SIZE];
        //new object from Random
        rnd = new Random();
    }

    //setting the array of the 4 digits
    public void setCode()
    {
        for (i = 0; i < SIZE; i++)
        {
            codeArray[i] = rnd.nextInt(10);
            code = code + codeArray[i];
        }
    }

    //getting the code
    public String getCode()
    {
        return code;
    }

}
