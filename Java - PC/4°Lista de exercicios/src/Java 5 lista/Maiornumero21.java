import javax.swing.JOptionPane;
class Maiornumero21
{
	public static void main (String vinte[])
	{
		int valor, valor2, valor3;
		valor=Integer.parseInt(JOptionPane.showInputDialog("Digita um numero:"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digita mais um numero:"));
		valor3=Integer.parseInt(JOptionPane.showInputDialog("Digita mais um numero:"));
		if(valor>valor2 && valor>valor3)
		{
		JOptionPane.showMessageDialog(null,"O numero maior e : "+valor);
				
		}
			
	
	
		else if(valor2>valor3 && valor2>valor)
		{
		JOptionPane.showMessageDialog(null,"O numero maior e : "+valor2);
				
		}
		else if(valor3>valor && valor3>valor2)
		{
		JOptionPane.showMessageDialog(null,"O numero maior e : "+valor3);
				
		}
	}
}