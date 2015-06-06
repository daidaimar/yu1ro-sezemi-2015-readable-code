import java.io.*;

public class Recipe {
    public static void main(String args[]) throws IOException {
        //ファイル読み込み
        File recipe_file = new File("data/recipe_data.txt");
        FileReader recipe_reader = new FileReader(recipe_file);
        BufferedReader recipe_buff = new BufferedReader(recipe_reader);

        String str = recipe_buff.readLine();
        System.out.println(str);
    }
}
