package minecraft;

import Nursultan.class09665;
import Nursultan.class10951;
import Nursultan.class10964;
import Nursultan.class11368;
import Nursultan.class11938;
import com.google.common.collect.Sets;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public abstract class class01463<T extends class07482> extends class05096 implements class09665, class05868<T> {
   public static final class01894 i = class01894.y("textures/gui/container/inventory.png");
   private static final class01894 N = class01894.y("container/slot_highlight_back");
   private static final class01894 y = class01894.y("container/slot_highlight_front");
   protected static final int R = 256;
   protected static final int M = 256;
   private static final float L = 100.0F;
   private static final int u = 500;
   protected int B = 176;
   protected int Z = 166;
   protected int z;
   protected int U;
   protected int E;
   protected int W;
   private final List<class02457> n;
   protected final T m;
   protected final class00392 P;
   @Nullable
   protected class06937 s;
   @Nullable
   private class06937 t;
   @Nullable
   private class06937 G;
   @Nullable
   private class06937 l;
   @Nullable
   private class01441 d;
   protected int T;
   protected int b;
   private boolean w;
   private class06584 k = class06584.E;
   private long Y;
   protected final Set<class06937> j = Sets.newHashSet();
   protected boolean v;
   private int Q;
   private int O;
   private boolean g;
   private int I;
   private boolean J;
   private class06584 o = class06584.E;

   public void L(class01054 var1, int var2, int var3) {
      class06584 class06584 = this.k.R() ? this.m.M() : this.k;
      if (!class06584.R()) {
         byte b0 = 8;
         int ix = this.k.R() ? 8 : 16;
         String sx = null;
         if (!this.k.R() && this.w) {
            class06584 = class06584.L(class04995.u(class06584.c() / 2.0F));
         } else if (this.v && this.j.size() > 1) {
            class06584 = class06584.L(this.I);
            if (class06584.R()) {
               sx = class06541.field_1054 + "0";
            }
         }

         var1.L();
         this.N(var1, class06584, var2 - 8, var3 - ix, sx);
      }
   }

   private void L(class01054 var1) {
      if (this.s != null && this.s.Z()) {
         var1.N(class08394.Na, y, this.s.i - 4, this.s.R - 4, 24, 24);
      }
   }

   public class01463(T var1, class08044 var2, class00392 var3) {
      super(var3);
      this.m = (T)var1;
      this.P = var2.method_5476();
      this.g = true;
      this.z = 8;
      this.U = 6;
      this.E = 8;
      this.W = this.Z - 94;
      this.n = new ArrayList<>();
   }

   public void Z() {
      this.k = class06584.E;
      this.t = null;
   }

   protected void u(class01054 var1, int var2, int var3) {
      var1.N(this.field_22793, this.field_22785, this.z, this.U, -12566464, false);
      var1.N(this.field_22793, this.P, this.E, this.W, -12566464, false);
   }

   protected void u() {
   }

   @Nullable
   private class06937 y(double var1, double var3) {
      for (class06937 class06937 : this.m.T) {
         if (class06937.N() && this.N(class06937, var1, var3)) {
            return class06937;
         }
      }

      return null;
   }

   private void y(class06613 var1, double var2, double var4, CallbackInfoReturnable var6) {
      if (ProtocolTranslator.getTargetVersion().olderThan(LegacyProtocolVersion.r1_5tor1_5_1)) {
         var6.setReturnValue(super.method_25403(var1, var2, var4));
      }
   }

   private boolean y(class06613 var1) {
      return var1.W() && ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_6_1);
   }

   private boolean y(class06584 var1) {
      return var1.N().map(class06357::N).map(class06357::N).orElse(false);
   }

   private void y(class01054 var1) {
      if (this.s != null && this.s.Z()) {
         var1.N(class08394.Na, N, this.s.i - 4, this.s.R - 4, 24, 24);
      }
   }

   @Override
   public T E() {
      return this.m;
   }

   private void N(class06613 var1, CallbackInfoReturnable var2) {
      if (super.method_25406(var1)) {
         var2.setReturnValue(true);
      }
   }

   private void N(class01054 var1, int var2, int var3, float var4, CallbackInfo var5) {
      class10951 class10951 = class10951.N(var1, class06541.N(this.method_25440().getString()));
      class11938.L().L(class10951);
   }

   private void N(class06613 var1, double var2, double var4, CallbackInfoReturnable var6) {
      if (super.method_25403(var1, var2, var4)) {
         var6.setReturnValue(true);
      }
   }

   protected void N(int var1, int var2, boolean var3) {
      ((class03443)this.field_22787.T_2).N(var1, var2, var3);
   }

   protected boolean N(class06601 var1) {
      if (this.m.M().R() && this.s != null) {
         if (((class05630)this.field_22787.i_7).Q.N(var1)) {
            this.N(this.s, this.s.u, 40, class07510.field_7791);
            return true;
         }

         for (int ix = 0; ix < 9; ix++) {
            class06428 class06428 = ((class05630)this.field_22787.i_7).f[ix];
            if (this.N(class06428, var1)) {
               this.N(this.s, this.s.u, ix, class07510.field_7791);
               return true;
            }
         }
      }

      return false;
   }

   private void N(class06937 var1) {
      if (var1.R()) {
         for (class02457 class02457 : this.n) {
            if (class02457.N(var1)) {
               class02457.y(var1);
            }
         }
      }
   }

   protected void N(class01054 var1, int var2, int var3) {
      for (class06937 class06937 : this.m.T) {
         if (class06937.N()) {
            this.N(var1, class06937, var2, var3);
         }
      }
   }

   private boolean N(class01463 var1, class06937 var2, int var3, int var4, class07510 var5) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_4_2);
   }

   private boolean N(class06428 var1, class06601 var2) {
      return var1.N(var2) && ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_4_2);
   }

   protected void N(class02457 var1) {
      this.n.add(var1);
   }

   private void N(class01054 var1, int var2, int var3, CallbackInfo var4) {
      class10964 class10964 = class10964.N(var1, this.s.i(), var2, var3);
      class11938.L().L(class10964);
      if (class10964.y()) {
         var4.cancel();
      }
   }

   private void N(class06937 var1, int var2, int var3, class07510 var4, CallbackInfo var5) {
      class11368 class11368 = class11368.N(this.m.b, var2, var3, var1, var4, this.m);
      class11938.L().L(class11368);
      if (class11368.y()) {
         var5.cancel();
      }
   }

   public void N(class01054 var1) {
      if (this.d != null) {
         float f = class04995.N((float)(class07536.L() - this.d.u()) / 100.0F, 0.0F, 1.0F);
         int ix = this.d.L().x - this.d.y().x;
         int jx = this.d.L().y - this.d.y().y;
         int kx = this.d.y().x + (int)(ix * f);
         int lx = this.d.y().y + (int)(jx * f);
         var1.L();
         this.N(var1, this.d.N(), kx, lx, null);
         if (f >= 1.0F) {
            this.d = null;
         }
      }
   }

   public void N(class01054 var1, int var2, int var3, float var4) {
      int ix = this.T;
      int jx = this.b;
      super.method_25394(var1, var2, var3, var4);
      var1.i().pushMatrix();
      var1.i().translate(ix, jx);
      this.u(var1, var2, var3);
      class06937 class06937 = this.s;
      this.s = this.y(var2, var3);
      this.y(var1);
      this.N(var1, var2, var3);
      this.L(var1);
      if (class06937 != null && class06937 != this.s) {
         this.N(class06937);
      }

      Matrix3x2fStack matrix3x2fstack = var1.i();
      this.N(var1, var2, var3, var4, null);
      matrix3x2fstack.popMatrix();
   }

   private void N(class01054 var1, class06584 var2, int var3, int var4, @Nullable String var5) {
      var1.N(var2, var3, var4);
      var1.N(this.field_22793, var2, var3, var4 - (this.k.R() ? 0 : 8), var5);
   }

   protected List<class00392> N(class06584 var1) {
      return method_25408(this.field_22787, var1);
   }

   private boolean N(class06937 var1, double var2, double var4) {
      return this.N(var1.i, var1.R, 16, 16, var2, var4);
   }

   protected void N(class01054 var1, class06937 var2, int var3, int var4) {
      int ix = var2.i;
      int jx = var2.R;
      class06584 class06584x = var2.i();
      boolean flag = false;
      boolean flag1 = var2 == this.t && !this.k.R() && !this.w;
      class06584 class06584x = this.m.M();
      String sx = null;
      if (var2 == this.t && !this.k.R() && this.w && !class06584x.R()) {
         class06584x = class06584x.L(class06584x.c() / 2);
      } else if (this.v && this.j.contains(var2) && !class06584x.R()) {
         if (this.j.size() == 1) {
            return;
         }

         if (class07482.N(var2, class06584x, true) && this.m.y(var2)) {
            flag = true;
            int kx = Math.min(class06584x.U(), var2.b_(class06584x));
            int lx = var2.i().R() ? 0 : var2.i().c();
            int i1 = class07482.N(this.j, this.Q, class06584x) + lx;
            if (i1 > kx) {
               i1 = kx;
               sx = class06541.field_1054.toString() + kx;
            }

            class06584x = class06584x.L(i1);
         } else {
            this.j.remove(var2);
            this.N();
         }
      }

      if (class06584x.R() && var2.N()) {
         class01894 class01894 = var2.L();
         if (class01894 != null) {
            var1.N(class08394.Na, class01894, ix, jx, 16, 16);
            flag1 = true;
         }
      }

      if (!flag1) {
         if (flag) {
            var1.N(ix, jx, ix + 16, jx + 16, -2130706433);
         }

         int j1 = var2.i + var2.R * this.B;
         if (var2.u()) {
            var1.y(class06584x, ix, jx, j1);
         } else {
            var1.N(class06584x, ix, jx, j1);
         }

         var1.N(this.field_22793, class06584x, ix, jx, sx);
      }
   }

   private void N() {
      class06584 class06584x = this.m.M();
      if (!class06584x.R() && this.v) {
         if (this.Q == 2) {
            this.I = class06584x.U();
         } else {
            this.I = class06584x.c();

            for (class06937 class06937 : this.j) {
               class06584 class06584x = class06937.i();
               int ix = class06584x.R() ? 0 : class06584x.c();
               int jx = Math.min(class06584x.U(), class06937.b_(class06584x));
               int kx = Math.min(class07482.N(this.j, this.Q, class06584x) + ix, jx);
               this.I -= kx - ix;
            }
         }
      }
   }

   protected abstract void N(class01054 var1, float var2, int var3, int var4);

   private void N(class06613 var1) {
      if (this.s != null && this.m.M().R()) {
         if (((class05630)this.field_22787.i_7).Q.N(var1)) {
            this.N(this.s, this.s.u, 40, class07510.field_7791);
            return;
         }

         for (int ix = 0; ix < 9; ix++) {
            if (((class05630)this.field_22787.i_7).f[ix].N(var1)) {
               this.N(this.s, this.s.u, ix, class07510.field_7791);
            }
         }
      }
   }

   protected boolean N(double var1, double var3, int var5, int var6) {
      return var1 < var5 || var3 < var6 || var1 >= var5 + this.B || var3 >= var6 + this.Z;
   }

   public void N(@Nullable class06937 var1, class07510 var2) {
      if (var1 != null && var1.R()) {
         for (class02457 class02457 : this.n) {
            if (class02457.N(var1)) {
               class02457.N(var1, var2);
            }
         }
      }
   }

   protected boolean N(int var1, int var2, int var3, int var4, double var5, double var7) {
      int ix = this.T;
      int jx = this.b;
      var5 -= ix;
      var7 -= jx;
      return var5 >= var1 - 1 && var5 < var1 + var3 + 1 && var7 >= var2 - 1 && var7 < var2 + var4 + 1;
   }

   protected void N(class06937 var1, int var2, int var3, class07510 var4) {
      if (var1 != null) {
         var2 = var1.u;
      }

      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(var1, var4);
         ((class03443)this.field_22787.T_2).N(this.m.b, var2, var3, var4, (class04453)this.field_22787.T_4);
      }
   }

   @Override
   public void method_25426() {
      this.T = (this.field_22789 - this.B) / 2;
      this.b = (this.field_22790 - this.Z) / 2;
      this.n.clear();
      this.N(new class02408(this.field_22787));
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (super.method_25404(var1)) {
         return true;
      } else if (((class05630)this.field_22787.i_7).Y.N(var1)) {
         this.method_25419();
         return true;
      } else {
         this.N(var1);
         if (this.s != null && this.s.R()) {
            if (((class05630)this.field_22787.i_7).J.N(var1)) {
               class07510 class07510 = class07510.field_7796;
               byte b0 = 0;
               int ix = this.s.u;
               class06937 class06937 = this.s;
               if (this.N(this, class06937, ix, b0, class07510)) {
                  this.N(class06937, ix, b0, class07510);
               }
            } else if (((class05630)this.field_22787.i_7).O.N(var1)) {
               this.N(this.s, this.s.u, var1.m() ? 1 : 0, class07510.field_7795);
            }
         }

         return false;
      }
   }

   @Override
   public final void method_25393() {
      super.method_25393();
      if (((class04453)this.field_22787.T_4).method_5805() && !((class04453)this.field_22787.T_4).method_31481()) {
         this.u();
      } else {
         ((class04453)this.field_22787.T_4).method_7346();
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25432() {
      if ((class04453)this.field_22787.T_4 != null) {
         this.m.y((class04453)this.field_22787.T_4);
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      super.method_25420(var1, var2, var3, var4);
      this.N(var1, var4, var2, var3);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      this.N(var1, var2, var3, var4);
      this.L(var1, var2, var3);
      this.N(var1);
   }

   @Override
   public void method_25419() {
      ((class04453)this.field_22787.T_4).method_7346();
      if (this.s != null) {
         this.N(this.s);
      }

      super.method_25419();
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public boolean method_25403(class06613 var1, double var2, double var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         this.y(var1, var2, var4, callbackinforeturnable1);
         if (callbackinforeturnable1.isCancelled()) {
            return callbackinforeturnable1.getReturnValueZ();
         } else {
            class06937 class06937 = this.y(var1.n(), var1.t());
            class06584 class06584 = this.m.M();
            if (this.t != null && ((class05630)this.field_22787.i_7).Nm().method_41753()) {
               if (var1.v() == 0 || var1.v() == 1) {
                  if (this.k.R()) {
                     if (class06937 != this.t && !this.t.i().R()) {
                        this.k = this.t.i().t();
                     }
                  } else if (this.k.c() > 1 && class06937 != null && class07482.N(class06937, this.k, false)) {
                     long ix = class07536.L();
                     if (this.G == class06937) {
                        if (ix - this.Y > 500L) {
                           this.N(this.t, this.t.u, 0, class07510.field_7790);
                           this.N(class06937, class06937.u, 1, class07510.field_7790);
                           this.N(this.t, this.t.u, 0, class07510.field_7790);
                           this.Y = ix + 750L;
                           this.k.B(1);
                        }
                     } else {
                        this.G = class06937;
                        this.Y = ix;
                     }
                  }
               }

               return true;
            } else if (this.v
               && class06937 != null
               && !class06584.R()
               && (class06584.c() > this.j.size() || this.Q == 2)
               && class07482.N(class06937, class06584, true)
               && class06937.N(class06584)
               && this.m.y(class06937)) {
               this.j.add(class06937);
               this.N();
               return true;
            } else {
               return class06937 == null && this.m.M().R() ? super.method_25403(var1, var2, var4) : true;
            }
         }
      }
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (this.s != null && this.s.R()) {
         for (class02457 class02457 : this.n) {
            if (class02457.N(this.s) && class02457.N(var5, var7, this.s.u, this.s.i())) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean method_25406(class06613 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         class06937 class06937xx = this.y(var1.n(), var1.t());
         int ix = this.T;
         int jx = this.b;
         boolean flag = this.N(var1.n(), var1.t(), ix, jx);
         int kx = -1;
         if (class06937xx != null) {
            kx = class06937xx.u;
         }

         if (flag) {
            kx = -999;
         }

         if (this.J && class06937xx != null && var1.v() == 0 && this.m.N(class06584.E, class06937xx)) {
            if (this.y(var1)) {
               if (!this.o.R()) {
                  for (class06937 class06937x : this.m.T) {
                     if (class06937x != null
                        && class06937x.N((class04453)this.field_22787.T_4)
                        && class06937x.R()
                        && class06937x.L == class06937xx.L
                        && class07482.N(class06937x, this.o, true)) {
                        this.N(class06937x, class06937x.u, var1.v(), class07510.field_7794);
                     }
                  }
               }
            } else {
               this.N(class06937xx, kx, var1.v(), class07510.field_7793);
            }

            this.J = false;
         } else {
            if (this.v && this.O != var1.v()) {
               this.v = false;
               this.j.clear();
               this.g = true;
               return true;
            }

            if (this.g) {
               this.g = false;
               return true;
            }

            if (this.t != null && ((class05630)this.field_22787.i_7).Nm().method_41753()) {
               if (var1.v() == 0 || var1.v() == 1) {
                  if (this.k.R() && class06937xx != this.t) {
                     this.k = this.t.i();
                  }

                  boolean flag2 = class07482.N(class06937xx, this.k, false);
                  if (kx != -1 && !this.k.R() && flag2) {
                     this.N(this.t, this.t.u, var1.v(), class07510.field_7790);
                     this.N(class06937xx, kx, 0, class07510.field_7790);
                     if (this.m.M().R()) {
                        this.d = null;
                     } else {
                        this.N(this.t, this.t.u, var1.v(), class07510.field_7790);
                        this.d = new class01441(this.k, new Vector2i((int)var1.n(), (int)var1.t()), new Vector2i(this.t.i + ix, this.t.R + jx), class07536.L());
                     }
                  } else if (!this.k.R()) {
                     this.d = new class01441(this.k, new Vector2i((int)var1.n(), (int)var1.t()), new Vector2i(this.t.i + ix, this.t.R + jx), class07536.L());
                  }

                  this.Z();
               }
            } else if (this.v && !this.j.isEmpty()) {
               this.N(null, -999, class07482.L(0, this.Q), class07510.field_7789);

               for (class06937 class06937xx : this.j) {
                  this.N(class06937xx, class06937xx.u, class07482.L(1, this.Q), class07510.field_7789);
               }

               this.N(null, -999, class07482.L(2, this.Q), class07510.field_7789);
            } else if (!this.m.M().R()) {
               if (((class05630)this.field_22787.i_7).J.N(var1)) {
                  this.N(class06937xx, kx, var1.v(), class07510.field_7796);
               } else {
                  boolean var7 = kx != -999 && this.y(var1);
                  if (var7) {
                     this.o = class06937xx != null && class06937xx.R() ? class06937xx.i().t() : class06584.E;
                  }

                  this.N(class06937xx, kx, var1.v(), var7 ? class07510.field_7794 : class07510.field_7790);
               }
            }
         }

         this.v = false;
         return true;
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (super.method_25402(var1, var2)) {
         return true;
      } else {
         boolean flag = ((class05630)this.field_22787.i_7).J.N(var1) && ((class04453)this.field_22787.T_4).method_56992();
         class06937 class06937 = this.y(var1.n(), var1.t());
         this.J = this.l == class06937 && var2;
         this.g = false;
         if (var1.v() != 0 && var1.v() != 1 && !flag) {
            this.N(var1);
         } else {
            int ix = this.T;
            int jx = this.b;
            boolean flag1 = this.N(var1.n(), var1.t(), ix, jx);
            int kx = -1;
            if (class06937 != null) {
               kx = class06937.u;
            }

            if (flag1) {
               kx = -999;
            }

            if (((class05630)this.field_22787.i_7).Nm().method_41753() && flag1 && this.m.M().R()) {
               this.method_25419();
               return true;
            }

            if (kx != -1) {
               if (((class05630)this.field_22787.i_7).Nm().method_41753()) {
                  if (class06937 != null && class06937.R()) {
                     this.t = class06937;
                     this.k = class06584.E;
                     this.w = var1.v() == 1;
                  } else {
                     this.t = null;
                  }
               } else if (!this.v) {
                  if (this.m.M().R()) {
                     if (flag) {
                        this.N(class06937, kx, var1.v(), class07510.field_7796);
                     } else {
                        boolean flag2 = kx != -999 && this.y(var1);
                        class07510 class07510 = class07510.field_7790;
                        if (flag2) {
                           this.o = class06937 != null && class06937.R() ? class06937.i().t() : class06584.E;
                           class07510 = class07510.field_7794;
                        } else if (kx == -999) {
                           class07510 = class07510.field_7795;
                        }

                        this.N(class06937, kx, var1.v(), class07510);
                     }

                     this.g = true;
                  } else {
                     this.v = true;
                     this.O = var1.v();
                     this.j.clear();
                     if (var1.v() == 0) {
                        this.Q = 0;
                     } else if (var1.v() == 1) {
                        this.Q = 1;
                     } else if (flag) {
                        this.Q = 2;
                     }
                  }
               }
            }
         }

         this.l = class06937;
         return true;
      }
   }

   protected void a_(class01054 var1, int var2, int var3) {
      if (this.s != null && this.s.R()) {
         class06584 class06584 = this.s.i();
         if (this.m.M().R() || this.y(class06584)) {
            class01590 class01590 = this.field_22793;
            List list = this.N(class06584);
            Optional optional = class06584.N();
            class01894 class01894 = class06584.method_58694(class02484.V);
            CallbackInfo callbackinfo = new CallbackInfo("", true);
            this.N(var1, var2, var3, callbackinfo);
            if (callbackinfo.isCancelled()) {
               return;
            }

            var1.N(class01590, list, optional, var2, var3, class01894);
         }
      }
   }
}
