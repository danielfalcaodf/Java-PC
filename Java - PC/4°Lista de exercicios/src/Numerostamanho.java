import javax.swing.JOptionPane;
class Numerostamanho
{
	public static void main (String arg[])
	{
	 int n1,n2;
	 n1=Integer.parseInt(JOptionPane.showInputDialog("Digita um Numero"));
	 n2=Integer.parseInt(JOptionPane.showInputDialog("Digita mais um Numero"));
	 
	 
	 if(n1==n2 || n2==n1)
		 {
		 JOptionPane.showMessageDialog(null,"Numeros iguais");
		 }
	else if (n1>n2)
	{
		JOptionPane.showMessageDialog(null,"O primero numero "+n1+" e maior");
	}
	else
	{
		JOptionPane.showMessageDialog(null,"O segundo numero "+n2+" e maior");
		
	}
		System.exit(0);
	}
}	