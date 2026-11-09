package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class03987 {
   protected static final int N = 2;
   protected static final int y = 150;
   private static final int M = 1;
   private int B = class04995.y(class06069.u(), 0, 2);
   int L;
   private static final Codec<Pair<UUID, Integer>> Z = RecordCodecBuilder.create(
      var0 -> var0.group(class01487.N.fieldOf("uuid").forGetter(Pair::getFirst), class06338.T.fieldOf("anger").forGetter(Pair::getSecond))
         .apply(var0, Pair::of)
   );
   private final Predicate<class07049> z;
   protected final ArrayList<class07049> u;
   private final class04001 U;
   protected final Object2IntMap<class07049> i;
   protected final Object2IntMap<UUID> R;

   private void L() {
      this.L = 0;
      this.u.sort(this.U);
      if (this.u.size() == 1) {
         this.L = this.i.getInt(this.u.get(0));
      }
   }

   public class03987(Predicate<class07049> var1, List<Pair<UUID, Integer>> var2) {
      super();
      this.z = var1;
      this.u = new ArrayList<>();
      this.U = new class04001(this);
      this.i = new Object2IntOpenHashMap();
      this.R = new Object2IntOpenHashMap(var2.size());
      var2.forEach(var1x -> this.R.put((UUID)var1x.getFirst(), (Integer)var1x.getSecond()));
   }

   @Nullable
   private class07049 u() {
      return this.u.stream().filter(this.z).findFirst().orElse(null);
   }

   public int y(@Nullable class07049 var1) {
      return var1 == null ? this.L : this.i.getInt(var1);
   }

   private List<Pair<UUID, Integer>> y() {
      return Streams.concat(
            new Stream[]{
               this.u.stream().map(var1 -> Pair.of(var1.method_5667(), this.i.getInt(var1))),
               this.R.object2IntEntrySet().stream().map(var0 -> Pair.of((UUID)var0.getKey(), var0.getIntValue()))
            }
         )
         .collect(Collectors.toList());
   }

   public static Codec<class03987> N(Predicate<class07049> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(Z.listOf().fieldOf("suspects").orElse(Collections.emptyList()).forGetter(class03987::y))
            .apply(var1, var1x -> new class03987(var0, var1x))
      );
   }

   public void N(class04782 var1, Predicate<class07049> var2) {
      this.B--;
      if (this.B <= 0) {
         this.N(var1);
         this.B = 2;
      }

      ObjectIterator<Entry<UUID>> objectiterator = this.R.object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         int ix = entry.getIntValue();
         if (ix <= 1) {
            objectiterator.remove();
         } else {
            entry.setValue(ix - 1);
         }
      }

      ObjectIterator objectiterator1 = this.i.object2IntEntrySet().iterator();

      while (objectiterator1.hasNext()) {
         Entry entry1 = (Entry)objectiterator1.next();
         int j = entry1.getIntValue();
         class07049 class07049 = (class07049)entry1.getKey();
         class07062 class07062 = class07049.method_35049();
         if (j > 1 && var2.test(class07049) && class07062 == null) {
            entry1.setValue(j - 1);
         } else {
            this.u.remove(class07049);
            objectiterator1.remove();
            if (j > 1 && class07062 != null) {
               switch (class07062) {
                  case field_27002:
                  case field_27000:
                  case field_27001:
                     this.R.put(class07049.method_5667(), j - 1);
               }
            }
         }
      }

      this.L();
   }

   private void N(class04782 var1) {
      ObjectIterator<Entry<UUID>> objectiterator = this.R.object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         int ix = entry.getIntValue();
         class07049 class07049 = var1.method_66347((UUID)entry.getKey());
         if (class07049 != null) {
            this.i.put(class07049, ix);
            this.u.add(class07049);
            objectiterator.remove();
         }
      }
   }

   public int N(class07049 var1, int var2) {
      boolean flag = !this.i.containsKey(var1);
      int ix = this.i.computeInt(var1, (var1x, var2x) -> Math.min(150, (var2x == null ? 0 : var2x) + var2));
      if (flag) {
         int j = this.R.removeInt(var1.method_5667());
         ix += j;
         this.i.put(var1, ix);
         this.u.add(var1);
      }

      this.L();
      return ix;
   }

   public void N(class07049 var1) {
      this.i.removeInt(var1);
      this.u.remove(var1);
      this.L();
   }

   public Optional<class07438> N() {
      return Optional.ofNullable(this.u()).filter(var0 -> var0 instanceof class07438).map(var0 -> (class07438)var0);
   }
}
