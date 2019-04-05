import javax.swing.JOptionPane;

class Pescador17
{
	public static void main (String dezessete[])
	{
		double peso,multa,calc,zero;
		do
		{
		peso=Double.parseDouble(JOptionPane.showInputDialog("Qual e o peso do peixe em kg? "));
		if(peso<=0)
		{
			JOptionPane.showMessageDialog(null,"Peso invalido, nao pode ser negativo ou zero,  digite novamente");
		}
		}while (peso<=0);
		if (peso>50)
		{
			calc=(peso-50);
			multa=calc*4.00;
			JOptionPane.showMessageDialog(null,"A multa e: "+multa+"\nO excesso e: "+calc); 
		}
		else if (peso<=50)
		{
			zero = peso;
			JOptionPane.showMessageDialog(null,"Hoje voce nao vai pagar multa "+zero);
		}
		
		
	}
}