import javax.swing.JOptionPane;
public class maior15 
{

	
	public static void main(String[] args) 
	{ int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("Digita um numero"));
		if (n>=100)
		{
			JOptionPane.showMessageDialog(null,"Ele é maior que 100,  seu "+n);
			
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"Numero e menor que 100, seu "+n);
			
		}
	

	}

}
