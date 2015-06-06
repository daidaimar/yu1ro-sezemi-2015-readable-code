import java.io.*;

public class Recipe {
    public static void main(String args[]) throws IOException {
        //ファイル読み込み
        File recipeFile = new File("data/recipe_data.txt");
        FileReader recipeReader = new FileReader(recipeFile);
        BufferedReader recipeBuff = new BufferedReader(recipeReader);

        String out = recipeBuff.readLine();
        System.out.println(out);
    }
}
