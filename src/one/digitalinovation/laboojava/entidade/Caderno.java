package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

/**
 * Classe que representa um caderno, qual é uma especialização de um produto da loja.
 * @author angelo antonio
 */
public class Caderno extends Produto {

  /**
  * Quantidade de materias do caderno.
  */
  private Materias materias;

  public Materias getMaterias(){
    return materias;
  }

  public void setMaterias(Materias materias){
    this.materias = materias;
  }

  @Override
  public double calcularFrete(){
    return((getPreco() * getQuantidade()) * (1 + materias.getFator()));
  }

  @Override
  public String toString(){
    return "Caderno{" +
            "materias=" + materias + '\'' +
            ", codigo='" + getCodigo() + '\'' +
            ", preço='" + getPreco() + '\'' +
            '}';
  }
}