package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class04861 extends class05248 {
   public static final MapCodec<class04861> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04336.y.fieldOf("feature").forGetter(var0x -> var0x.L), R()).apply(var0, class04861::new)
   );
   private static final class01894 y = class01894.y("bottom");
   private final class03556<class04336> L;
   private final class07001 u;

   public class04861(class03556<class04336> var1, class05246 var2) {
      super(var2);
      this.L = var1;
      this.u = this.y();
   }

   @Override
   public String toString() {
      return "Feature[" + this.L + "]";
   }

   private class07001 y() {
      class07001 class07001 = new class07001();
      class07001.N("name", class01894.N, y);
      class07001.N_67("final_state", "minecraft:air");
      class07001.N("pool", class04858.N, class01019.N);
      class07001.N("target", class01894.N, class04858.y);
      class07001.N("joint", class04853.field_54790, class04853.field_23329);
      return class07001;
   }

   @Override
   public boolean N(
      class01224 var1,
      class05974 var2,
      class05324 var3,
      class08088 var4,
      class07209 var5,
      class07209 var6,
      class06993 var7,
      class05163 var8,
      class06069 var9,
      class02610 var10,
      boolean var11
   ) {
      return this.L.N().N(var2, var4, var9, var5);
   }

   @Override
   public class00753 N(class01224 var1, class06993 var2) {
      return class00753.field_11176;
   }

   @Override
   public List<class01203> N(class01224 var1, class07209 var2, class06993 var3, class06069 var4) {
      return List.of(
         class01203.N(new class01228(var2, class00869.sr.W().y(class04884.y, class05288.N(class07211.field_11033, class07211.field_11035)), this.u))
      );
   }

   @Override
   public class05163 N(class01224 var1, class07209 var2, class06993 var3) {
      class00753 class00753 = this.N(var1, var3);
      return new class05163(
         var2.method_10263(),
         var2.method_10264(),
         var2.method_10260(),
         var2.method_10263() + class00753.method_10263(),
         var2.method_10264() + class00753.method_10264(),
         var2.method_10260() + class00753.method_10260()
      );
   }

   @Override
   public class05267<?> N() {
      return class05267.L;
   }
}
