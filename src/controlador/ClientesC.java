package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientesC implements Initializable
{
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		
	}
	public void ventanaCliente(ActionEvent ev) throws IOException
	{
		Stage stage = new Stage();
		Parent fxml=FXMLLoader.load(getClass().getResource("/vista/AgregarClienteFX.fxml"));
		Scene scene = new Scene(fxml);
		stage.setScene(scene);
		//stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
	}
	public void agregarModificarCliente(ActionEvent evento) throws IOException
	{
		
	}
	public void buscarCliente(ActionEvent evento) throws IOException
	{
		
	}
	public void eliminarCliente(ActionEvent evento) throws IOException
	{
		
	}
}