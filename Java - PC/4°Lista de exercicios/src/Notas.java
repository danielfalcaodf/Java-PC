import javax.swing.JOptionPane;
class Notas
{
	public static void main(String oito[])
	{
		float nota1,nota2,media;
		do {
		nota1=Float.parseFloat(JOptionPane.showInputDialog(null,"Qual e primeira nota do aluno? "));
		nota2=Float.parseFloat(JOptionPane.showInputDialog("Qual e sengunda nota do aluno? "));
		if(nota1>10 || nota2>10)
		{
			JOptionPane.showMessageDialog(null,"umas das notas foi maior, digita novamente"); 
		}
		}
		while(nota1>10 || nota2>10);
		media=(nota1+nota2)/2;
		JOptionPane.showMessageDialog(null,"A media e:"+media);
	}
}