package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class class06505 implements class05957 {
   protected final List<class05957> N;
   private final Predicate<class05908> i;

   public class06505(List<class05957> var1, Predicate<class05908> var2) {
      super();
      this.N = var1;
      this.i = var2;
   }

   protected static <T extends class06505> Codec<T> y(Function<List<class05957>, T> var0) {
      return class05957.L.listOf().xmap(var0, var0x -> var0x.N);
   }

   @Override
   public void N(class05561 var1) {
      class05957.super.N(var1);

      for (int ix = 0; ix < this.N.size(); ix++) {
         this.N.get(ix).N(var1.N(new class10416("terms", ix)));
      }
   }

   protected static <T extends class06505> MapCodec<T> N(Function<List<class05957>, T> var0) {
      return RecordCodecBuilder.mapCodec(var1 -> var1.group(class05957.L.listOf().fieldOf("terms").forGetter(var0xx -> var0xx.N)).apply(var1, var0));
   }

   public final boolean test(class05908 var1) {
      return this.i.test(var1);
   }
}
