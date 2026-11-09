package minecraft;

import Nursultan.class11332;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08593 extends class06555 {
   private static final int L = 4;
   private static final Logger u = LogUtils.getLogger();
   private static final Codec<Pair<class07321, class01596>> i = Codec.mapPair(class07321.N.fieldOf("chunk_pos"), class01596.N).codec();
   public static final Codec<class08593> N = RecordCodecBuilder.create(
      var0 -> var0.group(i.listOf().optionalFieldOf("tickets", List.of()).forGetter(class08593::R)).apply(var0, class08593::N)
   );
   public static final class08413<class08593> y = new class08413<>("chunks", class08593::new, N, class05715.field_45078);
   private final Long2ObjectOpenHashMap<List<class01596>> R;
   private final Long2ObjectOpenHashMap<List<class01596>> M;
   private LongSet B;
   @Nullable
   private class08617 Z;
   @Nullable
   private class08617 z;
   private final Long2ObjectOpenHashMap U = new Long2ObjectOpenHashMap();

   public boolean L() {
      ObjectIterator<List<class01596>> objectiterator = this.R.values().iterator();

      while (objectiterator.hasNext()) {
         Iterator<class01596> iterator = ((List)objectiterator.next()).iterator();

         while (iterator.hasNext()) {
            if (iterator.next().N().u()) {
               return true;
            }
         }
      }

      return false;
   }

   private void M() {
      this.B = this.N((Predicate<class01596>)(var0 -> var0.N().equals(class01624.E)));
   }

   private class08593(Long2ObjectOpenHashMap<List<class01596>> var1, Long2ObjectOpenHashMap<List<class01596>> var2) {
      super();
      this.B = new LongOpenHashSet();
      this.R = var1;
      this.M = var2;
      this.M();
   }

   public class08593() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   public LongSet i() {
      return this.B;
   }

   public void u() {
      this.N((class11332)((var0, var1) -> var0.N() != class01624.P), this.M);
   }

   public void y(class01596 var1, class07321 var2) {
      this.y(var2.y(), var1);
   }

   public boolean y(long var1, class01596 var3) {
      List<class01596> list = (List<class01596>)this.R.get(var1);
      if (list == null) {
         return false;
      } else {
         boolean flag = false;
         Iterator<class01596> iterator = list.iterator();

         while (iterator.hasNext()) {
            class01596 class01596 = iterator.next();
            if (N(var3, class01596)) {
               iterator.remove();
               if (class07529.H) {
                  u.debug("RTI {} {}", new class07321(var1), class01596);
               }

               flag = true;
               break;
            }
         }

         if (!flag) {
            return false;
         } else {
            this.y(var1, var3, null, list);
            if (list.isEmpty()) {
               this.R.remove(var1);
            }

            if (var3.N().L() && this.z != null) {
               this.z.update(var1, N(list, true), false);
            }

            if (var3.N().y() && this.Z != null) {
               this.Z.update(var1, N(list, false), false);
            }

            if (var3.N().equals(class01624.E)) {
               this.M();
            }

            this.method_80();
            return true;
         }
      }
   }

   public void y(class01624 var1, class07321 var2, int var3) {
      class01596 class01596 = new class01596(var1, class03469.N(class04763.field_44855) - var3);
      this.y(var2.y(), class01596);
   }

   @Nullable
   private static class01596 y(@Nullable List<class01596> var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else {
         class01596 class01596x = null;

         for (class01596 class01596x : var0) {
            if (class01596x == null || class01596x.y() < class01596x.y()) {
               if (var1 && class01596x.N().L()) {
                  class01596x = class01596x;
               } else if (!var1 && class01596x.N().y()) {
                  class01596x = class01596x;
               }
            }
         }

         return class01596x;
      }
   }

   private static boolean y(List var0) {
      if (!var0.isEmpty()) {
         Iterator iterator = var0.iterator();

         while (iterator.hasNext()) {
            if (((class01596)iterator.next()).N().R()) {
               return false;
            }
         }
      }

      return true;
   }

   public String y(long var1, boolean var3) {
      class01596 class01596 = y(this.N(var1), var3);
      return class01596 == null ? "no_ticket" : class01596.toString();
   }

   private void y(long var1, class01596 var3, CallbackInfoReturnable var4, List var5) {
      if (var3.N().R() && y(var5)) {
         this.U.remove(var1);
      }
   }

   private List<class01596> y(long var1) {
      return (List<class01596>)this.R.computeIfAbsent(var1, var0 -> new ObjectArrayList(4));
   }

   public boolean y() {
      return !this.R.isEmpty();
   }

   public void y(@Nullable class08617 var1) {
      this.z = var1;
   }

   public void N() {
      ObjectIterator objectiterator = Long2ObjectMaps.fastIterable(this.M).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();

         for (class01596 class01596 : (List)entry.getValue()) {
            this.N(entry.getLongKey(), class01596);
         }
      }

      this.M.clear();
   }

   public void N(@Nullable class08617 var1) {
      this.Z = var1;
   }

   private static class08593 N(List<Pair<class07321, class01596>> var0) {
      Long2ObjectOpenHashMap long2objectopenhashmap = new Long2ObjectOpenHashMap();

      for (Pair pair : var0) {
         class07321 class07321 = (class07321)pair.getFirst();
         ((List)long2objectopenhashmap.computeIfAbsent(class07321.y(), var0x -> new ObjectArrayList(4))).add((class01596)pair.getSecond());
      }

      return new class08593(new Long2ObjectOpenHashMap(4), long2objectopenhashmap);
   }

   private Long2ObjectOpenHashMap N(Long2ObjectOpenHashMap var1, Long2ObjectOpenHashMap var2) {
      return var2 == null ? this.U : var1;
   }

   private boolean N(boolean var1, Entry var2, Long2ObjectOpenHashMap var3, ObjectIterator var4) {
      if (!var1 && y((List)var2.getValue())) {
         if (var3 == null) {
            var4.remove();
         } else {
            this.U.remove(var2.getLongKey());
         }
      }

      return var1;
   }

   private void N(CallbackInfo var1, Entry var2, Long2ObjectOpenHashMap var3) {
      if (var3 == null) {
         this.R.remove(var2.getLongKey());
      } else {
         this.U.remove(var2.getLongKey());
      }
   }

   private static void N(BiConsumer<class07321, class01596> var0, Long2ObjectOpenHashMap<List<class01596>> var1) {
      ObjectIterator objectiterator = Long2ObjectMaps.fastIterable(var1).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class07321 class07321 = new class07321(entry.getLongKey());

         for (class01596 class01596 : (List)entry.getValue()) {
            var0.accept(class07321, class01596);
         }
      }
   }

   private void N(BiConsumer<class07321, class01596> var1) {
      N(var1, this.R);
      N(var1, this.M);
   }

   private void N(long var1, class01596 var3, CallbackInfoReturnable var4, List var5) {
      if (var3.N().R()) {
         this.U.put(var1, var5);
      }
   }

   public boolean N(long var1, class01596 var3) {
      List<class01596> list = this.y(var1);

      for (class01596 class01596 : list) {
         if (N(var3, class01596)) {
            class01596.L();
            this.method_80();
            return false;
         }
      }

      int ix = N(list, true);
      int j = N(list, false);
      this.N(var1, var3, null, list);
      list.add(var3);
      if (class07529.H) {
         u.debug("ATI {} {}", new class07321(var1), var3);
      }

      if (var3.N().L() && var3.y() < ix && this.z != null) {
         this.z.update(var1, var3.y(), true);
      }

      if (var3.N().y() && var3.y() < j && this.Z != null) {
         this.Z.update(var1, var3.y(), true);
      }

      if (var3.N().equals(class01624.E)) {
         this.B.add(var1);
      }

      this.method_80();
      return true;
   }

   public void N(class01596 var1, class07321 var2) {
      this.N(var2.y(), var1);
   }

   public void N(class01624 var1, class07321 var2, int var3) {
      class01596 class01596 = new class01596(var1, class03469.N(class04763.field_44855) - var3);
      this.N(var2.y(), class01596);
   }

   public List<class01596> N(long var1) {
      return (List<class01596>)this.R.getOrDefault(var1, List.of());
   }

   private static boolean N(class01596 var0, class01596 var1) {
      return var1.N() == var0.N() && var1.y() == var0.y();
   }

   private static int N(List<class01596> var0, boolean var1) {
      class01596 class01596 = y(var0, var1);
      return class01596 == null ? class03469.y + 1 : class01596.y();
   }

   public int N(long var1, boolean var3) {
      return N(this.N(var1), var3);
   }

   public void N(class11332 var1, @Nullable Long2ObjectOpenHashMap<List<class01596>> var2) {
      Long2ObjectOpenHashMap<List<class01596>> long2objectopenhashmap = this.R;
      ObjectIterator objectiterator = this.N(long2objectopenhashmap, var2).long2ObjectEntrySet().fastIterator();
      boolean flag = false;

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         Iterator iterator = ((List)entry.getValue()).iterator();
         long ix = entry.getLongKey();
         boolean flag1 = false;
         boolean flag2 = false;

         while (iterator.hasNext()) {
            class01596 class01596 = (class01596)iterator.next();
            if (var1.test(class01596, ix)) {
               if (var2 != null) {
                  ((List)var2.computeIfAbsent(ix, var1x -> new ObjectArrayList(((List)entry.getValue()).size()))).add(class01596);
               }

               iterator.remove();
               if (class01596.N().y()) {
                  flag2 = true;
               }

               if (class01596.N().L()) {
                  flag1 = true;
               }

               if (class01596.N().equals(class01624.E)) {
                  flag = true;
               }
            }
         }

         if (flag2 || flag1) {
            if (flag2 && this.Z != null) {
               this.Z.update(ix, N((List<class01596>)entry.getValue(), false), false);
            }

            if (flag1 && this.z != null) {
               this.z.update(ix, N((List<class01596>)entry.getValue(), true), false);
            }

            this.method_80();
            if (this.N(((List)entry.getValue()).isEmpty(), entry, var2, objectiterator)) {
               this.N(null, entry, var2);
               objectiterator.remove();
            }
         }
      }

      if (flag) {
         this.M();
      }
   }

   public void N(int var1, class01624 var2) {
      ArrayList arraylist = new ArrayList();
      ObjectIterator<Entry<List<class01596>>> objectiterator = this.R.long2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();

         for (class01596 class01596x : (List)entry.getValue()) {
            if (class01596x.N() == var2) {
               arraylist.add(Pair.of(class01596x, entry.getLongKey()));
            }
         }
      }

      for (Pair pair : arraylist) {
         Long olong = (Long)pair.getSecond();
         class01596 class01596x = (class01596)pair.getFirst();
         this.y(olong, class01596x);
         class01624 class01624 = class01596x.N();
         this.N(olong, new class01596(class01624, var1));
      }
   }

   public boolean N(class07321 var1, boolean var2) {
      class01596 class01596 = new class01596(class01624.E, class06265.L);
      return var2 ? this.N(var1.y(), class01596) : this.y(var1.y(), class01596);
   }

   private LongSet N(Predicate<class01596> var1) {
      LongOpenHashSet longopenhashset = new LongOpenHashSet();
      ObjectIterator objectiterator = Long2ObjectMaps.fastIterable(this.R).iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();

         for (class01596 class01596 : (List)entry.getValue()) {
            if (var1.test(class01596)) {
               longopenhashset.add(entry.getLongKey());
               break;
            }
         }
      }

      return longopenhashset;
   }

   private boolean N(class06265 var1, class01596 var2, long var3) {
      if (!var2.N().R()) {
         return false;
      } else if (var2.N().i()) {
         return true;
      } else {
         class04745 class04745 = var1.N(var3);
         return class04745 == null || class04745.B();
      }
   }

   public void N(class06265 var1) {
      this.N((var2, var3) -> {
         if (this.N(var1, var2, var3)) {
            var2.u();
            return var2.i();
         } else {
            return false;
         }
      }, null);
      this.method_80();
   }

   private List<Pair<class07321, class01596>> R() {
      ArrayList arraylist = new ArrayList();
      this.N((BiConsumer<class07321, class01596>)((var1x, var2) -> {
         if (var2.N().N()) {
            arraylist.add(new Pair(var1x, var2));
         }
      }));
      return arraylist;
   }
}
