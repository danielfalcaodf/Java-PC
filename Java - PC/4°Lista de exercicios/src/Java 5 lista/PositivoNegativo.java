import javax.swing.JOptionPane;
class PositivoNegativo{

public static void main(String arg[])
{ 	 
	int n;
	n=Integer.parseInt(JOptionPane.showInputDialog("Digita um numero!"));
	if (n>=0){
		JOptionPane.showMessageDialog(null,"O seu numero e positivo");
	}
	else{
		JOptionPane.showMessageDialog(null,"O seu numero e negativo");}
}
}