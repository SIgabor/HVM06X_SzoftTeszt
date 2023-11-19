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

    
    public static char Turn(char direction) {

        if (direction == 'r') {

            switch (currentHeadning) {
                case 'N':
                    currentHeadning = 'E';
                    break;

                case 'E':
                    currentHeadning = 'S';
                    break;

                case 'S':
                    currentHeadning = 'W';
                    break;

                case 'W':
                    currentHeadning = 'N';
                    break;
            }
        }

        if (direction == 'l') {

            switch (currentHeadning) {
                case 'N':
                    currentHeadning = 'W';
                    break;

                case 'E':
                    currentHeadning = 'N';
                    break;

                case 'S':
                    currentHeadning = 'E';
                    break;

                case 'W':
                    currentHeadning = 'S';
                    break;
            }
        }
        return currentHeadning;
    }
}

