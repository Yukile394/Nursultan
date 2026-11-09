package minecraft;

import Nursultan.class09458;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Optional;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;

public class class04631 extends class05914 {
   private static final class00392 N = class00392.L("options.videoTitle");
   private static final class00392 y = class00392.L("options.improvedTransparency").N(class06541.field_1056);
   private static final class00392 L = class00392.N("options.graphics.warning.message", y, y);
   private static final class00392 u = class00392.L("options.graphics.warning.title").N(class06541.field_1061);
   private static final class00392 i = class00392.L("options.graphics.warning.accept");
   private static final class00392 R = class00392.L("options.graphics.warning.cancel");
   private static final class00392 M = class00392.L("options.video.display.header");
   private static final class00392 B = class00392.L("options.video.quality.header");
   private static final class00392 Z = class00392.L("options.video.preferences.header");
   private final class01246 z;
   private final int U;
   private final int E;
   private final class06532 W;

   private static class04370<?>[] L(class05630 var0) {
      return new class04370[]{var0.NG(), var0.P(), var0.X(), var0.b()};
   }

   public class04631(class05096 var1, class06202 var2, class05630 var3) {
      super(var1, var3, N);
      this.z = var2.Ns();
      this.z.R();
      if (var3.s().method_41753()) {
         this.z.u();
      }

      this.U = var3.V().method_41753();
      this.E = var3.e().method_41753();
      this.W = var3.c().method_41753();
   }

   private static class04370<?>[] y(class05630 var0) {
      return new class04370[]{var0.B(), var0.NN(), var0.z(), var0.Nq(), var0.NP(), var0.No()};
   }

   public void N() {
      if (this.field_51824 != null) {
         class04370<Boolean> class04370 = this.field_21336.s();
         class06478 class06478 = this.field_51824.y(class04370);
         if (class06478 != null) {
            ((class06366)class06478).N(class04370.method_41753());
         }
      }
   }

   private class04370[] N(class04370[] var1) {
      class04370[] aclass04370 = new class04370[var1.length + 2];
      System.arraycopy(var1, 0, aclass04370, 0, var1.length);
      aclass04370[aclass04370.length - 2] = new class04370<>(
         "options.iris.shaderPackSelection",
         class04370.method_42717(class00392.i()),
         (var0, var1x) -> class00392.i(),
         class04370.field_38278,
         true,
         var1x -> this.field_22787.N(new ShaderPackScreen(this))
      );
      aclass04370[aclass04370.length - 1] = IrisVideoSettings.RENDER_DISTANCE;
      return aclass04370;
   }

   private static class04370<?>[] N(class05630 var0) {
      return new class04370[]{
         var0.a(),
         var0.i(),
         var0.j(),
         var0.R(),
         var0.T(),
         var0.U(),
         var0.NK(),
         var0.V(),
         var0.Ny(),
         var0.M(),
         var0.G(),
         var0.E(),
         var0.m(),
         var0.s(),
         var0.c(),
         var0.e(),
         var0.W()
      };
   }

   public void N(boolean var1) {
      if (this.field_51824 != null) {
         class06478 class06478 = this.field_51824.y(this.field_21336.NP());
         if (class06478 != null) {
            ((class06366)class06478).N(Boolean.valueOf(var1));
         }
      }
   }

   @Override
   public void method_25393() {
      if (this.field_51824 != null) {
         class06478 class06478 = this.field_51824.y(this.field_21336.e());
         if (class06478 instanceof class05801) {
            ((class05801)class06478).field_22763 = this.field_21336.c().method_41753() == class06532.field_64665;
         }
      }

      super.method_25393();
   }

   @Override
   public void method_25432() {
      if (this.field_21336.V().method_41753() != this.U || this.field_21336.e().method_41753() != this.E || this.field_21336.c().method_41753() != this.W) {
         this.field_22787.N(this.field_21336.V().method_41753());
         this.field_22787.Nw();
      }

      super.method_25432();
   }

   @Override
   public void method_25419() {
      this.field_22787.Nt().R();
      super.method_25419();
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      if (this.field_22787.s()) {
         class04370<Integer> class04370 = this.field_21336.Nq();
         if (class04370.method_41754() instanceof class04343 class04343) {
            int j = class04370.method_41753();
            int ix = (j == 0 ? class04343.L() + 1 : j) + (int)Math.signum(var7);
            if (ix != 0 && ix <= class04343.L() && ix >= class04343.aA_()) {
               class06366 class06366 = (class06366)this.field_51824.y(class04370);
               if (class06366 != null) {
                  class04370.method_41748(ix);
                  class06366.N(ix);
                  this.field_51824.method_44382(0.0);
                  return true;
               }
            }
         }

         return false;
      } else {
         return super.method_25401(var1, var3, var5, var7);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (super.method_25402(var1, var2)) {
         if (this.z.i()) {
            ArrayList arraylist = Lists.newArrayList(new class00392[]{L, class05220.n});
            String s = this.z.M();
            if (s != null) {
               arraylist.add(class05220.n);
               arraylist.add(class00392.N("options.graphics.warning.renderer", s).N(class06541.field_1080));
            }

            String s1 = this.z.Z();
            if (s1 != null) {
               arraylist.add(class05220.n);
               arraylist.add(class00392.N("options.graphics.warning.vendor", s1).N(class06541.field_1080));
            }

            String s2 = this.z.B();
            if (s2 != null) {
               arraylist.add(class05220.n);
               arraylist.add(class00392.N("options.graphics.warning.version", s2).N(class06541.field_1080));
            }

            this.field_22787.N(new class01274(u, arraylist, ImmutableList.of(new class09458(i, var1x -> {
               this.field_21336.s().method_41748(true);
               ((class03063)class06202.Nq().B_2).u();
               this.z.u();
               this.field_22787.N(this);
            }), new class09458(R, var1x -> {
               this.z.u();
               this.field_21336.s().method_41748(false);
               this.N();
               this.field_22787.N(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void method_60325() {
      byte b0 = -1;
      class08844 class08844 = this.field_22787.Nt();
      class06221 class06221 = class08844.v();
      int ix;
      if (class06221 == null) {
         ix = -1;
      } else {
         Optional<class04760> optional = class08844.i();
         ix = optional.<Integer>map(class06221::N).orElse(-1);
      }

      class04370 class04370 = new class04370<>(
         "options.fullscreen.resolution",
         class04370.method_42399(),
         (var1x, var2x) -> {
            if (class06221 == null) {
               return class00392.L("options.fullscreen.unavailable");
            } else if (var2x == -1) {
               return class05630.N(var1x, class00392.L("options.fullscreen.current"));
            } else {
               class04760 class04760 = class06221.N(var2x);
               return class05630.N(
                  var1x,
                  class00392.N("options.fullscreen.entry", class04760.N(), class04760.y(), class04760.R(), class04760.L() + class04760.u() + class04760.i())
               );
            }
         },
         new class04369(-1, class06221 != null ? class06221.i() - 1 : -1),
         ix,
         var2x -> {
            if (class06221 != null) {
               class08844.N(var2x == -1 ? Optional.empty() : Optional.of(class06221.N(var2x)));
            }
         }
      );
      this.field_51824.N(M);
      this.field_51824.N(class04370);
      class05002 class05002 = this.field_51824;
      class04370<?>[] class04370x = y(this.field_21336);
      class05002.N(this.N(class04370x));
      this.field_51824.N(B);
      this.field_51824.N(this.field_21336.Z());
      class05002 = this.field_51824;
      class04370x = N(this.field_21336);
      class05002.N(this.N(class04370x));
      this.field_51824.N(Z);
      class05002 = this.field_51824;
      class04370x = L(this.field_21336);
      class05002.N(this.N(class04370x));
   }
}
