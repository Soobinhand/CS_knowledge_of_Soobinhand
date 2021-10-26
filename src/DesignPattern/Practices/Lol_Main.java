package DesignPattern.Practices;

public class Lol_Main {
    public static void main(String[] args) {
        Lol lol = new Lol("가렌");
        Lol lol1 = new Lol("케이틀린");
        SpellCheck spellCheck = new SpellCheck();
        spellCheck.check("점멸");

    }
}
