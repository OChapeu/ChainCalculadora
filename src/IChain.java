public interface IChain {
    void setNextChain(IChain nextChain);
    void calculate (Number request);
}