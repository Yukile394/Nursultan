package minecraft;

public class class00095 {
   public static final class06563[] N = new class06563[]{
      class06563.field_7952,
      class06563.field_7967,
      class06563.field_7951,
      class06563.field_7966,
      class06563.field_7955,
      class06563.field_7942,
      class06563.field_7961,
      class06563.field_7947,
      class06563.field_7946,
      class06563.field_7954,
      class06563.field_7964,
      class06563.field_7958
   };

   public class00095() {
      super();
   }

   public static int N(class00111 var0, float var1) {
      int i = class04995.y(var1);
      int j = i / var0.field_60689;
      int k = var0.field_60691.length;
      int l = j % k;
      int i1 = (j + 1) % k;
      float f = (i % var0.field_60689 + class04995.M(var1)) / var0.field_60689;
      int j1 = var0.N(var0.field_60691[l]);
      int k1 = var0.N(var0.field_60691[i1]);
      return class02566.N(f, j1, k1);
   }

   static int N(class06563 var0, float var1) {
      if (var0 == class06563.field_7952) {
         return -1644826;
      } else {
         int i = var0.L();
         return class02566.y(255, class04995.y(class02566.L(i) * var1), class04995.y(class02566.u(i) * var1), class04995.y(class02566.i(i) * var1));
      }
   }
}
