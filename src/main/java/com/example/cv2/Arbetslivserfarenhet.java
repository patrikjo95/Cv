package com.example.cv2;

import java.util.Scanner;

public class Arbetslivserfarenhet {


    public static String arbetsLivMenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("Välj nedan val för att veta mer:");
        System.out.println("1) Produktionstekniker GKN Aerospace Sweden 2017-2021");
        System.out.println("2) Gästvärd Skistar Åre 2015-2017");
        System.out.println("3) Butiksbiträde Colorama 2014-2015");
        String val = input.nextLine();
        switch (val) {
            case "1":
                System.out.println("* GKN Aerospace Sweden augusti 2017 - augusti 2021");
                System.out.println("* Patrik arbetade som produktionstekniker i Trollhättan med detaljansvar över kompressorspoolar.");
                System.out.println("* Arbetsuppgifterna innefattade förbättringsarbeten inom främst kvalitet både som eget arbete men även större projektarbeten");
                System.out.println("* Patrik var även senior produktionstekniker i ett projektarbete som involverade implementation av en ny produkt i produktionslinan");
            case "2":
                System.out.println("* Skistar Åre december 2015 - Maj 2017");
                System.out.println("* Patrik arbetade som gästvärd i Skistars liftsystem i åre, där arbetade han i olika");
                System.out.println("* liftar med att ta hand om skidåkande gäster samt en del tekniskt liftunderhåll");
            case "3":
                System.out.println("* Colorama Trollhättan 2014-2015");
                System.out.println("* Patrik arbetade som butiksbiträde samt lagerarbetare i färgbutiken Colorama i Trollhättan.");
                System.out.println("* Där hade Patrik bland annat ansvar över leverans och utkörning av indutrifärg till flera bil samt lastbilslackerare runt om i Västra Götaland");
                System.out.println("* Först arbetade Patrik i butiken som timanställd under gymnasietiden och därefter som visstidsanställd");
        }

        return arbetsLivMenu();
    }

}
