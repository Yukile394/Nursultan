package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntSet;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class03688 extends class07049 {
   static final Logger N = LogUtils.getLogger();
   public static final int y = -1;
   private static final class02131<Integer> s = class03289.N(class03688.class, class02154.y);
   private static final class02131<Integer> T = class03289.N(class03688.class, class02154.y);
   private static final class02131<Integer> b = class03289.N(class03688.class, class02154.y);
   private static final class02131<Vector3fc> j = class03289.N(class03688.class, class02154.K);
   private static final class02131<Vector3fc> v = class03289.N(class03688.class, class02154.K);
   private static final class02131<Quaternionfc> n = class03289.N(class03688.class, class02154.V);
   private static final class02131<Quaternionfc> t = class03289.N(class03688.class, class02154.V);
   private static final class02131<Byte> G = class03289.N(class03688.class, class02154.N);
   private static final class02131<Integer> l = class03289.N(class03688.class, class02154.y);
   private static final class02131<Float> d = class03289.N(class03688.class, class02154.u);
   private static final class02131<Float> w = class03289.N(class03688.class, class02154.u);
   private static final class02131<Float> k = class03289.N(class03688.class, class02154.u);
   private static final class02131<Float> Y = class03289.N(class03688.class, class02154.u);
   private static final class02131<Float> Q = class03289.N(class03688.class, class02154.u);
   private static final class02131<Integer> O = class03289.N(class03688.class, class02154.y);
   private static final IntSet g = IntSet.of(new int[]{j.N(), v.N(), n.N(), t.N(), G.N(), l.N(), w.N(), k.N()});
   private static final int I = 0;
   private static final int J = 0;
   private static final int o = 0;
   private static final float q = 0.0F;
   private static final float K = 1.0F;
   private static final float V = 1.0F;
   private static final float e = 0.0F;
   private static final float H = 0.0F;
   private static final int c = -1;
   public static final String L = "teleport_duration";
   public static final String u = "interpolation_duration";
   public static final String i = "start_interpolation";
   public static final String R = "transformation";
   public static final String M = "billboard";
   public static final String B = "brightness";
   public static final String Z = "view_range";
   public static final String z = "shadow_radius";
   public static final String U = "shadow_strength";
   public static final String E = "width";
   public static final String W = "height";
   public static final String m = "glow_color_override";
   private long X = -2147483648L;
   private int a;
   private float p;
   private class00734 F;
   private boolean A = true;
   protected boolean P;
   private boolean f;
   private boolean C;
   @Nullable
   private class03657 S;
   private final class08382 x = new class08382(this, 0);

   @Nullable
   public class03657 L() {
      return this.S;
   }

   public final void L(float var1) {
      this.field_6011.N(k, var1);
   }

   public final void L(int var1) {
      this.field_6011.N(b, var1);
   }

   public final class03679 M() {
      return class03679.field_42411.apply(this.field_6011.N(G));
   }

   public final float P() {
      return this.field_6011.N(Q);
   }

   private class03657 T() {
      return new class03657(class03665.N(N(this.field_6011)), this.M(), this.Z(), class03664.N(this.U()), class03664.N(this.E()), this.m());
   }

   @Override
   public boolean method_5696() {
      return true;
   }

   @Override
   public class04641 method_5657() {
      return class04641.field_15975;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (Q.equals(var1) || Y.equals(var1)) {
         this.s();
      }

      if (s.equals(var1)) {
         this.f = true;
      }

      if (b.equals(var1)) {
         this.x.method_66266(this.R());
      }

      if (T.equals(var1)) {
         this.C = true;
      }

      if (g.contains(var1.N())) {
         this.P = true;
      }
   }

   @Override
   public int method_22861() {
      int ix = this.m();
      return ix != -1 ? ix : super.method_22861();
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(b, 0);
      var1.N(s, 0);
      var1.N(T, 0);
      var1.N(j, new Vector3f());
      var1.N(v, new Vector3f(1.0F, 1.0F, 1.0F));
      var1.N(t, new Quaternionf());
      var1.N(n, new Quaternionf());
      var1.N(G, class03679.field_42406.N());
      var1.N(l, -1);
      var1.N(d, 1.0F);
      var1.N(w, 0.0F);
      var1.N(k, 1.0F);
      var1.N(Y, 0.0F);
      var1.N(Q, 0.0F);
      var1.N(O, -1);
   }

   @Override
   public void method_5814(double var1, double var3, double var5) {
      super.method_5814(var1, var3, var5);
      this.s();
   }

   @Override
   public void method_5773() {
      class07049 class07049 = this.method_5854();
      if (class07049 != null && class07049.method_31481()) {
         this.method_5848();
      }

      if (this.method_73183().method_8608()) {
         if (this.f) {
            this.f = false;
            int ix = this.i();
            this.X = this.field_6012 + ix;
         }

         if (this.C) {
            this.C = false;
            this.a = this.u();
         }

         if (this.P) {
            this.P = false;
            boolean flag = this.a != 0;
            if (flag && this.S != null) {
               this.S = this.N(this.S, this.p);
            } else {
               this.S = this.T();
            }

            this.N(flag, this.p);
         }

         this.x.method_66271();
      }
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("transformation", class01404.y, N(this.field_6011));
      var1.N("billboard", class03679.field_42410, this.M());
      var1.N("interpolation_duration", this.u());
      var1.N("teleport_duration", this.R());
      var1.N("view_range", this.z());
      var1.N("shadow_radius", this.U());
      var1.N("shadow_strength", this.E());
      var1.N("width", this.W());
      var1.N("height", this.P());
      var1.N("glow_color_override", this.m());
      var1.y("brightness", class03675.y, this.B());
   }

   @Override
   public boolean method_5640(double var1) {
      return var1 < class04995.E(this.z() * 64.0 * method_5824());
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(var1.<class01404>N("transformation", class01404.y).orElse(class01404.N()));
      this.N(var1.N("interpolation_duration", 0));
      this.y(var1.N("start_interpolation", 0));
      int ix = var1.N("teleport_duration", 0);
      this.L(class04995.N(ix, 0, 59));
      this.N(var1.<class03679>N("billboard", class03679.field_42410).orElse(class03679.field_42406));
      this.N(var1.N("view_range", 1.0F));
      this.y(var1.N("shadow_radius", 0.0F));
      this.L(var1.N("shadow_strength", 1.0F));
      this.u(var1.N("width", 0.0F));
      this.i(var1.N("height", 0.0F));
      this.u(var1.N("glow_color_override", -1));
      this.N(var1.<class03675>N("brightness", class03675.y).orElse(null));
   }

   @Override
   public class08382 method_66233() {
      return this.x;
   }

   public class03688(class07078<?> var1, class07299 var2) {
      super(var1, var2);
      this.field_5960 = true;
      this.F = this.method_5829();
   }

   @Nullable
   public final class03675 B() {
      int ix = this.field_6011.N(l);
      return ix != -1 ? class03675.L(ix) : null;
   }

   public final int Z() {
      return this.field_6011.N(l);
   }

   public final void i(float var1) {
      this.field_6011.N(Q, var1);
   }

   public final int i() {
      return this.field_6011.N(s);
   }

   private void s() {
      float fx = this.W();
      float f1 = this.P();
      this.A = fx == 0.0F || f1 == 0.0F;
      float f2 = fx / 2.0F;
      double d0 = this.method_23317();
      double d1 = this.method_23318();
      double d2 = this.method_23321();
      this.F = new class00734(d0 - f2, d1, d2 - f2, d0 + f2, d1 + f1, d2 + f2);
   }

   public final int m() {
      return this.field_6011.N(O);
   }

   public final float U() {
      return this.field_6011.N(w);
   }

   public final float z() {
      return this.field_6011.N(d);
   }

   public final void u(int var1) {
      this.field_6011.N(O, var1);
   }

   public final int u() {
      return this.field_6011.N(T);
   }

   public final void u(float var1) {
      this.field_6011.N(Y, var1);
   }

   public boolean y() {
      return !this.A;
   }

   public final void y(int var1) {
      this.field_6011.N(s, var1, true);
   }

   public final void y(float var1) {
      this.field_6011.N(w, var1);
   }

   public final float E() {
      return this.field_6011.N(k);
   }

   public final void N(@Nullable class03675 var1) {
      this.field_6011.N(l, var1 != null ? var1.N() : -1);
   }

   public final void N(class03679 var1) {
      this.field_6011.N(G, var1.N());
   }

   public final void N(class01404 var1) {
      this.field_6011.N(j, var1.i());
      this.field_6011.N(n, var1.R());
      this.field_6011.N(v, var1.M());
      this.field_6011.N(t, var1.B());
   }

   private class03657 N(class03657 var1, float var2) {
      class01404 class01404 = var1.N().method_48888(var2);
      float fx = var1.u().method_48886(var2);
      float f1 = var1.i().method_48886(var2);
      return new class03657(
         new class03685(class01404, N(this.field_6011)), this.M(), this.Z(), new class03693(fx, this.U()), new class03693(f1, this.E()), this.m()
      );
   }

   protected abstract void N(boolean var1, float var2);

   private static class01404 N(class03289 var0) {
      Vector3fc vector3fc = var0.N(j);
      Quaternionfc quaternionfc = var0.N(n);
      Vector3fc vector3fc1 = var0.N(v);
      Quaternionfc quaternionfc1 = var0.N(t);
      return new class01404(vector3fc, quaternionfc, vector3fc1, quaternionfc1);
   }

   public final void N(int var1) {
      this.field_6011.N(T, var1);
   }

   public class00734 N() {
      return this.F;
   }

   public final void N(float var1) {
      this.field_6011.N(d, var1);
   }

   public final float W() {
      return this.field_6011.N(Y);
   }

   public float R(float var1) {
      int ix = this.a;
      if (ix <= 0) {
         return 1.0F;
      } else {
         float fx = class04995.N(class04995.R((float)(this.field_6012 - this.X) + var1, 0.0F, (float)ix), 0.0F, 1.0F);
         this.p = fx;
         return fx;
      }
   }

   public final int R() {
      return this.field_6011.N(b);
   }
}
