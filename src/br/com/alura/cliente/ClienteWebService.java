package br.com.alura.cliente;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		String retorno=Request
			.Post("http://localhost:8080/gerenciador/empresas")
			.addHeader("Accept","application/json")     //define qual o tipo de retorno que quer  json/ xml
			.execute()
			.returnContent()
			.asString();
		System.out.println(retorno);
	}

}
