package DesignPattern.Strategy.Ramen;

public class Ramen {
    Recipe recipe = new GeneralRamen();

    public void setRecipe(Recipe recipe){
        this.recipe = recipe;
    }

    public void performCook(){
        recipe.cook();
    }

}
