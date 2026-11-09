package minecraft;

import Nursultan.class11921;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.terraformersmc.modmenu.api.ModMenuApi;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.ModMenuConfig.GameMenuButtonStyle;
import com.terraformersmc.modmenu.event.ModMenuEventHandler;
import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.gui.widget.ModMenuButtonWidget;
import com.terraformersmc.modmenu.gui.widget.UpdateCheckerTexturedButtonWidget;
import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05123 extends class05096 {
   private static final class01894 y = class01894.y("icon/draft_report");
   private static final int L = 2;
   private static final int u = 50;
   private static final int i = 4;
   private static final int R = 204;
   private static final int M = 98;
   private static final class00392 B = class00392.L("menu.returnToGame");
   private static final class00392 Z = class00392.L("gui.advancements");
   private static final class00392 z = class00392.L("gui.stats");
   private static final class00392 U = class00392.L("menu.sendFeedback");
   private static final class00392 E = class00392.L("menu.reportBugs");
   private static final class00392 W = class00392.L("menu.feedback");
   private static final class00392 m = class00392.L("menu.options");
   private static final class00392 P = class00392.L("menu.shareToLan");
   private static final class00392 s = class00392.L("menu.playerReporting");
   private static final class00392 T = class00392.L("menu.game");
   private static final class00392 b = class00392.L("menu.paused");
   private static final class04141 j = class04141.N(class00392.L("menu.custom_options.tooltip"));
   private final boolean v;
   @Nullable
   public class05362 N;
   private int n;
   private class05361 t;

   private void L() {
      class02060 class02060 = new class02060();
      class02060.L().N(4, 4, 4, 0);
      class02080 class02080 = class02060.u(2);
      class02080.N(class05362.method_46430(B, var1x -> {
         this.field_22787.N(null);
         ((class06220)this.field_22787.L_2).Z();
      }).N(204).N(), 2, class02060.y().L(50));
      class00392 class00392x = Z;
      Supplier supplier = () -> new class01417(((class01683)((class04453)this.field_22787.T_4).y_0).W(), this);
      class00392 class00392x = class00392x;
      class05362 class05362xxxx = this.N(this, class00392x, supplier, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
         return ((class05123)var0[0]).N((class00392)var0[1], (Supplier<class05096>)var0[2]);
      });
      this.N(class02080, class05362xxxx, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
         return ((class02080)var0[0]).N((class02102)var0[1]);
      });
      class00392x = z;
      supplier = () -> new class04610(this, ((class04453)this.field_22787.T_4).O());
      class00392x = class00392x;
      class05362 class05362x = this.N(this, class00392x, supplier, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
         return ((class05123)var0[0]).N((class00392)var0[1], (Supplier<class05096>)var0[2]);
      });
      this.N(class02080, class05362x, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
         return ((class02080)var0[0]).N((class02102)var0[1]);
      });
      Optional<? extends class03556<class09037>> optional = this.u();
      if (optional.isEmpty()) {
         if (this.y(this, class02080)) {
            N(this, class02080);
         }
      } else {
         this.N(this.field_22787, (class03556<class09037>)optional.get(), class02080);
      }

      class00392x = m;
      supplier = () -> new class05716(this, (class05630)this.field_22787.i_7);
      class00392x = class00392x;
      class05362 class05362xx = this.N(this, class00392x, supplier, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
         return ((class05123)var0[0]).N((class00392)var0[1], (Supplier<class05096>)var0[2]);
      });
      this.N(class02080, class05362xx, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
         return ((class02080)var0[0]).N((class02102)var0[1]);
      });
      if (this.field_22787.v() && !this.field_22787.Na().P()) {
         class00392x = P;
         supplier = () -> new class05131(this);
         class00392x = class00392x;
         class05362 class05362xxx = this.N(this, class00392x, supplier, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
            return ((class05123)var0[0]).N((class00392)var0[1], (Supplier<class05096>)var0[2]);
         });
         this.N(class02080, class05362xxx, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
            return ((class02080)var0[0]).N((class02102)var0[1]);
         });
      } else {
         class00392x = s;
         supplier = () -> new class05470(this);
         class00392x = class00392x;
         class05362 class05362xxx = this.N(this, class00392x, supplier, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_433, net.minecraft.class_2561, java.util.function.Supplier]");
            return ((class05123)var0[0]).N((class00392)var0[1], (Supplier<class05096>)var0[2]);
         });
         this.N(class02080, class05362xxx, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_7845$class_7939, net.minecraft.class_8021]");
            return ((class02080)var0[0]).N((class02102)var0[1]);
         });
      }

      class02102 class02102 = class02080.N(class05362.method_46430(class05220.y(this.field_22787.q()), var1x -> {
         var1x.field_22763 = false;
         this.field_22787.R().N(this.field_22787, this, () -> this.field_22787.N(class03448.N), true);
      }).N(204).N(), 2);
      this.N(null, class02080);
      this.N = (class05362)class02102;
      class02060.N();
      class02077.N(class02060, 0, 0, this.field_22789, this.field_22790, 0.5F, 0.25F);
      Consumer consumer = this::method_37063;
      this.N(null, class02060);
      class02060.method_48206(consumer);
      this.N(null);
   }

   public class05123(boolean var1) {
      super(var1 ? T : b);
      this.v = var1;
   }

   private Optional<? extends class03556<class09037>> u() {
      class00751 class00751 = ((class01683)((class04453)this.field_22787.T_4).y_0).j().L(class04227.yL);
      Optional optional = class00751.N(class00101.N);
      if (optional.isPresent()) {
         class03543 class03543 = (class03543)optional.get();
         if (class03543.y() > 0) {
            if (class03543.y() == 1) {
               return Optional.of(class03543.N(0));
            }

            return class00751.N(class09016.y);
         }
      }

      class02243 class02243 = ((class01683)((class04453)this.field_22787.T_4).y_0).o();
      return !class02243.N() ? class00751.N(class09016.N) : Optional.empty();
   }

   private boolean y(class05096 var1, class02080 var2) {
      return VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() != 0
         || ViaFabricPlus.getImpl().getTargetVersion().newerThan(ProtocolVersion.v1_13_2);
   }

   public boolean y() {
      class05630 class05630 = (class05630)this.field_22787.i_7;
      return class05630.NX().method_41753().L() && class05630.N(class04911.field_15253) > 0.0F && this.v;
   }

   private class05362 N(class00392 var1) {
      for (class04654 class04654 : this.method_25396()) {
         if (class04654 instanceof class05362 class05362 && class05362.method_25369().equals(var1)) {
            return class05362;
         }
      }

      return null;
   }

   public boolean N() {
      return this.v;
   }

   static void N(class05096 var0, class02080 var1) {
      var1.N(N(var0, U, class07529.y().comp_4031() ? class03597.Z : class03597.B));
      var1.N(N(var0, E, class03597.z)).field_22763 = !class07529.y().comp_4026().N();
   }

   private void N(class06202 var1, class03556<class09037> var2, class02080 var3) {
      var3.N(this.N(W, () -> new class05106(this)));
      var3.N(class05362.method_46430(((class09037)var2.N()).H_().N(), var3x -> ((class01683)((class04453)var1.T_4).y_0).N(var2, this)).N(98).N(j).N());
   }

   private static class05362 N(class05096 var0, class00392 var1, URI var2) {
      return class05362.method_46430(var1, class01321.y(var0, var2)).N(98).N();
   }

   private class05362 N(class00392 var1, Supplier<class05096> var2) {
      return class05362.method_46430(var1, var2x -> this.field_22787.N((class05096)var2.get())).N(98).N();
   }

   private void N(CallbackInfo var1, class02060 var2) {
      if (var2 != null) {
         List<class02102> list = var2.getChildren();
         if (ModMenuConfig.MODIFY_GAME_MENU.getValue()) {
            int ix = -1;
            byte b0 = 24;
            int jx = this.field_22790 / 4 + 8;
            GameMenuButtonStyle gamemenubuttonstyle = (GameMenuButtonStyle)ModMenuConfig.GAME_MENU_BUTTON_STYLE.getValue();
            int k = this.field_22790 / 4 + 72 - 16 + 1;
            short short1 = 204;

            for (int l = 0; l < list.size(); l++) {
               class02102 class02102 = list.get(l);
               if (gamemenubuttonstyle == GameMenuButtonStyle.INSERT && !(class02102 instanceof class06478 class06478 && !class06478.field_22764)) {
                  ModMenuEventHandler.shiftButtons(
                     class02102,
                     ix == -1
                        || ModMenuEventHandler.buttonHasText(class02102, new String[]{"menu.reportBugs", "menu.server_links"})
                        || ModMenuEventHandler.buttonHasTooltip(class02102, m()),
                     24
                  );
                  if (ix == -1) {
                     jx = class02102.method_46427();
                  }
               }

               boolean flag1 = ModMenuEventHandler.buttonHasText(class02102, new String[]{"menu.feedback"});
               boolean flag = ModMenuEventHandler.buttonHasText(class02102, new String[]{"menu.sendFeedback"});
               if (flag1 || flag) {
                  ix = l + 1;
                  k = class02102.method_46427();
                  if (gamemenubuttonstyle == GameMenuButtonStyle.REPLACE) {
                     list.set(
                        l,
                        new ModMenuButtonWidget(
                           class02102.method_46426(),
                           class02102.method_46427(),
                           flag1 ? class02102.method_25368() : 204,
                           class02102.method_25364(),
                           ModMenuApi.createModsButtonText(),
                           this
                        )
                     );
                     list.stream().filter(var0 -> ModMenuEventHandler.buttonHasText(var0, new String[]{"menu.reportBugs"})).forEach(var0 -> {
                        if (var0 instanceof class06478 class06478x) {
                           class06478x.field_22764 = false;
                           class06478x.field_22763 = false;
                        }
                     });
                  } else {
                     ix = l + 1;
                     if (!(class02102 instanceof class06478) || ((class06478)class02102).field_22764) {
                        jx = class02102.method_46427();
                     }
                  }
               }
            }

            if (ix != -1) {
               if (gamemenubuttonstyle == GameMenuButtonStyle.INSERT) {
                  list.add(ix, new ModMenuButtonWidget(this.field_22789 / 2 - 102, jx + 24, 204, 20, ModMenuApi.createModsButtonText(), this));
               } else if (gamemenubuttonstyle == GameMenuButtonStyle.ICON) {
                  list.add(
                     ix,
                     new UpdateCheckerTexturedButtonWidget(
                        this.field_22789 / 2 + 4 + 100 + 2,
                        k,
                        20,
                        20,
                        0,
                        0,
                        20,
                        ModMenuEventHandler.MODS_BUTTON_TEXTURE,
                        32,
                        64,
                        var1x -> class06202.Nq().N(new ModsScreen(this)),
                        ModMenuApi.createModsButtonText()
                     )
                  );
               }
            }
         }
      }
   }

   private void N(CallbackInfo var1, class02080 var2) {
      if (!this.field_22787.q()) {
         class04568 class04568 = this.field_22787.yN();
         if (class04568 != null && class04568.y != null && !class04568.i()) {
            var2.N(class05362.method_46430(class11921.N("reconnect-button"), var2x -> {
               var2x.field_22763 = false;
               ((class03448)this.field_22787.T_3).N(class00392.N("User requested to reconnect through game menu screen"));
               this.field_22787.N((class05096)class06202.Nq().v_3, false);
               class05763.N(null, this.field_22787, class03420.N(class04568.y), class04568, true, null);
            }).N(204).N(), 2);
         }
      }
   }

   private class02102 N(class02080 var1, class02102 var2, Operation var3) {
      if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 0 && var2 instanceof class05362 class05362) {
         if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5) && class05362.method_25369().equals(P)) {
            return null;
         }

         if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_4tob1_4_1)) {
            if (class05362.method_25369().equals(z)) {
               return null;
            }

            if (class05362.method_25369().equals(class05220.T)) {
               this.t = var1x -> class05362.method_25306(null);
               this.n = class05362.method_25368();
               return null;
            }
         }
      }

      return (class02102)var3.call(new Object[]{var1, var2});
   }

   private void N(class00392 var1, Consumer var2) {
      class05362 class05362 = this.N(var1);
      if (class05362 != null) {
         var2.accept(class05362);
      }
   }

   private class05362 N(class05123 var1, class00392 var2, Supplier var3, Operation var4) {
      if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 0) {
         if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19) && var2.equals(s)) {
            return class05362.method_46430(P, var1x -> new class05131(var1)).N(M).N();
         }

         if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_4tob1_4_1) && var2.equals(Z)) {
            return class05362.method_46430(class05220.T, this.t).N(this.n).N();
         }
      } else if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 1
         && ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19)
         && var2.equals(s)) {
         return this.N(class05470.N, () -> new class05470(var1));
      }

      return (class05362)var4.call(new Object[]{var1, var2, var3});
   }

   private void N(CallbackInfo var1) {
      if (VisualSettings.INSTANCE.changeGameMenuScreenLayout.getIndex() == 0) {
         Consumer consumer = var0 -> var0.method_46419(var0.method_46427() + 20);
         if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            this.N(m, consumer);
            this.N(class05220.T, consumer);
            this.N(P, var1x -> {
               consumer.accept(var1x);
               var1x.field_22763 = false;
            });
         }

         class05362 class05362 = this.N(B);
         if (class05362 != null) {
            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
               this.N(m, var1x -> {
                  var1x.method_46421(class05362.method_46426());
                  var1x.method_25358(class05362.method_25368());
               });
            }

            if (ViaFabricPlus.getImpl().getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_4tob1_4_1)) {
               this.N(m, consumer);
               this.N(class05220.T, var1x -> var1x.method_46419(class05362.method_46427() + 20 + 3));
            }
         }
      }
   }

   @Override
   public void method_25426() {
      if (this.v) {
         this.L();
      }

      int ix = this.field_22793.N(this.field_22785);
      this.method_37063(new class02071(this.field_22789 / 2 - ix / 2, this.v ? 40 : 10, ix, 9, this.field_22785, this.field_22793));
   }

   @Override
   public void method_25393() {
      if (this.y()) {
         class00108.N();
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      if (this.v) {
         super.method_25420(var1, var2, var3, var4);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (this.y()) {
         class00108.N(var1, this.field_22793);
      }

      if (this.v && this.field_22787.R().L() && this.N != null) {
         var1.N(class08394.Na, y, this.N.method_46426() + this.N.method_25368() - 17, this.N.method_46427() + 3, 15, 15);
      }
   }
}
