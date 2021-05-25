module romanticteller {
  requires fortuneteller;

  provides com.agiledeveloper.fortuneteller.FortuneTeller
    with com.agiledeveloper.romanticteller.RomanticTeller;
}