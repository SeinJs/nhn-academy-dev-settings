public class DiceMain {
    public static void main(String[] args) {
        Dice first = new Dice(6);
        Dice second = new Dice(2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(first, second));
        assert DiceCalculator.addDice(first, second) == 8;
        
        System.out.println("주사위 차 = " + DiceCalculator.subDice(first, second));
        assert DiceCalculator.subDice(first, second) == 4;
        
        System.out.println("주사위 곱 = " + DiceCalculator.mulDice(first, second));
        assert DiceCalculator.mulDice(first, second) == 12;
        
        System.out.println("주사위 몫 = " + DiceCalculator.divDice(first, second));
        assert DiceCalculator.divDice(first, second) == 3;
        
        
        int random = (int) ((Math.random() * (6 - 1)) + 1);

        Dice dice = new Dice(random);

        System.out.println("주사위 눈(" + dice.getNumber() + ")이 홀수인가?? : " + DiceCalculator.isOdd(dice));
        System.out.println("주사위 눈(" + dice.getNumber() + ")이 짝수인가?? : " + DiceCalculator.isEven(dice));
    }
}