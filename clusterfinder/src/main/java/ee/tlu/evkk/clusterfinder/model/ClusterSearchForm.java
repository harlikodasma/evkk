package ee.tlu.evkk.clusterfinder.model;

import ee.tlu.evkk.clusterfinder.constants.ClauseType;
import ee.tlu.evkk.clusterfinder.constants.WordType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ClusterSearchForm {

  private final String formId;

  private final String fileName;

  private final int analysisLength;

  private final boolean morfoAnalysis;

  private final boolean syntacticAnalysis;

  private final boolean includePunctuation;

  private final boolean wordtypeAnalysis;

  private final String sortingType;

  private final WordType wordType;

  private final ClauseType clauseType;

  private final String[] clauseTypeAdditionals;

  private final String[] wordSubType;

  private final String[] wordFiniteType;

  private final String[] wordCaseType;

  private final String[] wordPluralType;

  private final String[] wordStepType;

  private final String[] wordPerspectiveType;

  private final String[] wordTimeType;

  private final String[] wordVoiceType;

  private final String[] wordSpeechSubtype;

  private final String[] wordSubTypeVK;

  private final String[] wordSubTypeVKPartic;

  private final String[] wordSubTypeVKSup;

  private final String[] wordSpeechType;
}