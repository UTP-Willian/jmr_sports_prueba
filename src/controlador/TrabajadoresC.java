package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dao.CamisetaDAO;
import dao.TrabajadorDAO;
import dao.interfaz.IIndumentariaDAO;
import dao.interfaz.ITrabajadorDAO;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import modelo.Camiseta;
import modelo.Trabajador;
import modelo.Usuario;
import utils.ListaEnlazada;
import utils.Nodo;

public class TrabajadoresC implements Initializable
{
	@FXML
    private TableView<Trabajador> tabla_trabajador;
	//
	private ObservableList<Trabajador> lista_registros_tabla=FXCollections.observableArrayList();
	public static ITrabajadorDAO dao=new TrabajadorDAO();
	//
	@Override
	public void initialize(URL location, ResourceBundle resources)
	{
		actualizarTabla(dao.obtenerLista());
	}
	public void ventanaTrabajador(ActionEvent ev) throws IOException
	{
		Stage stage = new Stage();
		Parent fxml=FXMLLoader.load(getClass().getResource("/vista/AgregarTrabajadorFX.fxml"));
		Scene scene = new Scene(fxml);
		stage.setScene(scene);
		//stage.initStyle(StageStyle.UNDECORATED);
		stage.show();
	}
	public void agregarModificarTrabajador(ActionEvent evento) throws IOException
	{
		
	}
	public void buscarTrabajador(ActionEvent evento) throws IOException
	{
		
	}
	public void eliminarTrabajador(ActionEvent evento) throws IOException
	{
		
	}
	//
	public void actualizarTabla(ListaEnlazada lista)
	{
		lista_registros_tabla.clear();
		tabla_trabajador.getColumns().clear();
		TableColumn<Trabajador, String> columna_dni = new TableColumn<>("DNI");
		columna_dni.setCellValueFactory(new PropertyValueFactory<>("dni"));
		TableColumn<Trabajador, String> columna_nombre = new TableColumn<>("Nombre");
		columna_nombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		TableColumn<Trabajador, String> columna_ap = new TableColumn<>("Apellido paterno");
		columna_ap.setCellValueFactory(new PropertyValueFactory<>("apellido_paterno"));
		TableColumn<Trabajador, String> columna_am = new TableColumn<>("Apellido materno");
		columna_am.setCellValueFactory(new PropertyValueFactory<>("apellido_materno"));
		TableColumn<Trabajador, String> columna_usuario = new TableColumn<>("Usuario");
		columna_usuario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getUsuario()));
		TableColumn<Trabajador, String> columna_contrasenna = new TableColumn<>("Contraseña");
		columna_contrasenna.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getContrasenna()));
		TableColumn<Trabajador, String> columna_tienda = new TableColumn<>("Tienda");
		columna_tienda.setCellValueFactory(new PropertyValueFactory<>("tienda"));
		tabla_trabajador.getColumns().add(columna_dni);
		tabla_trabajador.getColumns().add(columna_nombre);
		tabla_trabajador.getColumns().add(columna_ap);
		tabla_trabajador.getColumns().add(columna_am);
		tabla_trabajador.getColumns().add(columna_usuario);
		tabla_trabajador.getColumns().add(columna_contrasenna);
		tabla_trabajador.getColumns().add(columna_tienda);
		Nodo<Trabajador> trabajadores=lista.getCabecera();
		while(trabajadores!=null)
		{
			Trabajador trabajador=trabajadores.getElemento();
			lista_registros_tabla.add(trabajador);
			trabajadores=trabajadores.getSiguiente();
		}
		tabla_trabajador.setItems(lista_registros_tabla);
	}
}