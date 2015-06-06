import java.io.*;

public class Recipe {
    public static void main(String args[]) throws IOException {
        //ファイル読み込み
        File recipeFile = new File("data/recipe_data.txt");
        FileReader recipeReader = new FileReader(recipeFile);
        BufferedReader recipeBuff = new BufferedReader(recipeReader);

        //読み込んだレシピを出力
        String oneRecipe = recipeBuff.readLine();
        while (oneRecipe != null) {
            System.out.println(oneRecipe);
            oneRecipe = recipeBuff.readLine();
        }
        recipeBuff.close();
    }
}
