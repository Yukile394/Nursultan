package minecraft;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class class05828 extends class04991<class05818> {
   protected int L() {
      return this.u.y;
   }

   @Override
   protected class00536 M(long var1) {
      class00536 class00536x = (class00536)this.M.get(var1);
      if (class00536x != null) {
         return class00536x;
      } else {
         int i = this.u.L.get(class01296.R(var1));
         if (i != this.u.y && class01296.L(var1) < i) {
            long j = class01296.N(var1, class07211.field_11036);

            class00536 class00536x;
            while ((class00536x = this.N(j, true)) == null) {
               j = class01296.N(j, class07211.field_11036);
            }

            return N(class00536x);
         } else {
            return this.z(var1) ? new class00536(15) : new class00536();
         }
      }
   }

   protected class05828(class00538 var1) {
      super(class00772.field_9284, var1, new class05818(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   protected void B(long var1) {
      int i = class01296.L(var1);
      if (this.u.y > i) {
         this.u.y = i;
         this.u.L.defaultReturnValue(this.u.y);
      }

      long j = class01296.R(var1);
      if (this.u.L.get(j) < i + 1) {
         this.u.L.put(j, i + 1);
      }
   }

   @Override
   protected void Z(long var1) {
      long i = class01296.R(var1);
      int j = class01296.L(var1);
      if (this.u.L.get(i) == j + 1) {
         long k;
         for (k = var1; !this.y(k) && this.N(j); k = class01296.N(k, class07211.field_11033)) {
            j--;
         }

         if (this.y(k)) {
            this.u.L.put(i, j + 1);
         } else {
            this.u.L.remove(i);
         }
      }
   }

   protected int i(long var1, boolean var3) {
      long i = class01296.i(var1);
      int j = class01296.L(i);
      class05818 class05818 = var3 ? this.u : this.L;
      int k = class05818.L.get(class01296.R(i));
      if (k != class05818.y && j < k) {
         class00536 class00536 = this.N(class05818, i);
         if (class00536 == null) {
            for (var1 = class07209.method_10091(var1); class00536 == null; class00536 = this.N(class05818, i)) {
               if (++j >= k) {
                  return 15;
               }

               i = class01296.N(i, class07211.field_11036);
            }
         }

         return class00536.N(
            class01296.y(class07209.method_10061(var1)), class01296.y(class07209.method_10071(var1)), class01296.y(class07209.method_10083(var1))
         );
      } else {
         return var3 && !this.z(i) ? 0 : 15;
      }
   }

   protected int m(long var1) {
      return this.u.L.get(var1);
   }

   private static class00536 N(class00536 var0) {
      if (var0.L()) {
         return var0.y();
      } else {
         byte[] abyte = var0.N();
         byte[] abyte1 = new byte[2048];

         for (int i = 0; i < 16; i++) {
            System.arraycopy(abyte, 0, abyte1, i * 128, 128);
         }

         return new class00536(abyte1);
      }
   }

   protected boolean N(int var1) {
      return var1 >= this.u.y;
   }

   @Override
   protected int N(long var1) {
      return this.i(var1, false);
   }

   protected boolean W(long var1) {
      long i = class01296.R(var1);
      int j = this.u.L.get(i);
      return j == this.u.y || class01296.L(var1) >= j;
   }
}
