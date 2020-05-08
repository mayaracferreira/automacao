import org.junit.Test;

import  static org.junit.Assert.assertEquals;


public class TestCompra extends BaseTest{

    private Index index = new Index();
    private Cadastro cadastro = new Cadastro ();
    private ConfirmarCompra compra = new ConfirmarCompra ();
    private Pagamento pagamento = new Pagamento();



    @Test
    public  void testComprar () throws InterruptedException {
        String produto = "//a[@data-id-product='1']";
        index.acessarAplicacao();
        index.selecionarProduto();
        Thread.sleep( 3000);
        cadastro.cadastrarUsuario("teste12354@test.com.br");
        cadastro.dadosUsuario();
        cadastro.confirmarCadastro();
        pagamento.ConfirmarPagamento();
        compra.ConfirmarDadosdeCompra();


    }
}
