package Lab3P1;

public class Punct extends Parabola{
    protected int x;
    protected int y;
    public Punct(int x, int y){
        super();
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "x: "+x+"  y=" +y;
    }
    public Punct() {
        }
        public static Punct Mijloc(Parabola a1, Parabola a2)
        {
            Punct p1= new Punct();
            Punct p2= new Punct();
            p1=a1.Varfuri(a1);
            p2=a2.Varfuri(a2);

            int x,y;
            x=(p1.x+p2.x)/2;
            y=(p1.y+p2.y)/2;
            Punct p = new Punct(x,y);
            String s = p.toString();
            System.out.println(s);
            return p;
        }

}
