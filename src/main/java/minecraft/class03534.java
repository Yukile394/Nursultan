package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Consumer;

public abstract class class03534 extends class04129 {
   public static final class04480 i = new class03537();
   protected final List<class04129> R;
   private final class03449 N;

   public class03534(List<class04129> var1, List<class05957> var2) {
      super(var2);
      this.R = var1;
      this.N = this.N(var1);
   }

   @Override
   public final boolean expand(class05908 var1, Consumer<class03599> var2) {
      return !this.N(var1) ? false : this.N.expand(var1, var2);
   }

   public static <T extends class03534> MapCodec<T> N(class03551<T> var0) {
      return RecordCodecBuilder.mapCodec(
         var1 -> var1.group(class03942.N.listOf().optionalFieldOf("children", List.of()).forGetter(var0xx -> var0xx.R))
            .and(N(var1).t1())
            .apply(var1, var0::create)
      );
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);
      if (this.R.isEmpty()) {
         var1.N(i);
      }

      for (int ix = 0; ix < this.R.size(); ix++) {
         this.R.get(ix).N(var1.N(new class10416("children", ix)));
      }
   }

   protected abstract class03449 N(List<? extends class03449> var1);
}
