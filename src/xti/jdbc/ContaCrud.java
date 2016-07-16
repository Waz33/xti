package xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCrud {

	public void transferir(Connection con, Conta origem, Conta destino, double valor) throws SQLException{

		if (origem.saldo>= valor) {
			try{
				con.setAutoCommit(false);
				
				//saque
				origem.saldo -= valor;
				alterar(con, origem);

				//erro para forcar o rollback
				//int x = 3/0;
				
				//deposito
				destino.saldo += valor;
				alterar(con, destino);
			
				con.commit();
			}catch(Exception e){
				con.rollback();
			}
		}	
	}
	public void criar(Connection con, Conta conta) throws SQLException{
		String sql = "insert into conta values (?,?,?)";
		
		try(PreparedStatement stm = con.prepareStatement(sql)){
			
			stm.setInt(1, conta.numero);		
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
		}
	}

	public void excluir(Connection con, Conta conta) throws SQLException{
		String sql = "delete conta  where numero=?";
		
		try(PreparedStatement stm = con.prepareStatement(sql)){
			stm.setInt(1, conta.numero);		
			stm.executeUpdate();
		}
	}

	public void alterar(Connection con, Conta conta) throws SQLException{
		String sql = "update conta set saldo=? where numero=?";
		
		try(PreparedStatement stm = con.prepareStatement(sql)){
			
			//stm.setString(1, conta.cliente);		
			stm.setDouble(1, conta.saldo);
			stm.setInt(2, conta.numero);
			System.out.println(sql);
			stm.executeUpdate();
		}
	}

	public List<Conta> ler(Connection con) throws SQLException{
		List<Conta> lista = new ArrayList<>();
		String sql = "select * from conta";
		try(PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery()){
				while(rs.next()){
					lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
				}
			}
		return lista;		
	}
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try(Connection con = DriverManager.getConnection(url, "xti", "xti123")){
			ContaCrud crud = new ContaCrud();
			
			/*
			Conta c1 = new Conta(1, "Wazzz", 14_012.02);
			Conta c2 = new Conta(2, "carol", 11_012.03);
			Conta c3 = new Conta(3, "andrea", 7_012.3);
			
			crud.criar(con, c1);
			crud.criar(con, c2);
			crud.criar(con, c3);
			*/
			
			//Conta c1 = new Conta(1, "Wazzz", 14_012.02);
			//c1.saldo = 9_009;
			//crud.alterar(con, c1);
			
			//Conta c2 = new Conta(2, "Wazzz", 14_012.02);
			//crud.excluir(con, c2);
			
			
			List<Conta> contas= crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta.numero+" - "+conta.cliente+" - "+conta.saldo);
			}
			
			Conta origem = contas.get(0);
			Conta destino = contas.get(1);
			crud.transferir(con, origem, destino, 500);

			for (Conta conta : contas) {
				System.out.println(conta.numero+" - "+conta.cliente+" - "+conta.saldo);
			}
		}
	
	}
}
