package br.com.liandro.javacore.jdbc.conn;

import br.com.liandro.javacore.jdbc.conn.ConexaoFactory;

public class TestConexao {
	public static void main(String[] args) {
		ConexaoFactory conn = new ConexaoFactory();
		conn.getConexao();
	}
}
