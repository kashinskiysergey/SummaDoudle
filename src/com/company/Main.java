package com.company;

public class Main {

    public static void main(String[] args) {
        double D = 8.17d;
        int n = (int) (D * 100);
        int First = (int) (D % 10);
        System.out.println(First);

        int Second = (int) ((D*10) % 10);
        System.out.println(Second);

        int Third = (int) ((D*100) % 10);
        System.out.println(Third);

        int Summa = (First + Second + Third);
        System.out.println("Summa All = " + Summa);




                                if (First > Second && First > Third) {
                                    System.out.println("Max = " + First);
                                }
                                else if (Second > First && Second > Third) {
                                    System.out.println("Max = " + Second);
                                }

                                else if (Third > First && Third > Second) {
                                    System.out.println("Max = " + Third);
                                }





                                                    if (First < Second && First < Third) {
                                                        System.out.println("Min = " + First);
                                                    }
                                                    else if (Second < First && Second < Third) {
                                                        System.out.println("Min = " + Second);
                                                    }

                                                    else if (Third < First && Third < Second) {
                                                        System.out.println("Min = " + Third);
                                                    }


    }
    }

