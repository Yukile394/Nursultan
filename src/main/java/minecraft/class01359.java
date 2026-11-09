package minecraft;

import Nursultan.class09469;
import com.google.common.collect.ImmutableList;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01359 extends class05096 {
   private static final class00392 N = class00392.L("structure_block.structure_name");
   private static final class00392 y = class00392.L("structure_block.position");
   private static final class00392 L = class00392.L("structure_block.size");
   private static final class00392 u = class00392.L("structure_block.integrity");
   private static final class00392 i = class00392.L("structure_block.custom_data");
   private static final class00392 R = class00392.L("structure_block.include_entities");
   private static final class00392 M = class00392.L("structure_block.strict");
   private static final class00392 B = class00392.L("structure_block.detect_size");
   private static final class00392 Z = class00392.L("structure_block.show_air");
   private static final class00392 z = class00392.L("structure_block.show_boundingbox");
   private static final ImmutableList<class08070> U = ImmutableList.copyOf(class08070.values());
   private static final ImmutableList<class08070> E = U.stream().filter(var0 -> var0 != class08070.field_12696).collect(ImmutableList.toImmutableList());
   private final class07253 W;
   private class07111 m = class07111.field_11302;
   private class06993 P = class06993.field_11467;
   private class08070 s = class08070.field_12696;
   private boolean T;
   private boolean b;
   private boolean j;
   private boolean v;
   private class04927 n;
   private class04927 t;
   private class04927 G;
   private class04927 l;
   private class04927 d;
   private class04927 w;
   private class04927 k;
   private class04927 Y;
   private class04927 Q;
   private class04927 O;
   private class05362 g;
   private class05362 I;
   private class05362 J;
   private class05362 o;
   private class05362 q;
   private class05362 K;
   private class05362 V;
   private class06366<Boolean> e;
   private class06366<Boolean> H;
   private class06366<class07111> c;
   private class06366<Boolean> X;
   private class06366<Boolean> a;
   private final DecimalFormat p = new DecimalFormat("0.0###", DecimalFormatSymbols.getInstance(Locale.ROOT));

   private void L() {
      this.J.field_22763 = true;
      this.o.field_22763 = true;
      this.q.field_22763 = true;
      this.K.field_22763 = true;
      switch (this.W.z()) {
         case field_11467:
            this.J.field_22763 = false;
            break;
         case field_11464:
            this.q.field_22763 = false;
            break;
         case field_11465:
            this.K.field_22763 = false;
            break;
         case field_11463:
            this.o.field_22763 = false;
      }
   }

   private int L(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException numberformatexception) {
         return 0;
      }
   }

   public class01359(class07253 var1) {
      super(class00392.L(class00869.sh.w()));
      this.W = var1;
   }

   private void y() {
      this.W.N(this.m);
      this.W.N(this.P);
      this.W.N(this.s);
      this.W.N(this.T);
      this.W.y(this.b);
      this.W.i(this.j);
      this.W.R(this.v);
      this.field_22787.N(null);
   }

   private float y(String var1) {
      try {
         return Float.valueOf(var1);
      } catch (NumberFormatException numberformatexception) {
         return 1.0F;
      }
   }

   private void N(class08070 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         this.H.field_22764 = false;
      }
   }

   private boolean N(class01054 var1, class01590 var2, class00392 var3, int var4, int var5, int var6) {
      return var3 == M ? ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4) : true;
   }

   private void N(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18_2)) {
         this.n.method_1880(64);
      }
   }

   private void N() {
      if (this.N(class07271.field_12108)) {
         this.field_22787.N(null);
      }
   }

   private long N(String var1) {
      try {
         return Long.valueOf(var1);
      } catch (NumberFormatException numberformatexception) {
         return 0L;
      }
   }

   private boolean N(class07271 var1) {
      class07209 class07209 = new class07209(this.L(this.t.method_1882()), this.L(this.G.method_1882()), this.L(this.l.method_1882()));
      class00753 class00753 = new class00753(this.L(this.d.method_1882()), this.L(this.w.method_1882()), this.L(this.k.method_1882()));
      float f = this.y(this.Y.method_1882());
      long ix = this.N(this.Q.method_1882());
      this.field_22787
         .NE()
         .N(
            new class07819(
               this.W.d(),
               var1,
               this.W.E(),
               this.n.method_1882(),
               class07209,
               class00753,
               this.W.Z(),
               this.W.z(),
               this.O.method_1882(),
               this.W.W(),
               this.W.m(),
               this.W.t(),
               this.W.o(),
               f,
               ix
            )
         );
      return true;
   }

   private void N(class08070 var1) {
      this.n.method_1862(false);
      this.t.method_1862(false);
      this.G.method_1862(false);
      this.l.method_1862(false);
      this.d.method_1862(false);
      this.w.method_1862(false);
      this.k.method_1862(false);
      this.Y.method_1862(false);
      this.Q.method_1862(false);
      this.O.method_1862(false);
      this.g.field_22764 = false;
      this.I.field_22764 = false;
      this.V.field_22764 = false;
      this.e.field_22764 = false;
      this.H.field_22764 = false;
      this.c.field_22764 = false;
      this.J.field_22764 = false;
      this.o.field_22764 = false;
      this.q.field_22764 = false;
      this.K.field_22764 = false;
      this.X.field_22764 = false;
      this.a.field_22764 = false;
      switch (var1) {
         case field_12695:
            this.n.method_1862(true);
            this.t.method_1862(true);
            this.G.method_1862(true);
            this.l.method_1862(true);
            this.d.method_1862(true);
            this.w.method_1862(true);
            this.k.method_1862(true);
            this.g.field_22764 = true;
            this.V.field_22764 = true;
            this.e.field_22764 = true;
            this.H.field_22764 = false;
            this.X.field_22764 = true;
            break;
         case field_12697:
            this.n.method_1862(true);
            this.t.method_1862(true);
            this.G.method_1862(true);
            this.l.method_1862(true);
            this.Y.method_1862(true);
            this.Q.method_1862(true);
            this.I.field_22764 = true;
            this.e.field_22764 = true;
            this.H.field_22764 = true;
            this.c.field_22764 = true;
            this.J.field_22764 = true;
            this.o.field_22764 = true;
            this.q.field_22764 = true;
            this.K.field_22764 = true;
            this.a.field_22764 = true;
            this.L();
            break;
         case field_12699:
            this.n.method_1862(true);
            break;
         case field_12696:
            this.O.method_1862(true);
      }

      this.N(var1, null);
   }

   @Override
   public void method_25426() {
      this.method_37063(class05362.method_46430(class05220.u, var1x -> this.N()).N(this.field_22789 / 2 - 4 - 150, 210, 150, 20).N());
      this.method_37063(class05362.method_46430(class05220.i, var1x -> this.y()).N(this.field_22789 / 2 + 4, 210, 150, 20).N());
      this.m = this.W.Z();
      this.P = this.W.z();
      this.s = this.W.E();
      this.T = this.W.W();
      this.b = this.W.m();
      this.j = this.W.t();
      this.v = this.W.o();
      this.g = this.method_37063(class05362.method_46430(class00392.L("structure_block.button.save"), var1x -> {
         if (this.W.E() == class08070.field_12695) {
            this.N(class07271.field_12110);
            this.field_22787.N(null);
         }
      }).N(this.field_22789 / 2 + 4 + 100, 185, 50, 20).N());
      this.I = this.method_37063(class05362.method_46430(class00392.L("structure_block.button.load"), var1x -> {
         if (this.W.E() == class08070.field_12697) {
            this.N(class07271.field_12109);
            this.field_22787.N(null);
         }
      }).N(this.field_22789 / 2 + 4 + 100, 185, 50, 20).N());
      this.method_37063(
         class06366.<class08070>N(var0 -> class00392.L("structure_block.mode." + var0.method_15434()), this.s)
            .N(E, U)
            .N()
            .N(this.field_22789 / 2 - 4 - 150, 185, 50, 20, class00392.y("MODE"), (var1x, var2x) -> {
               this.W.N(var2x);
               this.N(var2x);
            })
      );
      this.V = this.method_37063(class05362.method_46430(class00392.L("structure_block.button.detect_size"), var1x -> {
         if (this.W.E() == class08070.field_12695) {
            this.N(class07271.field_12106);
            this.field_22787.N(null);
         }
      }).N(this.field_22789 / 2 + 4 + 100, 120, 50, 20).N());
      this.e = this.method_37063(class06366.N(!this.W.W()).N().N(this.field_22789 / 2 + 4 + 100, 160, 50, 20, R, (var1x, var2x) -> this.W.N(!var2x)));
      this.H = this.method_37063(class06366.N(this.W.m()).N().N(this.field_22789 / 2 + 4 + 100, 120, 50, 20, M, (var1x, var2x) -> this.W.y(var2x)));
      this.c = this.method_37063(
         class06366.<class07111>N(class07111::y, this.m)
            .N(class07111.values())
            .N()
            .N(this.field_22789 / 2 - 20, 185, 40, 20, class00392.y("MIRROR"), (var1x, var2x) -> this.W.N(var2x))
      );
      this.X = this.method_37063(class06366.N(this.W.t()).N().N(this.field_22789 / 2 + 4 + 100, 80, 50, 20, Z, (var1x, var2x) -> this.W.i(var2x)));
      this.a = this.method_37063(class06366.N(this.W.o()).N().N(this.field_22789 / 2 + 4 + 100, 80, 50, 20, z, (var1x, var2x) -> this.W.R(var2x)));
      this.J = this.method_37063(class05362.method_46430(class00392.y("0"), var1x -> {
         this.W.N(class06993.field_11467);
         this.L();
      }).N(this.field_22789 / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).N());
      this.o = this.method_37063(class05362.method_46430(class00392.y("90"), var1x -> {
         this.W.N(class06993.field_11463);
         this.L();
      }).N(this.field_22789 / 2 - 1 - 40 - 20, 185, 40, 20).N());
      this.q = this.method_37063(class05362.method_46430(class00392.y("180"), var1x -> {
         this.W.N(class06993.field_11464);
         this.L();
      }).N(this.field_22789 / 2 + 1 + 20, 185, 40, 20).N());
      this.K = this.method_37063(class05362.method_46430(class00392.y("270"), var1x -> {
         this.W.N(class06993.field_11465);
         this.L();
      }).N(this.field_22789 / 2 + 1 + 40 + 1 + 20, 185, 40, 20).N());
      this.n = new class09469(this, this.field_22793, this.field_22789 / 2 - 152, 40, 300, 20, class00392.L("structure_block.structure_name"));
      this.n.method_1880(128);
      this.n.method_1852(this.W.u());
      this.method_25429(this.n);
      class07209 class07209 = this.W.M();
      this.t = new class04927(this.field_22793, this.field_22789 / 2 - 152, 80, 80, 20, class00392.L("structure_block.position.x"));
      this.t.method_1880(15);
      this.t.method_1852(Integer.toString(class07209.method_10263()));
      this.method_25429(this.t);
      this.G = new class04927(this.field_22793, this.field_22789 / 2 - 72, 80, 80, 20, class00392.L("structure_block.position.y"));
      this.G.method_1880(15);
      this.G.method_1852(Integer.toString(class07209.method_10264()));
      this.method_25429(this.G);
      this.l = new class04927(this.field_22793, this.field_22789 / 2 + 8, 80, 80, 20, class00392.L("structure_block.position.z"));
      this.l.method_1880(15);
      this.l.method_1852(Integer.toString(class07209.method_10260()));
      this.method_25429(this.l);
      class00753 class00753 = this.W.B();
      this.d = new class04927(this.field_22793, this.field_22789 / 2 - 152, 120, 80, 20, class00392.L("structure_block.size.x"));
      this.d.method_1880(15);
      this.d.method_1852(Integer.toString(class00753.method_10263()));
      this.method_25429(this.d);
      this.w = new class04927(this.field_22793, this.field_22789 / 2 - 72, 120, 80, 20, class00392.L("structure_block.size.y"));
      this.w.method_1880(15);
      this.w.method_1852(Integer.toString(class00753.method_10264()));
      this.method_25429(this.w);
      this.k = new class04927(this.field_22793, this.field_22789 / 2 + 8, 120, 80, 20, class00392.L("structure_block.size.z"));
      this.k.method_1880(15);
      this.k.method_1852(Integer.toString(class00753.method_10260()));
      this.method_25429(this.k);
      this.Y = new class04927(this.field_22793, this.field_22789 / 2 - 152, 120, 80, 20, class00392.L("structure_block.integrity.integrity"));
      this.Y.method_1880(15);
      this.Y.method_1852(this.p.format(this.W.P()));
      this.method_25429(this.Y);
      this.Q = new class04927(this.field_22793, this.field_22789 / 2 - 72, 120, 80, 20, class00392.L("structure_block.integrity.seed"));
      this.Q.method_1880(31);
      this.Q.method_1852(Long.toString(this.W.s()));
      this.method_25429(this.Q);
      this.O = new class04927(this.field_22793, this.field_22789 / 2 - 152, 120, 240, 20, class00392.L("structure_block.custom_data"));
      this.O.method_1880(128);
      this.O.method_1852(this.W.U());
      this.method_25429(this.O);
      this.L();
      this.N(this.s);
      this.N(null);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.n);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (super.method_25404(var1)) {
         return true;
      } else if (var1.u()) {
         this.N();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_73150() {
      return true;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class08070 class08070 = this.W.E();
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
      if (class08070 != class08070.field_12696) {
         int j4 = this.field_22789 / 2 - 153;
         int jx = -6250336;
         byte b0 = 30;
         int ix = j4;
         class00392 class00392xxxxxxxxx = N;
         class01590 class01590xxxxxx = this.field_22793;
         if (this.N(var1, class01590xxxxxx, class00392xxxxxxxxx, ix, b0, jx)) {
            var1.y(class01590xxxxxx, class00392xxxxxxxxx, ix, b0, jx);
         }

         this.n.method_25394(var1, var2, var3, var4);
      }

      if (class08070 == class08070.field_12697 || class08070 == class08070.field_12695) {
         int i3 = this.field_22789 / 2 - 153;
         int l1 = -6250336;
         short short1 = 70;
         int kx = i3;
         class00392 class00392xxxx = y;
         class01590 class01590xxxxxxxx = this.field_22793;
         if (this.N(var1, class01590xxxxxxxx, class00392xxxx, kx, short1, l1)) {
            var1.y(class01590xxxxxxxx, class00392xxxx, kx, short1, l1);
         }

         this.t.method_25394(var1, var2, var3, var4);
         this.G.method_25394(var1, var2, var3, var4);
         this.l.method_25394(var1, var2, var3, var4);
         class01590 class01590x = this.field_22793;
         class00392 class00392x = R;
         i3 = this.field_22789 / 2 + 154 - this.field_22793.N(R);
         l1 = -6250336;
         short1 = 150;
         kx = i3;
         class00392xxxx = class00392x;
         class01590xxxxxxxx = class01590x;
         if (this.N(var1, class01590xxxxxxxx, class00392xxxx, kx, short1, l1)) {
            var1.y(class01590xxxxxxxx, class00392xxxx, kx, short1, l1);
         }
      }

      if (class08070 == class08070.field_12695) {
         int j3 = this.field_22789 / 2 - 153;
         int i2 = -6250336;
         byte b1 = 110;
         int lx = j3;
         class00392 class00392x = L;
         class01590 class01590x = this.field_22793;
         if (this.N(var1, class01590x, class00392x, lx, b1, i2)) {
            var1.y(class01590x, class00392x, lx, b1, i2);
         }

         this.d.method_25394(var1, var2, var3, var4);
         this.w.method_25394(var1, var2, var3, var4);
         this.k.method_25394(var1, var2, var3, var4);
         class01590 class01590xx = this.field_22793;
         class00392 class00392xx = B;
         j3 = this.field_22789 / 2 + 154 - this.field_22793.N(B);
         i2 = -6250336;
         b1 = 110;
         lx = j3;
         class00392x = class00392xx;
         class01590x = class01590xx;
         if (this.N(var1, class01590x, class00392x, lx, b1, i2)) {
            var1.y(class01590x, class00392x, lx, b1, i2);
         }

         class01590xx = this.field_22793;
         class00392xx = Z;
         j3 = this.field_22789 / 2 + 154 - this.field_22793.N(Z);
         i2 = -6250336;
         b1 = 70;
         lx = j3;
         class00392x = class00392xx;
         class01590x = class01590xx;
         if (this.N(var1, class01590x, class00392x, lx, b1, i2)) {
            var1.y(class01590x, class00392x, lx, b1, i2);
         }
      }

      if (class08070 == class08070.field_12697) {
         int k3 = this.field_22789 / 2 - 153;
         int j2 = -6250336;
         byte b2 = 110;
         int i1 = k3;
         class00392 class00392xxx = u;
         class01590 class01590xxx = this.field_22793;
         if (this.N(var1, class01590xxx, class00392xxx, i1, b2, j2)) {
            var1.y(class01590xxx, class00392xxx, i1, b2, j2);
         }

         this.Y.method_25394(var1, var2, var3, var4);
         this.Q.method_25394(var1, var2, var3, var4);
         class01590 class01590xxxx = this.field_22793;
         class00392 class00392xxxx = M;
         k3 = this.field_22789 / 2 + 154 - this.field_22793.N(M);
         j2 = -6250336;
         b2 = 110;
         i1 = k3;
         class00392xxx = class00392xxxx;
         class01590xxx = class01590xxxx;
         if (this.N(var1, class01590xxx, class00392xxx, i1, b2, j2)) {
            var1.y(class01590xxx, class00392xxx, i1, b2, j2);
         }

         class01590xxxx = this.field_22793;
         class00392xxxx = z;
         k3 = this.field_22789 / 2 + 154 - this.field_22793.N(z);
         j2 = -6250336;
         b2 = 70;
         i1 = k3;
         class00392xxx = class00392xxxx;
         class01590xxx = class01590xxxx;
         if (this.N(var1, class01590xxx, class00392xxx, i1, b2, j2)) {
            var1.y(class01590xxx, class00392xxx, i1, b2, j2);
         }
      }

      if (class08070 == class08070.field_12696) {
         int l3 = this.field_22789 / 2 - 153;
         int k2 = -6250336;
         byte b3 = 110;
         int j1 = l3;
         class00392 class00392xxxxx = i;
         class01590 class01590xxxxx = this.field_22793;
         if (this.N(var1, class01590xxxxx, class00392xxxxx, j1, b3, k2)) {
            var1.y(class01590xxxxx, class00392xxxxx, j1, b3, k2);
         }

         this.O.method_25394(var1, var2, var3, var4);
      }

      class01590 class01590xxxxx = this.field_22793;
      class00392 class00392xxxxx = class08070.N();
      int i4 = this.field_22789 / 2 - 153;
      int l2 = -6250336;
      short short2 = 174;
      int k1 = i4;
      class00392 class00392xxxxxx = class00392xxxxx;
      class01590 class01590xxxxxx = class01590xxxxx;
      if (this.N(var1, class01590xxxxxx, class00392xxxxxx, k1, short2, l2)) {
         var1.y(class01590xxxxxx, class00392xxxxxx, k1, short2, l2);
      }
   }

   @Override
   public void method_25419() {
      this.y();
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public void method_25410(int var1, int var2) {
      String sx = this.n.method_1882();
      String s1 = this.t.method_1882();
      String s2 = this.G.method_1882();
      String s3 = this.l.method_1882();
      String s4 = this.d.method_1882();
      String s5 = this.w.method_1882();
      String s6 = this.k.method_1882();
      String s7 = this.Y.method_1882();
      String s8 = this.Q.method_1882();
      String s9 = this.O.method_1882();
      this.method_25423(var1, var2);
      this.n.method_1852(sx);
      this.t.method_1852(s1);
      this.G.method_1852(s2);
      this.l.method_1852(s3);
      this.d.method_1852(s4);
      this.w.method_1852(s5);
      this.k.method_1852(s6);
      this.Y.method_1852(s7);
      this.Q.method_1852(s8);
      this.O.method_1852(s9);
   }
}
