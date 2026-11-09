package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Function;

public abstract class class06822 implements class06834 {
   protected final List<class06834> N;
   private final Function<class05908, class06838> y;

   public class06822(List<class06834> var1) {
      super();
      this.N = var1;
      this.y = class06848.N(var1);
   }

   protected static <T extends class06822> Codec<T> y(Function<List<class06834>, T> var0) {
      return class06848.y.listOf().xmap(var0, var0x -> var0x.N);
   }

   @Override
   public class06838 N(class05908 var1) {
      return this.y.apply(var1);
   }

   @Override
   public void N(class05561 var1) {
      class06834.super.N(var1);

      for (int i = 0; i < this.N.size(); i++) {
         this.N.get(i).N(var1.N(new class10416("terms", i)));
      }
   }

   protected static <T extends class06822> MapCodec<T> N(Function<List<class06834>, T> var0) {
      return RecordCodecBuilder.mapCodec(var1 -> var1.group(class06848.y.listOf().fieldOf("terms").forGetter(var0xx -> var0xx.N)).apply(var1, var0));
   }

   @Override
   public abstract MapCodec<? extends class06822> N();
}
