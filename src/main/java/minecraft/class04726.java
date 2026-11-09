package minecraft;

import java.util.List;

class class04726 extends class04718 {
   private String y;
   private final class02091 L;

   public class04726(class04710 var1) {
      super();
      this.N = var1;
      this.y = "";
      class05216 class05216 = class00392.N("mco.configure.world.invited.number", "").N(class06541.field_1073);
      this.L = class02091.N(class05216, var1.R).N(false).N(class02086.field_62118).N();
   }

   int N(int var1) {
      return var1 + this.L.u() * 2;
   }

   @Override
   public List<? extends class04654> method_25396() {
      return List.of(this.L);
   }

   @Override
   public List<? extends class03434> method_37025() {
      return List.of(this.L);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      String s = this.N.M.Z != null ? Integer.toString(this.N.M.Z.size()) : "0";
      if (!s.equals(this.y)) {
         this.y = s;
         class05216 class05216 = class00392.N("mco.configure.world.invited.number", s).N(class06541.field_1073);
         this.L.method_25355(class05216);
      }

      this.L
         .y(
            this.N.B.method_25342() + this.N.B.method_25322() / 2 - this.L.method_25368() / 2,
            this.method_46427() + this.method_25364() / 2 - this.L.method_25364() / 2
         );
      this.L.method_25394(var1, var2, var3, var5);
   }
}
