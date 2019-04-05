import javax.swing.JOptionPane;
class PositivoNegativo{

public static void main(String Vinteeum[])
{ 	 
	int n;
	String dado;
	while(true)
	{ 
		try{
	dado=JOptionPane.showInputDialog("Digita um numero!");
	if(dado==null)
	{
		JOptionPane.showMessageDialog(null, "Saindo");
		System.exit(0);
	}
	n=Integer.parseInt(dado);
	break;
		}
		catch(NumberFormatException erro)
		{
			JOptionPane.showMessageDialog(null, "So numero!!");
		}
	}
	if (n>=0){
		JOptionPane.showMessageDialog(null,"O seu numero e positivo");
	}
	else{
		JOptionPane.showMessageDialog(null,"O seu numero e negativo");}
}
}