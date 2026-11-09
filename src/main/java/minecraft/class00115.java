package minecraft;

class class00115 implements class00127<class08997> {
   class00115() {
      super();
   }

   public void N(class08997 var1, class05096 var2, class00129 var3) {
      class09025 class09025 = var1.y().orElse(var1.u().getFirst());
      class06366 class06366 = class06366.<class09025>N(class09025::N, class09025)
         .N(var1.u())
         .N(!var1.R() ? class06343.field_64540 : class06343.field_64539)
         .N(0, 0, var1.L(), 20, var1.i());
      var3.accept(class06366, class08737.N(() -> ((class09025)class06366.y()).y()));
   }
}
