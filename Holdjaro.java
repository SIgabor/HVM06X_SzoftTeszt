public class Holdjaro {

    private static int map[][] = {
            { 0, 0, 0, 1, 1, 0, 0, 1 },
            { 0, 1, 0, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0 },
            { 0, 1, 0, 1, 0, 0, 0, 0 },
            { 0, 1, 0, 0, 0, 0, 0, 0 }
    };

    private static int currentPosition[] = { 3, 3 };
    private static char currentHeadning = 'N';
    private static int previousPosition[] = { -1, -1 }; // átmeneti pozíció tárolás, ha akadály van az új pozíción akkor
    // visszaállítás
    private static char previousHeading; // átmeneti heading tárolás, ha akadály van az új pozíción akkor visszaállítás

    public static void main(String args[]) {

    }

    
   
}
