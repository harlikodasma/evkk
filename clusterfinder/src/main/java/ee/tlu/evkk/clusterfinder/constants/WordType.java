package ee.tlu.evkk.clusterfinder.constants;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum WordType {

  VERB( "V", "Verb" ),
  SUBJECT( "S", "Nimisõna" ),
  ADJECTIVE( "A", "Omadussõna" ),
  PRONOUN( "P", "Asesõna" ),
  NUMERAL( "N", "Arvsõna" ),
  ADVERB( "D", "Määrsõna" ),
  CONJUNCTION( "J", "Sidesõna" ),
  ADPOSITION( "K", "Kaassõna" ),
  ABBREVIATION( "Y", "Lühend" );

  private final String labelEst;

  private final String value;

  WordType( String value, String labelEst ) {
    this.value = value;
    this.labelEst = labelEst;
  }

  public String getLabelEst() {
    return labelEst;
  }

  public String getValue() {
    return value;
  }
}