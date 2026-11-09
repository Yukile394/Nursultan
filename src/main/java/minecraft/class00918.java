package minecraft;

public class class00918 extends class00155 {
   private final class05363 m;
   private final float P;
   private final float s;

   @Override
   public void P() {
      this.b();
   }

   public class00918(class04891 var1, class04911 var2, class06069 var3, class05363 var4, float var5, float var6) {
      super(var1, var2, var3);
      this.m = var4;
      this.P = var5;
      this.s = var6;
      this.b();
   }

   private void b() {
      class06889 class06889 = class06889.N(this.P, this.s).L(10.0);
      this.R = this.m.y().M + class06889.M;
      this.M = this.m.y().B + class06889.B;
      this.B = this.m.y().Z + class06889.Z;
      this.U = class00018.field_5478;
   }
}
