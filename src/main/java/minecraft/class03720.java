package minecraft;

import org.jspecify.annotations.Nullable;

public class class03720 extends class02294<class00681, class02777, class01000> {
   public static final class01894 N = class01894.y("textures/entity/armorstand/wood.png");
   private final class01000 i = this.L();
   private final class01000 R;

   public class03720(class04832 var1) {
      super(var1, new class05450(var1.N(class04802.R)), 0.0F);
      this.R = new class05450(var1.N(class04802.B));
      this.N(new class02562<>(this, class08118.N(class04802.M, var1.R(), class01000::new), class08118.N(class04802.Z, var1.R(), class01000::new), var1.B()));
      this.N(new class02758<>(this));
      this.N(new class02242<>(this, var1.R(), var1.B()));
      this.N(new class02245<>(this, var1.R(), var1.U()));
   }

   public class02777 method_55269() {
      return new class02777();
   }

   public class01894 N(class02777 var1) {
      return N;
   }

   public void method_62354(class00681 var1, class02777 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class04256.N(var1, var2, var3, this.L);
      var2.N = class04995.Z(var3, var1.field_5982, var1.method_36454());
      var2.a = var1.i();
      var2.p = var1.y();
      var2.F = var1.L();
      var2.A = var1.u();
      var2.C = var1.M();
      var2.f = var1.R();
      var2.S = var1.B();
      var2.Nj = var1.Z();
      var2.Nv = var1.z();
      var2.Nn = var1.U();
      var2.y = (float)(var1.method_73183().N() - var1.l) + var3;
   }

   public void method_3936(class02777 var1, class01421 var2, class01237 var3, class06959 var4) {
      this.y = var1.p ? this.R : this.i;
      super.method_3936(var1, var2, var3, var4);
   }

   protected void y(class02777 var1, class01421 var2, float var3, float var4) {
      var2.N(class02058.u.N(180.0F - var3));
      if (var1.y < 5.0F) {
         var2.N(class02058.u.N(class04995.m(var1.y / 1.5F * (float) Math.PI) * 3.0F));
      }
   }

   @Nullable
   protected class07311 N(class02777 var1, boolean var2, boolean var3, boolean var4) {
      if (!var1.a) {
         return super.N(var1, var2, var3, var4);
      } else {
         class01894 class01894 = this.N(var1);
         if (var3) {
            return class06851.L(class01894, false);
         } else {
            return var2 ? class06851.N(class01894, false) : null;
         }
      }
   }

   protected boolean method_3921(class00681 var1, double var2) {
      return var1.method_5807();
   }
}
