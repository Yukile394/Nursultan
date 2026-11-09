package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class05083 extends class01219 {
   public static final MapCodec<class05083> N = Codec.FLOAT.fieldOf("mossiness").xmap(class05083::new, var0 -> var0.R);
   private static final float y = 0.5F;
   private static final float L = 0.5F;
   private static final float u = 0.15F;
   private static final class00500[] i = new class00500[]{class00869.UG.W(), class00869.UO.W()};
   private final float R;

   @Nullable
   private class00500 L(class00500 var1, class06069 var2) {
      return var2.z() < this.R ? class00869.PI.s(var1) : null;
   }

   public class05083(float var1) {
      super();
      this.R = var1;
   }

   @Nullable
   private class00500 y(class06069 var1) {
      return var1.z() < 0.15F ? class00869.TU.W() : null;
   }

   @Nullable
   private class00500 y(class00500 var1, class06069 var2) {
      return var2.z() < this.R ? class00869.Pb.s(var1) : null;
   }

   @Override
   protected class05235<?> N() {
      return class05235.U;
   }

   private static class00500 N(class06069 var0, class00500[] var1) {
      return var1[var0.y(var1.length)];
   }

   @Nullable
   private class00500 N(class00500 var1, class06069 var2) {
      if (var2.z() >= 0.5F) {
         return null;
      } else {
         class00500[] aclass00500 = new class00500[]{class00869.Pu.s(var1), class00869.Pb.W()};
         return this.N(var2, i, aclass00500);
      }
   }

   @Nullable
   private class00500 N(class06069 var1) {
      if (var1.z() >= 0.5F) {
         return null;
      } else {
         class00500[] aclass00500 = new class00500[]{class00869.Rs.W(), N(var1, class00869.RA)};
         class00500[] aclass005001 = new class00500[]{class00869.RP.W(), N(var1, class00869.Pu)};
         return this.N(var1, aclass00500, aclass005001);
      }
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      class06069 class06069 = var6.y(var5.N());
      class00500 class00500x = var5.y();
      class07209 class07209 = var5.N();
      class00500 class00500x = null;
      if (class00500x.N(class00869.Rm) || class00500x.N(class00869.y) || class00500x.N(class00869.RT)) {
         class00500x = this.N(class06069);
      } else if (class00500x.N(class01210.K)) {
         class00500x = this.N(class00500x, class06069);
      } else if (class00500x.N(class01210.o)) {
         class00500x = this.y(class00500x, class06069);
      } else if (class00500x.N(class01210.q)) {
         class00500x = this.L(class00500x, class06069);
      } else if (class00500x.N(class00869.LV)) {
         class00500x = this.y(class06069);
      }

      return class00500x != null ? new class01228(class07209, class00500x, var5.L()) : var5;
   }

   private static class00500 N(class06069 var0, class00891 var1) {
      return var1.W().y(class07746.y, class07221.field_11062.N(var0)).y(class07746.L, class07536.N((class08052[])class08052.values(), var0));
   }

   private class00500 N(class06069 var1, class00500[] var2, class00500[] var3) {
      return var1.z() < this.R ? N(var1, var3) : N(var1, var2);
   }
}
