package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class08019 implements Comparable<class08019> {
   private static final DateTimeFormatter y = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   private static final Codec<Instant> L = class06338.N(y).xmap(Instant::from, var0 -> var0.atZone(ZoneId.systemDefault()));
   private static final Codec<Map<String, class06562>> u = Codec.unboundedMap(Codec.STRING, L)
      .xmap(
         var0 -> class07536.N(var0, class06562::new),
         var0 -> var0.entrySet()
            .stream()
            .filter(var0x -> ((class06562)var0x.getValue()).N())
            .collect(Collectors.toMap(Entry::getKey, var0x -> Objects.requireNonNull(((class06562)var0x.getValue()).u())))
      );
   public static final Codec<class08019> N = RecordCodecBuilder.create(
      var0 -> var0.group(u.optionalFieldOf("criteria", Map.of()).forGetter(var0x -> var0x.i), Codec.BOOL.fieldOf("done").orElse(true).forGetter(class08019::N))
         .apply(var0, (var0x, var1) -> new class08019(new HashMap<>(var0x)))
   );
   private final Map<String, class06562> i;
   private class03753 R = class03753.y;

   @Nullable
   public class06562 L(String var1) {
      return this.i.get(var1);
   }

   public float L() {
      if (this.i.isEmpty()) {
         return 0.0F;
      } else {
         float f = this.R.N();
         return this.B() / f;
      }
   }

   @Nullable
   public Instant M() {
      return this.i.values().stream().map(class06562::u).filter(Objects::nonNull).min(Comparator.naturalOrder()).orElse(null);
   }

   private class08019(Map<String, class06562> var1) {
      super();
      this.i = var1;
   }

   public class08019() {
      super();
      this.i = Maps.newHashMap();
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.i + ", requirements=" + this.R + "}";
   }

   private int B() {
      return this.R.y(this::u);
   }

   public Iterable<String> i() {
      ArrayList arraylist = Lists.newArrayList();

      for (Entry entry : this.i.entrySet()) {
         if (!((class06562)entry.getValue()).N()) {
            arraylist.add((String)entry.getKey());
         }
      }

      return arraylist;
   }

   private boolean u(String var1) {
      class06562 class06562 = this.L(var1);
      return class06562 != null && class06562.N();
   }

   @Nullable
   public class00392 u() {
      if (this.i.isEmpty()) {
         return null;
      } else {
         int ix = this.R.N();
         if (ix <= 1) {
            return null;
         } else {
            int j = this.B();
            return class00392.N("advancements.progress", j, ix);
         }
      }
   }

   public boolean y(String var1) {
      class06562 class06562 = this.i.get(var1);
      if (class06562 != null && class06562.N()) {
         class06562.L();
         return true;
      } else {
         return false;
      }
   }

   public static class08019 y(class00667 var0) {
      Map map = var0.N_17(class00667::s, class06562::y);
      return new class08019(map);
   }

   public boolean y() {
      Iterator<class06562> iterator = this.i.values().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().N()) {
            return true;
         }
      }

      return false;
   }

   public int compareTo(class08019 var1) {
      Instant instant = this.M();
      Instant instant1 = var1.M();
      if (instant == null && instant1 != null) {
         return 1;
      } else if (instant != null && instant1 == null) {
         return -1;
      } else {
         return instant == null && instant1 == null ? 0 : instant.compareTo(instant1);
      }
   }

   public boolean N(String var1) {
      class06562 class06562 = this.i.get(var1);
      if (class06562 != null && !class06562.N()) {
         class06562.y();
         return true;
      } else {
         return false;
      }
   }

   public void N(class00667 var1) {
      var1.N(this.i, class00667::N, (var0, var1x) -> var1x.N(var0));
   }

   public void N(class03753 var1) {
      Set<String> set = var1.L();
      this.i.entrySet().removeIf(var1x -> !set.contains(var1x.getKey()));

      for (String s : set) {
         this.i.putIfAbsent(s, new class06562());
      }

      this.R = var1;
   }

   public boolean N() {
      return this.R.N(this::u);
   }

   public Iterable<String> R() {
      ArrayList arraylist = Lists.newArrayList();

      for (Entry entry : this.i.entrySet()) {
         if (((class06562)entry.getValue()).N()) {
            arraylist.add((String)entry.getKey());
         }
      }

      return arraylist;
   }
}
