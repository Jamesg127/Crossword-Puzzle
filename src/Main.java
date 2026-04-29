import java.io.File;
import java.io.IOException;
import java.util.Scanner;
void main()throws IOException {
    File file = new File("CrosswordWords");
    Scanner scan = new Scanner(file);
    String[] arr = new String[100];
    int i = 0;
    while (scan.hasNextLine()) {
        arr[i] = scan.nextLine();
        i++;
    }
    String[] newArr = new String[arr.length];
    newArr = arr;
    CrosswordPuzzleGenerator.gridify(newArr);
}


