//open module com.agiledeveloper.thefirst { - this will open
//all unexported packages in the module. Not a good idea as it is too broad
module com.agiledeveloper.thefirst {
  exports com.agiledeveloper.first;
  opens com.agiledeveloper.stuff;
}

