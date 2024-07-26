public class Main {
public static void main(String[] args) {

    IChain chainCalc1 = new Adicao();
    IChain chainCalc2 = new Subtracao();
    IChain chainCalc3 = new Multiplicacao();
    IChain chainCalc4 = new Divisao();

    chainCalc1.setNextChain(chainCalc2);
    chainCalc2.setNextChain(chainCalc3);
    chainCalc3.setNextChain(chainCalc4);

    Number request = new Number(6, 3,"div");
    System.out.println("Div: ");
    chainCalc1.calculate(request);

    Number request2 = new Number(9, 2,"add");
    System.out.println("Add: ");
    chainCalc1.calculate(request2);

    Number request3 = new Number(2, 9,"sub");
    System.out.println("Sub: ");
    chainCalc1.calculate(request3);
    
    Number request4 = new Number(4, 7,"mult");
    System.out.println("Sub: ");
    chainCalc1.calculate(request4);

    Number request5 = new Number(2, 3,"teste");
    System.out.println("Teste: ");
    chainCalc1.calculate(request5);
} 
}
