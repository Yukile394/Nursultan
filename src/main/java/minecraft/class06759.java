package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06759 extends class07796 implements class01137 {
   public static final MapCodec<class06759> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.fieldOf("automatic").forGetter(var0x -> var0x.i), t()).apply(var0, class06759::new)
   );
   private static final Logger u = LogUtils.getLogger();
   public static final class08064<class07211> y = class06760.y;
   public static final class06667 L = class06665.R;
   private final boolean i;

   public class06759(boolean var1, class01362 var2) {
      super(var2);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
      this.i = var1;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.L().b());
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (var1.method_8321(var2) instanceof class00402 class00402) {
         class07327 class07327 = class00402.N();
         if (var1 instanceof class04782 class04782) {
            if (!var5.L(class02484.NB)) {
               class07327.N(class04782.method_64395().N(class07305.F));
               class00402.y(this.i);
            }

            boolean flag = var1.W(var2);
            this.N(var1, var2, class00402, flag);
         }
      }
   }

   @Override
   public MapCodec<class06759> N() {
      return N;
   }

   private static void N(class04782 var0, class07209 var1, class07211 var2) {
      class07218 class07218 = var1.method_25503();
      class07305 class07305 = var0.method_64395();
      int ix = class07305.N(class07305.w);

      while (ix-- > 0) {
         class07218.N(var2);
         class00500 class00500 = var0.method_8320(class07218);
         class00891 class00891 = class00500.i();
         if (!class00500.N(class00869.EO) || !(var0.method_8321(class07218) instanceof class00402 class00402) || class00402.Z() != class00384.field_11922) {
            break;
         }

         if (class00402.L() || class00402.u()) {
            class07327 class07327 = class00402.N();
            if (class00402.B()) {
               if (!class07327.y(var0)) {
                  break;
               }

               var0.method_8455(class07218, class00891);
            } else if (class00402.z()) {
               class07327.N(0);
            }
         }

         var2 = class00500.L(y);
      }

      if (ix <= 0) {
         int j = Math.max(class07305.N(class07305.w), 0);
         u.warn("Command Block chain tried to execute more than {} steps!", j);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_8321(var3) instanceof class00402 class00402) {
         class07327 class07327 = class00402.N();
         boolean flag = !class05018.y(class07327.u());
         class00384 class00384 = class00402.Z();
         boolean flag1 = class00402.M();
         if (class00384 == class00384.field_11923) {
            class00402.B();
            if (flag1) {
               this.N(var1, var2, var3, class07327, flag);
            } else if (class00402.z()) {
               class07327.N(0);
            }

            if (class00402.L() || class00402.u()) {
               var2.N(var3, this, 1);
            }
         } else if (class00384 == class00384.field_11924) {
            if (flag1) {
               this.N(var1, var2, var3, class07327, flag);
            } else if (class00402.z()) {
               class07327.N(0);
            }
         }

         var2.method_8455(var3, this);
      }
   }

   private void N(class07299 var1, class07209 var2, class00402 var3, boolean var4) {
      boolean flag = var3.L();
      if (var4 != flag) {
         var3.N(var4);
         if (var4) {
            if (var3.u() || var3.Z() == class00384.field_11922) {
               return;
            }

            var3.B();
            var1.N(var2, this, 1);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         if (var2.method_8321(var3) instanceof class00402 class00402) {
            this.N(var2, var3, class00402, var2.W(var3));
         }
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      class00402 class00402 = new class00402(var1, var2);
      class00402.y(this.i);
      return class00402;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class00402 ? ((class00402)class00394).N().y() : 0;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class00402 && var4.method_7338()) {
         var4.method_7323((class00402)class00394);
         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   private void N(class00500 var1, class04782 var2, class07209 var3, class07327 var4, boolean var5) {
      if (var5) {
         var4.y(var2);
      } else {
         var4.N(0);
      }

      N(var2, var3, var1.L(y));
   }
}
