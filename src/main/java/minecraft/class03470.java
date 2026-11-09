package minecraft;

import Nursultan.class10205;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class class03470 extends class06555 {
   public static final Codec<class03470> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.INT.fieldOf("salt").forGetter(class03470::y),
            Codec.BOOL.optionalFieldOf("include_world_seed", true).forGetter(class03470::L),
            Codec.BOOL.optionalFieldOf("include_sequence_id", true).forGetter(class03470::u),
            Codec.unboundedMap(class01894.N, class03512.N).fieldOf("sequences").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class03470::new)
   );
   public static final class08413<class03470> y = new class08413<>("random_sequences", class03470::new, N, class05715.field_45082);
   private int L;
   private boolean u = true;
   private boolean i = true;
   private final Map<class01894, class03512> R = new Object2ObjectOpenHashMap();

   private boolean L() {
      return this.u;
   }

   private class03512 L(class01894 var1, long var2) {
      return this.y(var1, var2, this.L, this.u, this.i);
   }

   public class03470() {
      super();
   }

   private class03470(int var1, boolean var2, boolean var3, Map<class01894, class03512> var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R.putAll(var4);
   }

   private boolean u() {
      return this.i;
   }

   private class03512 y(class01894 var1, long var2, int var4, boolean var5, boolean var6) {
      long ix = (var5 ? var2 : 0L) ^ var4;
      return new class03512(ix, var6 ? Optional.of(var1) : Optional.empty());
   }

   public void y(class01894 var1, long var2) {
      this.R.put(var1, this.L(var1, var2));
   }

   private int y() {
      return this.L;
   }

   public void N(BiConsumer<class01894, class03512> var1) {
      this.R.forEach(var1);
   }

   public void N(int var1, boolean var2, boolean var3) {
      this.L = var1;
      this.u = var2;
      this.i = var3;
   }

   public int N() {
      int ix = this.R.size();
      this.R.clear();
      return ix;
   }

   public void N(class01894 var1, long var2, int var4, boolean var5, boolean var6) {
      this.R.put(var1, this.y(var1, var2, var4, var5, var6));
   }

   public class06069 N(class01894 var1, long var2) {
      class06069 class06069 = this.R.computeIfAbsent(var1, var3 -> this.L(var3, var2)).N();
      return new class10205(this, class06069);
   }
}
