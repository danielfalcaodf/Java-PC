import javax.swing.JOptionPane;
class NumeroAB
{
	public static void main(String quatorze[])
	{
		int numero,a,b;
		numero=Integer.parseInt(JOptionPane.showInputDialog("Digita um valor"));
		if (numero>=0)
		{
			
			a=numero;
			JOptionPane.showMessageDialog(null,"Voce digitou positivo "+a);
		}
		else
		{	
			
			b=numero;
			JOptionPane.showMessageDialog(null,"Voce digitou negativo"+b);
			
		}
	}
}