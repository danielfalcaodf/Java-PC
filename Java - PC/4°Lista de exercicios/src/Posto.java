import javax.swing.JOptionPane;
class Posto
{
	public static void main (String arg[])
	{
		double litro, desconto;
		String tipo,dado;
		do{
		tipo=JOptionPane.showInputDialog("Qual combustivel foi vendido \ndigita: \nA- alcool \n G-gasolina");
		if (tipo==null)
		{
			JOptionPane.showMessageDialog(null, "Saindo");
			System.exit(0);
		}
			if((!tipo.equals("A") )&&( !tipo.equals("G")))
			{
			JOptionPane.showMessageDialog(null,"Combustivel invalido, \nS� A/G!!,\ndigite novamente");
			}
		}while((!tipo.equals("A")) && (!tipo.equals("G")));
		while (true)
		{
			try{
		
					do{
						dado=JOptionPane.showInputDialog("Quantos litros");
						if(dado==null)
						{
							JOptionPane.showMessageDialog(null, "Saindo");
							System.exit(0);
						}
					litro=Double.parseDouble(dado);
				
					if (litro<=0)
					{
						JOptionPane.showMessageDialog(null,"Litro invalido, nao pode ser negativo ou zero digite novamente");
					}
					}while(litro<=0 || litro!=1);
					break;
					
					}
					catch(NumberFormatException erro)
					{
						JOptionPane.showMessageDialog(null, "So numero!!");
					}
		}
					
					if (tipo.equals("A"))
					{
						if (litro<=20)
						{
							desconto=((litro*2.90)-((litro*2.90)*(0.03)));
							JOptionPane.showMessageDialog(null,"valor"+desconto);
						}
						
						else
						{
							desconto=((litro*2.90)-((litro*2.90)*(0.05)));JOptionPane.showMessageDialog(null,"valor "+desconto);
						}
					}
					else if(tipo.equals("G"))
					{ 
						if(litro<=20){
						desconto=((litro*3.30)-((litro*3.30)*(0.04)));
						JOptionPane.showMessageDialog(null,"valor "+desconto);
						}
						else
						{
							desconto=((litro*3.30)-((litro*3.30)*(0.06)));JOptionPane.showMessageDialog(null,"valor "+desconto);
						}
					}
		
		
		
		
		System.exit(0);
	}
}