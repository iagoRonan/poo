package ecommerce.pos.models;

public interface IPessoaAutenticavel {

	abstract boolean Autenticação(String login, String senha);

}
