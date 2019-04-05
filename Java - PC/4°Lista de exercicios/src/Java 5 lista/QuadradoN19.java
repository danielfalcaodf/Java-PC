import javax.swing.JOptionPane;

class QuadradoN19
{
	public static void main (String Dezenove[])
	{
		double numero,calc,numero2,numero3,numero4,calc2,calc3,calc4;
		numero=Double.parseDouble(JOptionPane.showInputDialog("Digita o primero numero "));
		numero2=Double.parseDouble(JOptionPane.showInputDialog("Digita o segundo numero "));
		numero3=Double.parseDouble(JOptionPane.showInputDialog("Digita o treceiro numero  "));
		numero4=Double.parseDouble(JOptionPane.showInputDialog("Digita quarto numero "));
		calc=numero*numero;
		calc2=numero2*numero2;
		calc3=numero3*numero3;
		calc4=numero4*numero4;
		if(calc3>=1000)
		{
			JOptionPane.showMessageDialog(null,"O valor numero em quartrado do treceiro	 e "+calc3);
		}
		
		else{
		JOptionPane.showMessageDialog(null,"O valor numero em quartrado o \nPrimero: "+calc+"\nSegundo: "+calc2+"\nTerceiro:"+calc3+"\nQuarto: "+calc4);
		}
	}
} 