public class APLine
{
private int a1,b1,c1;
  public class APLine(int a, int b, int c){
  a1=a;
  b1=b;
  c1=c;
}
public double getSlope(int a,int b){
    double value=(double)-a/b;
    return value;
}
public boolean isOnLine(int x,int y){
if((a1*x)+(y*b1)+c1==0){
return true;
}
  else 
  return false;

}
}
