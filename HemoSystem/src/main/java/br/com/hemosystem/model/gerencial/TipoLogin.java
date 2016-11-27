package br.com.hemosystem.model.gerencial;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public enum TipoLogin {

    GERENTE("Gerente"), FUNCIONARIO("Funcionario");

    private String value;

    private TipoLogin(String val) {
        this.value = val;
    }

    public String getTipoLogin() {
        return value;
    }

    public static TipoLogin setTipoLogin(String tipoLogin) {
        switch (tipoLogin) {
            case "GERENTE":
                return TipoLogin.GERENTE;
            case "FUNCIONARIO":
                return TipoLogin.FUNCIONARIO;
            default:
                return null;
        }
    }

}
