package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class00424 extends class00729 {
   public static final MapCodec<class00424> N = RecordCodecBuilder.mapCodec(var0 -> var0.group(y.forGetter(class00729::L), t()).apply(var0, class00424::new));

   public class00424(class02692 var1, class01362 var2) {
      super(var1, var2);
   }

   public class00424(class03556<class07084> var1, float var2, class01362 var3) {
      this(N(var1, var2), var3);
   }

   @Override
   public class07055 y() {
      return new class07055(class07047.v, 40);
   }

   @Override
   public MapCodec<class00424> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var2 instanceof class04782 class04782
         && var2.y() != class07086.field_5801
         && var4 instanceof class07438 class07438
         && !class07438.method_5679(class04782, var2.method_48963().b())) {
         class07438.method_6092(this.y());
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class06889 class06889 = this.N(var1, var2, var3, class06092.N()).method_1107().R();
      double d0 = var3.method_10263() + class06889.M;
      double d1 = var3.method_10260() + class06889.Z;

      for (int i = 0; i < 3; i++) {
         if (var4.Z()) {
            var2.method_8406(class07107.NZ, d0 + var4.U() / 5.0, var3.method_10264() + (0.5 - var4.U()), d1 + var4.U() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return super.N(var1, var2, var3) || var1.N(class00869.id) || var1.N(class00869.iw) || var1.N(class00869.ik);
   }
}
