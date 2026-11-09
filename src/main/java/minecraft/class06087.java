package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06087 extends class05096 {
   private static final class00392 y = class00392.L("jigsaw_block.joint_label");
   private static final class00392 L = class00392.L("jigsaw_block.pool");
   private static final class00392 u = class00392.L("jigsaw_block.name");
   private static final class00392 i = class00392.L("jigsaw_block.target");
   private static final class00392 R = class00392.L("jigsaw_block.final_state");
   private static final class00392 M = class00392.L("jigsaw_block.placement_priority");
   private static final class00392 B = class00392.L("jigsaw_block.placement_priority.tooltip");
   private static final class00392 Z = class00392.L("jigsaw_block.selection_priority");
   private static final class00392 z = class00392.L("jigsaw_block.selection_priority.tooltip");
   private final class04858 U;
   private class04927 E;
   private class04927 W;
   private class04927 m;
   private class04927 P;
   private class04927 s;
   private class04927 T;
   int N;
   private boolean b = true;
   private class06366<class04853> j;
   private class05362 v;
   private class05362 n;
   private class04853 t;

   private void L() {
      this.field_22787
         .NE()
         .N(
            new class04842(
               this.U.d(),
               class01894.N(this.E.method_1882()),
               class01894.N(this.W.method_1882()),
               class01894.N(this.m.method_1882()),
               this.P.method_1882(),
               this.t,
               this.y(this.s.method_1882()),
               this.y(this.T.method_1882())
            )
         );
   }

   public class06087(class04858 var1) {
      super(class05153.N);
      this.U = var1;
   }

   private void i() {
      boolean flag = N(this.E.method_1882()) && N(this.W.method_1882()) && N(this.m.method_1882());
      this.v.field_22763 = flag;
      this.n.field_22763 = flag;
   }

   private void u() {
      this.field_22787.NE().N(new class05044(this.U.d(), this.N, this.b));
   }

   private void y() {
      this.field_22787.N(null);
   }

   private int y(String var1) {
      try {
         return Integer.parseInt(var1);
      } catch (NumberFormatException numberformatexception) {
         return 0;
      }
   }

   private void N(CallbackInfo var1) {
      if ((Boolean)DebugSettings.INSTANCE.hideModernJigsawScreenFeatures.getValue()) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_2)) {
            this.s.field_22763 = false;
            this.T.field_22763 = false;
         }

         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            this.E.field_22763 = false;
            this.j.field_22763 = false;
            int ix = this.method_25396().indexOf(this.j);
            ((class06478)this.method_25396().get(ix + 1)).field_22763 = false;
            ((class06478)this.method_25396().get(ix + 2)).field_22763 = false;
            ((class06478)this.method_25396().get(ix + 3)).field_22763 = false;
         }
      }
   }

   public static boolean N(String var0) {
      return class01894.L(var0) != null;
   }

   private void N(class01054 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if ((Boolean)DebugSettings.INSTANCE.hideModernJigsawScreenFeatures.getValue()
         && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         this.E.method_1852(this.W.method_1882());
      }
   }

   private void N() {
      this.L();
      this.field_22787.N(null);
   }

   @Override
   public void method_25426() {
      this.m = new class04927(this.field_22793, this.field_22789 / 2 - 153, 20, 300, 20, L);
      this.m.method_1880(128);
      this.m.method_1852(this.U.u().N().toString());
      this.m.method_1863(var1x -> this.i());
      this.method_25429(this.m);
      this.E = new class04927(this.field_22793, this.field_22789 / 2 - 153, 55, 300, 20, u);
      this.E.method_1880(128);
      this.E.method_1852(this.U.N().toString());
      this.E.method_1863(var1x -> this.i());
      this.method_25429(this.E);
      this.W = new class04927(this.field_22793, this.field_22789 / 2 - 153, 90, 300, 20, i);
      this.W.method_1880(128);
      this.W.method_1852(this.U.L().toString());
      this.W.method_1863(var1x -> this.i());
      this.method_25429(this.W);
      this.P = new class04927(this.field_22793, this.field_22789 / 2 - 153, 125, 300, 20, R);
      this.P.method_1880(256);
      this.P.method_1852(this.U.R());
      this.method_25429(this.P);
      this.s = new class04927(this.field_22793, this.field_22789 / 2 - 153, 160, 98, 20, Z);
      this.s.method_1880(3);
      this.s.method_1852(Integer.toString(this.U.Z()));
      this.s.method_47400(class04141.N(z));
      this.method_25429(this.s);
      this.T = new class04927(this.field_22793, this.field_22789 / 2 - 50, 160, 98, 20, M);
      this.T.method_1880(3);
      this.T.method_1852(Integer.toString(this.U.B()));
      this.T.method_47400(class04141.N(B));
      this.method_25429(this.T);
      this.t = this.U.M();
      this.j = this.method_37063(
         class06366.N(class04853::N, this.t).N(class04853.values()).N().N(this.field_22789 / 2 + 54, 160, 100, 20, y, (var1x, var2) -> this.t = var2)
      );
      boolean flag = class04884.U(this.U.w()).z().y();
      this.j.field_22763 = flag;
      this.j.field_22764 = flag;
      this.method_37063(new class06116(this, this.field_22789 / 2 - 154, 185, 100, 20, class05220.N, 0.0));
      this.method_37063(
         class06366.N(this.b).N(this.field_22789 / 2 - 50, 185, 100, 20, class00392.L("jigsaw_block.keep_jigsaws"), (var1x, var2) -> this.b = var2)
      );
      this.n = this.method_37063(class05362.method_46430(class00392.L("jigsaw_block.generate"), var1x -> {
         this.N();
         this.u();
      }).N(this.field_22789 / 2 + 54, 185, 100, 20).N());
      this.v = this.method_37063(class05362.method_46430(class05220.u, var1x -> this.N()).N(this.field_22789 / 2 - 4 - 150, 210, 150, 20).N());
      this.method_37063(class05362.method_46430(class05220.i, var1x -> this.y()).N(this.field_22789 / 2 + 4, 210, 150, 20).N());
      this.i();
      this.N(null);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.m);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (super.method_25404(var1)) {
         return true;
      } else if (this.v.field_22763 && var1.u()) {
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
      this.N(var1, var2, var3, var4, null);
      super.method_25394(var1, var2, var3, var4);
      var1.y(this.field_22793, L, this.field_22789 / 2 - 153, 10, -6250336);
      this.m.method_25394(var1, var2, var3, var4);
      var1.y(this.field_22793, u, this.field_22789 / 2 - 153, 45, -6250336);
      this.E.method_25394(var1, var2, var3, var4);
      var1.y(this.field_22793, i, this.field_22789 / 2 - 153, 80, -6250336);
      this.W.method_25394(var1, var2, var3, var4);
      var1.y(this.field_22793, R, this.field_22789 / 2 - 153, 115, -6250336);
      this.P.method_25394(var1, var2, var3, var4);
      var1.y(this.field_22793, Z, this.field_22789 / 2 - 153, 150, -6250336);
      this.T.method_25394(var1, var2, var3, var4);
      var1.y(this.field_22793, M, this.field_22789 / 2 - 50, 150, -6250336);
      this.s.method_25394(var1, var2, var3, var4);
      if (class04884.U(this.U.w()).z().y()) {
         var1.y(this.field_22793, y, this.field_22789 / 2 + 53, 150, -6250336);
      }
   }

   @Override
   public void method_25419() {
      this.y();
   }

   @Override
   public void method_25410(int var1, int var2) {
      String sx = this.E.method_1882();
      String s1 = this.W.method_1882();
      String s2 = this.m.method_1882();
      String s3 = this.P.method_1882();
      String s4 = this.s.method_1882();
      String s5 = this.T.method_1882();
      int ix = this.N;
      class04853 class04853 = this.t;
      this.method_25423(var1, var2);
      this.E.method_1852(sx);
      this.W.method_1852(s1);
      this.m.method_1852(s2);
      this.P.method_1852(s3);
      this.N = ix;
      this.t = class04853;
      this.j.N(class04853);
      this.s.method_1852(s4);
      this.T.method_1852(s5);
   }
}
