package minecraft;

import java.util.Optional;

class class05219 extends class03286 {
   private static final class00392 y = class00392.L("createWorld.tab.more.title");
   private static final class00392 L = class00392.L("selectWorld.gameRules");
   private static final class00392 u = class00392.L("selectWorld.dataPacks");

   class05219(class05213 var1) {
      super(y);
      this.N = var1;
      class02080 class02080 = this.Z.y(8).u(1);
      class02080.N(class05362.method_46430(L, var1x -> this.N()).N(210).N());
      class02080.N(class05362.method_46430(class05213.L, var1x -> this.N.N(this.N.R.U().B())).N(210).N());
      class02080.N(class05362.method_46430(u, var1x -> this.N.y(this.N.R.U().B())).N(210).N());
   }

   private void N() {
      class05213.R(this.N).N(new class05191(this.N.R.T().y(this.N.R.U().B().y()), var1 -> {
         class05213.M(this.N).N(this.N);
         var1.ifPresent(this.N.R::N);
      }));
   }
}
