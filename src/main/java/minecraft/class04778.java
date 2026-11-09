package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ByteMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongConsumer;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ByteMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class04778 {
   private static final Logger B = LogUtils.getLogger();
   static final int N = class03469.N(class04763.field_13877);
   final Long2ObjectMap<ObjectSet<class04770>> y = new Long2ObjectOpenHashMap();
   private final class01313 Z;
   private final class01821 z;
   final class08593 L;
   private final class04766 U = new class04766(this, 8);
   private final class04759 E = new class04759(this, 32);
   protected final Set<class04745> u = new ReferenceOpenHashSet();
   final class08196 i;
   final LongSet R = new LongOpenHashSet();
   final Executor M;
   private int W = 10;

   public boolean L(long var1) {
      return class03469.u(this.z.L(var1));
   }

   public String L() {
      return this.i.u();
   }

   protected class04778(class08593 var1, Executor var2, Executor var3) {
      super();
      this.L = var1;
      this.Z = new class01313(this, var1);
      this.z = new class01821(var1);
      class08199<Runnable> class08199 = class08199.N("player ticket throttler", var3);
      this.i = new class08196(class08199, var2, 4);
      this.M = var3;
   }

   private int i() {
      return Math.max(0, class03469.N(class04763.field_13877) - this.W);
   }

   public class02584 i(long var1) {
      this.U.N();
      int ix = this.U.L(var1);
      if (ix <= class00803.L) {
         return class02584.field_52394;
      } else {
         return ix > 8 ? class02584.field_52395 : class02584.field_52396;
      }
   }

   public boolean u(long var1) {
      return class03469.i(this.z.L(var1));
   }

   public boolean u() {
      return this.L.y();
   }

   public LongIterator y() {
      this.U.N();
      return this.U.N.keySet().iterator();
   }

   @Nullable
   protected abstract class04745 y(long var1);

   public void y(int var1) {
      if (var1 != this.W) {
         this.W = var1;
         this.L.N(this.i(), class01624.U);
      }
   }

   public void y(class01296 var1, class04770 var2) {
      class07321 class07321 = var1.E();
      long ix = class07321.y();
      ObjectSet<class04770> objectset = (ObjectSet<class04770>)this.y.get(ix);
      objectset.remove(var2);
      if (objectset.isEmpty()) {
         this.y.remove(ix);
         this.U.y(ix, Integer.MAX_VALUE, false);
         this.E.y(ix, Integer.MAX_VALUE, false);
         this.L.y(new class01596(class01624.U, this.i()), class07321);
      }
   }

   protected abstract boolean N(long var1);

   public void N(class01296 var1, class04770 var2) {
      class07321 class07321 = var1.E();
      long ix = class07321.y();
      ((ObjectSet)this.y.computeIfAbsent(ix, var0 -> new ObjectOpenHashSet())).add(var2);
      this.U.y(ix, 0, true);
      this.E.y(ix, 0, true);
      this.L.N(new class01596(class01624.U, this.i()), class07321);
   }

   @Nullable
   protected abstract class04745 N(long var1, int var3, @Nullable class04745 var4, int var5);

   protected void N(int var1) {
      this.E.N(var1);
   }

   public int N(long var1, boolean var3) {
      return var3 ? this.z.L(var1) : this.Z.L(var1);
   }

   public boolean N(class06265 var1) {
      this.U.N();
      this.z.N();
      this.E.N();
      int ix = Integer.MAX_VALUE - this.Z.N(Integer.MAX_VALUE);
      boolean flag = ix != 0;
      if (flag && class07529.H) {
         B.debug("DMU {}", ix);
      }

      if (!this.u.isEmpty()) {
         for (class04745 class04745x : this.u) {
            class04745x.N(var1);
         }

         for (class04745 class04745 : this.u) {
            class04745.N(var1, this.M);
         }

         this.u.clear();
         return true;
      } else {
         if (!this.R.isEmpty()) {
            LongIterator var4 = this.R.iterator();

            while (var4.hasNext()) {
               long j = var4.nextLong();
               if (this.L.N(j).stream().anyMatch(var0 -> var0.N() == class01624.z)) {
                  class04745 class04745xx = var1.N(j);
                  if (class04745xx == null) {
                     throw new IllegalStateException();
                  }

                  class04745xx.y().thenAccept(var3x -> this.M.execute(() -> this.i.N(j, () -> {}, false)));
               }
            }

            this.R.clear();
         }

         return flag;
      }
   }

   public void N(LongConsumer var1) {
      ObjectIterator<Entry> objectiterator = Long2ByteMaps.fastIterable(this.z.y).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         byte b0 = entry.getByteValue();
         long ix = entry.getLongKey();
         if (class03469.u(b0)) {
            var1.accept(ix);
         }
      }
   }

   public int N() {
      this.U.N();
      return this.U.N.size();
   }
}
