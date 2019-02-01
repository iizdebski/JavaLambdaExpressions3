package com.izdebski;

import java.io.IOException;

public class LambdaExamples2 {

    static String thirdText = "Hey, un troisième texte";

    private  String fourthText = "quatrième texte";

    public void doIt(){

        final  String otherText = "Salut tous le monde: ";

        MyInterface myInterface = (text) -> {
            System.out.println(otherText + text + " " + fourthText + thirdText);
        };

        myInterface.printIt("ABC");

        fourthText = "Blablabla";

        myInterface.printIt("ABC");
    }

    public static void main(String[] args) throws IOException {
        LambdaExamples2 instance = new LambdaExamples2();
        instance.doIt();
    }
}