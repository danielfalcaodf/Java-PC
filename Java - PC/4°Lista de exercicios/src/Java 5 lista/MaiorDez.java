import javax.swing.JOptionPane;
class MaiorDez{
	public static void main (String arg[])
	{
		byte dado=Byte.parseByte(JOptionPane.showInputDialog("Digita um numero:"));
		if (dado>10)
		{
			JOptionPane.showMessageDialog(null," MAIOR QUE 10!");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"NÃO MAIOR QUE 10!");
		}
		System.exit(0);
	}
	
}