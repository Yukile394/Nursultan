package minecraft;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03574 implements class03358<class01958, class00971> {
   private final class08097 N;
   private static final String y = "neck";
   private static final String L = "front";
   private static final String u = "back";
   private static final String i = "left";
   private static final String R = "right";
   private static final String M = "top";
   private static final String B = "bottom";
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private final class01686 P;
   private static final float s = 0.125F;

   public class03574(class01140 var1, class08097 var2) {
      super();
      this.N = var2;
      class01686 class01686x = var1.N(class04802.NQ);
      this.Z = class01686x.y("neck");
      this.m = class01686x.y("top");
      this.P = class01686x.y("bottom");
      class01686 class01686x = var1.N(class04802.NO);
      this.z = class01686x.y("front");
      this.U = class01686x.y("back");
      this.E = class01686x.y("left");
      this.W = class01686x.y("right");
   }

   public class03574(class00331 var1) {
      this(var1.y(), var1.L());
   }

   public class03574(class04811 var1) {
      this(var1.R(), var1.B());
   }

   public static class04806 u() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04822 class04822 = class04822.L().N(1, 0).N(0.0F, 0.0F, 0.0F, 14.0F, 16.0F, 0.0F, EnumSet.of(class07211.field_11043));
      class04839.N("back", class04822, class04838.N(15.0F, 16.0F, 1.0F, 0.0F, 0.0F, (float) Math.PI));
      class04839.N("left", class04822, class04838.N(1.0F, 16.0F, 1.0F, 0.0F, (float) (-Math.PI / 2), (float) Math.PI));
      class04839.N("right", class04822, class04838.N(15.0F, 16.0F, 15.0F, 0.0F, (float) (Math.PI / 2), (float) Math.PI));
      class04839.N("front", class04822, class04838.N(1.0F, 16.0F, 15.0F, (float) Math.PI, 0.0F, 0.0F));
      return class04806.N(class04792, 16, 16);
   }

   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      this.Z.N(class01421, var1);
      this.m.N(class01421, var1);
      this.P.N(class01421, var1);
   }

   public void N(class01421 var1, class01237 var2, int var3, int var4, class03490 var5, int var6) {
      class07311 class07311 = class05911.g.N(class06851::u);
      class08388 class08388 = this.N.N(class05911.g);
      var2.N(this.Z, var1, class07311, var3, var4, class08388, false, false, -1, null, var6);
      var2.N(this.m, var1, class07311, var3, var4, class08388, false, false, -1, null, var6);
      var2.N(this.P, var1, class07311, var3, var4, class08388, false, false, -1, null, var6);
      class05913 class05913xxx = N(var5.i());
      var2.N(this.z, var1, class05913xxx.N(class06851::u), var3, var4, this.N.N(class05913xxx), false, false, -1, null, var6);
      class05913 class05913x = N(var5.y());
      var2.N(this.U, var1, class05913x.N(class06851::u), var3, var4, this.N.N(class05913x), false, false, -1, null, var6);
      class05913 class05913xx = N(var5.L());
      var2.N(this.E, var1, class05913xx.N(class06851::u), var3, var4, this.N.N(class05913xx), false, false, -1, null, var6);
      class05913 class05913xxx = N(var5.u());
      var2.N(this.W, var1, class05913xxx.N(class06851::u), var3, var4, this.N.N(class05913xxx), false, false, -1, null, var6);
   }

   public void N(class01958 var1, class00971 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.u = var1.z();
      var2.i = var1.u();
      class01967 class01967 = var1.R;
      if (class01967 != null && var1.G() != null) {
         var2.L = ((float)(var1.G().N() - var1.i) + var3) / class01967.field_46666;
      } else {
         var2.L = 0.0F;
      }
   }

   private static class05913 N(Optional<class06581> var0) {
      if (var0.isPresent()) {
         class05913 class05913 = class05911.N(class01944.N((class06581)var0.get()));
         if (class05913 != null) {
            return class05913;
         }
      }

      return class05911.I;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04834 class04834x = new class04834(0.2F);
      class04834 class04834x = new class04834(-0.1F);
      class04839.N(
         "neck",
         class04822.L().N(0, 0).N(4.0F, 17.0F, 4.0F, 8.0F, 3.0F, 8.0F, class04834x).N(0, 5).N(5.0F, 20.0F, 5.0F, 6.0F, 1.0F, 6.0F, class04834x),
         class04838.N(0.0F, 37.0F, 16.0F, (float) Math.PI, 0.0F, 0.0F)
      );
      class04822 class04822 = class04822.L().N(-14, 13).N(0.0F, 0.0F, 0.0F, 14.0F, 0.0F, 14.0F);
      class04839.N("top", class04822, class04838.N(1.0F, 16.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      class04839.N("bottom", class04822, class04838.N(1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F));
      return class04806.N(class04792, 32, 32);
   }

   public void N(class00971 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      class07211 class07211 = var1.i;
      var2.N(0.5, 0.0, 0.5);
      var2.N(class02058.u.N(180.0F - class07211.U()));
      var2.N(-0.5, 0.0, -0.5);
      if (var1.L >= 0.0F && var1.L <= 1.0F) {
         if (var1.y == class01967.field_46664) {
            float f = 0.015625F;
            float f1 = var1.L * (float) (Math.PI * 2);
            float f2 = -1.5F * (class04995.P(f1) + 0.5F) * class04995.m(f1 / 2.0F);
            var2.N(class02058.y.rotation(f2 * 0.015625F), 0.5F, 0.0F, 0.5F);
            float f3 = class04995.m(f1);
            var2.N(class02058.R.rotation(f3 * 0.015625F), 0.5F, 0.0F, 0.5F);
         } else {
            float f4 = class04995.m(-var1.L * 3.0F * (float) Math.PI) * 0.125F;
            float f5 = 1.0F - var1.L;
            var2.N(class02058.u.rotation(f4 * f5), 0.5F, 0.0F, 0.5F);
         }
      }

      this.N(var2, var3, var1.Z, class01384.u, var1.u, 0);
      var2.y();
   }

   public class00971 i() {
      return new class00971();
   }
}
