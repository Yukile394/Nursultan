package minecraft;

import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.fabricmc.fabric.impl.client.rendering.hud.HudElementRegistryImpl;

@Environment(EnvType.CLIENT)
public class class05808 implements class00122 {
   private static final long N = 3000L;
   private final class06202 y;
   private final List<class05800> L = Lists.newArrayList();
   private boolean u;
   private final List<class05800> i = new ArrayList<>();

   public class05808(class06202 var1) {
      super();
      this.y = var1;
   }

   private void y(class01054 var1) {
      class09033 class09033 = this.y.Nr();
      if (!this.u && ((class05630)this.y.i_7).NU().method_41753()) {
         class09033.N(this);
         this.u = true;
      } else if (this.u && !((class05630)this.y.i_7).NU().method_41753()) {
         class09033.y(this);
         this.u = false;
      }

      if (this.u) {
         class03836 class03836 = class09033.y();
         class06889 class06889xxx = class03836.y();
         class06889 class06889x = class03836.L();
         class06889 class06889xx = class03836.N();
         this.i.clear();

         for (class05800 class05800x : this.L) {
            if (class05800x.L(class06889xxx)) {
               this.i.add(class05800x);
            }
         }

         if (!this.i.isEmpty()) {
            int j1 = 0;
            int k1 = 0;
            double d0 = ((class05630)this.y.i_7).K().method_41753();
            Iterator<class05800> iterator = this.i.iterator();

            while (iterator.hasNext()) {
               class05800 class05800x = iterator.next();
               class05800x.N(3000.0 * d0);
               if (!class05800x.y()) {
                  iterator.remove();
               } else {
                  k1 = Math.max(k1, ((class01590)this.y.i_3).N(class05800x.N()));
               }
            }

            k1 += ((class01590)this.y.i_3).y("<") + ((class01590)this.y.i_3).y(" ") + ((class01590)this.y.i_3).y(">") + ((class01590)this.y.i_3).y(" ");
            if (!this.i.isEmpty()) {
               var1.L();
            }

            for (class05800 class05800x : this.i) {
               short short1 = 255;
               class00392 class00392 = class05800x.N();
               class05798 class05798 = class05800x.N(class06889xxx);
               if (class05798 != null) {
                  class06889 class06889xxx = class05798.N().u(class06889xxx).u();
                  double d1 = class06889xx.y(class06889xxx);
                  boolean flag = class06889x.y(class06889xxx) > 0.5;
                  int ix = k1 / 2;
                  byte b0 = 9;
                  int j = b0 / 2;
                  float f = 1.0F;
                  int k = ((class01590)this.y.i_3).N(class00392);
                  int l = class04995.y(class04995.y((float)(class07536.L() - class05798.y()) / (float)(3000.0 * d0), 255.0F, 75.0F));
                  var1.i().pushMatrix();
                  var1.i().translate(var1.N() - ix * 1.0F - 2.0F, var1.y() - 35 - j1 * (b0 + 1) * 1.0F);
                  var1.i().scale(1.0F, 1.0F);
                  var1.N(-ix - 1, -j - 1, ix + 1, j + 1, ((class05630)this.y.i_7).y(0.8F));
                  int i1 = class02566.y(255, l, l, l);
                  if (!flag) {
                     if (d1 > 0.0) {
                        var1.y((class01590)this.y.i_3, ">", ix - ((class01590)this.y.i_3).y(">"), -j, i1);
                     } else if (d1 < 0.0) {
                        var1.y((class01590)this.y.i_3, "<", -ix, -j, i1);
                     }
                  }

                  var1.y((class01590)this.y.i_3, class00392, -k / 2, -j, i1);
                  var1.i().popMatrix();
                  j1++;
               }
            }
         }
      }
   }

   private void N(class01054 var1, Operation var2) {
      HudElementRegistryImpl.getRoot(VanillaHudElements.SUBTITLES).render(var1, class06202.Nq().NK(), (var1x, var2x) -> var2.call(new Object[]{var1x}));
   }

   @Override
   public void N(class00044 var1, class00137 var2, float var3) {
      if (var2.N() != null) {
         class00392 class00392 = var2.N();
         if (!this.L.isEmpty()) {
            for (class05800 class05800 : this.L) {
               if (class05800.N().equals(class00392)) {
                  class05800.y(new class06889(var1.z(), var1.U(), var1.E()));
                  return;
               }
            }
         }

         this.L.add(new class05800(class00392, var3, new class06889(var1.z(), var1.U(), var1.E())));
      }
   }

   public void N(class01054 var1) {
      this.N(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[net.minecraft.class_332]");
         this.y((class01054)var1x[0]);
         return (Void)null;
      });
   }
}
