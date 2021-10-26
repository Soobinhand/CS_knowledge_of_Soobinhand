package DesignPattern.Practices;

public class Lotto_Main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        SpellCheck spellCheck = new SpellCheck();
        spellCheck.check("점멸");
        lotto.create();
    }
}
