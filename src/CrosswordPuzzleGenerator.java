public class CrosswordPuzzleGenerator {
    private String[][] cw = new String[20][20];
    public void gridify(String[] arr){
        if(cw == null){
            for (int i = 0; i < arr[0].length() - 1; i++) {
                cw[cw.length / 2][i] = arr[0].substring(i, i + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < cw.length; i++) {
            for (int j = 0; j < cw[i].length; j++) {
                for(int k = 0; k < arr.length; k++){
                    for(int l = 0; l < arr[k].length(); l++){
                        count++;
                        if(cw[i][j].equals(arr[k].substring(l, l + 1))){
                            String temp = arr[k].substring(l, l + 1);
                            String tempArrary = arr[k].substring(0, arr[k].indexOf(temp));
                            for(int p = 1; p < count; p++){
                                if(cw[i - p][j] == null){
                                    cw[i - p][j] = arr[k].substring( count - p, count - p + 1);
                                }
                            }
                            for(int p = 1; p < count; p++){

                            }
                            for(int p = 1; p < count; p++){
                                if(cw[i][j - p] == null){

                                }
                            }
                            for(int p = 1; p < count; p++){
                                if(cw[i][j + p] == null){

                                }
                            }
                        }
                        count = 0;
                    }

                }
            }
        }
    }
}
