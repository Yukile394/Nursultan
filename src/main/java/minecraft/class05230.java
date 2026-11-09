package minecraft;

class class05230 extends class03286 {
   private static final class00392 y = class00392.L("createWorld.tab.game.title");
   private static final class00392 L = class00392.L("selectWorld.allowCommands");
   private final class04927 u;

   class05230(class05213 var1) {
      super(y);
      this.N = var1;
      class02080 class02080 = this.Z.y(8).u(1);
      class02072 class02072 = class02080.y();
      this.u = new class04927(class05213.N(var1), 208, 20, class00392.L("selectWorld.enterName"));
      this.u.method_1852(var1.R.y());
      this.u.method_1863(var1.R::N);
      var1.R.N(var1x -> this.u.method_47400(class04141.N(class00392.N("selectWorld.targetFolder", class00392.y(var1x.L()).N(class06541.field_1056)))));
      class05213.N(var1, this.u);
      class02080.N(class03725.N(class05213.y(var1), this.u, class05213.y), class02080.y().y());
      class06366 class06366xx = class02080.N(
         class06366.<class03678>N(var0 -> var0.field_42224, var1.R.u())
            .N(class03678.field_20624, class03678.field_20625, class03678.field_20626)
            .N(0, 0, 210, 20, class05213.N, (var1x, var2x) -> this.N.R.N(var2x)),
         class02072
      );
      var1.R.N(var1x -> {
         class06366xx.N(var1x.u());
         class06366xx.field_22763 = !var1x.E();
         class06366xx.method_47400(class04141.N(var1x.u().N()));
      });
      class06366 class06366x = class02080.N(
         class06366.N(class07086::y, var1.R.i())
            .N(class07086.values())
            .N(0, 0, 210, 20, class00392.L("options.difficulty"), (var1x, var2x) -> this.N.R.N(var2x)),
         class02072
      );
      var1.R.N(var2x -> {
         class06366x.N(this.N.R.i());
         class06366x.field_22763 = !this.N.R.R();
         class06366x.method_47400(class04141.N(this.N.R.i().L()));
      });
      class06366<Boolean> class06366xx = class02080.N(
         class06366.N(var1.R.M()).N(var0 -> class04141.N(class05213.u)).N(0, 0, 210, 20, L, (var1x, var2x) -> this.N.R.N(var2x))
      );
      var1.R.N(var2x -> {
         class06366.N(Boolean.valueOf(this.N.R.M()));
         class06366.field_22763 = !this.N.R.E() && !this.N.R.R();
      });
      if (!class07529.y().comp_4031()) {
         class02080.N(class05362.method_46430(class05213.L, var1x -> this.N.N(this.N.R.U().B())).N(210).N());
      }
   }
}
