package dao.interfaces;

import java.util.List;

import dao.negocio.Cliente;

public interface ClienteInterface {
	public boolean addCliente(Cliente cliente);
	public boolean deleteCliente(Cliente cliente);
	public boolean updateCliente(Cliente cliente);
	public Cliente viewCliente(Cliente cliente);
	public List<Cliente> getAllCliente();
}
