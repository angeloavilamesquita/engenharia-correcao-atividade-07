package correcaoatividade07;

public class App {

    public static void main(String[] args) {
        Casa casa = new Casa();
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Xpto");
        endereco.setNumero("123-B");
        endereco.setBairro("Santana");
        endereco.setCidade("Sao Joaquim da Barra");
        
        Espelho espelho = new Espelho();
        /** implementando casa **/
        casa.setArea(44);
        casa.setEndereco(endereco);
        casa.setEspelhoCorredor(espelho);
        TipoTelha tipoTelha = new TipoTelha();
        tipoTelha.setDescricao("Sanduiche");
        casa.getTelhadoAreExterna().setTipoTelha(tipoTelha);
        casa.getTelhadoAreExterna().setArea(44);
        casa.getTelhadoAreInterna().setTipoTelha(tipoTelha);
        casa.getTelhadoAreInterna().setArea(34);
        Acabamento acabamento = new Acabamento();
        acabamento.setDescricao("luxo");
        casa.getParedeBanheiro().setAcabamento(acabamento);
        casa.getParedeBanheiro().setAltura(2);
        casa.getParedeBanheiro().setLargura(1.5);
    }
    
}
