package minecraft;

import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import com.terraformersmc.modmenu.ModMenu;
import com.terraformersmc.modmenu.config.ModMenuConfig;
import com.terraformersmc.modmenu.config.ModMenuConfig.ModCountLocation;
import com.terraformersmc.modmenu.config.ModMenuConfig.TitleMenuButtonStyle;
import java.io.IOException;
import java.util.Objects;
import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04705 extends class05096 {
   private static final Logger N = LogUtils.getLogger();
   private static final class00392 y = class00392.L("narrator.screen.title");
   private static final class00392 L = class00392.L("title.credits");
   private static final String u = "Demo_World";
   @Nullable
   private class03510 i;
   @Nullable
   private class04703 R;
   private boolean M;
   private long B;
   private final class02088 Z;
   private static boolean z;

   private boolean L() {
      try {
         boolean flag;
         try (class04785 class04785 = this.field_22787.NL().i("Demo_World")) {
            flag = class04785.W();
         }

         return flag;
      } catch (IOException ioexception) {
         class06132.N(this.field_22787, "Demo_World");
         N.warn("Failed to read demo world data", ioexception);
         return false;
      }
   }

   private int L(int var1, int var2) {
      boolean flag = this.L();
      this.method_37063(class05362.method_46430(class00392.L("menu.playdemo"), var2x -> {
         if (flag) {
            this.field_22787.S().N("Demo_World", () -> this.field_22787.N(this));
         } else {
            this.field_22787.S().N("Demo_World", class02796.R, class05934.y, class05964::N, this);
         }
      }).N(this.field_22789 / 2 - 100, var1, 200, 20).N());
      int ix;
      this.method_37063(
            class05362.method_46430(
                  class00392.L("menu.resetdemo"),
                  var1x -> {
                     class04777 class04777 = this.field_22787.NL();

                     try (class04785 class04785 = class04777.i("Demo_World")) {
                        if (class04785.W()) {
                           this.field_22787
                              .N(
                                 new class05733(
                                    this::N,
                                    class00392.L("selectWorld.deleteQuestion"),
                                    class00392.N("selectWorld.deleteWarning", class02796.R.N()),
                                    class00392.L("selectWorld.deleteButton"),
                                    class05220.i
                                 )
                              );
                        }
                     } catch (IOException ioexception) {
                        class06132.N(this.field_22787, "Demo_World");
                        N.warn("Failed to access demo world", ioexception);
                     }
                  }
               )
               .N(this.field_22789 / 2 - 100, ix = var1 + var2, 200, 20)
               .N()
         )
         .field_22763 = flag;
      return ix;
   }

   public class04705() {
      this(false);
   }

   public class04705(boolean var1, @Nullable class02088 var2) {
      super(y);
      this.M = var1;
      this.Z = Objects.requireNonNullElseGet(var2, () -> new class02088(false));
   }

   public class04705(boolean var1) {
      this(var1, null);
   }

   private void y(CallbackInfo var1) {
      this.i = null;
   }

   private int y(int var1, int var2) {
      this.method_37063(
         class05362.method_46430(class00392.L("menu.singleplayer"), var1x -> this.field_22787.N(new class05205(this)))
            .N(this.field_22789 / 2 - 100, var1, 200, 20)
            .N()
      );
      class00392 class00392 = this.y();
      boolean flag = class00392 == null;
      class04141 class04141 = class00392 != null ? class04141.N(class00392) : null;
      int ix;
      this.method_37063(class05362.method_46430(class00392.L("menu.multiplayer"), var1x -> {
         Object object = ((class05630)this.field_22787.i_7).v ? new class05304(this) : new class06002(this);
         this.field_22787.N((class05096)object);
      }).N(this.field_22789 / 2 - 100, ix = var1 + var2, 200, 20).N(class04141).N()).field_22763 = flag;
      this.method_37063(
            class05362.method_46430(class00392.L("menu.online"), var1x -> this.field_22787.N(new class05685(this)))
               .N(this.field_22789 / 2 - 100, var1 = ix + var2, 200, 20)
               .N(class04141)
               .N()
         )
         .field_22763 = flag;
      return var1;
   }

   @Nullable
   private class00392 y() {
      if (this.field_22787.yM()) {
         return null;
      } else if (this.field_22787.j()) {
         return class00392.L("title.multiplayer.disabled.banned.name");
      } else {
         BanDetails bandetails = this.field_22787.Nv();
         if (bandetails != null) {
            return bandetails.expires() != null
               ? class00392.L("title.multiplayer.disabled.banned.temporary")
               : class00392.L("title.multiplayer.disabled.banned.permanent");
         } else {
            return class00392.L("title.multiplayer.disabled");
         }
      }
   }

   private String N(String var1) {
      if (ModMenuConfig.MODIFY_TITLE_SCREEN.getValue() && ((ModCountLocation)ModMenuConfig.MOD_COUNT_LOCATION.getValue()).isOnTitleScreen()) {
         String s = ModMenu.getDisplayedModCount();
         String s1 = "modmenu.mods." + s;
         String s2 = class08392.N(s1) ? s1 : "modmenu.mods.n";
         if (ModMenuConfig.EASTER_EGGS.getValue() && class08392.N(s1 + ".secret")) {
            s2 = s1 + ".secret";
         }

         return var1.replace(class08392.N(class08392.N("menu.modded")), class08392.N(s2, s));
      } else {
         return var1;
      }
   }

   private int N(int var1) {
      if (ModMenuConfig.MODIFY_TITLE_SCREEN.getValue() && ModMenuConfig.MODS_BUTTON_STYLE.getValue() == TitleMenuButtonStyle.CLASSIC) {
         return var1 - 51;
      } else {
         return ModMenuConfig.MODS_BUTTON_STYLE.getValue() != TitleMenuButtonStyle.REPLACE_REALMS
               && ModMenuConfig.MODS_BUTTON_STYLE.getValue() != TitleMenuButtonStyle.SHRINK
            ? var1
            : -99999;
      }
   }

   public void N(CallbackInfo var1) {
      if (!z) {
         Iris.onLoadingComplete();
      }

      z = true;
   }

   private boolean N() {
      return this.R != null;
   }

   public static void N(class08627 var0) {
      var0.N(class02088.N);
      var0.N(class02088.L);
      var0.N(class02966.N);
   }

   private int N(int var1, int var2) {
      if (class07529.ND) {
         this.method_37063(
            class05362.method_46430(class00392.y("Create Test World"), var1x -> class05213.y(this.field_22787, () -> this.field_22787.N(this)))
               .N(this.field_22789 / 2 - 100, var1 += var2, 200, 20)
               .N()
         );
      }

      return var1;
   }

   private void N(boolean var1) {
      if (var1) {
         try (class04785 class04785 = this.field_22787.NL().i("Demo_World")) {
            class04785.U();
         } catch (IOException ioexception) {
            class06132.y(this.field_22787, "Demo_World");
            N.warn("Failed to delete demo world", ioexception);
         }
      }

      this.field_22787.N(this);
   }

   private float N(float var1) {
      return 400.0F;
   }

   @Override
   public void method_25426() {
      if (this.i == null) {
         this.i = this.field_22787.NN().N();
      }

      int ix = this.field_22793.N(L);
      int j = this.field_22789 - ix - 2;
      byte b0 = 24;
      int k = this.field_22790 / 4 + 48;
      if (this.field_22787.E()) {
         k = this.L(k, 24);
      } else {
         k = this.y(k, 24);
      }

      k = this.N(k, 24);
      class01858 class01858 = this.method_37063(
         class03240.N(20, var1x -> this.field_22787.N(new class06279(this, (class05630)this.field_22787.i_7, this.field_22787.X())), true)
      );
      int i1 = this.field_22789 / 2 - 124;
      k += 36;
      class01858.y(i1, k);
      this.method_37063(
         class05362.method_46430(class00392.L("menu.options"), var1x -> this.field_22787.N(new class05716(this, (class05630)this.field_22787.i_7)))
            .N(this.field_22789 / 2 - 100, k, 98, 20)
            .N()
      );
      this.method_37063(class05362.method_46430(class00392.L("menu.quit"), var1x -> this.field_22787.NP()).N(this.field_22789 / 2 + 2, k, 98, 20).N());
      this.method_37063(class03240.y(20, var1x -> this.field_22787.N(new class05336(this, (class05630)this.field_22787.i_7)), true))
         .y(this.field_22789 / 2 + 104, k);
      this.method_37063(new class04402(j, this.field_22790 - 10, ix, 10, L, var1x -> this.field_22787.N(new class03577(this)), this.field_22793));
      if (this.R == null) {
         this.R = new class04703();
      }

      if (this.N()) {
         int l = this.field_22790;
         this.R.method_25423(this.field_22789, this.N(l));
      }

      this.N(null);
      this.y(null);
   }

   @Override
   public void method_49589() {
      super.method_49589();
      if (this.R != null) {
         this.R.method_49589();
      }
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25393() {
      if (this.N()) {
         this.R.method_25393();
      }
   }

   @Override
   public void method_25432() {
      if (this.R != null) {
         this.R.method_25432();
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      if (this.B == 0L && this.M) {
         this.B = class07536.L();
      }

      float f = 1.0F;
      if (this.M) {
         float f1 = (float)(class07536.L() - this.B) / this.N(2000.0F);
         if (f1 > 1.0F) {
            this.M = false;
         } else {
            f1 = class04995.N(f1, 0.0F, 1.0F);
            f = class04995.y(f1, 0.5F, 1.0F, 0.0F, 1.0F);
         }

         this.method_71536(f);
      }

      this.method_57728(var1, var4);
      super.method_25394(var1, var2, var3, var4);
      this.Z.N(var1, this.field_22789, this.Z.N() ? 1.0F : f);
      if (this.i != null && !((class05630)this.field_22787.i_7).L().method_41753()) {
         this.i.N(var1, this.field_22789, this.field_22793, f);
      }

      String s = "Minecraft " + class07529.y().comp_4025();
      if (this.field_22787.E()) {
         s = s + " Demo";
      } else {
         s = s + ("release".equalsIgnoreCase(this.field_22787.Nu()) ? "" : "/" + this.field_22787.Nu());
      }

      if (class06202.Z().N()) {
         s = s + class08392.N("menu.modded");
      }

      class01590 class01590 = this.field_22793;
      int k = this.field_22790 - 10;
      int j = class02566.y(f);
      int ix = k;
      byte b0 = 2;
      var1.y(class01590, this.N(s), b0, ix, j);
      if (this.N() && f >= 1.0F) {
         this.R.method_25394(var1, var2, var3, var4);
      }
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public boolean method_73339() {
      return true;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      return super.method_25402(var1, var2) ? true : this.N() && this.R.method_25402(var1, var2);
   }
}
