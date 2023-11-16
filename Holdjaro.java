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

    private static int currentPosition[] = {5, 1};
    private static char currentHeadning  = 'E';
    private static int previousPosition[] = {0, 0};  // átmeneti pozíció tárolás, ha akadály van az új pozíción akkor visszaállítás
    private static char previousHeading = 'X';  // átmeneti heading tárolás, ha akadály van az új pozíción akkor visszaállítás

    public static void main(String args[]) {

        DrawMatrix();

        Move('f');
        System.out.println(" " + currentHeadning + currentPosition[0] + currentPosition[1]);
        DrawMatrix();

        
        Turn('r');

        

    }

    private static void DrawMatrix(){
        int helper;
        helper = map[currentPosition[0]][currentPosition[1]];
        map[currentPosition[0]][currentPosition[1]] = 8;
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");
        map[currentPosition[0]][currentPosition[1]] = helper;
    }

    private static void Move(char direction){

        switch (direction) {
            case 'f':
            switch (currentHeadning) {
                case 'N':

                    previousHeading = currentHeadning;
                    for(int i = 0; i < currentPosition.length; i++){
                        previousPosition[i] = currentPosition[i];
                    }
                    if(currentPosition[0] == 0){
                        if(currentPosition[1] >= 0 && currentPosition[1] <= 3){
                            currentPosition[1] += 4;
                        }else if(currentPosition[1] >= 4 && currentPosition[1] <= 7){
                            currentPosition[1] -= 4;
                        }
                        currentHeadning = 'S';
                    }else{
                        currentPosition[0] -= 1;
                    }
                    if(map[currentPosition[0]][currentPosition[1]] == 1){
                        currentHeadning = previousHeading;
                        for(int i = 0; i < currentPosition.length; i++){
                        currentPosition[i] = previousPosition[i];
                        }
                    }
                    
                    break;

                case 'S':

                    if(currentPosition[0] == 7){
                        if(currentPosition[1] >= 0 && currentPosition[1] <= 3){
                            currentPosition[1] += 4;
                        }else if(currentPosition[1] >= 4 && currentPosition[1] <= 7){
                            currentPosition[1] -= 4;
                        }
                        currentHeadning = 'N';
                    }else{
                        currentPosition[0] += 1;
                    }

                    break;

                case 'E':
                    
                    if(currentPosition[1] == 7){
                        currentPosition[1] = 0;
                    }else{
                        currentPosition[1] += 1;
                    }

                    break;

                case 'W':

                    if(currentPosition[1] == 0){
                        currentPosition[1] = 7;
                    }else{
                        currentPosition[1] -= 1;
                    }
                    
                    break;
            
            }    
            
            
            case 'b':
            switch (currentHeadning) {
                case 'N':

                    if(currentPosition[0] == 7){
                        if(currentPosition[1] >= 0 && currentPosition[1] <= 3){
                            currentPosition[1] += 4;
                        }else if(currentPosition[1] >= 4 && currentPosition[1] <= 7){
                            currentPosition[1] -= 4;
                        }
                        currentHeadning = 'S';
                    }else{
                        currentPosition[0] += 1;
                    }
                    
                    break;

                case 'S':

                    if(currentPosition[0] == 0){
                        if(currentPosition[1] >= 0 && currentPosition[1] <= 3){
                            currentPosition[1] += 4;
                        }else if(currentPosition[1] >= 4 && currentPosition[1] <= 7){
                            currentPosition[1] -= 4;
                        }
                        currentHeadning = 'N';
                    }else{
                        currentPosition[0] -= 1;
                    }
                    
                    break;

                case 'E':

                    if(currentPosition[1] == 0){
                        currentPosition[1] = 7;
                    }else{
                        currentPosition[1] -= 1;
                    }
                    
                    break;

                case 'W':

                    if(currentPosition[1] == 7){
                        currentPosition[1] = 0;
                    }else{
                        currentPosition[1] += 1;
                    }

                    
                    break;
            
            }    
            

            
        }

    }

    

    private static void Turn(char direction) {

        if (direction == 'r') {

            switch (currentHeadning) {
                case 'N':
                    currentHeadning = 'E';
                    break;

                case 'E':
                    currentHeadning = 'S';
                    break;

                case 'S':
                    currentHeadning= 'W';
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

    }

}
