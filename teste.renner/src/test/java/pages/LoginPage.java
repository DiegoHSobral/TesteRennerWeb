package pages;


import elementos.ElementosTestes;


public class LoginPage {

	MetodosdeTeste page = new MetodosdeTeste();
	ElementosTestes elementos = new ElementosTestes();
	

	public void login() {
		page.escrever(elementos.getEmailaddress(), "diegosobral14@gmail.com");
		page.escrever(elementos.getPassword(), "141717");
		page.clicar(elementos.getBotaoSignIn());
	}

}
