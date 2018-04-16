/**
 * @author Wataru Takahashi
 * returns double value based on exp distro
 */
public class rv {

  private double seed = 1111.0;
  
  public double uni_rv() {
    
    double k = 16807.0;
    double m = 2.147483647e9;
    double rv;
    
    seed = (k*seed)%m;
    rv = seed/m;
    return rv;
    
    
  }
/*****
 * given arrival rate lambda,
 * returns an exponential r.v.
 */
  public double exp_rv(double lambda) {
    
    double exp;
    exp = ((-1)/lambda) * Math.log(uni_rv());
    return exp;
    
  }
}

