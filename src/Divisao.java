public class Divisao implements IChain {

    @SuppressWarnings("unused")
    private IChain nextInChain;

    @Override
    public void setNextChain(IChain nextChain) {
      nextInChain = nextChain;
    }

    @Override
    public void calculate(Number request) {
      if (request.getCalculationWanted().equalsIgnoreCase("div")) {
        System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() / request.getNumber2()));
      } else {
        System.out.println("Só funciona se utilizar div, som, mult e add!");
      }
    }
  }