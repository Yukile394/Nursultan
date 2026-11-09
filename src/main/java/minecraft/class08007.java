package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public abstract class class08007 extends class08005 {
   private static final double u = 2.0;
   private static final int R = 7;
   private static final float M = 0.6F;
   private static final float B = 0.99F;
   private static final short Z = 0;
   private static final byte z = 0;
   private static final boolean U = false;
   private static final boolean E = false;
   private static final byte W = 0;
   private static final class02131<Byte> m = class03289.N(class08007.class, class02154.N);
   private static final class02131<Byte> P = class03289.N(class08007.class, class02154.N);
   private static final class02131<Boolean> s = class03289.N(class08007.class, class02154.U);
   private static final int T = 1;
   private static final int b = 2;
   @Nullable
   private class00500 j;
   protected int N;
   public class08008 y = class08008.field_7592;
   public int L = 0;
   private int v = 0;
   private double n = 2.0;
   private class04891 t = this.u();
   @Nullable
   private IntOpenHashSet G;
   @Nullable
   private List<class07049> l;
   private class06584 d = this.M();
   @Nullable
   private class06584 w = null;

   protected void L() {
      this.v++;
      if (this.v >= 1200) {
         this.method_31472();
      }
   }

   public void L(boolean var1) {
      this.field_5960 = var1;
      this.N(2, var1);
   }

   @Override
   public void L(@Nullable class07049 var1) {
      super.L((class07049)var1);

      this.y = switch (var1) {
         case class08036 class08036 when this.y == class08008.field_7592 -> class08008.field_7593;
         case class02626 class02626 -> class08008.field_7592;
         case null, default -> this.y;
      };
   }

   protected abstract class06584 M();

   @Override
   public boolean method_5675() {
      return !this.y();
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return var1 == 0 ? class04803.N(this::B, this::N) : super.method_32318(var1);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (!this.field_5953 && this.L <= 0 && var1.equals(s) && this.y()) {
         this.L = 7;
      }
   }

   @Nullable
   @Override
   public class06584 method_59958() {
      return this.w;
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(m, (byte)0);
      var1.N(P, (byte)0);
      var1.N(s, false);
   }

   @Override
   public void method_5773() {
      boolean flag = !this.W();
      class06889 class06889xx = this.method_18798();
      class07209 class07209 = this.method_24515();
      class00500 class00500 = this.method_73183().method_8320(class07209);
      if (!class00500.P() && flag) {
         class00494 class00494 = class00500.M(this.method_73183(), class07209);
         if (!class00494.method_1110()) {
            class06889 class06889x = this.method_73189();

            for (class00734 class00734 : class00494.method_1090()) {
               if (class00734.N(class07209).u(class06889x)) {
                  this.method_18799(class06889.L);
                  this.N(true);
                  break;
               }
            }
         }
      }

      if (this.L > 0) {
         this.L--;
      }

      if (this.method_5721()) {
         this.method_5646();
      }

      if (this.y() && flag) {
         if (!this.method_73183().method_8608()) {
            if (this.j != class00500 && this.m()) {
               this.b();
            } else {
               this.L();
            }
         }

         this.N++;
         if (this.method_5805()) {
            this.method_61409();
         }

         if (!this.method_73183().method_8608()) {
            this.method_33572(this.method_20802() > 0);
         }
      } else {
         this.N = 0;
         class06889 class06889x = this.method_73189();
         if (this.method_5799()) {
            this.y(this.E());
            this.N(class06889x);
         }

         if (this.Z()) {
            for (int i = 0; i < 4; i++) {
               this.method_73183()
                  .method_8406(
                     class07107.M,
                     class06889x.M + class06889xx.M * i / 4.0,
                     class06889x.B + class06889xx.B * i / 4.0,
                     class06889x.Z + class06889xx.Z * i / 4.0,
                     -class06889xx.M,
                     -class06889xx.B + 0.2,
                     -class06889xx.Z
                  );
            }
         }

         float f;
         if (!flag) {
            f = (float)(class04995.u(-class06889xx.M, -class06889xx.Z) * 180.0F / (float)Math.PI);
         } else {
            f = (float)(class04995.u(class06889xx.M, class06889xx.Z) * 180.0F / (float)Math.PI);
         }

         float f1 = (float)(class04995.u(class06889xx.B, class06889xx.Z()) * 180.0F / (float)Math.PI);
         this.method_36457(N(this.method_36455(), f1));
         this.method_36456(N(this.method_36454(), f));
         this.s();
         if (flag) {
            class06183 class06183 = this.method_73183()
               .y(new class05862(class06889x, class06889x.i(class06889xx), class05849.field_17558, class05835.field_1348, this));
            this.y(class06183);
         } else {
            this.method_33574(class06889x.i(class06889xx));
            this.method_61409();
         }

         if (!this.method_5799()) {
            this.y(0.99F);
         }

         if (flag && !this.y()) {
            this.method_56990();
         }

         super.method_5773();
      }
   }

   @Override
   public void method_5784(class07451 var1, class06889 var2) {
      super.method_5784(var1, var2);
      if (var1 != class07451.field_6308 && this.m()) {
         this.b();
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   protected double method_7490() {
      return 0.05;
   }

   @Override
   public void method_5762(double var1, double var3, double var5) {
      if (!this.y()) {
         super.method_5762(var1, var3, var5);
      }
   }

   @Override
   public void method_5694(class08036 var1) {
      if (!this.method_73183().method_8608() && (this.y() || this.W()) && this.L <= 0) {
         if (this.N(var1)) {
            var1.method_6103(this, 1);
            this.method_31472();
         }
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("life", (short)this.v);
      var1.y("inBlockState", class00500.N, this.j);
      var1.N("shake", (byte)this.L);
      var1.N("inGround", this.y());
      var1.N("pickup", class08008.field_56665, this.y);
      var1.N("damage", this.n);
      var1.N("crit", this.Z());
      var1.N("PierceLevel", this.U());
      var1.N("SoundEvent", class04206.y.T(), this.t);
      var1.N("item", class06584.y, this.d);
      var1.y("weapon", class06584.y, this.w);
   }

   @Override
   public boolean method_5863() {
      return super.method_5863() && !this.y();
   }

   @Override
   public boolean method_5640(double var1) {
      double d0 = this.method_5829().N() * 10.0;
      if (Double.isNaN(d0)) {
         d0 = 1.0;
      }

      d0 *= 64.0 * method_5824();
      return var1 < d0 * d0;
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.v = var1.N("life", (short)0);
      this.j = var1.<class00500>N("inBlockState", class00500.N).orElse(null);
      this.L = var1.N("shake", (byte)0) & 255;
      this.N(var1.N("inGround", false));
      this.n = var1.N("damage", 2.0);
      this.y = var1.<class08008>N("pickup", class08008.field_56665).orElse(class08008.field_7592);
      this.y(var1.N("crit", false));
      this.N(var1.N("PierceLevel", (byte)0));
      this.t = var1.<class04891>N("SoundEvent", class04206.y.T()).orElse(this.u());
      this.N(var1.<class06584>N("item", class06584.y).orElse(this.M()));
      this.w = var1.<class06584>N("weapon", class06584.y).orElse(null);
   }

   @Override
   public void method_5750(class06889 var1) {
      super.method_5750(var1);
      this.v = 0;
      if (this.y() && var1.B() > 0.0) {
         this.N(false);
      }
   }

   @Override
   public void method_5700(boolean var1, class07209 var2) {
      if (!this.y()) {
         super.method_5700(var1, var2);
      }
   }

   @Override
   public void method_5764(boolean var1) {
      if (!this.y()) {
         super.method_5764(var1);
      }
   }

   @Override
   public boolean method_5732() {
      return this.method_5864().N(class01217.q);
   }

   protected class08007(class07078<? extends class08007> var1, class07299 var2) {
      super(var1, var2);
   }

   protected class08007(
      class07078<? extends class08007> var1, double var2, double var4, double var6, class07299 var8, class06584 var9, @Nullable class06584 var10
   ) {
      this(var1, var8);
      this.d = var9.t();
      this.method_66652(var9);
      if (var9.y(class02484.l) != null) {
         this.y = class08008.field_7594;
      }

      this.method_5814(var2, var4, var6);
      if (var10 != null && var8 instanceof class04782 class04782) {
         if (var10.R()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.w = var10.t();
         int i = class07323.N(class04782, var10, this.d);
         if (i > 0) {
            this.N((byte)i);
         }
      }
   }

   protected class08007(class07078<? extends class08007> var1, class07438 var2, class07299 var3, class06584 var4, @Nullable class06584 var5) {
      this(var1, var2.method_23317(), var2.method_23320() - 0.1F, var2.method_23321(), var3, var4, var5);
      this.L(var2);
   }

   public class06584 B() {
      return this.d;
   }

   public boolean Z() {
      return (this.field_6011.N(m) & 1) != 0;
   }

   protected final class04891 i() {
      return this.t;
   }

   private void b() {
      this.N(false);
      class06889 class06889 = this.method_18798();
      this.method_18799(class06889.u(this.field_5974.z() * 0.2F, this.field_5974.z() * 0.2F, this.field_5974.z() * 0.2F));
      this.v = 0;
   }

   private boolean m() {
      return this.y() && this.method_73183().y(new class00734(this.method_73189(), this.method_73189()).M(0.06));
   }

   private void j() {
      if (this.l != null) {
         this.l.clear();
      }

      if (this.G != null) {
         this.G.clear();
      }
   }

   public byte U() {
      return this.field_6011.N(P);
   }

   protected class04891 u() {
      return class04909.No;
   }

   @Override
   protected boolean y() {
      return this.field_6011.N(s);
   }

   private void y(float var1) {
      class06889 class06889 = this.method_18798();
      this.method_18799(class06889.L((double)var1));
   }

   private void y(class06183 var1) {
      while (this.method_5805()) {
         class06889 class06889x = this.method_73189();
         ArrayList arraylist = new ArrayList<>(this.y(class06889x, var1.y()));
         arraylist.sort(Comparator.comparingDouble(var1x -> class06889x.M(var1x.L().method_73189())));
         class06889 class06889x = Objects.requireNonNullElse(arraylist.isEmpty() ? null : (class06145)arraylist.getFirst(), var1).y();
         this.method_33574(class06889x);
         this.method_64166(class06889x, class06889x);
         if (this.field_51994 != null && this.field_51994.i()) {
            this.method_60698();
         }

         if (arraylist.isEmpty()) {
            if (this.method_5805() && var1.N() != class07113.field_1333) {
               this.y((class07089)var1);
               this.field_64356 = true;
            }
            break;
         } else if (this.method_5805() && !this.field_5960) {
            class04252 class04252 = this.N(arraylist);
            this.field_64356 = true;
            if (this.U() > 0 && class04252 == class04252.N) {
               continue;
            }
            break;
         }
      }
   }

   public void y(boolean var1) {
      this.N(1, var1);
   }

   protected Collection<class06145> y(class06889 var1, class06889 var2) {
      return class08038.N(this.method_73183(), this, var1, var2, this.method_5829().y(this.method_18798()).M(1.0), this::N, false);
   }

   protected float E() {
      return 0.6F;
   }

   private void N(int var1, boolean var2) {
      byte b0 = this.field_6011.N(m);
      if (var2) {
         this.field_6011.N(m, (byte)(b0 | var1));
      } else {
         this.field_6011.N(m, (byte)(b0 & ~var1));
      }
   }

   protected void N(class07438 var1, class07072 var2) {
      double d0 = this.w != null && this.method_73183() instanceof class04782 class04782 ? class07323.u(class04782, this.w, var1, var2, 0.0F) : 0.0F;
      if (d0 > 0.0) {
         double d1 = Math.max(0.0, 1.0 - var1.method_45325(class05298.b));
         class06889 class06889 = this.method_18798().u(1.0, 0.0, 1.0).u().L(d0 * 0.6 * d1);
         if (class06889.B() > 0.0) {
            var1.method_5762(class06889.M, 0.1, class06889.Z);
         }
      }
   }

   @Override
   protected void N(class06183 var1) {
      this.j = this.method_73183().method_8320(var1.u());
      super.N(var1);
      class06584 class06584 = this.method_59958();
      if (this.method_73183() instanceof class04782 class04782 && class06584 != null) {
         this.N(class04782, var1, class06584);
      }

      class06889 class06889x = this.method_18798();
      class06889 class06889x = new class06889(Math.signum(class06889x.M), Math.signum(class06889x.B), Math.signum(class06889x.Z));
      class06889 class06889xx = class06889x.L(0.05F);
      this.method_33574(this.method_73189().u(class06889xx));
      this.method_18799(class06889.L);
      this.method_5783(this.i(), 1.0F, 1.2F / (this.field_5974.z() * 0.2F + 0.9F));
      this.N(true);
      this.L = 7;
      this.y(false);
      this.N((byte)0);
      this.N(class04909.No);
      this.j();
   }

   protected void N(class06584 var1) {
      if (!var1.R()) {
         this.d = var1;
      } else {
         this.d = this.M();
      }
   }

   public void N(class04891 var1) {
      this.t = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, float var7, float var8) {
      super.N(var1, var3, var5, var7, var8);
      this.v = 0;
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      class07049 class07049x = var1.L();
      float f = (float)this.method_18798().M();
      double d0 = this.n;
      class07049 class07049x = this.z();
      class07072 class07072 = this.method_48923().N(this, (class07049)(class07049x != null ? class07049x : this));
      if (this.method_59958() != null && this.method_73183() instanceof class04782 class04782xx) {
         d0 = class07323.N(class04782xx, this.method_59958(), class07049x, class07072, (float)d0);
      }

      int jx = class04995.L(class04995.N(f * d0, 0.0, 2.147483647E9));
      if (this.U() > 0) {
         if (this.G == null) {
            this.G = new IntOpenHashSet(5);
         }

         if (this.l == null) {
            this.l = Lists.newArrayListWithCapacity(5);
         }

         if (this.G.size() >= this.U() + 1) {
            this.method_31472();
            return;
         }

         this.G.add(class07049x.method_5628());
      }

      if (this.Z()) {
         long k = this.field_5974.y(jx / 2 + 2);
         jx = (int)Math.min(k + jx, 2147483647L);
      }

      if (class07049x instanceof class07438 class07438) {
         class07438.method_6114(class07049x);
      }

      boolean flag = class07049x.method_5864() == class07078.F;
      int i = class07049x.method_20802();
      if (this.method_5809() && !flag) {
         class07049x.method_5639(5.0F);
      }

      if (class07049x.method_64420(class07072, jx)) {
         if (flag) {
            return;
         }

         if (class07049x instanceof class07438 class07438x) {
            if (!this.method_73183().method_8608() && this.U() <= 0) {
               class07438x.method_6097(class07438x.method_6022() + 1);
            }

            this.N(class07438x, class07072);
            if (this.method_73183() instanceof class04782 class04782x) {
               class07323.N(class04782x, class07438x, class07072, this.method_59958());
            }

            this.N(class07438x);
            if (class07438x instanceof class08036 && class07049x instanceof class04770 class04770x && !this.method_5701() && class07438x != class04770x) {
               class04770x.field_13987.method_14364(new class00503(class00503.B, 0.0F));
            }

            if (!class07049x.method_5805() && this.l != null) {
               this.l.add(class07438x);
            }

            if (!this.method_73183().method_8608() && class07049x instanceof class04770 class04770) {
               if (this.l != null) {
                  class06912.q.N(class04770, this.l, this.w);
               } else if (!class07049x.method_5805()) {
                  class06912.q.N(class04770, List.of(class07049x), this.w);
               }
            }
         }

         this.method_5783(this.t, 1.0F, 1.2F / (this.field_5974.z() * 0.2F + 0.9F));
         if (this.U() <= 0) {
            this.method_31472();
         }
      } else {
         class07049x.method_20803(i);
         this.N(class04252.y, class07049x, this.i, false);
         this.method_18799(this.method_18798().L(0.2));
         if (this.method_73183() instanceof class04782 class04782 && this.method_18798().B() < 1.0E-7) {
            if (this.y == class08008.field_7593) {
               this.method_5699(class04782, this.R(), 0.1F);
            }

            this.method_31472();
         }
      }
   }

   public void N(float var1) {
      this.N(var1 * 2.0F + this.field_5974.N(this.method_73183().y().N() * 0.11, 0.57425));
   }

   protected boolean N(class08036 var1) {
      return switch (this.y) {
         case field_7592 -> false;
         case field_7593 -> var1.method_31548().M(this.R());
         case field_7594 -> var1.method_56992();
      };
   }

   @Nullable
   protected class06145 N(class06889 var1, class06889 var2) {
      return class08038.N(this.method_73183(), this, var1, var2, this.method_5829().y(this.method_18798()).M(1.0), this::N);
   }

   @Override
   public void N(class06581 var1) {
      this.w = null;
   }

   protected void N(class07438 var1) {
   }

   protected void N(boolean var1) {
      this.field_6011.N(s, var1);
   }

   @Override
   protected boolean N(class07049 var1) {
      if (var1 instanceof class08036) {
         class07049 class07049 = this.z();
         if (class07049 instanceof class08036 && !((class08036)class07049).method_7256((class08036)var1)) {
            return false;
         }
      }

      return super.N(var1) && (this.G == null || !this.G.contains(var1.method_5628()));
   }

   private void N(byte var1) {
      this.field_6011.N(P, var1);
   }

   private class04252 N(Collection<class06145> var1) {
      for (class06145 class06145 : var1) {
         class04252 class04252 = this.y(class06145);
         if (!this.method_5805() || class04252 != class04252.N) {
            return class04252;
         }
      }

      return class04252.N;
   }

   protected void N(class04782 var1, class06183 var2, class06584 var3) {
      class06889 class06889 = var2.u().method_60913(var2.y());
      class07049 class07049 = this.z();
      class07323.N(
         var1,
         var3,
         class07049 instanceof class07438 ? (class07438)class07049 : null,
         this,
         null,
         class06889,
         var1.method_8320(var2.u()),
         var1x -> this.w = null
      );
   }

   private void N(class06889 var1) {
      class06889 class06889 = this.method_18798();

      for (int i = 0; i < 4; i++) {
         float f = 0.25F;
         this.method_73183()
            .method_8406(
               class07107.u, var1.M - class06889.M * 0.25, var1.B - class06889.B * 0.25, var1.Z - class06889.Z * 0.25, class06889.M, class06889.B, class06889.Z
            );
      }
   }

   public void N(double var1) {
      this.n = var1;
   }

   public boolean W() {
      return !this.method_73183().method_8608() ? this.field_5960 : (this.field_6011.N(m) & 2) != 0;
   }

   protected class06584 R() {
      return this.d.t();
   }

   @Override
   protected boolean v_() {
      return true;
   }
}
