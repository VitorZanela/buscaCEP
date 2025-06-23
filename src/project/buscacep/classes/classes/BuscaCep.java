package project.buscacep.classes.classes;

public record BuscaCep(String cep, String logradouro, String complemento, String bairro, String uf, String localidade, String regiao, String ddd) {
    @Override
    public String toString() {
        return "----RESULTADO----\n" +
                "Logradouro: " + logradouro +
                "\nCOMPL: " + complemento +
                "\nBairro: " + bairro +
                "\nCidade: " + localidade +
                "\nCEP: " + cep +
                "\nUF: " + uf ;
    }
}

