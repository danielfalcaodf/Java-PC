import javax.swing.JOptionPane;
class Divicao
{
	public static void main (String arg[])
	{
		int num1,num2,valor;
		num1=Integer.parseInt(JOptionPane.showInputDialog("Digita um numero "));
		do
		{
		num2=Integer.parseInt(JOptionPane.showInputDialog("Digita mais um numero"));
		if (num2==0){
			JOptionPane.showMessageDialog(null,"Nao dar para dividir, \ndigita novamente");
		}
		}
		while (num2==0);
		valor=num1/num2;
		JOptionPane.showMessageDialog(null,"O resultado e: "+valor);
			
		
	}
}