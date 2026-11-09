package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class08631 extends class01474 {
   public static final MapCodec<class08631> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.b.fieldOf("tries").orElse(128).forGetter(var0x -> var0x.L),
            class06338.T.fieldOf("radius").orElse(2).forGetter(var0x -> var0x.u),
            class06338.T.fieldOf("height").orElse(1).forGetter(var0x -> var0x.i),
            class01471.N.fieldOf("block_state_provider").forGetter(var0x -> var0x.R)
         )
         .apply(var0, class08631::new)
   );
   private final int L;
   private final int u;
   private final int i;
   private final class01471 R;

   public class08631(int var1, int var2, int var3, class01471 var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   @Override
   protected class05930<?> N() {
      return class05930.Z;
   }

   private void N(class05894 var1, class07209 var2) {
      class07209 class07209 = var2.method_10084();
      if (var1.N().method_16358(class07209, var0 -> var0.P() || var0.N(class00869.Rc))
         && var1.N(var2, class01339::t)
         && var1.N().N(class07830.field_13203, var2).method_10264() <= class07209.method_10264()) {
         var1.N(class07209, this.R.N(var1.y(), class07209));
      }
   }

   @Override
   public void N(class05894 var1) {
      List list = class03194.N(var1);
      if (!list.isEmpty()) {
         class07209 class07209x = (class07209)list.getFirst();
         int ix = class07209x.method_10264();
         int j = class07209x.method_10263();
         int k = class07209x.method_10263();
         int l = class07209x.method_10260();
         int i1 = class07209x.method_10260();

         for (class07209 class07209x : list) {
            if (class07209x.method_10264() == ix) {
               j = Math.min(j, class07209x.method_10263());
               k = Math.max(k, class07209x.method_10263());
               l = Math.min(l, class07209x.method_10260());
               i1 = Math.max(i1, class07209x.method_10260());
            }
         }

         class06069 class06069 = var1.y();
         class05163 class05163 = new class05163(j, ix, l, k, ix, i1).L(this.u, this.i, this.u);
         class07218 class07218 = new class07218();

         for (int j1 = 0; j1 < this.L; j1++) {
            class07218.N(
               class06069.N(class05163.B(), class05163.U()), class06069.N(class05163.Z(), class05163.E()), class06069.N(class05163.z(), class05163.W())
            );
            this.N(var1, class07218);
         }
      }
   }
}
