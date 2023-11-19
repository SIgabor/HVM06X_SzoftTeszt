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

        Move('b');
        System.out.println(" " + currentHeadning + currentPosition[0] + currentPosition[1]);

        Turn('r');

    }

    public static String Move(char direction) {

        Task: switch (direction) {

            case 'f':
                switch (currentHeadning) {
                    case 'N':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[0] == 0) {
                            if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                                currentPosition[1] += 4;
                            } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                                currentPosition[1] -= 4;
                            }
                            currentHeadning = 'S';
                        } else {
                            currentPosition[0] -= 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                    case 'S':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[0] == 7) {
                            if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                                currentPosition[1] += 4;
                            } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                                currentPosition[1] -= 4;
                            }
                            currentHeadning = 'N';
                        } else {
                            currentPosition[0] += 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                    case 'E':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[1] == 7) {
                            currentPosition[1] = 0;
                        } else {
                            currentPosition[1] += 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                    case 'W':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[1] == 0) {
                            currentPosition[1] = 7;
                        } else {
                            currentPosition[1] -= 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                }

            case 'b':
                switch (currentHeadning) {
                    case 'N':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[0] == 7) {
                            if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                                currentPosition[1] += 4;
                            } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                                currentPosition[1] -= 4;
                            }
                            currentHeadning = 'S';
                        } else {
                            currentPosition[0] += 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                    case 'S':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[0] == 0) {
                            if (currentPosition[1] >= 0 && currentPosition[1] <= 3) {
                                currentPosition[1] += 4;
                            } else if (currentPosition[1] >= 4 && currentPosition[1] <= 7) {
                                currentPosition[1] -= 4;
                            }
                            currentHeadning = 'N';
                        } else {
                            currentPosition[0] -= 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                    case 'E':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[1] == 0) {
                            currentPosition[1] = 7;
                        } else {
                            currentPosition[1] -= 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;

                    case 'W':
                        previousHeading = currentHeadning;
                        for (int i = 0; i < currentPosition.length; i++) {
                            previousPosition[i] = currentPosition[i];
                        }
                        if (currentPosition[1] == 7) {
                            currentPosition[1] = 0;
                        } else {
                            currentPosition[1] += 1;
                        }
                        if (map[currentPosition[0]][currentPosition[1]] == 1) {
                            currentHeadning = previousHeading;
                            for (int i = 0; i < currentPosition.length; i++) {
                                currentPosition[i] = previousPosition[i];
                            }
                        }

                        break Task;
                }
        }
        return currentHeadning + "" + currentPosition[0] + currentPosition[1];
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

