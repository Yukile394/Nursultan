package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableObject;

public class class05281 {
   private static final int L = Integer.MIN_VALUE;
   private static final MutableObject<Codec<class03556<class05281>>> u = new MutableObject();
   public static final Codec<class05281> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.lazyInitialized(u).fieldOf("fallback").forGetter(class05281::y),
            Codec.mapPair(class05248.i.fieldOf("element"), Codec.intRange(1, 150).fieldOf("weight"))
               .codec()
               .listOf()
               .fieldOf("elements")
               .forGetter(var0x -> var0x.i)
         )
         .apply(var0, class05281::new)
   );
   public static final Codec<class03556<class05281>> y = class07536.N(class01281.N(class04227.yv, N), u::setValue);
   private final List<Pair<class05248, Integer>> i;
   private final ObjectArrayList<class05248> R;
   private final class03556<class05281> M;
   private int B = Integer.MIN_VALUE;

   public int L() {
      return this.R.size();
   }

   public class05281(class03556<class05281> var1, List<Pair<class05248, Integer>> var2) {
      super();
      this.i = var2;
      this.R = new ObjectArrayList();

      for (Pair pair : var2) {
         class05248 class05248 = (class05248)pair.getFirst();

         for (int ix = 0; ix < pair.getSecond(); ix++) {
            this.R.add(class05248);
         }
      }

      this.M = var1;
   }

   public class05281(class03556<class05281> var1, List<Pair<Function<class05246, ? extends class05248>, Integer>> var2, class05246 var3) {
      super();
      this.i = Lists.newArrayList();
      this.R = new ObjectArrayList();

      for (Pair pair : var2) {
         class05248 class05248 = (class05248)((Function)pair.getFirst()).apply(var3);
         this.i.add(Pair.of(class05248, (Integer)pair.getSecond()));

         for (int ix = 0; ix < pair.getSecond(); ix++) {
            this.R.add(class05248);
         }
      }

      this.M = var1;
   }

   public List<class05248> y(class06069 var1) {
      return class07536.N(this.R, var1);
   }

   public class03556<class05281> y() {
      return this.M;
   }

   public int N(class01224 var1) {
      if (this.B == Integer.MIN_VALUE) {
         this.B = this.R
            .stream()
            .filter(var0 -> var0 != class04869.y)
            .mapToInt(var1x -> var1x.N(var1, class07209.field_10980, class06993.field_11467).i())
            .max()
            .orElse(0);
      }

      return this.B;
   }

   public List<Pair<class05248, Integer>> N() {
      return this.i;
   }

   public class05248 N(class06069 var1) {
      return (class05248)(this.R.isEmpty() ? class04869.y : (class05248)this.R.get(var1.y(this.R.size())));
   }
}
