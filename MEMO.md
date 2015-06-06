##1つめ
### 実際のコード

https://github.com/yu1ro/yu1ro-sezemi-2015-readable-code/blob/master/src/Recipe.java

```Recipe.java

        File recipeFile = new File("data/recipe_data.txt");
        FileReader recipeReader = new FileReader(recipeFile);
        BufferedReader recipeBuff = new BufferedReader(recipeReader);

        String out = recipeBuff.readLine();
        System.out.println(out);
```

### どうしてリーダブルだと思っているかの説明

変数名にrecipeをつけたので、recipeであることがわかるようにした

##2つめ
### 実際のコード

https://github.com/yu1ro/yu1ro-sezemi-2015-readable-code/blob/master/src/Recipe.java

```Recipe.java

        //読み込んだレシピを出力
        String oneRecipe = recipeBuff.readLine();
        while (oneRecipe != null) {
            System.out.println(oneRecipe);
            oneRecipe = recipeBuff.readLine();
        }
        recipeBuff.close();
```

### どうしてリーダブルだと思っているかの説明

Stringの 変数名を"oneRecipe"にして
レシピが一つだけであることがわかるようにした

