package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class06593 extends class06577 {
   private static final float P = 1.25F;
   public static final int N = 8;
   private boolean s = false;
   private boolean T = false;
   private static final float b = 0.2F;
   private static final float j = 0.5F;
   private static final float v = 3.15F;
   private static final float n = 1.6F;
   public static final float y = 1.6F;
   private static final class06589 t = new class06589(Optional.of(class04909.BX), Optional.of(class04909.Bc), Optional.of(class04909.BH));

   @Override
   public Predicate<class06584> L() {
      return m;
   }

   @Override
   public boolean M(class06584 var1) {
      return var1.N((class06581)this);
   }

   public class06593(class06573 var1) {
      super(var1);
   }

   @Override
   protected int i(class06584 var1) {
      return var1.N(class06570.GJ) ? 3 : 1;
   }

   public static boolean u(class06584 var0) {
      return !var0.a_(class02484.x, class02820.N).y();
   }

   @Override
   public class06509 y(class06584 var1) {
      return class06509.field_8947;
   }

   @Override
   public int y() {
      return 8;
   }

   public static int y(class06584 var0, class07438 var1) {
      return class04995.y(class07323.N(var0, var1, 1.25F) * 20.0F);
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      return 72000;
   }

   private static float N(int var0, class06584 var1, class07438 var2) {
      float f = (float)var0 / y(var1, var2);
      if (f > 1.0F) {
         f = 1.0F;
      }

      return f;
   }

   @Override
   public Predicate<class06584> N() {
      return L;
   }

   private static float N(class06069 var0, int var1) {
      return var1 == 0 ? 1.0F : N((var1 & 1) == 1, var0);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      class02820 class02820 = class06584.method_58694(class02484.x);
      if (class02820 != null && !class02820.y()) {
         this.N(var1, var2, var3, class06584, N(class02820), 1.0F, null);
         return class07082.L;
      } else if (!var2.method_18808(class06584).R()) {
         this.s = false;
         this.T = false;
         var2.method_6019(var3);
         return class07082.L;
      } else {
         return class07082.u;
      }
   }

   @Override
   protected class08005 N(class07299 var1, class07438 var2, class06584 var3, class06584 var4, boolean var5) {
      if (var4.N(class06570.GJ)) {
         return new class08006(var1, var4, var2, var2.method_23317(), var2.method_23320() - 0.15F, var2.method_23321(), true);
      } else {
         class08005 class08005 = super.N(var1, var2, var3, var4, var5);
         if (class08005 instanceof class08007) {
            ((class08007)class08005).N(class04909.Be);
         }

         return class08005;
      }
   }

   private static Vector3f N(class07438 var0, class06889 var1, float var2) {
      Vector3f vector3f = var1.W().normalize();
      Vector3f vector3f1 = new Vector3f(vector3f).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if (vector3f1.lengthSquared() <= 1.0E-7) {
         class06889 class06889 = var0.method_18864(1.0F);
         vector3f1 = new Vector3f(vector3f).cross(class06889.W());
      }

      Vector3f vector3f2 = new Vector3f(vector3f).rotateAxis((float) (Math.PI / 2), vector3f1.x, vector3f1.y, vector3f1.z);
      return new Vector3f(vector3f).rotateAxis(var2 * (float) (Math.PI / 180.0), vector3f2.x, vector3f2.y, vector3f2.z);
   }

   @Override
   protected void N(class07438 var1, class08005 var2, int var3, float var4, float var5, float var6, @Nullable class07438 var7) {
      Vector3f vector3f;
      if (var7 != null) {
         double d0 = var7.method_23317() - var1.method_23317();
         double d1 = var7.method_23321() - var1.method_23321();
         double d2 = Math.sqrt(d0 * d0 + d1 * d1);
         double d3 = var7.method_23323(0.3333333333333333) - var2.method_23318() + d2 * 0.2F;
         vector3f = N(var1, new class06889(d0, d3, d1), var6);
      } else {
         class06889 class06889x = var1.method_18864(1.0F);
         Quaternionf quaternionf = new Quaternionf().setAngleAxis(var6 * (float) (Math.PI / 180.0), class06889x.M, class06889x.B, class06889x.Z);
         class06889 class06889x = var1.method_5828(1.0F);
         vector3f = class06889x.W().rotate(quaternionf);
      }

      var2.N(vector3f.x(), vector3f.y(), vector3f.z(), var4, var5);
      float f = N(var1.method_59922(), var3);
      var1.method_73183().method_43128(null, var1.method_23317(), var1.method_23318(), var1.method_23321(), class04909.BA, var1.method_5634(), 1.0F, f);
   }

   private static boolean N(class07438 var0, class06584 var1) {
      List<class06584> list = N(var1, var0.method_18808(var1), var0);
      if (!list.isEmpty()) {
         var1.N(class02484.x, class02820.N(list));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class06584 var1, class07299 var2, class07438 var3, int var4) {
      return N(this.N(var1, var3) - var4, var1, var3) >= 1.0F && u(var1);
   }

   private static float N(boolean var0, class06069 var1) {
      float f = var0 ? 0.63F : 0.43F;
      return 1.0F / (var1.z() * 0.5F + 1.8F) + f;
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, int var4) {
      if (!var1.method_8608()) {
         class06589 class06589 = this.R(var3);
         float f = (float)(var3.N(var2) - var4) / y(var3, var2);
         if (f < 0.2F) {
            this.s = false;
            this.T = false;
         }

         if (f >= 0.2F && !this.s) {
            this.s = true;
            class06589.N()
               .ifPresent(
                  var2x -> var1.method_43128(null, var2.method_23317(), var2.method_23318(), var2.method_23321(), var2x.N(), class04911.field_15248, 0.5F, 1.0F)
               );
         }

         if (f >= 0.5F && !this.T) {
            this.T = true;
            class06589.y()
               .ifPresent(
                  var2x -> var1.method_43128(null, var2.method_23317(), var2.method_23318(), var2.method_23321(), var2x.N(), class04911.field_15248, 0.5F, 1.0F)
               );
         }

         if (f >= 1.0F && !u(var3) && N(var2, var3)) {
            class06589.L()
               .ifPresent(
                  var2x -> var1.method_43128(
                     null,
                     var2.method_23317(),
                     var2.method_23318(),
                     var2.method_23321(),
                     var2x.N(),
                     var2.method_5634(),
                     1.0F,
                     1.0F / (var1.method_8409().z() * 0.5F + 1.0F) + 0.2F
                  )
               );
         }
      }
   }

   private static float N(class02820 var0) {
      return var0.N(class06570.GJ) ? 1.6F : 3.15F;
   }

   public void N(class07299 var1, class07438 var2, class07050 var3, class06584 var4, float var5, float var6, @Nullable class07438 var7) {
      if (var1 instanceof class04782 class04782) {
         class02820 class02820 = var4.N(class02484.x, class02820.N);
         if (class02820 != null && !class02820.y()) {
            this.N(class04782, var2, var3, var4, class02820.N(), var5, var6, var2 instanceof class08036, var7);
            if (var2 instanceof class04770 class04770) {
               class06912.J.N(class04770, var4);
               class04770.method_7259(class01235.L.y(var4.B()));
            }
         }
      }
   }

   class06589 R(class06584 var1) {
      return class07323.y(var1, class02523.Q).orElse(t);
   }
}
