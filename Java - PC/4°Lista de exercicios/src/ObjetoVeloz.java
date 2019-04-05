import javax.swing.JOptionPane;
class ObjetoVeloz
{
	public static void main (String dez[])
	{
		double velozIni,acele,tempo,calc;
		do{
		velozIni=Double.parseDouble(JOptionPane.showInputDialog("Qual e velocidade incial do objeto"));
		if(velozIni<0){
		JOptionPane.showMessageDialog(null,"velocidade invalido, nao pode ser negativo digite novamente");
		}
		}while (velozIni<0);
		do
		{
		acele=Double.parseDouble(JOptionPane.showInputDialog("Qual e Aceleracao do objeto? "));
		if(acele<0)
		{
			JOptionPane.showMessageDialog(null,"Aceleração invalido, nao pode ser negativo digite novamente");
		}
		}while(acele<0);
		
		do
		{
		tempo=Double.parseDouble(JOptionPane.showInputDialog("Qual e o tempo? "));
		if(tempo<0)
		{
				JOptionPane.showMessageDialog(null,"Tempo invalido, nao pode ser negativo digite novamente");
				
		}
		}
		while (tempo<0);
		calc=(velozIni+acele)*tempo;
		JOptionPane.showMessageDialog(null,"A velocidade do objeto e:"+calc);
	
	}
}