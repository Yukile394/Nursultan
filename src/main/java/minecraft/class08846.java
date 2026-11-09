package minecraft;

public enum class08846 {
   field_55070(true, class07047.P, 11.0F, class04909.UT, class04909.Ub, 16545810),
   field_55071(false, class07047.Z, 7.0F, class04909.Uj, class04909.Uv, 6250335);

   final boolean field_55072;
   final class03556<class07084> field_55073;
   final float field_55074;
   final class04891 field_55075;
   final class04891 field_55076;
   private final int field_55077;

   public class08846 L() {
      return N(!this.field_55072);
   }

   private class08846(boolean var3, class03556<class07084> var4, float var5, class04891 var6, class04891 var7, int var8) {
      this.field_55072 = var3;
      this.field_55073 = var4;
      this.field_55074 = var5;
      this.field_55075 = var6;
      this.field_55076 = var7;
      this.field_55077 = var8;
   }

   public class04891 i() {
      return this.field_55075;
   }

   public boolean u() {
      return this.field_55072;
   }

   public class00500 y() {
      return this.N().W();
   }

   public void N(class04782 var1, class07209 var2, class06069 var3) {
      class06889 class06889xx = var2.method_46558();
      double d0 = 0.5 + var3.U();
      class06889 class06889x = new class06889(var3.U() - 0.5, var3.U() + 1.0, var3.U() - 0.5);
      class06889 class06889xx = class06889xx.i(class06889x.L(d0));
      class00303 class00303 = new class00303(class06889xx, this.field_55077, (int)(20.0 * d0));
      var1.method_65096(class00303, class06889xx.M, class06889xx.B, class06889xx.Z, 1, 0.0, 0.0, 0.0, 0.0);
   }

   public class00891 N() {
      return this.field_55072 ? class00869.nx : class00869.nD;
   }

   public static class08846 N(boolean var0) {
      return var0 ? field_55070 : field_55071;
   }
}
