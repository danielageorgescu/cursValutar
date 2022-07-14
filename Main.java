package com.itfactory;

import com.itfactory.CursValutar.CursValutar;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alegeti una din variantele de mai jos: ");
        System.out.println("1. Introduceti suma in RON pe care doriti sa o schimbati si moneda in care se  schimba.");
        System.out.println("2. Schimbati cursul unei monezi");
        System.out.println("3. Tranzactie incheiata.");
        int variantaAleasa = Integer.parseInt(scanner.nextLine());

        if (variantaAleasa <= 3)
        {
            switch (variantaAleasa)
            {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Introduceti suma in Ron pe care doriti sa o schimbati: ");
                    double sumaRonDeSchimbat = Double.parseDouble(scanner1.nextLine());
                    CursValutar RON = new CursValutar(sumaRonDeSchimbat);
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Optiunile de schimb valutar sunt pentru Eur, Usd si GBP");
                    System.out.println("Introduceti moneda in care se doreste sa fie schimbata suma: ");
                    String monedaDeSchimb = scanner2.nextLine();


                    if (!(monedaDeSchimb.equalsIgnoreCase("Ron")) && (monedaDeSchimb.equalsIgnoreCase("Eur") || monedaDeSchimb.equalsIgnoreCase("Usd") || monedaDeSchimb.equalsIgnoreCase("GBP")))
                    {
                        switch (monedaDeSchimb.toUpperCase())
                        {
                            case "EUR":
                                System.out.println("Suma rezultata este: " + sumaRonDeSchimbat * RON.cursRonEur() + " Eur");

                                break;
                            case "USD":
                                System.out.println("Suma rezultata este: " + sumaRonDeSchimbat * RON.cursRonUsd() + " Usd");

                                break;
                            case "GBP":
                                System.out.println("Suma rezultata este: " + sumaRonDeSchimbat * RON.cursRonGbp() + " GBP");

                                break;
                            default:
                                System.out.println("Moneda scrisa gresit.");
                        }

                    } else
                    {
                        System.out.println("Moneda gresita.");
                    }
                    break;
                case 2:
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.println("Optiunile de schimb valutar sunt pentru Ron, Eur, Usd si GBP");
                    System.out.println("Introduceti moneda din care doriti sa schimbati: ");
                    String monedaInitiala = scanner3.nextLine();
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.println("Introduceti suma pe care doriti sa o schimbati: ");
                    double sumaDeSchimbat = Double.parseDouble(scanner4.nextLine());
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.println("Introduceti moneda in care se doreste sa fie schimbata suma: ");
                    String monedaFinala = scanner5.nextLine();
                    CursValutar RON1 = new CursValutar(sumaDeSchimbat);

                    if (monedaInitiala.equalsIgnoreCase("Ron"))
                    {
                        switch (monedaFinala.toUpperCase())
                        {
                            case "EUR":
                                System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursRonEur() + " Eur");
                                break;
                            case "USD":
                                System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursRonUsd() + " Usd");
                                break;
                            case "GBP":
                                System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursRonGbp() + " GBP");
                                break;
                        }
                    }
                    if (monedaInitiala.equalsIgnoreCase("Eur"))
                    {
                         switch (monedaFinala.toUpperCase())
                         {
                              case "RON":
                                  System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursEurRon() + " Ron");
                                  break;
                              case "USD":
                                  System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursEurUsd() + " Usd");
                                  break;
                              case "GBP":
                                  System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursEurGbp() + " GBP");
                                  break;
                         }
                    }
                    if (monedaInitiala.equalsIgnoreCase("Usd"))
                    {
                         switch (monedaFinala.toUpperCase())
                         {
                             case "RON":
                                 System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursUsdRon() + " Ron");
                                 break;
                             case "EUR":
                                 System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursUsdEur() + " Eur");
                                 break;
                             case "GBP":
                                 System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursUsdGbp() + " GBP");
                                 break;
                         }
                    }
                    if ( monedaInitiala.equalsIgnoreCase("Gbp"))
                    {
                        switch (monedaFinala.toUpperCase())
                        {
                            case "RON":
                                System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursGbpRon() + " Ron");
                                break;
                            case "EUR":
                                System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursGbpEur() + " Eur");
                                break;
                            case "USD":
                                System.out.println("Suma rezultata este: " + sumaDeSchimbat * RON1.cursGbpUsd() + " Usd");
                                break;
                        }
                    }

                case 3:
                    System.out.println("Program inchis");
                    System.exit(0);
                    break;
                 default:
                    System.out.println("Varianta gresita. Incercati din nou.");
            }
       } else
       {
                System.out.println("Varianta gresita. Incercati din nou.");
       }
    }
}

