import javax.swing.JOptionPane;
class Vogal
{
	public static void main(String nove[])
	{
		String letra=JOptionPane.showInputDialog("Digita uma letra?");
		if (letra.equals("A")|| letra.equals("a") || letra.equals("E")|| letra.equals("e")||letra.equals("I")|| letra.equals("i")||letra.equals("O")|| letra.equals("o")||letra.equals("U")|| letra.equals("u"))
		{
			JOptionPane.showMessageDialog(null,letra+"\ne uma vogal");
		}
		else
		{
			JOptionPane.showMessageDialog(null,letra+"\ne uma consoante");
		}
	}
	
	
}