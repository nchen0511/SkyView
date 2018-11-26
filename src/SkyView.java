public class SkyView {
    double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int count = 0;
        for (int i=0;i<view.length;i++){
            if(i%2==0){
                for(int j=0;j<view[i].length;j++){
                    view[i][j] = scanned[count];
                    count++;
                }
            } else {
                for(int j=view[i].length-1;j>=0;j--){
                    view[i][j] = scanned[count];
                    count++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double avg = 0;
        int num = 0;
        for(int i = startRow;i<endRow+1;i++){
            for (int j=startCol;j<endCol+1;j++){
                avg+=view[i][j];
                num++;
            }
        }
        return (avg/num);
    }

    public String toString(){
        String temp = "";
        for(int i=0;i<view.length;i++){
            for(int j=0;j<view[i].length;j++){
                temp+=view[i][j] + " ";
            }
            temp+="\n";
        }
        return temp;
    }
}
