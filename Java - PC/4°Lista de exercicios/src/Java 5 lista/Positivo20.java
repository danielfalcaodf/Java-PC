import javax.swing.JOptionPane;
class Positivo20
{
	public static void main (String vinte[])
	{
		int valor;
		
		valor=Integer.parseInt(JOptionPane.showInputDialog("Digita um numero:"));
		if(valor>=0)
		{

			if (valor%2==0)
			{
			JOptionPane.showMessageDialog(null,"seu numero e par e positivo : "+valor);
			}
			else if (valor%3==0)
			{
				JOptionPane.showMessageDialog(null,"seu numero e Impar e positivo : "+valor);
			}
		}
			
	
	
		else 
		{
			if (valor%2==0)
			{
			JOptionPane.showMessageDialog(null,"seu numero e Par e negativo : "+valor);
			}
			else if (valor%3==0)
			{
				JOptionPane.showMessageDialog(null,"seu numero e Impar e negativo : "+valor);
			}
			
		}
	}
}