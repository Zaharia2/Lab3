package Lab3P1;

import javax.lang.model.type.ArrayType;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static Lab3P1.Parabola.Lungime2;
import static Lab3P1.Punct.Mijloc;

public class Ex1 {
    public static void main(String[] args) throws IOException {
    Parabola a1 = new Parabola(1, 2,3 );
    Parabola a2 = new Parabola(4,5,6);
    Punct p = new Punct();
    p= Mijloc(a1,a2);
    p=a1.Coordonate(a2);
    System.out.println("rezultat: "+a1.Lungime(a2));
    System.out.println("rezultat2: "+ Lungime2(a1,a2));

    List<Parabola> listaParabole = new ArrayList<Parabola>();
    Scanner fileReader = new Scanner(new File("C:\\Users\\roste\\Desktop\\Lab3\\Laborator3\\in.txt"));
    int a,b,c;
    while (fileReader.hasNext())
    {
        String line;
        line = fileReader.nextLine();

        String[] subline = line.split(",");
        //for (String s : subline)
        //    System.out.println(s + "\n");
        a=Integer.parseInt(subline[0]);
        b=Integer.parseInt(subline[1]);
        c=Integer.parseInt(subline[2]);

        listaParabole.add(new Parabola(a,b,c));
    }

    for (Parabola x : listaParabole)
        System.out.println(x);

    p= Mijloc(listaParabole.get(0),listaParabole.get(1));
    p= listaParabole.get(0).Coordonate(listaParabole.get(1));

        System.out.println("rezultat: "+listaParabole.get(0).Lungime(listaParabole.get(1)));
        System.out.println("rezultat2: "+ Lungime2(listaParabole.get(0),listaParabole.get(1)));
 }
}
