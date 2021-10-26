package DesignPattern.Practices;

public class SpellCheck {
    private String spell;
    public void check(String spell){
        this.spell = spell;
        System.out.println(spell +"이 있습니다.");
        System.out.println();
    }
}
