package minecraft;

import Nursultan.class10188;
import Nursultan.class10416;
import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class class03328 extends class04129 {
   public static final int i = 1;
   public static final int R = 0;
   public final int B;
   public final int Z;
   protected final List<class08122> z;
   public final BiFunction<class06584, class05908, class06584> U;
   private final class03599 N = new class10188(this);

   public class03328(int var1, int var2, List<class05957> var3, List<class08122> var4) {
      super(var3);
      this.B = var1;
      this.Z = var2;
      this.z = var4;
      this.U = class07439.N(var4);
   }

   @Override
   public boolean expand(class05908 var1, Consumer<class03599> var2) {
      if (this.N(var1)) {
         var2.accept(this.N);
         return true;
      } else {
         return false;
      }
   }

   protected static <T extends class03328> P4<Mu<T>, Integer, Integer, List<class05957>, List<class08122>> y(Instance<T> var0) {
      return var0.group(Codec.INT.optionalFieldOf("weight", 1).forGetter(var0x -> var0x.B), Codec.INT.optionalFieldOf("quality", 0).forGetter(var0x -> var0x.Z))
         .and(N(var0).t1())
         .and(class07439.L.listOf().optionalFieldOf("functions", List.of()).forGetter(var0x -> var0x.z));
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);

      for (int ix = 0; ix < this.z.size(); ix++) {
         this.z.get(ix).N(var1.N(new class10416("functions", ix)));
      }
   }

   public static class03366<?> N(class03477 var0) {
      return new class03479(var0);
   }

   public abstract void N(Consumer<class06584> var1, class05908 var2);
}
