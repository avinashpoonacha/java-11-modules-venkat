module multipletellers {
  requires fortuneteller;

  provides com.agiledeveloper.fortuneteller.FortuneTeller
    with com.agiledeveloper.multipletellers.ProcessTeller,
      com.agiledeveloper.multipletellers.ReleaseTeller;
}