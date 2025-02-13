///it23017

interface Alpha
{
    void methodA();
    void methodB();
}

-----------------------------------------------------

interface Beta
{
    void methodD();
    void methodE();
}

------------------------------------------------------

abstract class AbstractBase implements Alpha
{
    public abstract void methodC();
}

-----------------------------------------------------

class BetaHelper implements Beta
{
    public void methodD()
  {
    
  }
    public void methodE()
  {
    
  }
}

-----------------------------------------------------

class FinalClass extends AbstractBase
{
    @Override
    public void methodA()
  {
    
  }
    @Override
    public void methodB()
  {
    
  }
    @Override
    public void methodC()
  {
    
  }
  
    public void methodD()
  {
    
  }
    public void methodE()
  {
    
  }
}
