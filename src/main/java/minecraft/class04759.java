package minecraft;

import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntMaps;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

class class04759 extends class04766 {
   private int M;
   private final Long2IntMap B;
   private final LongSet Z;

   private boolean L(int var1) {
      return var1 <= this.M;
   }

   protected class04759(class04778 var1, int var2) {
      super(var1, var2);
      this.u = var1;
      this.B = Long2IntMaps.synchronize(new Long2IntOpenHashMap());
      this.Z = new LongOpenHashSet();
      this.M = 0;
      this.B.defaultReturnValue(var2 + 2);
   }

   private void N(long var1, int var3, boolean var4, boolean var5) {
      if (var4 != var5) {
         class01596 class01596 = new class01596(class01624.z, class04778.N);
         if (var5) {
            this.u.i.N(() -> this.u.M.execute(() -> {
               if (this.L(this.L(var1))) {
                  this.u.L.N(var1, class01596);
                  this.u.R.add(var1);
               } else {
                  this.u.i.N(var1, () -> {}, false);
               }
            }), var1, () -> var3);
         } else {
            this.u.i.N(var1, () -> this.u.M.execute(() -> this.u.L.y(var1, class01596)), true);
         }
      }
   }

   public void N(int var1) {
      ObjectIterator<Entry> objectiterator = this.N.long2ByteEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         byte b0 = entry.getByteValue();
         long i = entry.getLongKey();
         this.N(i, b0, this.L(b0), b0 <= var1);
      }

      this.M = var1;
   }

   @Override
   protected void N(long var1, int var3, int var4) {
      this.Z.add(var1);
   }

   @Override
   public void N() {
      super.N();
      if (!this.Z.isEmpty()) {
         LongIterator longiterator = this.Z.iterator();

         while (longiterator.hasNext()) {
            long i = longiterator.nextLong();
            int j = this.B.get(i);
            int k = this.L(i);
            if (j != k) {
               this.u.i.method_17209(new class07321(i), () -> this.B.get(i), k, var3 -> {
                  if (var3 >= this.B.defaultReturnValue()) {
                     this.B.remove(i);
                  } else {
                     this.B.put(i, var3);
                  }
               });
               this.N(i, k, this.L(j), this.L(k));
            }
         }

         this.Z.clear();
      }
   }
}
