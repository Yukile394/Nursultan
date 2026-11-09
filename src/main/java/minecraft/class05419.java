package minecraft;

import java.util.List;
import java.util.Optional;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class class05419 extends class05431<class04974> {
   private static final class01894 N = class01894.y("container/smithing/error");
   private static final class01894 y = class01894.y("container/slot/smithing_template_armor_trim");
   private static final class01894 L = class01894.y("container/slot/smithing_template_netherite_upgrade");
   private static final class00392 u = class00392.L("container.upgrade.missing_template_tooltip");
   private static final class00392 n = class00392.L("container.upgrade.error_tooltip");
   private static final List<class01894> t = List.of(y, L);
   private static final int G = 44;
   private static final int l = 15;
   private static final int d = 28;
   private static final int w = 21;
   private static final int k = 65;
   private static final int Y = 46;
   private static final int Q = 115;
   private static final int O = 210;
   private static final int g = 25;
   private static final Vector3f I = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Quaternionf J = new Quaternionf().rotationXYZ(0.43633232F, 0.0F, (float) Math.PI);
   private static final int o = 25;
   private static final int q = 121;
   private static final int K = 20;
   private static final int V = 161;
   private static final int e = 80;
   private final class03245 H = new class03245(0);
   private final class03245 c = new class03245(1);
   private final class03245 X = new class03245(2);
   private final class02777 a = new class02777();

   private boolean L() {
      return this.m.W();
   }

   public class05419(class04974 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3, class01894.y("textures/gui/container/smithing.png"));
      this.z = 44;
      this.U = 15;
      this.a.U = class07078.B;
      this.a.A = false;
      this.a.F = true;
      this.a.h = 25.0F;
      this.a.x = 210.0F;
   }

   @Override
   protected void i(class01054 var1, int var2, int var3) {
      if (this.L()) {
         var1.N(class08394.Na, N, var2 + 65, var3 + 46, 28, 21);
      }
   }

   @Override
   public void u() {
      super.u();
      Optional<class03262> optional = this.y();
      this.H.N(t);
      this.c.N(optional.map(class03262::L).orElse(List.of()));
      this.X.N(optional.map(class03262::W).orElse(List.of()));
   }

   private Optional<class03262> y() {
      class06584 class06584 = this.m.L(0).i();
      if (!class06584.R()) {
         class06581 class06581 = class06584.B();
         if (class06581 instanceof class03262) {
            return Optional.of((class03262)class06581);
         }
      }

      return Optional.empty();
   }

   private void y(class06584 var1) {
      this.a.NH = class06584.E;
      this.a.Ne.y();
      this.a.e = class06584.E;
      this.a.NP.y();
      this.a.H = class06584.E;
      this.a.c = class06584.E;
      this.a.X = class06584.E;
      if (!var1.R()) {
         class08725 class08725 = var1.method_58694(class02484.o);
         class07085 class07085 = class08725 != null ? class08725.y() : null;
         class08943 class08943 = this.field_22787.NM();
         switch (class07085) {
            case HEAD:
               if (class02562.N(var1, class07085.field_6169)) {
                  this.a.e = var1.t();
               } else {
                  class08943.N(this.a.NP, var1, class03662.field_4316, null, null, 0);
               }
               break;
            case CHEST:
               this.a.H = var1.t();
               break;
            case LEGS:
               this.a.c = var1.t();
               break;
            case FEET:
               this.a.X = var1.t();
               break;
            case null:
            default:
               this.a.NH = var1.t();
               class08943.N(this.a.Ne, var1, class03662.field_4323, null, null, 0);
         }
      }
   }

   @Override
   public void N(class07482 var1, int var2, class06584 var3) {
      if (var2 == 3) {
         this.y(var3);
      }
   }

   @Override
   protected void N() {
      this.y(this.m.L(3).i());
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      super.N(var1, var2, var3, var4);
      this.H.N(this.m, var1, var2, this.T, this.b);
      this.c.N(this.m, var1, var2, this.T, this.b);
      this.X.N(this.m, var1, var2, this.T, this.b);
      int i = this.T + 121;
      int j = this.b + 20;
      int kx = this.T + 161;
      int lx = this.b + 80;
      var1.N(this.a, 25.0F, I, J, null, i, j, kx, lx);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.R(var1, var2, var3);
   }

   private void R(class01054 var1, int var2, int var3) {
      Optional optional = Optional.empty();
      if (this.L() && this.N(65, 46, 28, 21, var2, var3)) {
         optional = Optional.of(n);
      }

      if (this.s != null) {
         class06584 class06584x = this.m.L(0).i();
         class06584 class06584x = this.s.i();
         if (class06584x.R()) {
            if (this.s.u == 0) {
               optional = Optional.of(u);
            }
         } else if (class06584x.B() instanceof class03262 class03262 && class06584x.R()) {
            if (this.s.u == 1) {
               optional = Optional.of(class03262.N());
            } else if (this.s.u == 2) {
               optional = Optional.of(class03262.y());
            }
         }
      }

      optional.ifPresent(var4x -> var1.y(this.field_22793, this.field_22793.L(var4x, 115), var2, var3));
   }
}
