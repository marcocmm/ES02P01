/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.hemosystem.model.doacao;

import br.com.hemosystem.model.doador.Doador;
import java.util.Collection;

/**
 *
 * @author Leonardo Baiser <lpbaiser@gmail.com>
 */
public interface TriagemAtual {
    
    public Collection<Triagem> listaDadosTriagemAtual(Doador doador); 
}
