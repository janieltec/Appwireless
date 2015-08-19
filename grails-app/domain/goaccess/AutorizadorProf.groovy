package goaccess

class AutorizadorProf {

	String nome
	String cpf
	String login
	String senha
	String hashSenha
	String email
	String setorResponsavel
	Integer numMemo
	String celularNum
	
	String toString () {
		"${this.nome}"
	}
	
	static hasMany = [solicitacoes:Solicitacao]
	
    static constraints = {
		nome(nullable:false,blank:false)
		cpf(blank:false,unique:true)
		login(blank:false)
		senha(blank:false)
		email(email:true,blank:false)
		setorResponsavel(blank:false)
		numMemo(blank:false)
		celularNum(blank:false)
    }
}
