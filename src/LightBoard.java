public class LightBoard {
    private boolean[][] lights;

    public LightBoard (int numRows, int numCol){

    }

    public boolean evaluateLight (int row, int col){
        int count = 0;
       for (int i = 0; i < lights.length; i ++){
           if (lights[row][col] == true){
               count++;
           }
       }
       if (lights[row][col] == true && count%2 == 0){
           return false;
       }
       if (lights[row][col] == false && count%3 == 0){
           return true;
       }
       return lights[row][col];
    }
}
