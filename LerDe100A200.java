import javax.swing.*;
public class LerDe100A200{
   public static void main(String args []){
      int a = 0;
      int cont = 0;
      do{
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
         if (a > 0 || a < 0){
            if(a > 100 && a < 200){
               cont++;
            }
         }
      }
      while(a > 0 || a < 0);
      JOptionPane.showMessageDialog(null, cont);
   }
}