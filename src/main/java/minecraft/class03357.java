package minecraft;

import java.util.function.Consumer;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class03357 implements class03358<class00387, class00979> {
   private final class08097 N;
   private final class06260 y;
   private final class06260 L;

   public class03357(class08097 var1, class01140 var2) {
      super();
      this.N = var1;
      this.y = new class06260(var2.N(class04802.n), class06851::u);
      this.L = new class06260(var2.N(class04802.v), class06851::u);
   }

   public class03357(class00331 var1) {
      this(var1.L(), var1.y());
   }

   public class03357(class04811 var1) {
      this(var1.B(), var1.R());
   }

   public static class04806 u() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("main", class04822.L().N(0, 22).N(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), class04838.N);
      class04839.N("left_leg", class04822.L().N(50, 0).N(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F), class04838.y((float) (Math.PI / 2), 0.0F, 0.0F));
      class04839.N(
         "right_leg",
         class04822.L().N(50, 12).N(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F),
         class04838.y((float) (Math.PI / 2), 0.0F, (float) (Math.PI * 3.0 / 2.0))
      );
      return class04806.N(class04792, 64, 64);
   }

   public void N(Consumer<Vector3fc> var1) {
      class01421 class01421 = new class01421();
      N(class01421, false, class07211.field_11035);
      this.y.method_63512().N(class01421, var1);
      class01421.i();
      N(class01421, true, class07211.field_11035);
      this.L.method_63512().N(class01421, var1);
   }

   private static void N(class01421 var0, boolean var1, class07211 var2) {
      var0.N(0.0F, 0.5625F, var1 ? -1.0F : 0.0F);
      var0.N(class02058.y.N(90.0F));
      var0.N(0.5F, 0.5F, 0.5F);
      var0.N(class02058.R.N(180.0F + var2.U()));
      var0.N(-0.5F, -0.5F, -0.5F);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("main", class04822.L().N(0, 0).N(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F), class04838.N);
      class04839.N("left_leg", class04822.L().N(50, 6).N(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), class04838.y((float) (Math.PI / 2), 0.0F, (float) (Math.PI / 2)));
      class04839.N("right_leg", class04822.L().N(50, 18).N(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F), class04838.y((float) (Math.PI / 2), 0.0F, (float) Math.PI));
      return class04806.N(class04792, 64, 64);
   }

   public void N(class00387 var1, class00979 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.N = var1.L();
      var2.y = var1.w().L(class07789.R);
      var2.L = var1.w().L(class07789.y) == class06637.field_12560;
      if (var1.G() != null) {
         class06025<class00387> class06025 = class05994.N(
            class00404.field_11910, class07789::E, class07789::U, class00860.u, var1.w(), var1.G(), var1.d(), (var0, var1x) -> false
         );
         var2.Z = class06025.apply(new class05993<>()).get(var2.Z);
      }
   }

   public void N(class00979 var1, class01421 var2, class01237 var3, class06959 var4) {
      class05913 class05913 = class05911.N(var1.N);
      this.N(var2, var3, var1.L ? this.y : this.L, var1.y, class05913, var1.Z, class01384.u, false, var1.z, 0);
   }

   public void N(class01421 var1, class01237 var2, int var3, int var4, class05913 var5, int var6) {
      this.N(var1, var2, this.y, class07211.field_11035, var5, var3, var4, false, null, var6);
      this.N(var1, var2, this.L, class07211.field_11035, var5, var3, var4, true, null, var6);
   }

   private void N(
      class01421 var1,
      class01237 var2,
      class06260 var3,
      class07211 var4,
      class05913 var5,
      int var6,
      int var7,
      boolean var8,
      @Nullable class08141 var9,
      int var10
   ) {
      var1.N();
      N(var1, var8, var4);
      var2.N(var3, class06244.field_17274, var1, var5.N(class06851::u), var6, var7, -1, this.N.N(var5), var10, var9);
      var1.y();
   }

   public class00979 i() {
      return new class00979();
   }
}
