import javax.swing.JOptionPane;
class Extenso
{
	public static void main(String doze[])
	{
		byte numero;
		do{
		numero=Byte.parseByte(JOptionPane.showInputDialog("Digita um algarismo"));
		if (numero<=0 || numero>10)
		{
			JOptionPane.showMessageDialog(null,"Voce digitou um numero maior que 10 ou menor que 1!!");
		}
		}while (numero<=0 || numero>10);
		switch(numero)
		{
			case 1:
			{
				JOptionPane.showMessageDialog(null,"Voce digitou UM");
			}break;
			case 2:
			{
				JOptionPane.showMessageDialog(null,"Você digitou DOIS");
			}break;
			case 3:
			{
				JOptionPane.showMessageDialog(null,"Você digitou TRES");
			}break;
			case 4:
			{
				JOptionPane.showMessageDialog(null,"Você digitou QUATRO");
			}break;
			case 5:
			{
				JOptionPane.showMessageDialog(null,"Você digitou CINCO");
			}break;
			case 6:
			{
				JOptionPane.showMessageDialog(null,"Você digitou SEIS");
			}break;
			case 7:
			{
				JOptionPane.showMessageDialog(null,"Você digitou SETE");
			}break;
			case 8:
			{
				JOptionPane.showMessageDialog(null,"Você digitou OITO");
			}break;
			case 9:
			{
				JOptionPane.showMessageDialog(null,"Você digitou NOVE");
			}break;
			case 10:
			{
				JOptionPane.showMessageDialog(null,"Você digitou DEZ");
			}break;
			
				
		}
		
		
		
		
	}
}