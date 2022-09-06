package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML
	private TextField campoSenha;
	
	public void entrar() {
		
		boolean emailValido = campoEmail.getText().equals("asdf");
		boolean senhaValida = campoSenha.getText().equals("asdf");
		
		if(emailValido && senhaValida) {
			Notifications.create()
				.title("Login FXML")
				.text("Login efetuado com sucesso!")
				.showInformation();
		} else {
			Notifications.create()
			.title("Login FXML")
			.text("Usuário e Senha inválidos!")
			.showError();
		}
	}
	
}
