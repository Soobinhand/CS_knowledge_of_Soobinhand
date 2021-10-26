package DesignPattern.Practices;

public class Lol implements Loll{
    private String champ;
    public Lol(){}
    public Lol(String champ){
        this.champ = champ;
        if (champ.equals("가렌")){
            System.out.println(champ + " 를 고르셨습니다.");
            System.out.println("이 챔프는 너무 강합니다.");
        }else{
            System.out.println(champ+"를 고르셨습니다.");
        }


    }


    @Override
    public void op() {
    }
}
