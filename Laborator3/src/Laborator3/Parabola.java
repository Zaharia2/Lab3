package Lab3P1;

import java.io.*;
import java.util.List;

public class Parabola {

    protected int a;
    protected int b;
    protected int c;
    public Parabola(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Parabola(){}

    public String toString()
    {
        String s = a + "x^2 + " + b + "x + " + c;
        return s;
    }

    public Punct Varfuri(Parabola a1)
    {
        int x1,y1;
        x1=-a1.b/2*a1.a;
        y1=-(a1.b*a1.b + 4*a1.a*a1.c)/4*a1.a;
        Punct v= new Punct(x1,y1);
        return v;
    }

    public Punct Coordonate(Parabola a1)
    {
        Punct p1= new Punct();
        Punct p2=new Punct();

        p1=a1.Varfuri(a1);
        p2=this.Varfuri(this);
        int x,y;
        x=(p1.x+p2.x)/2;
        y=(p1.y+p2.y)/2;
        Punct p = new Punct(x,y);
        String s = p.toString();
        System.out.println(s);
        return p;
    }

    public double Lungime(Parabola a1)
    {
     Punct p1 = this.Varfuri(this);
     Punct p2 = a1.Varfuri(a1);
     int x = p2.x-p1.x;
     int y = p2.y-p1.y;
     return Math.hypot(x,y);
    }

    public static double Lungime2(Parabola a1,Parabola a2)
    {
        Punct p1 = a1.Varfuri(a1);
        Punct p2 = a2.Varfuri(a2);
        int x = p2.x-p1.x;
        int y = p2.y-p1.y;
        return Math.hypot(x,y);
    }

    public static void LoadList(List<Parabola> l) throws IOException {
        String f_in="in.txt";
        FileReader f_reader= new FileReader(f_in);
        BufferedReader reader = new BufferedReader(f_reader);
        String line;
    while ((line=reader.readLine())!= null)
    {
        int a,b,c;

    }
    }

}
