module qualityteller {
  requires fortuneteller;

  provides com.agiledeveloper.fortuneteller.FortuneTeller
    with com.agiledeveloper.qualityteller.QualityTeller;
}