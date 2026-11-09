package minecraft;

import Nursultan.class10485;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.jspecify.annotations.Nullable;

public abstract class class04991<M extends class05017<M>> {
   private final class00772 Z;
   protected final class00538 N;
   protected final Long2ByteMap y = new Long2ByteOpenHashMap();
   private final LongSet z = new LongOpenHashSet();
   protected volatile M L;
   protected final M u;
   protected final LongSet i = new LongOpenHashSet();
   protected final LongSet R = new LongOpenHashSet();
   protected final Long2ObjectMap<class00536> M = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());
   private final LongSet U = new LongOpenHashSet();
   private final LongSet E = new LongOpenHashSet();
   protected volatile boolean B;

   @Nullable
   protected class00536 L(long var1) {
      class00536 class00536 = this.u.L(var1);
      if (class00536 == null) {
         return null;
      } else {
         if (this.i.add(var1)) {
            class00536 = class00536.y();
            this.u.N(var1, class00536);
            this.u.L();
         }

         return class00536;
      }
   }

   public void L(long var1, boolean var3) {
      if (var3) {
         this.U.add(var1);
      } else {
         this.U.remove(var1);
      }
   }

   protected class00536 M(long var1) {
      class00536 class00536 = (class00536)this.M.get(var1);
      return class00536 != null ? class00536 : new class00536();
   }

   protected class04991(class00772 var1, class00538 var2, M var3) {
      super();
      this.Z = var1;
      this.N = var2;
      this.u = (M)var3;
      this.L = (M)var3.y();
      this.L.u();
      this.y.defaultReturnValue((byte)0);
   }

   protected void B(long var1) {
   }

   protected void Z(long var1) {
   }

   protected int i(long var1) {
      long ix = class01296.i(var1);
      return this.N(ix, true)
         .N(class01296.y(class07209.method_10061(var1)), class01296.y(class07209.method_10071(var1)), class01296.y(class07209.method_10083(var1)));
   }

   private void m(long var1) {
      this.E.add(var1);
      this.B = true;
   }

   protected boolean U(long var1) {
      return this.z.contains(var1);
   }

   protected boolean z(long var1) {
      long ix = class01296.R(var1);
      return this.z.contains(ix);
   }

   @Nullable
   public class00536 u(long var1) {
      class00536 class00536 = (class00536)this.M.get(var1);
      return class00536 != null ? class00536 : this.N(var1, false);
   }

   protected void u(long var1, boolean var3) {
      byte b0 = this.y.get(var1);
      byte b1 = class10485.N(b0, !var3);
      if (b0 != b1) {
         this.N(var1, b1);
         int ix = var3 ? -1 : 1;

         for (int j = -1; j <= 1; j++) {
            for (int k = -1; k <= 1; k++) {
               for (int l = -1; l <= 1; l++) {
                  if (j != 0 || k != 0 || l != 0) {
                     long i1 = class01296.N(var1, j, k, l);
                     byte b2 = this.y.get(i1);
                     this.N(i1, class10485.N(b2, class10485.y(b2) + ix));
                  }
               }
            }
         }
      }
   }

   protected boolean y(long var1) {
      return this.N(var1, true) != null;
   }

   protected void y(long var1, boolean var3) {
      if (var3) {
         this.z.add(var1);
      } else {
         this.z.remove(var1);
      }
   }

   protected void y() {
      if (!this.i.isEmpty()) {
         class05017 class05017 = this.u.y();
         class05017.u();
         this.L = (M)class05017;
         this.i.clear();
      }

      if (!this.R.isEmpty()) {
         LongIterator longiterator = this.R.iterator();

         while (longiterator.hasNext()) {
            long ix = longiterator.nextLong();
            this.N.N(this.Z, class01296.N(ix));
         }

         this.R.clear();
      }
   }

   public class04993 E(long var1) {
      return class10485.L(this.y.get(var1));
   }

   @Nullable
   protected class00536 N(long var1, boolean var3) {
      return this.N(var3 ? this.u : this.L, var1);
   }

   protected void N(long var1, byte var3) {
      if (var3 != 0) {
         if (this.y.put(var1, var3) == 0) {
            this.W(var1);
         }
      } else if (this.y.remove(var1) != 0) {
         this.m(var1);
      }
   }

   protected void N(long var1, int var3) {
      long ix = class01296.i(var1);
      class00536 class00536;
      if (this.i.add(ix)) {
         class00536 = this.u.N(ix);
      } else {
         class00536 = this.N(ix, true);
      }

      class00536.N(class01296.y(class07209.method_10061(var1)), class01296.y(class07209.method_10071(var1)), class01296.y(class07209.method_10083(var1)), var3);
      class01296.N(var1, this.R::add);
   }

   protected abstract int N(long var1);

   protected void N(class05015<M, ?> var1) {
      if (this.B) {
         this.B = false;
         LongIterator var2 = this.E.iterator();

         while (var2.hasNext()) {
            long ix = (Long)var2.next();
            class00536 class00536xx = (class00536)this.M.remove(ix);
            class00536 class00536x = this.u.u(ix);
            if (this.U.contains(class01296.R(ix))) {
               if (class00536xx != null) {
                  this.M.put(ix, class00536xx);
               } else if (class00536x != null) {
                  this.M.put(ix, class00536x);
               }
            }
         }

         this.u.L();
         var2 = this.E.iterator();

         while (var2.hasNext()) {
            long k = (Long)var2.next();
            this.Z(k);
            this.i.add(k);
         }

         this.E.clear();
         ObjectIterator<Entry<class00536>> objectiterator = Long2ObjectMaps.fastIterator(this.M);

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            long j = entry.getLongKey();
            if (this.y(j)) {
               class00536 class00536 = (class00536)entry.getValue();
               if (this.u.L(j) != class00536) {
                  this.u.N(j, class00536);
                  this.i.add(j);
               }

               objectiterator.remove();
            }
         }

         this.u.L();
      }
   }

   protected boolean N() {
      return this.B;
   }

   protected void N(long var1, @Nullable class00536 var3) {
      if (var3 != null) {
         this.M.put(var1, var3);
         this.B = true;
      } else {
         this.M.remove(var1);
      }
   }

   @Nullable
   protected class00536 N(M var1, long var2) {
      return var1.L(var2);
   }

   private void W(long var1) {
      if (!this.E.remove(var1)) {
         this.u.N(var1, this.M(var1));
         this.i.add(var1);
         this.B(var1);
         this.R(var1);
         this.B = true;
      }
   }

   protected void R(long var1) {
      int ix = class01296.y(var1);
      int j = class01296.L(var1);
      int k = class01296.u(var1);

      for (int l = -1; l <= 1; l++) {
         for (int i1 = -1; i1 <= 1; i1++) {
            for (int j1 = -1; j1 <= 1; j1++) {
               this.R.add(class01296.y(ix + i1, j + j1, k + l));
            }
         }
      }
   }
}
