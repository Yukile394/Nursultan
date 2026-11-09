package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class08300 extends class03286 implements class00061 {
   static final class00392 N = class00392.L("mco.configure.worlds.title");
   private final class05092 y;
   private final class06202 L;
   private class04981 u;
   private final class05362 i;
   private final class05362 R;
   private final class05362 M;
   private final List<class05099> B = Lists.newArrayList();

   private void L() {
      class04739 class04739 = new class04739(
         class00392.L("mco.template.title.minigame"),
         this::N,
         class04969.field_19438,
         null,
         List.of(class00392.L("mco.minigame.world.info.line1").y(-4539718), class00392.L("mco.minigame.world.info.line2").y(-4539718))
      );
      this.L.N(class04739);
   }

   class08300(class05092 var1, class06202 var2, class04981 var3) {
      super(N);
      this.y = var1;
      this.L = var2;
      this.u = var3;
      class02080 class02080xx = this.Z.L(20).u(1);
      class02080 class02080x = new class02060().L(16).u(4);
      this.B.clear();

      for (int ix = 1; ix < 5; ix++) {
         this.B.add(class02080x.N(this.N(ix), class02072.Z().R()));
      }

      class02080xx.N(class02080x.N());
      class02080 class02080xx = new class02060().L(8).u(1);
      this.i = class02080xx.N(
         class05362.method_46430(
               class00392.L("mco.configure.world.buttons.options"), var3x -> var2.N(new class04723(var1, var3.z.get(var3.T).N(), var3.m, var3.T))
            )
            .N(0, 0, 150, 20)
            .N()
      );
      this.R = class02080xx.N(
         class05362.method_46430(class00392.L("mco.configure.world.backup"), var3x -> var2.N(new class05094(var1, var3.B(), var3.T))).N(0, 0, 150, 20).N()
      );
      this.M = class02080xx.N(class05362.method_46430(class00392.i(), var1x -> this.N()).N(0, 0, 150, 20).N());
      class02080xx.N(class02080xx.N(), class02072.Z().y());
      this.R.field_22763 = true;
      this.N(var3);
   }

   private void y(int var1, class04981 var2) {
      this.L.N(class02252.N(this.y, class00392.L("mco.configure.world.slot.switch.question.line1"), var3 -> {
         this.y.R();
         class04736 class04736 = class04736.N(this.y, var1, var2, () -> this.L.execute(() -> this.L.N(this.y.Z())));
         this.L.N(class04736);
      }));
   }

   @Override
   public void y(class04981 var1) {
      this.N(var1);
   }

   private boolean y() {
      return this.u.z();
   }

   private void N() {
      if (this.y()) {
         this.L.N(new class04739(class00392.L("mco.template.title.minigame"), this::N, class04969.field_19438, null));
      } else {
         this.L.N(class04736.N(this.y, this.u.B(), () -> this.L.execute(() -> this.L.N(this.y.Z()))));
      }
   }

   @Override
   public void N(class04981 var1) {
      this.u = var1;
      this.i.field_22763 = !var1.U && !this.y();
      this.M.field_22763 = !var1.U;
      if (this.y()) {
         this.M.method_25355(class00392.L("mco.configure.world.buttons.switchminigame"));
      } else {
         boolean var2 = var1.z.containsKey(var1.T) && var1.z.get(var1.T).y.Z;
         if (var2) {
            this.M.method_25355(class00392.L("mco.configure.world.buttons.newworld"));
         } else {
            this.M.method_25355(class00392.L("mco.configure.world.buttons.resetworld"));
         }
      }

      this.R.field_22763 = !this.y();

      for (class05099 class05099 : this.B) {
         if (class05099.N(var1).z) {
            class05099.method_55445(80, 80);
         } else {
            class05099.method_55445(50, 50);
         }
      }
   }

   private void N(@Nullable class04982 var1) {
      if (var1 != null && class05398.field_19448 == var1.Z()) {
         this.y.R();
         class05092 class05092 = this.y.Z();
         this.L.N(new class04708(class05092, new class04694(this.u.y, var1, class05092)));
      } else {
         this.L.N(this.y);
      }
   }

   private class05099 N(int var1) {
      return new class05099(0, 0, 80, 80, var1, this.u, var2 -> {
         class05119 class05119 = ((class05099)var2).y();
         switch (class05119.B) {
            case field_19679:
               if (class05119.M) {
                  this.L();
               } else if (class05119.R) {
                  this.y(var1, this.u);
               } else {
                  this.N(var1, this.u);
               }
            case field_19678:
               return;
            default:
               throw new IllegalStateException("Unknown action " + class05119.B);
         }
      });
   }

   private void N(int var1, class04981 var2) {
      this.L.N(class02252.N(this.y, class00392.L("mco.configure.world.slot.switch.question.line1"), var3 -> {
         class05092 class05092 = this.y.Z();
         this.y.R();
         this.L.N(new class04708(class05092, new class04724(var2.y, var1, () -> this.L.execute(() -> this.L.N(class05092)))));
      }));
   }
}
