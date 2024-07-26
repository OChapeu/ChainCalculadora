
public class Adicao implements IChain {

    private IChain nextInChain;

    @Override
    public void setNextChain(IChain nextChain) {

    nextInChain = nextChain;
    }

    @Override
    public void calculate(Number request) {
      if (request.getCalculationWanted().equalsIgnoreCase("add")) {
        System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
      } else {
        nextInChain.calculate(request);
        }
      }
    }

