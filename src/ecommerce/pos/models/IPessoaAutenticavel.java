package ecommerce.pos.models;

public interface IPessoaAutenticavel {

	abstract boolean Autentica��o(String login, String senha);

}
