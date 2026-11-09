package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.longs.LongCollection;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class class04917 extends class06555 {
   private final LongSet y;
   private final LongSet L;
   private static final Codec<LongSet> u = Codec.LONG_STREAM.xmap(LongOpenHashSet::toSet, LongCollection::longStream);
   public static final Codec<class04917> N = RecordCodecBuilder.create(
      var0 -> var0.group(u.fieldOf("All").forGetter(var0x -> var0x.y), u.fieldOf("Remaining").forGetter(var0x -> var0x.L)).apply(var0, class04917::new)
   );

   public boolean L(long var1) {
      return this.L.contains(var1);
   }

   public class04917() {
      this(new LongOpenHashSet(), new LongOpenHashSet());
   }

   private class04917(LongSet var1, LongSet var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public void u(long var1) {
      if (this.L.remove(var1)) {
         this.method_80();
      }
   }

   public boolean y(long var1) {
      return this.y.contains(var1);
   }

   public static class08413<class04917> N(String var0) {
      return new class08413<>(var0, class04917::new, N, class05715.field_45084);
   }

   public LongSet N() {
      return this.y;
   }

   public void N(long var1) {
      this.y.add(var1);
      this.L.add(var1);
      this.method_80();
   }
}
