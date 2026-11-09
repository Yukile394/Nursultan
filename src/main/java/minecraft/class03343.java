package minecraft;

import org.jspecify.annotations.Nullable;

public class class03343<T extends class00394 & class07274> implements class03358<T, class00958> {
   private final class08097 N;
   private final class02443 y;
   private final class02443 L;
   private final class02443 u;
   private final boolean i;

   public class03343(class04811 var1) {
      super();
      this.N = var1.B();
      this.i = N();
      this.y = new class02443(var1.N(class04802.D));
      this.L = new class02443(var1.N(class04802.NV));
      this.u = new class02443(var1.N(class04802.Ne));
   }

   public class00958 i() {
      return new class00958();
   }

   public void N(class00958 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      var2.N(0.5F, 0.5F, 0.5F);
      var2.N(class02058.u.N(-var1.L));
      var2.N(-0.5F, -0.5F, -0.5F);
      float f = var1.y;
      f = 1.0F - f;
      f = 1.0F - f * f * f;
      class05913 class05913 = class05911.N(var1.u, var1.N);
      class07311 class07311 = class05913.N(class06851::R);
      class08388 class08388 = this.N.N(class05913);
      if (var1.N != class06638.field_12569) {
         if (var1.N == class06638.field_12574) {
            var3.N(this.L, f, var2, class07311, var1.Z, class01384.u, -1, class08388, 0, var1.z);
         } else {
            var3.N(this.u, f, var2, class07311, var1.Z, class01384.u, -1, class08388, 0, var1.z);
         }
      } else {
         var3.N(this.y, f, var2, class07311, var1.Z, class01384.u, -1, class08388, 0, var1.z);
      }

      var2.y();
   }

   private class00959 N(class00394 var1, boolean var2) {
      if (var1 instanceof class07281) {
         return class00959.field_62697;
      } else if (var2) {
         return class00959.field_62698;
      } else if (var1 instanceof class00476) {
         return class00959.field_62699;
      } else if (var1.w().i() instanceof class08950 class08950) {
         return switch (class08950.y()) {
            case field_28704 -> class00959.field_62700;
            case field_28705 -> class00959.field_62701;
            case field_28706 -> class00959.field_62702;
            case field_28707 -> class00959.field_62703;
         };
      } else {
         return class00959.field_62704;
      }
   }

   public static boolean N() {
      return class06842.L();
   }

   public void N(T var1, class00958 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class06025<? extends class00379> class06025;
      label30: {
         class03358.super.N((T)var1, var2, var3, var4, var5);
         boolean flag = var1.G() != null;
         class00500 class00500 = flag ? var1.w() : class00869.LA.W().y(class00860.u, class07211.field_11035);
         var2.N = class00500.y(class00860.i) ? class00500.L(class00860.i) : class06638.field_12569;
         var2.L = class00500.L(class00860.u).U();
         var2.u = this.N(var1, this.i);
         if (flag) {
            class00891 class00891 = class00500.i();
            if (class00891 instanceof class00860) {
               class06025 = ((class00860)class00891).N(class00500, var1.G(), var1.d(), true);
               break label30;
            }
         }

         class06025 = class06029::y;
      }

      var2.y = class06025.apply(class00860.N((class07274)var1)).get(var3);
      if (var2.N != class06638.field_12569) {
         var2.Z = class06025.apply(new class05993<>()).applyAsInt(var2.Z);
      }
   }
}
