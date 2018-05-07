
/**
 * Graph.
 */

public class Graph
{
    //Attribute
    private Knoten[] knotenliste;
    private int maxAnzahl;
    private int anzahl;

    private boolean[][] adjazenzmatrix;

    //Konstruktor
    public Graph(int maxAnzahl_)
    {
       // Hier ist etwas zu tun!
    }

    //Methoden
    /**
     * Erzeugt einen neuen Knoten mit dem übergebenen Inhalt 
     * und fügt ihn in die Knotenliste ein
     */
    public void  knotenEinfuegen(Mitglied mitglied)
    {

        // Hier ist etwas zu tung       
    }

    /**
     * Sucht nach einem Knoten mit dem Inhalt mitglied in der Knotenliste
     * und gibt dessen Index zurück
     */
    public int knotennummerGeben(Mitglied mitglied)
    {
        for (int i = 0; i < anzahl; i++)
        {
            if (mitglied == knotenliste[i].getInhalt())
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * Gibt die Knotenliste auf der Konsole aus
     */
    public void knotenlisteAusgeben()
    {

        System.out.println("---- Knotenliste ----");
        for (int i = 0; i < anzahl; i++)
        {
            Mitglied m = knotenliste[i].getInhalt();
            System.out.print("Knoten " + i + ": ");
            m.ausgeben();
        }
        System.out.println();
    }

    /**
     * Gibt die Adjazenzmatrix auf der Konsole aus.
     */
    public void adjazenzMatrixAusgeben()
    { 
        String a = "  ";

        for (int i = 0; i < anzahl; i++)
        { 
            a = a + i + " ";
        }
        a = a +"\n";
        for (int i = 0; i < anzahl;i++)
        {
            a = a + i + " ";
            for (int j = 0; j < anzahl; j++) 
            {

                if (adjazenzmatrix[i][j])
                {
                    a = a + "x ";
                }
                else
                {
                    a = a + "o ";
                }

            }
            a = a + "\n";
        }
        System.out.println(a);
    }

    /**
     * Fügt eine Kante zwischen den Knoten mit den Inhalten bez1 und bez2 ein.
     */

    public void kanteEinfuegen(Mitglied bez1, Mitglied bez2)
    {
        // Hier ist etwas zu tun
    }

    /**
     * methode1
     */   
    public int methode1(Mitglied m)
    {

        return 0; // muss geändert werden!    

    }

    public void freundeVonFreunden(Mitglied m)
    {
      // Auch hier ist etwas zu tun!
    }

}
