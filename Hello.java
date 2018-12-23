public class Hello{

  static int Mode_Shift = 30;


  public static void main(String[] arg){

    Model model = new Model();
    model.setA(0);
    System.out.println("A = "+model.getA());

    System.out.println((0x3<<Mode_Shift)+"   0x3");
    System.out.println((0<<Mode_Shift)+"   0");
    System.out.println((1<<Mode_Shift)+"   1");
    System.out.println((2<<Mode_Shift)+"   2");
  }


}
class Model{

  Double a;
  Double b;

  public void setA(double a){
    this.a = a;
  }

  public Double getA(){
    return this.a;
  }

}
