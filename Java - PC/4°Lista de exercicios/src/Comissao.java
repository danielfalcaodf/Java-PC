import javax.swing.JOptionPane;
class Comissao
{
	public static void main(String treze[])
	{
		String vendedor;
		int codigo;
		double preco,quantidade,pagamento;
		vendedor=JOptionPane.showInputDialog("Nome do vendedor");
		do{
		codigo=Integer.parseInt(JOptionPane.showInputDialog("Codigo da preço"));
		preco=Double.parseDouble(JOptionPane.showInputDialog("Preco unitario da peca"));
		quantidade=Double.parseDouble(JOptionPane.showInputDialog("Quantidade vendida"));
		if (codigo<0||preco<=0||quantidade<=0)
		{
			JOptionPane.showMessageDialog(null, "Voce digitou valores negativo ou zero");
		}
		
		}while (codigo<0||preco<=0||quantidade<=0);
		pagamento=(preco*quantidade)*0.05;
		JOptionPane.showMessageDialog(null,vendedor+" Sua comisao da preca do codigo "+codigo+" sera de "+pagamento+"R$","comisao",JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}