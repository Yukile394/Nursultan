package minecraft;

import Nursultan.class09565;
import Nursultan.class11359;
import Nursultan.class11361;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.event.events.ChatEvent;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.net.URI;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterBackground;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.AfterInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents.BeforeInit;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.client.screen.ButtonList;
import net.fabricmc.fabric.impl.client.screen.ScreenEventFactory;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;
import net.fabricmc.fabric.mixin.screen.ScreenAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public abstract class class05096 extends class04664 implements class01294, ScreenExtensions, ScreenAccessor, ru.fiw.proxyserver.mixin.ScreenAccessor {
   private static final Logger field_22782 = LogUtils.getLogger();
   private static final class00392 field_33814 = class00392.L("narrator.screen.usage");
   public static final class01894 field_49511 = class01894.y("textures/gui/menu_background.png");
   public static final class01894 field_49895 = class01894.y("textures/gui/header_separator.png");
   public static final class01894 field_49896 = class01894.y("textures/gui/footer_separator.png");
   private static final class01894 field_49894 = class01894.y("textures/gui/inworld_menu_background.png");
   public static final class01894 field_49897 = class01894.y("textures/gui/inworld_header_separator.png");
   public static final class01894 field_49898 = class01894.y("textures/gui/inworld_footer_separator.png");
   protected static final float field_60460 = 2000.0F;
   public final class00392 field_22785;
   private final List<class04654> field_22786 = Lists.newArrayList();
   private final List<class03434> field_33815 = Lists.newArrayList();
   public final class06202 field_22787;
   private boolean field_42156;
   public int field_22789;
   public int field_22790;
   private final List<class01294> field_33816 = Lists.newArrayList();
   public final class01590 field_22793;
   private static final long field_33817 = TimeUnit.SECONDS.toMillis(2L);
   private static final long field_33818 = field_33817;
   private static final long field_33819 = 750L;
   private static final long field_33820 = 200L;
   private static final long field_33821 = 200L;
   private final class03425 field_33822 = new class03425();
   private long field_33823 = Long.MIN_VALUE;
   private long field_33824 = Long.MAX_VALUE;
   @Nullable
   protected class06366<class01299> field_52252;
   @Nullable
   private class03434 field_33813;
   protected final Executor field_44944;
   private ButtonList fabricButtons;
   private Event removeEvent;
   private Event beforeTickEvent;
   private Event afterTickEvent;
   private Event beforeRenderEvent;
   private Event afterBackgroundEvent;
   private Event afterRenderEvent;
   private Event allowKeyPressEvent;
   private Event beforeKeyPressEvent;
   private Event afterKeyPressEvent;
   private Event allowKeyReleaseEvent;
   private Event beforeKeyReleaseEvent;
   private Event afterKeyReleaseEvent;
   private Event allowMouseClickEvent;
   private Event beforeMouseClickEvent;
   private Event afterMouseClickEvent;
   private Event allowMouseReleaseEvent;
   private Event beforeMouseReleaseEvent;
   private Event afterMouseReleaseEvent;
   private Event allowMouseDragEvent;
   private Event beforeMouseDragEvent;
   private Event afterMouseDragEvent;
   private Event allowMouseScrollEvent;
   private Event beforeMouseScrollEvent;
   private Event afterMouseScrollEvent;

   public class00392 method_25440() {
      return this.field_22785;
   }

   public class05096(class00392 var1) {
      this(class06202.Nq(), (class01590)class06202.Nq().i_3, var1);
   }

   protected class05096(class06202 var1, class01590 var2, class00392 var3) {
      super();
      this.field_22787 = var1;
      this.field_22793 = var2;
      this.field_22785 = var3;
      this.field_44944 = var2x -> var1.execute(() -> {
         if ((class05096)var1.v_3 == this) {
            var2x.run();
         }
      });
   }

   @Nullable
   public class05075 method_50024() {
      return null;
   }

   protected static void method_71999(class00647 var0, class06202 var1, @Nullable class05096 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      handler$zzp000$baritone$handleCustomClickEvent((class00647)var0, var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class04453 class04453 = Objects.requireNonNull((class04453)var1.T_4, "Player not available");
         switch (var0) {
            case class00625 class00625:
               String s1;
               try {
                  s1 = class00625.y();
               } catch (Throwable throwable) {
                  throw new MatchException(throwable.toString(), throwable);
               }

               String s = s1;
               method_71844(class04453, s, var2);
               break;
            case class00626 class00626:
               ((class01683)class04453.y_0).N(class00626.y(), var2);
               break;
            case class00669 class00669:
               ((class01683)class04453.y_0).N(new class09036(class00669.y(), class00669.L()));
               if ((class05096)var1.v_3 != var2) {
                  var1.N(var2);
               }
               break;
            default:
               method_71847((class00647)var0, var1, var2);
         }
      }
   }

   public void method_25426() {
   }

   public void method_37064(boolean var1) {
      if (this.method_37073()) {
         this.method_37065(var1);
      }
   }

   private void method_37058(long var1) {
      this.method_72802(class07536.L() + var1);
   }

   protected void method_41843() {
      this.method_37067();
      this.method_48267();
      this.method_25426();
      this.method_56131();
   }

   public final void method_25423(int var1, int var2) {
      this.m_handler$bbg000$fabric_screen_api_v1$beforeInitScreen_47(var1, var2, null);
      this.field_22789 = var1;
      this.field_22790 = var2;
      if (!this.field_42156) {
         this.method_25426();
         this.method_56131();
      } else {
         this.method_48640();
      }

      this.field_42156 = true;
      this.method_37064(false);
      if (this.field_22787.Nc().y()) {
         this.method_72802(Long.MAX_VALUE);
      } else {
         this.method_37058(field_33817);
      }

      this.m_handler$bbg000$fabric_screen_api_v1$afterInitScreen_51(var1, var2, null);
   }

   protected void method_71536(float var1) {
      for (class04654 class04654 : this.method_25396()) {
         if (class04654 instanceof class06478) {
            ((class06478)class04654).method_25350(var1);
         }
      }
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.field_22786;
   }

   public void method_49589() {
   }

   protected static boolean method_71843(class06202 var0, @Nullable class05096 var1, URI var2) {
      if (!((class05630)var0.i_7).h().method_41753()) {
         return false;
      } else {
         if (((class05630)var0.i_7).r().method_41753()) {
            var0.N(new class01321(var3 -> {
               if (var3) {
                  class07536.m().N(var2);
               }

               var0.N(var1);
            }, var2.toString(), false));
         } else {
            class07536.m().N(var2);
         }

         return true;
      }
   }

   private class02116 method_48264(class03249 var1) {
      return new class02116(var1);
   }

   protected void method_48263(class02106 var1) {
      this.method_48267();
      var1.N(true);
   }

   protected void method_56131() {
      if (this.field_22787.Nc().y()) {
         class03251 class03251 = new class03251(true);
         class02106 class02106 = super.method_48205(class03251);
         if (class02106 != null) {
            this.method_48263(class02106);
         }
      }
   }

   protected <T extends class04654 & class03434> T method_25429(T var1) {
      this.field_22786.add(var1);
      this.field_33815.add((class03434)var1);
      return (T)var1;
   }

   public final void method_47413(class01054 var1, int var2, int var3, float var4) {
      var1.L();
      this.method_25420(var1, var2, var3, var4);
      this.m_handler$bbg000$fabric_screen_api_v1$renderWithTooltip_49(var1, var2, var3, var4, null);
      var1.L();
      this.method_25394(var1, var2, var3, var4);
      var1.M();
   }

   protected void method_48265(class04654 var1) {
      class02106 class02106 = class02106.N(this, var1.method_48205(new class09565()));
      if (class02106 != null) {
         this.method_48263(class02106);
      }
   }

   public boolean method_25422() {
      return true;
   }

   public <T extends class04654 & class01294 & class03434> T method_37063(T var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.m_handler$ede000$viafabricplus_visuals$removeRecipeBook_46(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (T)callbackinforeturnable.getReturnValue();
      } else {
         this.field_33816.add((class01294)var1);
         return this.method_25429((T)var1);
      }
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.i() && this.method_25422()) {
         this.method_25419();
         return true;
      } else if (super.method_25404(var1)) {
         return true;
      } else {
         Object object = switch (var1.v()) {
            case 258 -> this.method_48266(!var1.W());
            default -> null;
            case 262 -> this.method_48264(class03249.field_41829);
            case 263 -> this.method_48264(class03249.field_41828);
            case 264 -> this.method_48264(class03249.field_41827);
            case 265 -> this.method_48264(class03249.field_41826);
         };
         if (object != null) {
            class02106 class02106 = super.method_48205((class02089)object);
            if (class02106 == null && object instanceof class03251) {
               this.method_48267();
               class02106 = super.method_48205((class02089)object);
            }

            if (class02106 != null) {
               this.method_48263(class02106);
            }
         }

         return false;
      }
   }

   protected void method_25415(String var1, boolean var2) {
   }

   protected static void method_71844(class04453 var0, String var1, @Nullable class05096 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      handler$ebd000$viafabricplus$changeCommandHandling(var0, var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         ((class01683)var0.y_0).N(class07686.N(var1), var2);
      }
   }

   public static void method_71847(class00647 var0, class06202 var1, @Nullable class05096 var2) {
      if (switch (var0) {
         case class00652 class00652 -> {
            URI uri1;
            try {
               uri1 = class00652.y();
            } catch (Throwable throwable2) {
               throw new MatchException(throwable2.toString(), throwable2);
            }

            URI uri = uri1;
            method_71843(var1, var2, uri);
            yield false;
         }
         case class00623 class00623 -> {
            class07536.m().N(class00623.y());
            yield true;
         }
         case class00640 class00640 -> {
            String s3;
            try {
               s3 = class00640.y();
            } catch (Throwable throwable1) {
               throw new MatchException(throwable1.toString(), throwable1);
            }

            String s1 = s3;
            if (var2 != null) {
               var2.method_25415(s1, true);
            }

            yield true;
         }
         case class00627 class00627x -> {
            class00627 class00627 = class00627x;

            try {
               s2 = class00627.y();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            String s = s2;
            ((class06197)var1.L_3).N(s);
            yield true;
         }
         default -> {
            field_22782.error("Don't know how to handle {}", var0);
            yield true;
         }
      } && (class05096)var1.v_3 != var2) {
         var1.N(var2);
      }
   }

   public void method_48640() {
      this.method_41843();
   }

   private class03251 method_48266(boolean var1) {
      return new class03251(var1);
   }

   public static List<class00392> method_25408(class06202 var0, class06584 var1) {
      return redirect$cic000$nursultan$redirectGetTooltipFromItem(
         var1, class06591.N((class03448)var0.T_3), (class04453)var0.T_4, ((class05630)var0.i_7).W ? class06524.y : class06524.N
      );
   }

   public void method_25393() {
   }

   public boolean method_73150() {
      return false;
   }

   public void method_37066(class04654 var1) {
      if (var1 instanceof class01294) {
         this.field_33816.remove((class01294)var1);
      }

      if (var1 instanceof class03434) {
         this.field_33815.remove((class03434)var1);
      }

      if (this.method_25399() == var1) {
         this.method_48267();
      }

      this.field_22786.remove(var1);
   }

   protected void method_37067() {
      this.field_33816.clear();
      this.field_22786.clear();
      this.field_33815.clear();
   }

   public void method_25432() {
   }

   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      if (this.method_73150()) {
         this.method_52752(var1);
      } else {
         if ((class03448)this.field_22787.T_3 == null) {
            this.method_57728(var1, var4);
         }

         this.method_57734(var1);
         this.method_57735(var1);
      }

      ((class01056)this.field_22787.i_6).y();
   }

   public void method_48267() {
      class02106 class02106 = this.B();
      if (class02106 != null) {
         class02106.N(false);
      }
   }

   protected <T extends class01294> T method_37060(T var1) {
      this.field_33816.add(var1);
      return (T)var1;
   }

   public void method_52752(class01054 var1) {
      var1.N(0, 0, this.field_22789, this.field_22790, -1072689136, -804253680);
   }

   protected void method_57728(class01054 var1, float var2) {
      ((class03386)this.field_22787.i_5).n().N(var1, this.field_22789, this.field_22790, this.method_72798());
   }

   protected void method_57734(class01054 var1) {
      if (((class05630)this.field_22787.i_7).l() >= 1.0F) {
         var1.u();
      }
   }

   private void method_72802(long var1) {
      this.field_33823 = var1;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      Iterator<class01294> iterator = this.field_33816.iterator();

      while (iterator.hasNext()) {
         iterator.next().method_25394(var1, var2, var3, var4);
      }
   }

   public void method_25419() {
      this.handler$cic000$nursultan$onClose(null);
      this.field_22787.N(null);
   }

   public boolean method_25421() {
      return true;
   }

   public void method_37070() {
      this.method_37059(200L, true);
   }

   protected void method_57735(class01054 var1) {
      this.method_57736(var1, 0, 0, this.field_22789, this.field_22790);
   }

   public void method_37068() {
      this.method_37059(750L, false);
   }

   protected boolean method_25414(String var1, int var2, int var3) {
      int i = var1.indexOf(58);
      int j = var1.indexOf(47);
      if (var2 == 58) {
         return (j == -1 || var3 <= j) && i == -1;
      } else {
         return var2 == 47 ? var3 > i : var2 == 95 || var2 == 45 || var2 >= 97 && var2 <= 122 || var2 >= 48 && var2 <= 57 || var2 == 46;
      }
   }

   private void method_37059(long var1, boolean var3) {
      this.field_33824 = class07536.L() + var1;
      if (var3) {
         this.field_33823 = Long.MIN_VALUE;
      }
   }

   public void method_37069() {
      this.method_37059(200L, true);
   }

   protected void method_37062(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25435());
      if (this.method_48262()) {
         var1.N(class03457.field_33791, field_33814);
      }

      this.method_37056(var1);
   }

   public static void method_57737(class01054 var0, class01894 var1, int var2, int var3, float var4, float var5, int var6, int var7) {
      byte b0 = 32;
      var0.N(class08394.Na, var1, var2, var3, var4, var5, var6, var7, 32, 32);
   }

   public void method_25410(int var1, int var2) {
      this.m_handler$bbg000$fabric_screen_api_v1$beforeResizeScreen_50(var1, var2, null);
      this.field_22789 = var1;
      this.field_22790 = var2;
      this.method_48640();
      this.m_handler$bbg000$fabric_screen_api_v1$afterResizeScreen_48(var1, var2, null);
   }

   public void method_29638(List<Path> var1) {
   }

   @Nullable
   public static class05117 method_37061(List<? extends class03434> var0, @Nullable class03434 var1) {
      class05117 class05117x = null;
      class05117 class05117x = null;
      int i = 0;

      for (int j = var0.size(); i < j; i++) {
         class03434 class03434 = (class03434)var0.get(i);
         class03432 class03432 = class03434.method_37018();
         if (class03432.N()) {
            if (class03434 != var1) {
               return new class05117(class03434, i, class03432);
            }

            class05117x = new class05117(class03434, i, class03432);
         } else if (class03432.compareTo(class05117x != null ? class05117x.L() : class03432.field_33784) > 0) {
            class05117x = new class05117(class03434, i, class03432);
         }
      }

      return class05117x != null ? class05117x : class05117x;
   }

   protected void method_57736(class01054 var1, int var2, int var3, int var4, int var5) {
      method_57737(var1, (class03448)this.field_22787.T_3 == null ? field_49511 : field_49894, var2, var3, 0.0F, 0.0F, var4, var5);
   }

   public class01590 method_64506() {
      return this.field_22793;
   }

   public boolean method_64507() {
      return false;
   }

   public boolean method_73339() {
      return this.method_25422();
   }

   public void method_61040(boolean var1) {
      if (var1) {
         this.method_37059(field_33818, false);
      }

      if (this.field_52252 != null) {
         this.field_52252.N(((class05630)this.field_22787.i_7).NV().method_41753());
      }
   }

   @Override
   public class03255 method_48202() {
      return new class03255(0, 0, this.field_22789, this.field_22790);
   }

   private void method_37065(boolean var1) {
      this.field_33822.N(this::method_37062);
      String s = this.field_33822.N(!var1);
      if (!s.isEmpty()) {
         this.field_22787.NT().N(s);
      }
   }

   protected boolean method_72798() {
      return true;
   }

   protected boolean method_48262() {
      return true;
   }

   private boolean method_37073() {
      return class07529.G || this.field_22787.NT().N();
   }

   protected class00392 method_53870() {
      return class00392.L("narration.component_list.usage");
   }

   @Override
   public boolean method_25405(double var1, double var3) {
      return true;
   }

   public boolean method_73217() {
      return this.method_25421();
   }

   public void method_65027(class07080 var1) {
      var1.N("Affected screen", 1).N("Screen name", () -> this.getClass().getCanonicalName());
   }

   public void method_37071() {
      if (this.method_37073()) {
         long i = class07536.L();
         if (i > this.field_33824 && i > this.field_33823) {
            this.method_37065(true);
            this.field_33824 = Long.MAX_VALUE;
         }
      }
   }

   protected void method_37056(class03428 var1) {
      List list = this.field_33815
         .stream()
         .flatMap(var0 -> var0.e_().stream())
         .filter(class03434::method_37303)
         .sorted(Comparator.comparingInt(class03256::method_48590))
         .toList();
      class05117 class05117 = method_37061(list, this.field_33813);
      if (class05117 != null) {
         if (class05117.L().N()) {
            this.field_33813 = class05117.N();
         }

         if (list.size() > 1) {
            var1.N(class03457.field_33789, class00392.N("narrator.position.screen", class05117.y() + 1, list.size()));
            if (class05117.L() == class03432.field_33786) {
               var1.N(class03457.field_33791, this.method_53870());
            }
         }

         class05117.N().method_37020(var1.N());
      }
   }

   public List fabric_getButtons() {
      if (this.fabricButtons == null) {
         this.fabricButtons = new ButtonList(this.field_33816, this.field_33815, this.field_22786);
      }

      return this.fabricButtons;
   }

   private void m_handler$ede000$viafabricplus_visuals$removeRecipeBook_46(class04654 var1, CallbackInfoReturnable var2) {
      if (var1 instanceof class04897 && ((class04897)var1).field_45356 == class05306.N) {
         boolean flag = this instanceof class06274;
         if (VisualSettings.INSTANCE.hideFurnaceRecipeBook.isEnabled() && flag) {
            var2.setReturnValue(var1);
         } else if (VisualSettings.INSTANCE.hideCraftingRecipeBook.isEnabled() && !flag) {
            var2.setReturnValue(var1);
         }
      }
   }

   private static List redirect$cic000$nursultan$redirectGetTooltipFromItem(class06584 var0, class06591 var1, class08036 var2, class06497 var3) {
      class06202 class06202 = class06202.Nq();
      class11361 class11361 = class11361.N(
         var0.N(class06591.N((class03448)class06202.T_3), (class04453)class06202.T_4, ((class05630)class06202.i_7).W ? class06497.y : class06497.N), var0
      );
      class11938.L().L(class11361);
      return class11361.N();
   }

   private void m_handler$bbg000$fabric_screen_api_v1$beforeInitScreen_47(int var1, int var2, CallbackInfo var3) {
      this.beforeInit(var1, var2);
   }

   private void m_handler$bbg000$fabric_screen_api_v1$afterResizeScreen_48(int var1, int var2, CallbackInfo var3) {
      this.afterInit(var1, var2);
   }

   public final void m_handler$bbg000$fabric_screen_api_v1$renderWithTooltip_49(class01054 var1, int var2, int var3, float var4, CallbackInfo var5) {
      ((AfterBackground)ScreenEvents.afterBackground(this).invoker()).afterBackground(this, var1, var2, var3, var4);
   }

   private void m_handler$bbg000$fabric_screen_api_v1$beforeResizeScreen_50(int var1, int var2, CallbackInfo var3) {
      this.beforeInit(var1, var2);
   }

   private void m_handler$bbg000$fabric_screen_api_v1$afterInitScreen_51(int var1, int var2, CallbackInfo var3) {
      this.afterInit(var1, var2);
   }

   public class00392 method_25435() {
      return this.method_25440();
   }

   private static void handler$zzp000$baritone$handleCustomClickEvent(class00647 var0, class06202 var1, class05096 var2, CallbackInfo var3) {
      if (var0 != null) {
         if (var0 instanceof class00625 class00625x) {
            class00625 class00625x = class00625x;

            try {
               s1 = class00625x.y();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            String s = s1;
            if (s.startsWith(IBaritoneChatControl.FORCE_COMMAND_PREFIX)) {
               IBaritone ibaritone = BaritoneAPI.getProvider().getPrimaryBaritone();
               if (ibaritone != null) {
                  ibaritone.getGameEventHandler().onSendChatMessage(new ChatEvent(s));
               }

               var3.cancel();
            }
         }
      }
   }

   private static void handler$ebd000$viafabricplus$changeCommandHandling(class04453 var0, String var1, class05096 var2, CallbackInfo var3) {
      if (!ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4)) {
         if (!var1.startsWith("/")) {
            var3.cancel();
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19)) {
               ((class01683)var0.y_0).L(var1);
            }
         }
      }
   }

   private Event ensureEventsAreInitialized(Event var1) {
      if (var1 == null) {
         throw new IllegalStateException(
            String.format(
               "[fabric-screen-api-v1] The current screen (%s) has not been correctly initialised, please send this crash log to the mod author. This is usually caused by calling setScreen on the wrong thread.",
               this.getClass().getName()
            )
         );
      } else {
         return var1;
      }
   }

   public Event fabric_getBeforeTickEvent() {
      return this.ensureEventsAreInitialized(this.beforeTickEvent);
   }

   public Event fabric_getAfterRenderEvent() {
      return this.ensureEventsAreInitialized(this.afterRenderEvent);
   }

   public Event fabric_getRemoveEvent() {
      return this.ensureEventsAreInitialized(this.removeEvent);
   }

   public Event fabric_getAfterTickEvent() {
      return this.ensureEventsAreInitialized(this.afterTickEvent);
   }

   private void afterInit(int var1, int var2) {
      ((AfterInit)ScreenEvents.AFTER_INIT.invoker()).afterInit(class06202.Nq(), this, var1, var2);
   }

   private void beforeInit(int var1, int var2) {
      this.fabricButtons = null;
      this.removeEvent = ScreenEventFactory.createRemoveEvent();
      this.beforeRenderEvent = ScreenEventFactory.createBeforeRenderEvent();
      this.afterBackgroundEvent = ScreenEventFactory.createAfterBackgroundEvent();
      this.afterRenderEvent = ScreenEventFactory.createAfterRenderEvent();
      this.beforeTickEvent = ScreenEventFactory.createBeforeTickEvent();
      this.afterTickEvent = ScreenEventFactory.createAfterTickEvent();
      this.allowKeyPressEvent = ScreenEventFactory.createAllowKeyPressEvent();
      this.beforeKeyPressEvent = ScreenEventFactory.createBeforeKeyPressEvent();
      this.afterKeyPressEvent = ScreenEventFactory.createAfterKeyPressEvent();
      this.allowKeyReleaseEvent = ScreenEventFactory.createAllowKeyReleaseEvent();
      this.beforeKeyReleaseEvent = ScreenEventFactory.createBeforeKeyReleaseEvent();
      this.afterKeyReleaseEvent = ScreenEventFactory.createAfterKeyReleaseEvent();
      this.allowMouseClickEvent = ScreenEventFactory.createAllowMouseClickEvent();
      this.beforeMouseClickEvent = ScreenEventFactory.createBeforeMouseClickEvent();
      this.afterMouseClickEvent = ScreenEventFactory.createAfterMouseClickEvent();
      this.allowMouseReleaseEvent = ScreenEventFactory.createAllowMouseReleaseEvent();
      this.beforeMouseReleaseEvent = ScreenEventFactory.createBeforeMouseReleaseEvent();
      this.afterMouseReleaseEvent = ScreenEventFactory.createAfterMouseReleaseEvent();
      this.allowMouseDragEvent = ScreenEventFactory.createAllowMouseDragEvent();
      this.beforeMouseDragEvent = ScreenEventFactory.createBeforeMouseDragEvent();
      this.afterMouseDragEvent = ScreenEventFactory.createAfterMouseDragEvent();
      this.allowMouseScrollEvent = ScreenEventFactory.createAllowMouseScrollEvent();
      this.beforeMouseScrollEvent = ScreenEventFactory.createBeforeMouseScrollEvent();
      this.afterMouseScrollEvent = ScreenEventFactory.createAfterMouseScrollEvent();
      ((BeforeInit)ScreenEvents.BEFORE_INIT.invoker()).beforeInit(class06202.Nq(), this, var1, var2);
   }

   private void handler$cic000$nursultan$onClose(CallbackInfo var1) {
      class11359 class11359 = class11359.N();
      class11938.L().L(class11359);
   }

   public Event fabric_getAfterBackgroundEvent() {
      return this.ensureEventsAreInitialized(this.afterBackgroundEvent);
   }

   public Event fabric_getBeforeMouseDragEvent() {
      return this.ensureEventsAreInitialized(this.beforeMouseDragEvent);
   }

   public Event fabric_getAllowKeyReleaseEvent() {
      return this.ensureEventsAreInitialized(this.allowKeyReleaseEvent);
   }

   public Event fabric_getAllowMouseReleaseEvent() {
      return this.ensureEventsAreInitialized(this.allowMouseReleaseEvent);
   }

   public Event fabric_getAfterMouseScrollEvent() {
      return this.ensureEventsAreInitialized(this.afterMouseScrollEvent);
   }

   public Event fabric_getAfterMouseClickEvent() {
      return this.ensureEventsAreInitialized(this.afterMouseClickEvent);
   }

   public Event fabric_getAllowKeyPressEvent() {
      return this.ensureEventsAreInitialized(this.allowKeyPressEvent);
   }

   public Event fabric_getBeforeKeyPressEvent() {
      return this.ensureEventsAreInitialized(this.beforeKeyPressEvent);
   }

   public Event fabric_getBeforeKeyReleaseEvent() {
      return this.ensureEventsAreInitialized(this.beforeKeyReleaseEvent);
   }

   public Event fabric_getAfterKeyReleaseEvent() {
      return this.ensureEventsAreInitialized(this.afterKeyReleaseEvent);
   }

   public Event fabric_getAfterMouseReleaseEvent() {
      return this.ensureEventsAreInitialized(this.afterMouseReleaseEvent);
   }

   public Event fabric_getAfterMouseDragEvent() {
      return this.ensureEventsAreInitialized(this.afterMouseDragEvent);
   }

   public Event fabric_getAllowMouseClickEvent() {
      return this.ensureEventsAreInitialized(this.allowMouseClickEvent);
   }

   public Event fabric_getAfterKeyPressEvent() {
      return this.ensureEventsAreInitialized(this.afterKeyPressEvent);
   }

   public Event fabric_getBeforeMouseClickEvent() {
      return this.ensureEventsAreInitialized(this.beforeMouseClickEvent);
   }

   public Event fabric_getAllowMouseScrollEvent() {
      return this.ensureEventsAreInitialized(this.allowMouseScrollEvent);
   }

   public Event fabric_getBeforeMouseScrollEvent() {
      return this.ensureEventsAreInitialized(this.beforeMouseScrollEvent);
   }

   public Event fabric_getBeforeRenderEvent() {
      return this.ensureEventsAreInitialized(this.beforeRenderEvent);
   }

   public Event fabric_getBeforeMouseReleaseEvent() {
      return this.ensureEventsAreInitialized(this.beforeMouseReleaseEvent);
   }

   public Event fabric_getAllowMouseDragEvent() {
      return this.ensureEventsAreInitialized(this.allowMouseDragEvent);
   }
}
