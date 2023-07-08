package com.serverest.api.stepsdefinitions;

import com.serverest.api.token.Token;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.response.Response;

public class StepsDefinitions {
	
	Token token = new Token();
	private Response response;
	String url = "https://serverest.dev";
	
	@Dado("que eu faca uma requisicao POST na rota \\/carrinhos com requestBody valido")
	public void que_eu_faca_uma_requisicao_post_na_rota_carrinhos_com_request_body_valido() {
	   
	}

	@Entao("valido status code {int}")
	public void valido_status_code(Integer int1) {
	    
	}

	@Entao("mensagem {string}")
	public void mensagem(String string) {
	    
	    
	}

	@Dado("que eu faca uma requisicao POST na rota \\/carrinhos SEM o requestBody")
	public void que_eu_faca_uma_requisicao_post_na_rota_carrinhos_sem_o_request_body() {
	    
	}

	@Dado("que eu faca uma requisicao POST na rota \\/carrinhos SEM o campo idProduto")
	public void que_eu_faca_uma_requisicao_post_na_rota_carrinhos_sem_o_campo_id_produto() {
	    
	}

	@Dado("que eu fa?a uma requisi??o POST na rota \\/carrinhos com o campo idProduto com valor int")
	public void que_eu_fa_a_uma_requisi_o_post_na_rota_carrinhos_com_o_campo_id_produto_com_valor_int() {
	
	}

	@Dado("que eu faca uma requisicao POST na rota \\/carrinhos sem o campo quantidade")
	public void que_eu_faca_uma_requisicao_post_na_rota_carrinhos_sem_o_campo_quantidade() {
	    
	}

	@Dado("que eu faca uma requisicao POST na rota \\/carrinhos com o campo quantidade com valor string")
	public void que_eu_faca_uma_requisicao_post_na_rota_carrinhos_com_o_campo_quantidade_com_valor_string() {
	    
	}

}
