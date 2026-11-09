package minecraft;

import java.util.Objects;
import java.util.Optional;
import net.fabricmc.fabric.api.item.v1.FabricItem.Settings;
import org.jspecify.annotations.Nullable;

public class class06573 implements Settings {
   private static final class08216<class06581, String> L = var0 -> class07536.N("block", var0.N());
   private static final class08216<class06581, String> u = var0 -> class07536.N("item", var0.N());
   private final class02676 i = class02695.N().N(class02484.yy);
   @Nullable
   class06581 N;
   class03767 y = class03794.M;
   @Nullable
   private class05946<class06581> R;
   private class08216<class06581, String> M = u;
   private class08216<class06581, class01894> B = class05946::N;

   public class06573 L() {
      this.M = u;
      return this;
   }

   public class06573 L(int var1) {
      return this.N(class02484.J, new class02766(var1));
   }

   public class06573 L(class06932 var1) {
      class02055 class02055 = class04206.N(class04206.M);
      return this.N(var1.N(class03274.field_48838))
         .N(
            class02484.o,
            class08725.N(class07085.field_48824).N(class04909.NY).N(var1.B()).N(class02055.y(class01217.c)).L(false).u(true).i(true).y(class04909.NQ).N()
         )
         .N(1);
   }

   public class06573 L(class02749 var1, float var2, float var3) {
      return this.N(var1, class01210.yX, var2, var3, 0.0F);
   }

   public class06573 L(class06581 var1) {
      return this.N(class02484.q, new class02764(class03543.N(var1.i())));
   }

   public class06573 L(class05946<class06581> var1) {
      this.R = var1;
      return this;
   }

   public class06573() {
      super();
   }

   public class06573 i(class02749 var1, float var2, float var3) {
      return var1.N(this, var2, var3);
   }

   public class01894 i() {
      return this.B.get(Objects.requireNonNull(this.R, "Item id not set"));
   }

   public String u() {
      return this.M.get(Objects.requireNonNull(this.R, "Item id not set"));
   }

   public class06573 u(class02749 var1, float var2, float var3) {
      return this.N(var1, class01210.yp, var2, var3, 0.0F);
   }

   public class06573 y(int var1) {
      this.N(class02484.u, var1);
      this.N(class02484.L, 1);
      this.N(class02484.i, 0);
      return this;
   }

   public class06573 y(class06581 var1) {
      this.N = var1;
      return this;
   }

   public class06573 y() {
      this.M = L;
      return this;
   }

   public class06573 y(class06932 var1) {
      class02055 class02055 = class04206.N(class04206.M);
      return this.N(var1.N(class03274.field_48838))
         .N(class02484.o, class08725.N(class07085.field_48824).N(class04909.PJ).N(var1.B()).N(class02055.y(class01217.H)).L(false).i(true).y(class04909.Po).N())
         .N(1);
   }

   public class06573 y(class05946<class03252> var1) {
      return this.N(class02484.Nz, new class08551(var1));
   }

   public class06573 y(class07085 var1) {
      return this.N(class02484.o, class08725.N(var1).y(false).N());
   }

   public class06573 y(class02749 var1, float var2, float var3) {
      return this.N(var1, class01210.yc, var2, var3, 5.0F);
   }

   public class06573 N(class05349 var1, class08209 var2) {
      return this.N(class02484.d, var1).N(class02484.w, var2);
   }

   public class06573 N(int var1) {
      return this.N(class02484.L, var1);
   }

   public class06573 N(String var1) {
      this.M = class08216.N(var1);
      return this;
   }

   public class06573 N(class05349 var1) {
      return this.N(var1, class08225.N);
   }

   public <T> class06573 N(class02477<T> var1, T var2) {
      this.i.N(var1, var2);
      return this;
   }

   public class06573 N(class02833 var1) {
      return this.N(class02484.b, var1);
   }

   public class06573 N(class06581 var1) {
      return this.N(class02484.k, new class08197(new class06584(var1)));
   }

   class02695 N(class00392 var1, class01894 var2) {
      class02695 class02695 = this.i.N(class02484.U, var1).N(class02484.E, var2).N();
      if (class02695.N(class02484.i) && class02695.a_(class02484.L, 1) > 1) {
         throw new IllegalStateException("Item cannot have both durability and be stackable");
      } else {
         return class02695;
      }
   }

   public class06573 N(float var1) {
      return this.N(class02484.Y, new class08208(var1));
   }

   public class06573 N(class06495 var1) {
      return this.N(class02484.m, var1);
   }

   public class06573 N(class02749 var1, float var2, float var3) {
      return this.N(var1, class01210.ya, var2, var3, 0.0F);
   }

   public class06573 N(class02749 var1, class03530<class00891> var2, float var3, float var4, float var5) {
      return var1.N(this, var2, var3, var4, var5);
   }

   public class06573 N(class07085 var1) {
      return this.N(class02484.o, class08725.N(var1).N());
   }

   public class06573 N(class03530<class06581> var1) {
      class02055 class02055 = class04206.N(class04206.B);
      return this.N(class02484.q, new class02764(class02055.y(var1)));
   }

   public class06573 N() {
      return this.N(class02484.Q, new class08721(class03696.Z));
   }

   public class06573 N(class02957... var1) {
      this.y = class03794.i.N(var1);
      return this;
   }

   public class06573 N(class05946<class02206> var1) {
      return this.N(class02484.NE, new class02232(new class02204<>(var1)));
   }

   public class06573 N(class06932 var1) {
      return this.y(class03274.field_48838.N(var1.N()))
         .N(var1.N(class03274.field_48838))
         .N(var1.M())
         .N(
            class02484.o,
            class08725.N(class07085.field_48824).N(var1.u()).N(var1.B()).N(class03543.N(class07078.yC.T())).i(true).y(class04206.y.i(class04909.Nk)).N()
         )
         .N(class02484.NY, class04909.JL)
         .N(1);
   }

   public class06573 N(class02749 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      return this.y(var1.y())
         .N(var1.R())
         .L(var1.i())
         .N(class02484.z, new class02204<>(class03683.g))
         .N(
            class02484.X,
            new class08174(
               10,
               (int)(var4 * 20.0F),
               class08169.N((int)(var5 * 20.0F), var6),
               class08169.N((int)(var7 * 20.0F), var8),
               class08169.y((int)(var9 * 20.0F), var10),
               0.38F,
               var3,
               Optional.of(var1 == class02749.N ? class04909.YM : class04909.Yu),
               Optional.of(var1 == class02749.N ? class04909.YB : class04909.Yi)
            )
         )
         .N(
            class02484.c,
            new class08172(
               true,
               false,
               Optional.of(var1 == class02749.N ? class04909.YZ : class04909.YR),
               Optional.of(var1 == class02749.N ? class04909.YB : class04909.Yi)
            )
         )
         .N(class02484.I, new class06543(2.0F, 4.5F, 2.0F, 6.5F, 0.125F, 0.5F))
         .N(class02484.Z, 1.0F)
         .N(class02484.a, new class08186(class08155.field_63400, (int)(var2 * 20.0F)))
         .N(
            class02833.N()
               .N(class05298.u, new class07471(class06581.M, 0.0F + var1.u(), class07463.field_6328), class02834.field_49217)
               .N(class05298.R, new class07471(class06581.B, 1.0F / var2 - 4.0, class07463.field_6328), class02834.field_49217)
               .N()
         )
         .N(class02484.M, new class08153(true, false, 1.0F))
         .N(class02484.g, new class08609(1));
   }

   public class06573 N(class07078<?> var1) {
      return this.N(class02484.NR, class08983.N(var1, new class07001()));
   }

   public class06573 N(class06932 var1, class03274 var2) {
      return this.y(var2.N(var1.N())).N(var1.N(var2)).L(var1.L()).N(class02484.o, class08725.N(var2.N()).N(var1.u()).N(var1.B()).N()).N(var1.M());
   }

   public class06573 modelId(class01894 var1) {
      this.B = class08216.N(var1);
      return super.modelId(var1);
   }
}
