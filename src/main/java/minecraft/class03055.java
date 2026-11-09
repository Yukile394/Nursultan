package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.BitSet;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class03055 {
   public static final Codec<class03055> N = class05033.N(class03084::values).dispatch(class03055::L, class03084::N);
   public static final class03055 y = new class03055(new BitSet(0), class03084.field_39948);
   public static final class03055 L = new class03055(new BitSet(0), class03084.field_39947);
   public static final class00405 u = class00405.N.N(class06541.field_1063).N(new class00401(class00392.L("chat.filtered")));
   static final MapCodec<class03055> i = MapCodec.unit(L);
   static final MapCodec<class03055> R = MapCodec.unit(y);
   static final MapCodec<class03055> M = class06338.O.xmap(class03055::new, class03055::u).fieldOf("value");
   private static final char B = '#';
   private final BitSet Z;
   private final class03084 z;

   private class03084 L() {
      return this.z;
   }

   public class03055(int var1) {
      this(new BitSet(var1), class03084.field_39949);
   }

   private class03055(BitSet var1) {
      super();
      this.Z = var1;
      this.z = class03084.field_39949;
   }

   private class03055(BitSet var1, class03084 var2) {
      super();
      this.Z = var1;
      this.z = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class03055 class03055 = (class03055)var1;
         return this.Z.equals(class03055.Z) && this.z == class03055.z;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int ix = this.Z.hashCode();
      return 31 * ix + this.z.hashCode();
   }

   private BitSet u() {
      return this.Z;
   }

   @Nullable
   public class00392 y(String var1) {
      return switch (this.z) {
         case field_39947 -> class00392.y(var1);
         case field_39948 -> null;
         case field_39949 -> {
            class05216 class05216 = class00392.i();
            int ix = 0;
            boolean flag = this.Z.get(0);

            while (true) {
               int j = flag ? this.Z.nextClearBit(ix) : this.Z.nextSetBit(ix);
               j = j < 0 ? var1.length() : j;
               if (j == ix) {
                  yield class05216;
               }

               if (flag) {
                  class05216.y(class00392.y(StringUtils.repeat('#', j - ix)).L(u));
               } else {
                  class05216.i(var1.substring(ix, j));
               }

               flag = !flag;
               ix = j;
            }
         }
      };
   }

   public boolean y() {
      return this.z == class03084.field_39948;
   }

   public void N(int var1) {
      this.Z.set(var1);
   }

   public static class03055 N(class00667 var0) {
      return switch ((class03084)var0.y(class03084.class)) {
         case field_39947 -> L;
         case field_39948 -> y;
         case field_39949 -> new class03055(var0.t(), class03084.field_39949);
      };
   }

   public static void N(class00667 var0, class03055 var1) {
      var0.N((Enum<?>)var1.z);
      if (var1.z == class03084.field_39949) {
         var0.N(var1.Z);
      }
   }

   @Nullable
   public String N(String var1) {
      return switch (this.z) {
         case field_39947 -> var1;
         case field_39948 -> null;
         case field_39949 -> {
            char[] achar = var1.toCharArray();

            for (int ix = 0; ix < achar.length && ix < this.Z.length(); ix++) {
               if (this.Z.get(ix)) {
                  achar[ix] = '#';
               }
            }

            yield new String(achar);
         }
      };
   }

   public boolean N() {
      return this.z == class03084.field_39947;
   }
}
