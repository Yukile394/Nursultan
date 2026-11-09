package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.IntList;
import org.jspecify.annotations.Nullable;

public record class08821(int defaultColor) implements class08843 {
   public static final MapCodec<class08821> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("default").forGetter(class08821::y)).apply(var0, class08821::new)
   );

   public class08821() {
      this(-7697782);
   }

   public class08821(int defaultColor) {
      this.defaultColor = defaultColor;
   }

   public int y() {
      return this.defaultColor;
   }

   @Override
   public MapCodec<class08821> N() {
      return N;
   }

   @Override
   public int N(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3) {
      class02827 class02827 = var1.method_58694(class02484.Ns);
      IntList intlist = class02827 != null ? class02827.y() : IntList.of();
      int i = intlist.size();
      if (i == 0) {
         return this.defaultColor;
      } else if (i == 1) {
         return class02566.M(intlist.getInt(0));
      } else {
         int j = 0;
         int k = 0;
         int l = 0;

         for (int i1 = 0; i1 < i; i1++) {
            int j1 = intlist.getInt(i1);
            j += class02566.L(j1);
            k += class02566.u(j1);
            l += class02566.i(j1);
         }

         return class02566.N(j / i, k / i, l / i);
      }
   }
}
