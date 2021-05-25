module pepsico {
  requires softdrink;

  provides com.agiledeveloper.softdrink.SoftDrink
    with com.agiledeveloper.pepsi.Pepsi, 
    com.agiledeveloper.pepsi.DietPepsi;
}

