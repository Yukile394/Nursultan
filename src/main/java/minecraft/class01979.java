package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class01979 extends class07796 implements class06344 {
   public static final MapCodec<class01979> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class04206.i.T().fieldOf("turns_into").forGetter(class01979::y),
            class04206.y.T().fieldOf("brush_sound").forGetter(class01979::L),
            class04206.y.T().fieldOf("brush_completed_sound").forGetter(class01979::u),
            t()
         )
         .apply(var0, class01979::new)
   );
   private static final class08071 L = class06665.yk;
   public static final int y = 2;
   private final class00891 u;
   private final class04891 i;
   private final class04891 R;

   public class04891 L() {
      return this.i;
   }

   public class01979(class00891 var1, class04891 var2, class04891 var3, class01362 var4) {
      super(var4);
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.P(this.Q.y().y(L, 0));
   }

   public class04891 u() {
      return this.R;
   }

   public class00891 y() {
      return this.u;
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class01965(var1, var2);
   }

   @Override
   public MapCodec<class01979> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      var2.N(var3, this, 2);
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      var3.N(var4, this, 2);
      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_8321(var3) instanceof class01965 class01965) {
         class01965.N(var2);
      }

      if (class07204.U(var2.method_8320(var3.method_10074())) && var3.method_10264() >= var2.method_31607()) {
         class00701 class00701 = class00701.N(var2, var3, var1);
         class00701.y();
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00701 var3) {
      class06889 class06889 = var3.method_5829().R();
      var1.N(2001, class07209.method_49638(class06889), class00891.W(var3.L()));
      var1.N(var3, class01194.R, class06889);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(16) == 0) {
         class07209 class07209 = var3.method_10074();
         if (class07204.U(var2.method_8320(class07209))) {
            double d0 = var3.method_10263() + var4.U();
            double d1 = var3.method_10264() - 0.05;
            double d2 = var3.method_10260() + var4.U();
            var2.method_8406(new class07105(class07107.O, var1), d0, d1, d2, 0.0, 0.0, 0.0);
         }
      }
   }
}
