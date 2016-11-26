package br.com.hemosystem.model.doador;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 * @since 29/10/2016
 * @version 1.0
 */
public enum Sexo {

    FEMENINO, MASCULINO, OUTRO;

    public static Sexo setSexo(String sexo) {
        switch (sexo) {
            case "masculino":
                return Sexo.MASCULINO;
            case "feminino":
                return Sexo.FEMENINO;
            case "outro":
                return Sexo.OUTRO;
            default:
                return null;
        }
    }
}
