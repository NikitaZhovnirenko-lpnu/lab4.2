package com.company;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Уведіть значення х-початкове: ");
            double xStart = sc.nextDouble();

            System.out.println("Уведіть значення Х-кінцеве: ");
            double xEnd = sc.nextDouble();

            System.out.println("Уведіть значення кроку: ");
            double xStep = sc.nextDouble();

            double y;

            while (xStart <= xEnd){
                if(xStart < 1) {
                y = (1 / Math.abs(xStart + 2) + 1) - 7 * Math.pow(xStart, 2) + xStart - 8;
            }

                else if(xStart > 4) {
                y = (1 / Math.abs(xStart + 2) + 1) - Math.sqrt(1 + Math.pow(Math.cos(xStart), 3));
            }

                else
            {
                y = (1 / Math.abs(xStart + 2) + 1) - (Math.cos((xStart + 4) / Math.sqrt(11)) / Math.sin((xStart + 4) / Math.sqrt(11))) + 3;
            }




                System.out.println("Значення Y:"+ y +" при значенні xStart: " + xStart);
                xStart += xStep;
            }



        }
    }


