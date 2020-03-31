import javax.swing.*;
public class Media{
   public static void main(String ... args){
   int a = 0;
   double media = 0;
   int cont = 0;
      do{
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo e quando quiser parar digite um negativo"));
        if (a>0){
         media = a + media;
         cont++;
        }
      }
      while (a>0);
      JOptionPane.showMessageDialog(null, media/cont);
   }
}