/*
 *  UCF COP3330 Fall 2021 Pizza Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Pizza
{
    private final int people;
    private final int pizzas;
    private final int slicesPerPizza;

    //user input
    public Pizza()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people? ");
        this.people = scan.nextInt();

        if(this.people != 0)
        {
            System.out.print("How many pizzas do you have? ");
            this.pizzas = scan.nextInt();

            System.out.print("How many slices per pizza? ");
            this.slicesPerPizza = scan.nextInt();
        }

        //if there are no people at the party, then there are no pizzas
        else
        {
            this.pizzas = 0;
            this.slicesPerPizza = 0;
        }

    }

    public void DividePizzas()
    {
        //if theres one person
        if(this.people == 1)
        {
            System.out.println(this.people+" person with "+this.pizzas+" pizzas ("+(this.pizzas * this.slicesPerPizza)+" slices)");
        }

        //if there is no one
        else if(this.people == 0)
        {
            System.out.print("There are no people at this pizza party!");
        }

        //multiple people at the party
        else
        {
            System.out.println(this.people+" people with "+this.pizzas+" pizzas ("+(this.pizzas * this.slicesPerPizza)+" slices)");
        }

    }

    public void Leftovers()
    {
        int totalSlices = this.pizzas * this.slicesPerPizza;
        
        //if there is no one at the party, there are no leftovers
        if(this.people == 0)
        {
            return;
        }
        
        else if(this.people == 1)
        {
            System.out.println("The one person gets " +(totalSlices/this.people)+ " slices of pizza.");
        }

        //if there is more than 1 person at the party
        else if(this.people > 1)
        {
            System.out.println("Each person gets " +(totalSlices/this.people)+ " slices of pizza.");
        }

        //if each person gets one slice
        if(totalSlices/this.people == 1)
        {
            System.out.println("Each person gets 1 slice of pizza.");
        }

        //if there is one leftover slice
        if(totalSlices % this.people == 1)
        {
            System.out.print("There is 1 leftover piece.");
        }

        //multiple slices leftover
        else
        {
            System.out.print("There are "+(totalSlices % this.people)+" leftover pieces.");
        }
    }

}
