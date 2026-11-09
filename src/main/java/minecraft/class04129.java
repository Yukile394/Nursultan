package minecraft;

import Nursultan.class10416;
import com.mojang.datafixers.Products.P1;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.function.Predicate;

public abstract class class04129 implements class03449 {
   public final List<class05957> M;
   private final Predicate<class05908> N;

   public class04129(List<class05957> var1) {
      super();
      this.M = var1;
      this.N = class07536.N(var1);
   }

   protected final boolean N(class05908 var1) {
      return this.N.test(var1);
   }

   public abstract class05950 N();

   public void N(class05561 var1) {
      for (int i = 0; i < this.M.size(); i++) {
         this.M.get(i).N(var1.N(new class10416("conditions", i)));
      }
   }

   protected static <T extends class04129> P1<Mu<T>, List<class05957>> N(Instance<T> var0) {
      return var0.group(class05957.L.listOf().optionalFieldOf("conditions", List.of()).forGetter(var0x -> var0x.M));
   }
}
