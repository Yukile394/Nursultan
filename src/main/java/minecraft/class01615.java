package minecraft;

import Nursultan.class09485;
import Nursultan.class10104;
import Nursultan.class10406;
import Nursultan.class10407;
import Nursultan.class10410;
import com.google.common.collect.Lists;
import com.google.common.primitives.Floats;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents.PickItemFromBlock;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents.PickItemFromEntity;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.UntrackedNetworkHandler;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01615 extends class04156 implements class03077, class04259, class04813, class08051, NetworkHandlerExtensions {
   public static final Logger field_14121 = LogUtils.getLogger();
   private static final int field_37281 = -1;
   private static final int field_39989 = 4096;
   private static final int field_49027 = 80;
   private static final int field_63175 = 5;
   public static final int field_64603 = 60;
   private static final class00392 field_39990 = class00392.L("multiplayer.disconnect.chat_validation_failed");
   private static final class00392 field_50089 = class00392.L("chat.disabled.invalid_command_signature").N(class06541.field_1061);
   private static final int field_49778 = 1000;
   public class04770 field_14140;
   public final class04178 field_45026;
   private int field_14118;
   private int field_37282 = -1;
   private final class08722 field_54291 = new class08722(20, 200);
   private final class08722 field_54292 = new class08722(20, 1480);
   private double field_14130;
   private double field_14146;
   private double field_14128;
   private double field_14145;
   private double field_14126;
   private double field_14144;
   @Nullable
   private class07049 field_14147;
   private double field_14143;
   private double field_14124;
   private double field_14142;
   private double field_14122;
   private double field_14141;
   private double field_14120;
   @Nullable
   private class06889 field_14119;
   private int field_14123;
   private int field_14139;
   private boolean field_14131;
   private int field_14138;
   private boolean field_14129;
   private int field_14137;
   private int field_14117;
   private int field_14135;
   private boolean field_52364;
   @Nullable
   private class02027 field_40720;
   private class03073 field_39805;
   private final class03060 field_39825 = new class03060(20);
   private int field_58079;
   private final class03397 field_39987 = class03397.N();
   private final class03052 field_39826;
   private boolean field_45025;
   private boolean field_64601;
   private int field_64602;
   private ServerPlayNetworkAddon addon;

   @Override
   public void method_12697(class07839 var1) {
      this.field_45013.method_10743(new class07832(var1.N()));
   }

   public class01615(class02796 var1, class00642 var2, class04770 var3, class03713 var4) {
      super(var1, var2, var4);
      this.method_76689();
      this.field_45026 = new class04178(var2.method_10756());
      this.field_14140 = var3;
      var3.field_13987 = this;
      var3.method_31273().N();
      this.field_39805 = class03073.N(var3.method_5667(), var1::r);
      this.field_39826 = new class03052(var1);
      this.m_handler$zjl002$fabric_networking_api_v1$initAddon_19(null);
   }

   @Override
   public boolean method_48106() {
      return this.field_45013.method_10758() && !this.field_45025;
   }

   @Override
   public void method_65306(class08816 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.method_76688();
   }

   private boolean method_29780(class07049 var1) {
      return var1.method_73183().N(var1.method_5829().M(0.0625).y(0.0, -0.55, 0.0)).allMatch(class01339::P);
   }

   @Override
   public void method_12047(class07337 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      class06484 class06484 = this.field_45012.yM().N(var1.N());
      if (class06484 != null) {
         this.field_14140.method_14253().u(class06484.y().N());
      }
   }

   @Override
   public void method_12067(class07352 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_63561(var1.N());
      if (this.method_76685()) {
         this.field_14140.method_14234();
         this.field_14140.method_5660(var1.N().R());
      }
   }

   private static boolean method_14371(double var0, double var2, double var4, float var6, float var7) {
      return Double.isNaN(var0) || Double.isNaN(var2) || Double.isNaN(var4) || !Floats.isFinite(var7) || !Floats.isFinite(var6);
   }

   private void method_76689() {
      this.field_64601 = false;
      this.field_64602 = 60;
   }

   @Override
   public void method_12059(class00526 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      StringReader stringreader = new StringReader(var1.y());
      if (stringreader.canRead() && stringreader.peek() == '/') {
         stringreader.skip();
      }

      ParseResults<class07701> parseresults = this.field_45012.yL().N().parse(stringreader, this.field_14140.method_64396());
      this.field_45012.yL().N().getCompletionSuggestions(parseresults).thenAccept(var2x -> {
         Suggestions suggestions = var2x.getList().size() <= 1000 ? var2x : new Suggestions(var2x.getRange(), var2x.getList().subList(0, 1000));
         this.method_14364(new class07232(var1.N(), suggestions));
      });
   }

   private boolean method_60947() {
      if (this.field_14119 != null) {
         if (this.field_14118 - this.field_14139 > 20) {
            this.field_14139 = this.field_14118;
            this.method_14363(this.field_14119.M, this.field_14119.B, this.field_14119.Z, this.field_14140.method_36454(), this.field_14140.method_36455());
         }

         return true;
      } else {
         this.field_14139 = this.field_14118;
         return false;
      }
   }

   @Override
   public void method_12058(class07339 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (var1.y() == class07349.field_13024) {
         class01894 class01894 = Objects.requireNonNull(var1.L());
         class03711 class03711 = this.field_45012.Nh().N(class01894);
         if (class03711 != null) {
            this.field_14140.method_14236().N(class03711);
         }
      }
   }

   private boolean method_73086() {
      this.method_14372();
      this.field_14140.field_6014 = this.field_14140.method_23317();
      this.field_14140.field_6036 = this.field_14140.method_23318();
      this.field_14140.field_5969 = this.field_14140.method_23321();
      this.field_14140.method_14226();
      this.field_14140.method_5641(this.field_14130, this.field_14146, this.field_14128, this.field_14140.method_36454(), this.field_14140.method_36455());
      this.field_14118++;
      this.field_14135 = this.field_14117;
      if (this.field_14131 && !this.field_14140.method_6113() && !this.field_14140.method_5765() && !this.field_14140.method_29504()) {
         if (++this.field_14138 > this.method_56922(this.field_14140)) {
            field_14121.warn("{} was kicked for floating too long!", this.field_14140.method_74861());
            this.method_52396(class00392.L("multiplayer.disconnect.flying"));
            return true;
         }
      } else {
         this.field_14131 = false;
         this.field_14138 = 0;
      }

      this.field_14147 = this.field_14140.method_5668();
      if (this.field_14147 != this.field_14140 && this.field_14147.method_5642() == this.field_14140) {
         this.field_14143 = this.field_14147.method_23317();
         this.field_14124 = this.field_14147.method_23318();
         this.field_14142 = this.field_14147.method_23321();
         this.field_14122 = this.field_14147.method_23317();
         this.field_14141 = this.field_14147.method_23318();
         this.field_14120 = this.field_14147.method_23321();
         if (this.field_14129 && this.field_14147.method_5642() == this.field_14140) {
            if (++this.field_14137 > this.method_56922(this.field_14147)) {
               field_14121.warn("{} was kicked for floating a vehicle too long!", this.field_14140.method_74861());
               this.method_52396(class00392.L("multiplayer.disconnect.flying"));
               return true;
            }
         } else {
            this.field_14129 = false;
            this.field_14137 = 0;
         }
      } else {
         this.field_14147 = null;
         this.field_14129 = false;
         this.field_14137 = 0;
      }

      return false;
   }

   private boolean method_20630(class05487 var1, class07049 var2, class00734 var3, double var4, double var6, double var8) {
      class00734 class00734 = var2.method_5829().u(var4 - var2.method_23317(), var6 - var2.method_23318(), var8 - var2.method_23321());
      Iterable<class00494> iterable = var1.N(var2, class00734.B(1.0E-5F), var3.M());
      class00494 class00494 = class00389.N(var3.B(1.0E-5F));
      Iterator<class00494> iterator = iterable.iterator();

      while (iterator.hasNext()) {
         if (!class00389.L(iterator.next(), class00494, class07003.Z)) {
            return true;
         }
      }

      return false;
   }

   private <T, R> CompletableFuture<R> method_31275(T var1, BiFunction<class05477, T, CompletableFuture<R>> var2) {
      return ((CompletableFuture)var2.apply(this.field_14140.method_31273(), var1)).thenApply(var1x -> {
         if (!this.method_48106()) {
            field_14121.debug("Ignoring packet due to disconnection");
            throw new CancellationException("disconnected");
         } else {
            return (R)var1x;
         }
      });
   }

   private void method_61290(class06889 var1) {
      if (var1.B() > 1.0E-5F) {
         this.field_14140.method_14234();
      }

      this.field_14140.method_52208(var1);
      this.field_52364 = true;
   }

   @Override
   public void method_12077(class07358 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (!this.field_14140.method_7338()) {
         this.field_14140.method_64398(class00392.L("advMode.notAllowed"));
      } else {
         class07327 class07327 = null;
         class00402 class00402x = null;
         class07209 class07209 = var1.N();
         class00394 class00394 = this.field_14140.method_51469().method_8321(class07209);
         if (class00394 instanceof class00402 class00402x) {
            class00402x = class00402x;
            class07327 = class00402x.N();
         }

         String s = var1.y();
         boolean flag = var1.L();
         if (class07327 != null) {
            class00384 class00384 = class00402x.Z();
            class00500 class00500x = this.field_14140.method_51469().method_8320(class07209);
            class07211 class07211 = class00500x.L(class06759.y);

            class00500 class00500 = (switch (var1.B()) {
               case field_11922 -> class00869.EO.W();
               case field_11923 -> class00869.EQ.W();
               default -> class00869.MQ.W();
            }).y(class06759.y, class07211).y(class06759.L, var1.u());
            if (class00500 != class00500x) {
               this.field_14140.method_51469().method_8652(class07209, class00500, 2);
               class00394.L(class00500);
               this.field_14140.method_51469().method_8500(class07209).N(class00394);
            }

            class07327.N(s);
            class07327.N(flag);
            if (!flag) {
               class07327.y(null);
            }

            class00402x.y(var1.M());
            if (class00384 != var1.B()) {
               class00402x.R();
            }

            if (this.field_14140.method_51469().method_75000()) {
               class07327.N(this.field_14140.method_51469());
            }

            if (!class05018.y(s)) {
               this.field_14140
                  .method_64398(class00392.N(this.field_14140.method_51469().method_75000() ? "advMode.setCommand.success" : "advMode.setCommand.disabled", s));
            }
         }
      }
   }

   @Override
   public void method_12049(class07333 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (!this.field_14140.method_7338()) {
         this.field_14140.method_64398(class00392.L("advMode.notAllowed"));
      } else {
         class07327 class07327 = var1.N(this.field_14140.method_51469());
         if (class07327 != null) {
            String s = var1.N();
            class07327.N(s);
            class07327.N(var1.y());
            if (!var1.y()) {
               class07327.y(null);
            }

            boolean flag = this.field_14140.method_51469().method_75000();
            if (flag) {
               class07327.N(this.field_14140.method_51469());
            }

            if (!class05018.y(s)) {
               this.field_14140.method_64398(class00392.N(flag ? "advMode.setCommand.success" : "advMode.setCommand.disabled", s));
            }
         }
      }
   }

   @Override
   public void method_12050(class08078 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (var1.N() == this.field_14123) {
         if (this.field_14119 == null) {
            this.method_52396(class00392.L("multiplayer.disconnect.invalid_player_movement"));
            return;
         }

         this.field_14140
            .method_5641(this.field_14119.M, this.field_14119.B, this.field_14119.Z, this.field_14140.method_36454(), this.field_14140.method_36455());
         this.field_14145 = this.field_14119.M;
         this.field_14126 = this.field_14119.B;
         this.field_14144 = this.field_14119.Z;
         this.field_14140.method_14240();
         this.field_14119 = null;
      }
   }

   @Override
   public void method_65085(class00328 var1) {
      class04782 class04782 = this.field_14140.method_51469();
      class00417.N(var1, this, class04782);
      class07209 class07209 = var1.N();
      if (this.field_14140.method_56093(class07209, 1.0)) {
         if (class04782.method_8477(class07209)) {
            class00500 class00500 = class04782.method_8320(class07209);
            boolean flag = this.field_14140.method_56992() && var1.y();
            Operation operation = var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 4, "[net.minecraft.class_2680, net.minecraft.class_4538, net.minecraft.class_2338, boolean]");
               return ((class00500)var0[0]).N((class05487)var0[1], (class07209)var0[2], (Boolean)var0[3]);
            };
            LocalRefImpl localrefimpl = new LocalRefImpl();
            localrefimpl.init(var1);
            class06584 class06584 = this.m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromBlock$mixinextras$bridge$136_13(
               class00500, class04782, class07209, flag, operation, localrefimpl
            );
            var1 = (class00328)localrefimpl.dispose();
            class06584 class06584x = class06584;
            if (!class06584x.R()) {
               if (flag) {
                  method_65099(class00500, class04782, class07209, class06584x);
               }

               this.method_65098(class06584x);
            }
         }
      }
   }

   private static void method_65099(class00500 var0, class04782 var1, class07209 var2, class06584 var3) {
      class00394 class00394 = var0.k() ? var1.method_8321(var2) : null;
      if (class00394 != null) {
         try (class04495 class04495 = new class04495(class00394.J(), field_14121)) {
            class08303 class08303 = class08303.N(class04495, var1.method_30349());
            class00394.R(class08303);
            class00394.y(class08303);
            class06918.N(var3, class00394.O(), class08303);
            var3.y(class00394.g());
         }
      }
   }

   private void method_65098(class06584 var1) {
      if (var1.N(this.field_14140.method_51469().method_45162())) {
         class08044 class08044 = this.field_14140.method_31548();
         int i = class08044.u(var1);
         if (i != -1) {
            if (class08044.L(i)) {
               class08044.N(i);
            } else {
               class08044.y(i);
            }
         } else if (this.field_14140.method_56992()) {
            class08044.L(var1);
         }

         this.method_14364(new class06664(class08044.N()));
         this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
      }
   }

   private void method_76688() {
      this.field_64602 = 0;
   }

   @Override
   public void method_12078(class00557 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (method_14371(var1.N().N(), var1.N().y(), var1.N().L(), var1.y(), var1.L())) {
         this.method_52396(class00392.L("multiplayer.disconnect.invalid_vehicle_movement"));
      } else if (!this.method_60947() && this.method_76685()) {
         class07049 class07049 = this.field_14140.method_5668();
         if (class07049 != this.field_14140 && class07049.method_5642() == this.field_14140 && class07049 == this.field_14147) {
            class04782 class04782 = this.field_14140.method_51469();
            double d0 = class07049.method_23317();
            double d1 = class07049.method_23318();
            double d2 = class07049.method_23321();
            double d3 = method_34882(var1.N().N());
            double d4 = method_34883(var1.N().y());
            double d5 = method_34882(var1.N().L());
            float f = class04995.R(var1.y());
            float f1 = class04995.R(var1.L());
            double d6 = d3 - this.field_14143;
            double d7 = d4 - this.field_14124;
            double d8 = d5 - this.field_14142;
            double d9 = class07049.method_18798().B();
            double d10 = d6 * d6 + d7 * d7 + d8 * d8;
            if (d10 - d9 > 100.0 && !this.method_52402()) {
               field_14121.warn(
                  "{} (vehicle of {}) moved too quickly! {},{},{}", new Object[]{class07049.method_74861(), this.field_14140.method_74861(), d6, d7, d8}
               );
               this.method_14364(class06668.N(class07049));
               return;
            }

            class00734 class00734 = class07049.method_5829();
            d6 = d3 - this.field_14122;
            d7 = d4 - this.field_14141;
            d8 = d5 - this.field_14120;
            boolean flag = class07049.field_36331;
            if (class07049 instanceof class07438 class07438 && class07438.method_6101()) {
               class07438.method_38785();
            }

            class07049.method_5784(class07451.field_6305, new class06889(d6, d7, d8));
            d6 = d3 - class07049.method_23317();
            d7 = d4 - class07049.method_23318();
            if (d7 > -0.5 || d7 < 0.5) {
               d7 = 0.0;
            }

            d8 = d5 - class07049.method_23321();
            d10 = d6 * d6 + d7 * d7 + d8 * d8;
            boolean flag1 = false;
            if (d10 > 0.0625) {
               flag1 = true;
               field_14121.warn(
                  "{} (vehicle of {}) moved wrongly! {}", new Object[]{class07049.method_74861(), this.field_14140.method_74861(), Math.sqrt(d10)}
               );
            }

            if (flag1 && class04782.method_8587(class07049, class00734) || this.method_20630(class04782, class07049, class00734, d3, d4, d5)) {
               class07049.method_5641(d0, d1, d2, f, f1);
               this.method_14364(class06668.N(class07049));
               class07049.method_68259();
               return;
            }

            class07049.method_5641(d3, d4, d5, f, f1);
            this.field_14140.method_51469().method_14178().N(this.field_14140);
            class06889 class06889 = new class06889(class07049.method_23317() - d0, class07049.method_23318() - d1, class07049.method_23321() - d2);
            this.method_61290(class06889);
            class07049.method_65342(var1.u(), class06889);
            class07049.method_65942(class06889.M, class06889.B, class06889.Z, var1.u());
            this.field_14140.method_54720(class06889.M, class06889.B, class06889.Z);
            this.field_14129 = d7 >= -0.03125
               && !flag
               && !this.field_45012.q()
               && !class07049.method_70987()
               && !class07049.method_5740()
               && this.method_29780(class07049);
            this.field_14122 = class07049.method_23317();
            this.field_14141 = class07049.method_23318();
            this.field_14120 = class07049.method_23321();
         }
      }
   }

   @Override
   public void method_61220(class02575 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(var1.N(), var1.y());
   }

   @Override
   public void method_30303(class01023 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14253().N(var1.N(), var1.y(), var1.L());
   }

   @Override
   public void method_12084(class00285 var1) {
      class04782 class04782 = this.field_14140.method_51469();
      class00417.N(var1, this, class04782);
      class07049 class07049 = class04782.method_31424(var1.N());
      if (class07049 != null && this.field_14140.method_56094(class07049, 3.0)) {
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_1297]");
            return ((class07049)var0[0]).method_31480();
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var1);
         class06584 class06584 = this.m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromEntity$mixinextras$bridge$137_14(
            class07049, operation, localrefimpl
         );
         var1 = (class00285)localrefimpl.dispose();
         class06584 class06584x = class06584;
         if (class06584x != null && !class06584x.R()) {
            this.method_65098(class06584x);
         }
      }
   }

   @Override
   public void method_12060(class07338 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      class07482 class07482 = (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
      if (class07482 instanceof class07497 class07497) {
         if (!class07497.N(this.field_14140)) {
            field_14121.debug("Player {} interacted with invalid menu {}", this.field_14140, class07497);
            return;
         }

         class07497.N(var1.N());
      }
   }

   @Override
   public void method_12057(class07354 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      class07482 class07482 = (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
      if (class07482 instanceof class07501 class07501) {
         if (!((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(this.field_14140)) {
            field_14121.debug(
               "Player {} interacted with invalid menu {}", this.field_14140, (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            );
            return;
         }

         class07501.N(var1.N(), var1.y());
      }
   }

   private CompletableFuture<List<class06068>> method_31279(List<String> var1) {
      return this.method_31275(var1, class05477::N);
   }

   private CompletableFuture<class06068> method_31277(String var1) {
      return this.method_31275(var1, class05477::N);
   }

   private static double method_34882(double var0) {
      return class04995.N(var0, -3.0E7, 3.0E7);
   }

   private static double method_34883(double var0) {
      return class04995.N(var0, -2.0E7, 2.0E7);
   }

   @Override
   public void method_12051(class07819 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_7338()) {
         class07209 class07209 = var1.N();
         class00500 class00500 = this.field_14140.method_51469().method_8320(class07209);
         if (this.field_14140.method_51469().method_8321(class07209) instanceof class07253 class07253) {
            class07253.N(var1.L());
            class07253.N(var1.u());
            class07253.N(var1.M());
            class07253.N(var1.B());
            class07253.N(var1.Z());
            class07253.N(var1.z());
            class07253.y(var1.U());
            class07253.N(var1.E());
            class07253.y(var1.W());
            class07253.i(var1.m());
            class07253.R(var1.P());
            class07253.N(var1.s());
            class07253.N(var1.T());
            if (class07253.R()) {
               String s = class07253.u();
               if (var1.y() == class07271.field_12110) {
                  if (class07253.b()) {
                     this.field_14140.method_7353(class00392.N("structure_block.save_success", s), false);
                  } else {
                     this.field_14140.method_7353(class00392.N("structure_block.save_failure", s), false);
                  }
               } else if (var1.y() == class07271.field_12109) {
                  if (!class07253.v()) {
                     this.field_14140.method_7353(class00392.N("structure_block.load_not_found", s), false);
                  } else if (class07253.N(this.field_14140.method_51469())) {
                     this.field_14140.method_7353(class00392.N("structure_block.load_success", s), false);
                  } else {
                     this.field_14140.method_7353(class00392.N("structure_block.load_prepare", s), false);
                  }
               } else if (var1.y() == class07271.field_12106) {
                  if (class07253.T()) {
                     this.field_14140.method_7353(class00392.N("structure_block.size_success", s), false);
                  } else {
                     this.field_14140.method_7353(class00392.L("structure_block.size_failure"), false);
                  }
               }
            } else {
               this.field_14140.method_7353(class00392.N("structure_block.invalid_structure_name", var1.u()), false);
            }

            class07253.method_5431();
            this.field_14140.method_51469().method_8413(class07209, class00500, class00500, 3);
         }
      }
   }

   private int method_56922(class07049 var1) {
      double d0 = var1.method_56989();
      if (d0 < 1.0E-5F) {
         return Integer.MAX_VALUE;
      } else {
         double d1 = 0.08 / d0;
         return class04995.L(80.0 * Math.max(d1, 1.0));
      }
   }

   @Override
   public void method_58580(class02177 var1) {
      Optional<class03048> optional = this.method_45169(var1.M());
      if (!optional.isEmpty()) {
         this.method_44337(var1.N(), true, () -> {
            this.method_45010(var1, optional.get());
            this.method_43669();
         });
      }
   }

   @Override
   public boolean method_68733() {
      return this.field_14140.method_56992();
   }

   @Override
   public void method_66581(class08640 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_7338()) {
         class07209 class07209 = var1.N();
         class00500 class00500 = this.field_14140.method_51469().method_8320(class07209);
         if (this.field_14140.method_51469().method_8321(class07209) instanceof class08594 class08594) {
            class08594.N(var1.y());
            class08594.N(var1.L());
            class08594.method_5431();
            this.field_14140.method_51469().method_8413(class07209, class00500, class08594.w(), 3);
         }
      }
   }

   public void method_14372() {
      this.field_14130 = this.field_14140.method_23317();
      this.field_14146 = this.field_14140.method_23318();
      this.field_14128 = this.field_14140.method_23321();
      this.field_14145 = this.field_14140.method_23317();
      this.field_14126 = this.field_14140.method_23318();
      this.field_14144 = this.field_14140.method_23321();
   }

   public void method_14363(double var1, double var3, double var5, float var7, float var8) {
      this.method_14360(new class08716(new class06889(var1, var3, var5), class06889.L, var7, var8), Collections.emptySet());
   }

   public boolean method_76685() {
      return !this.field_64601 && this.field_64602 <= 0;
   }

   public void method_76687() {
      this.field_64601 = true;
   }

   public void method_14360(class08716 var1, Set<class06681> var2) {
      this.field_14139 = this.field_14118;
      if (++this.field_14123 == Integer.MAX_VALUE) {
         this.field_14123 = 0;
      }

      this.field_14140.method_61412(var1, var2);
      this.field_14119 = this.field_14140.method_73189();
      this.method_14364(class06663.N(this.field_14123, var1, var2));
   }

   public void method_76686() {
      if (this.field_64602 > 0) {
         this.field_64602--;
      }
   }

   public SocketAddress method_48107() {
      return this.field_45013.method_10755();
   }

   public void method_75005() {
      this.field_14138 = 0;
      this.field_14137 = 0;
   }

   public ServerPlayNetworkAddon getAddon() {
      return this.addon;
   }

   @Override
   protected GameProfile method_52403() {
      return this.field_14140.method_7334();
   }

   @Override
   public void method_10839(class02570 var1) {
      field_14121.info("{} lost connection: {}", this.field_14140.method_74861(), var1.N().getString());
      this.method_52415();
      super.method_10839(var1);
   }

   @Override
   public void method_18784() {
      if (this.field_37282 > -1) {
         this.method_14364(new class04622(this.field_37282));
         this.field_37282 = -1;
      }

      if (this.field_45012.ap_() || !this.method_73086()) {
         this.method_52400();
         this.field_54291.y();
         this.field_54292.y();
         if (this.field_14140.method_14219() > 0L
            && this.field_45012.C() > 0
            && class07536.L() - this.field_14140.method_14219() > TimeUnit.MINUTES.toMillis(this.field_45012.C())
            && !this.field_14140.field_13989) {
            this.method_52396(class00392.L("multiplayer.disconnect.idling"));
         }
      }
   }

   @Override
   public void method_12069(class00541 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      boolean flag = this.field_14140.method_74091(class08030.field_7563);
      this.field_14140.method_14213(var1.N());
      if (this.field_14140.method_74091(class08030.field_7563) != flag) {
         this.field_45012.Nm().N(new class06661(class06680.field_54981, this.field_14140));
      }
   }

   @Override
   public void method_52392(class00559 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.m_handler$zjl001$fabric_networking_api_v1$handleCustomPayloadReceivedAsync_18(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         ;
      }
   }

   @Override
   public boolean method_52413(class00381<?> var1) {
      return super.method_52413(var1) ? true : this.field_45025 && this.field_45013.method_10758() && var1 instanceof class04183;
   }

   @Override
   public void method_12072(class00537 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_75004().hasPermission(class08162.y)) {
         class00394 class00394 = this.field_14140.method_51469().method_8321(var1.y());
         class07001 class07001 = class00394 != null ? class00394.L(this.field_14140.method_56673()) : null;
         this.method_14364(new class08093(var1.N(), class07001));
      }
   }

   @Override
   public void method_12068(class00535 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14234();
      class00569 class00569 = var1.N();
      switch (class00569) {
         case field_12774:
            if (this.field_14140.field_13989) {
               this.field_14140.field_13989 = false;
               this.field_14140 = this.field_45012.Nm().N(this.field_14140, true, class07062.field_27002);
               this.method_14372();
               this.method_76689();
               class06912.G.N(this.field_14140, class07299.field_25181, class07299.field_25179);
            } else {
               if (this.field_14140.method_6032() > 0.0F) {
                  return;
               }

               this.field_14140 = this.field_45012.Nm().N(this.field_14140, false, class07062.field_26998);
               this.method_14372();
               this.method_76689();
               if (this.field_45012.ao_()) {
                  this.field_14140.method_7336(class07282.field_9219);
                  this.field_14140.method_51469().method_64395().N(class07305.Ny, false, this.field_45012);
               }
            }
            break;
         case field_12775:
            this.field_14140.method_14248().N(this.field_14140);
      }
   }

   @Override
   public void method_12061(class07378 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14234();
      if (!this.field_14140.method_7325() && ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == var1.N()) {
         if (!((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(this.field_14140)) {
            field_14121.debug(
               "Player {} interacted with invalid menu {}", this.field_14140, (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            );
         } else {
            class06484 class06484 = this.field_45012.yM().N(var1.y());
            if (class06484 != null) {
               class03729<?> class03729 = class06484.y();
               if (this.field_14140.method_14253().y(class03729.N())) {
                  class07482 class07482 = (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
                  if (class07482 instanceof class06923 class06923) {
                     if (class03729.y().method_61671().L()) {
                        field_14121.debug("Player {} tried to place impossible recipe {}", this.field_14140, class03729.N().N());
                        return;
                     }

                     class06910 class06910 = class06923.N(
                        var1.L(), this.field_14140.method_68878(), class03729, this.field_14140.method_51469(), this.field_14140.method_31548()
                     );
                     if (class06910 == class06910.field_52573) {
                        this.method_14364(new class06636(((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, class06484.N().y()));
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_12074(class00540 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_75004().hasPermission(class08162.y)) {
         class07049 class07049 = this.field_14140.method_51469().method_8469(var1.y());
         if (class07049 != null) {
            try (class04495 class04495 = new class04495(class07049.method_71370(), field_14121)) {
               class08303 class08303 = class08303.N(class04495, class07049.method_56673());
               class07049.method_5647(class08303);
               class07001 class07001 = class08303.y();
               this.method_14364(new class08093(var1.N(), class07001));
            }
         }
      }
   }

   @Override
   public void method_16383(class04842 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_7338()) {
         class07209 class07209 = var1.N();
         class00500 class00500 = this.field_14140.method_51469().method_8320(class07209);
         if (this.field_14140.method_51469().method_8321(class07209) instanceof class04858 class04858) {
            class04858.N(var1.y());
            class04858.y(var1.L());
            class04858.N(class05946.N(class04227.yv, var1.u()));
            class04858.N(var1.M());
            class04858.N(var1.B());
            class04858.N(var1.z());
            class04858.y(var1.Z());
            class04858.method_5431();
            this.field_14140.method_51469().method_8413(class07209, class00500, class00500, 3);
         }
      }
   }

   @Override
   public void method_12054(class00543 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14247();
   }

   @Override
   public void method_12053(class00560 var1) {
      int i = var1.N();
      if (class08044.L(i) || i == 40) {
         ArrayList arraylist = Lists.newArrayList();
         Optional<String> optional = var1.L();
         optional.ifPresent(arraylist::add);
         arraylist.addAll(var1.y());
         Consumer consumer = optional.isPresent()
            ? var2x -> this.method_31276((class06068)var2x.get(0), var2x.subList(1, var2x.size()), i)
            : var2x -> this.method_31278(var2x, i);
         this.method_31279(arraylist).thenAcceptAsync(consumer, this.field_45012);
      }
   }

   public void method_45170(class03926 var1, class00649 var2) {
      this.method_14364(new class04464(this.field_58079++, var1.U().L(), var1.U().y(), var1.E(), var1.W().N(this.field_39987), var1.m(), var1.P(), var2));
      class04469 class04469 = var1.E();
      if (class04469 != null) {
         this.field_39987.N(var1.W(), var1.E());
         int i;
         synchronized (this.field_39825) {
            this.field_39825.N(class04469);
            i = this.field_39825.N();
         }

         if (i > 4096) {
            this.method_52396(class00392.L("multiplayer.disconnect.too_many_pending_chats"));
         }
      }
   }

   public class06584 m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromBlock$mixinextras$bridge$136_13(
      class00500 var1, class05487 var2, class07209 var3, boolean var4, Operation var5, LocalRef var6
   ) {
      return this.m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromBlock_17(var1, var2, var3, var4, var5, (class00328)var6.get());
   }

   public class06584 m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromEntity$mixinextras$bridge$137_14(
      class07049 var1, Operation var2, LocalRef var3
   ) {
      return this.m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromEntity_15(var1, var2, (class00285)var3.get());
   }

   public class06584 m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromEntity_15(class07049 var1, Operation var2, class00285 var3) {
      class06584 class06584 = ((PickItemFromEntity)PlayerPickItemEvents.ENTITY.invoker()).onPickItemFromEntity(this.field_14140, var1, var3.y());
      if (class06584 == null) {
         return (class06584)var2.call(new Object[]{var1});
      } else {
         if (!class06584.R()) {
            this.method_65098(class06584);
         }

         return class06584.E;
      }
   }

   private void m_wrapOperation$zjl000$fabric_networking_api_v1$onAcknowledgeReconfiguration_16(
      class00642 var1, class04275 var2, class00638 var3, Operation var4
   ) {
      var4.call(new Object[]{var1, var2, var3});
      class04176 class04176 = (class04176)var3;
      ServerNetworkingImpl.getAddon(class04176).setReconfiguring();
      if (this.addon.requestedReconfigure()) {
         class04176.L();
      }
   }

   public class06584 m_wrapOperation$zeo000$fabric_events_interaction_v0$onPickItemFromBlock_17(
      class00500 var1, class05487 var2, class07209 var3, boolean var4, Operation var5, class00328 var6
   ) {
      class06584 class06584 = ((PickItemFromBlock)PlayerPickItemEvents.BLOCK.invoker()).onPickItemFromBlock(this.field_14140, var3, var1, var6.y());
      if (class06584 == null) {
         return (class06584)var5.call(new Object[]{var1, var2, var3, var4});
      } else {
         if (!class06584.R()) {
            this.method_65098(class06584);
         }

         return class06584.E;
      }
   }

   private void m_handler$zjl001$fabric_networking_api_v1$handleCustomPayloadReceivedAsync_18(class00559 var1, CallbackInfo var2) {
      try {
         if (this.getAddon().handle(var1.N())) {
            var2.cancel();
         }
      } catch (class03096 class03096) {
         this.field_45012.yK().N(this, var1);
         var2.cancel();
      }
   }

   private void m_handler$zjl002$fabric_networking_api_v1$initAddon_19(CallbackInfo var1) {
      this.addon = new ServerPlayNetworkAddon(this, this.field_45013, this.field_45012);
      if (!(this instanceof UntrackedNetworkHandler)) {
         this.addon.lateInit();
      }
   }

   private void method_58590(String var1) {
      ParseResults<class07701> parseresults = this.method_45003(var1);
      if (this.field_45012.r() && class03039.N(parseresults)) {
         field_14121.error(
            "Received unsigned command packet from {}, but the command requires signable arguments: {}", this.field_14140.method_7334().name(), var1
         );
         this.field_14140.method_64398(field_50089);
      } else {
         this.field_45012.yL().N(parseresults, var1);
      }
   }

   private ParseResults<class07701> method_45003(String var1) {
      return this.field_45012.yL().N().parse(var1, this.field_14140.method_64396());
   }

   private void method_45171(class03083 var1) {
      field_14121.warn("Failed to update secure chat state for {}: '{}'", this.field_14140.method_7334().name(), var1.N().getString());
      this.field_14140.method_64398(var1.N().L().N(class06541.field_1061));
   }

   private void method_45010(class02177 var1, class03048 var2) {
      ParseResults<class07701> parseresults = this.method_45003(var1.N());

      Map<String, class03926> map;
      try {
         map = this.method_45006(var1, class03039.y(parseresults), var2);
      } catch (class03083 class03083) {
         this.method_45171(class03083);
         return;
      }

      class10410 class10410 = new class10410(map);
      parseresults = class07686.N(parseresults, var2x -> var2x.N(class10410, this.field_39826));
      this.field_45012.yL().N(parseresults, var1.N());
   }

   private <S> Map<String, class03926> method_58591(List<class03067<S>> var1) throws class03083 {
      HashMap hashmap = new HashMap();

      for (class03067 class03067 : var1) {
         class03079 class03079 = class03079.N(class03067.L());
         hashmap.put(class03067.N(), this.field_39805.unpack(null, class03079));
      }

      return hashmap;
   }

   private void method_31278(List<class06068> var1, int var2) {
      class06584 class06584 = this.field_14140.method_31548().method_5438(var2);
      if (class06584.L(class02484.Ny)) {
         List list = var1.stream().map(this::method_57142).toList();
         class06584.N(class02484.Ny, new class02699(list));
      }
   }

   private class02826<String> method_57142(class06068 var1) {
      return this.field_14140.method_33793() ? class02826.N(var1.y()) : class02826.N(var1);
   }

   @Override
   public void method_12064(class07377 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      class07049 class07049 = this.field_14140.method_49694();
      if (class07049 instanceof class00250) {
         ((class00250)class07049).N(var1.N(), var1.y());
      }
   }

   private void method_44337(String var1, boolean var2, Runnable var3) {
      if (method_43508(var1)) {
         this.method_52396(class00392.L("multiplayer.disconnect.illegal_characters"));
      } else if (!var2 && this.field_14140.method_14238() == class08027.field_7536) {
         this.method_14364(new class04459(class00392.L("chat.disabled.options").N(class06541.field_1061), false));
      } else {
         this.field_14140.method_14234();
         this.field_45012.execute(var3);
      }
   }

   private <S> Map<String, class03926> method_45006(class02177 var1, class03039<S> var2, class03048 var3) throws class03083 {
      List<class10407> list = var1.u().N();
      List list1 = var2.N();
      if (list.isEmpty()) {
         return this.method_58591(list1);
      } else {
         Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap();

         for (class10407 class10407 : list) {
            class03067 class03067x = var2.N(class10407.y());
            if (class03067x == null) {
               this.field_39805.N();
               throw method_58589(var1.N(), list, list1);
            }

            class03079 class03079 = new class03079(class03067x.L(), var1.y(), var1.L(), var3);
            object2objectopenhashmap.put(class03067x.N(), this.field_39805.unpack(class10407.N(), class03079));
         }

         for (class03067 class03067 : list1) {
            if (!object2objectopenhashmap.containsKey(class03067.N())) {
               throw method_58589(var1.N(), list, list1);
            }
         }

         return object2objectopenhashmap;
      }
   }

   @Override
   public void method_12063(class00547 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (method_14371(var1.N(0.0), var1.y(0.0), var1.L(0.0), var1.N(0.0F), var1.y(0.0F))) {
         this.method_52396(class00392.L("multiplayer.disconnect.invalid_player_movement"));
      } else {
         class04782 class04782 = this.field_14140.method_51469();
         if (!this.field_14140.field_13989) {
            if (this.field_14118 == 0) {
               this.method_14372();
            }

            if (this.method_76685()) {
               float f = class04995.R(var1.N(this.field_14140.method_36454()));
               float f1 = class04995.R(var1.y(this.field_14140.method_36455()));
               if (this.method_60947()) {
                  this.field_14140.method_60608(f, f1);
               } else {
                  double d0 = method_34882(var1.N(this.field_14140.method_23317()));
                  double d1 = method_34883(var1.y(this.field_14140.method_23318()));
                  double d2 = method_34882(var1.L(this.field_14140.method_23321()));
                  if (this.field_14140.method_5765()) {
                     this.field_14140.method_5641(this.field_14140.method_23317(), this.field_14140.method_23318(), this.field_14140.method_23321(), f, f1);
                     this.field_14140.method_51469().method_14178().N(this.field_14140);
                  } else {
                     double d3 = this.field_14140.method_23317();
                     double d4 = this.field_14140.method_23318();
                     double d5 = this.field_14140.method_23321();
                     double d6 = d0 - this.field_14130;
                     double d7 = d1 - this.field_14146;
                     double d8 = d2 - this.field_14128;
                     double d9 = this.field_14140.method_18798().B();
                     double d10 = d6 * d6 + d7 * d7 + d8 * d8;
                     if (this.field_14140.method_6113()) {
                        if (d10 > 1.0) {
                           this.method_14363(this.field_14140.method_23317(), this.field_14140.method_23318(), this.field_14140.method_23321(), f, f1);
                        }
                     } else {
                        boolean flag = this.field_14140.method_6128();
                        if (class04782.method_54719().Z()) {
                           this.field_14117++;
                           int i = this.field_14117 - this.field_14135;
                           if (i > 5) {
                              field_14121.debug("{} is sending move packets too frequently ({} packets since last tick)", this.field_14140.method_74861(), i);
                              i = 1;
                           }

                           if (this.method_64962(flag)) {
                              float f2 = flag ? 300.0F : 100.0F;
                              if (d10 - d9 > f2 * i) {
                                 field_14121.warn("{} moved too quickly! {},{},{}", new Object[]{this.field_14140.method_74861(), d6, d7, d8});
                                 this.method_14363(
                                    this.field_14140.method_23317(),
                                    this.field_14140.method_23318(),
                                    this.field_14140.method_23321(),
                                    this.field_14140.method_36454(),
                                    this.field_14140.method_36455()
                                 );
                                 return;
                              }
                           }
                        }

                        class00734 class00734 = this.field_14140.method_5829();
                        d6 = d0 - this.field_14145;
                        d7 = d1 - this.field_14126;
                        d8 = d2 - this.field_14144;
                        boolean flag4 = d7 > 0.0;
                        if (this.field_14140.method_24828() && !var1.N() && flag4) {
                           this.field_14140.method_6043();
                        }

                        boolean flag1 = this.field_14140.field_36331;
                        this.field_14140.method_5784(class07451.field_6305, new class06889(d6, d7, d8));
                        d6 = d0 - this.field_14140.method_23317();
                        d7 = d1 - this.field_14140.method_23318();
                        if (d7 > -0.5 || d7 < 0.5) {
                           d7 = 0.0;
                        }

                        d8 = d2 - this.field_14140.method_23321();
                        d10 = d6 * d6 + d7 * d7 + d8 * d8;
                        boolean flag2 = false;
                        if (!this.field_14140.method_14208()
                           && d10 > 0.0625
                           && !this.field_14140.method_6113()
                           && !this.field_14140.method_68878()
                           && !this.field_14140.method_7325()
                           && !this.field_14140.method_76730()) {
                           flag2 = true;
                           field_14121.warn("{} moved wrongly!", this.field_14140.method_74861());
                        }

                        if (this.field_14140.field_5960
                           || this.field_14140.method_6113()
                           || (!flag2 || !class04782.method_8587(this.field_14140, class00734))
                              && !this.method_20630(class04782, this.field_14140, class00734, d0, d1, d2)) {
                           this.field_14140.method_5641(d0, d1, d2, f, f1);
                           boolean flag3 = this.field_14140.method_6123();
                           this.field_14131 = d7 >= -0.03125
                              && !flag1
                              && !this.field_14140.method_7325()
                              && !this.field_45012.q()
                              && !this.field_14140.method_31549().L
                              && !this.field_14140.method_6059(class07047.d)
                              && !flag
                              && !flag3
                              && this.method_29780(this.field_14140);
                           this.field_14140.method_51469().method_14178().N(this.field_14140);
                           class06889 class06889 = new class06889(
                              this.field_14140.method_23317() - d3, this.field_14140.method_23318() - d4, this.field_14140.method_23321() - d5
                           );
                           this.field_14140.method_60607(var1.N(), var1.y(), class06889);
                           this.field_14140.method_65942(class06889.M, class06889.B, class06889.Z, var1.N());
                           this.method_61290(class06889);
                           if (flag4) {
                              this.field_14140.method_38785();
                           }

                           if (var1.N() || this.field_14140.method_59925() || this.field_14140.method_6101() || this.field_14140.method_7325() || flag || flag3
                              )
                            {
                              this.field_14140.method_60983();
                           }

                           this.field_14140
                              .method_54720(this.field_14140.method_23317() - d3, this.field_14140.method_23318() - d4, this.field_14140.method_23321() - d5);
                           this.field_14145 = this.field_14140.method_23317();
                           this.field_14126 = this.field_14140.method_23318();
                           this.field_14144 = this.field_14140.method_23321();
                        } else {
                           this.method_14363(d3, d4, d5, f, f1);
                           this.field_14140
                              .method_65942(
                                 this.field_14140.method_23317() - d3, this.field_14140.method_23318() - d4, this.field_14140.method_23321() - d5, var1.N()
                              );
                           this.field_14140.method_68259();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_12073(class07810 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_7325()) {
         for (class04782 class04782 : this.field_45012.NO()) {
            class07049 class07049 = var1.N(class04782);
            if (class07049 != null) {
               this.field_14140
                  .method_48105(
                     class04782,
                     class07049.method_23317(),
                     class07049.method_23318(),
                     class07049.method_23321(),
                     Set.of(),
                     class07049.method_36454(),
                     class07049.method_36455(),
                     true
                  );
               return;
            }
         }
      }
   }

   @Override
   public void method_27273(class05044 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_7338()) {
         class07209 class07209 = var1.N();
         class00394 class00394 = this.field_14140.method_51469().method_8321(class07209);
         if (class00394 instanceof class04858) {
            ((class04858)class00394).N(this.field_14140.method_51469(), var1.y(), var1.L());
         }
      }
   }

   @Override
   public void method_12080(class07351 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      int i = var1.N();
      class07482 class07482 = (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
      if (class07482 instanceof class06952 class06952) {
         if (!class06952.N(this.field_14140)) {
            field_14121.debug("Player {} interacted with invalid menu {}", this.field_14140, class06952);
            return;
         }

         class06952.N(i);
         class06952.B(i);
      }
   }

   @Override
   public void method_66582(class08628 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      class07209 class07209 = var1.N();
      if (this.field_14140.method_7338() && this.field_14140.method_51469().method_8321(class07209) instanceof class08610 class08610) {
         if (var1.y() != class08616.field_55921 && var1.y() != class08616.field_55920) {
            class08610.N(var1.L());
            if (var1.y() == class08616.field_55923) {
               class08610.N(this.field_14140::method_64398);
            } else if (var1.y() == class08616.field_55924) {
               class08610.y(this.field_14140::method_64398);
            } else if (var1.y() == class08616.field_55925) {
               class08610.L(this.field_14140::method_64398);
            } else if (var1.y() == class08616.field_55926) {
               class08610.u(this.field_14140::method_64398);
            }

            class00500 class00500 = this.field_14140.method_51469().method_8320(class07209);
            this.field_14140.method_51469().method_8413(class07209, class00869.N.W(), class00500, 3);
         } else {
            class00751 class00751 = this.field_14140.method_56673().L(class04227.yt);
            Optional optional = var1.L().N().flatMap(class00751::N);
            Object object;
            if (optional.isPresent()) {
               object = ((class00201)((class03529)optional.get()).N()).L();
            } else {
               object = class00392.L("test_instance.description.no_test").N(class06541.field_1061);
            }

            Optional optional1;
            if (var1.y() == class08616.field_55921) {
               optional1 = var1.L().N().flatMap(var1x -> class08610.N(this.field_14140.method_51469(), (class05946<class00201>)var1x));
            } else {
               optional1 = Optional.empty();
            }

            this.field_45013.method_10743(new class08621((class00392)object, optional1));
         }
      }
   }

   @Override
   public void method_12066(class07364 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.method_76685()) {
         class07209 class07209 = var1.N();
         this.field_14140.method_14234();
         class07356 class07356 = var1.L();
         switch (class07356) {
            case field_63165:
               if (this.field_14140.method_7325()) {
                  return;
               } else {
                  class06584 class06584x = this.field_14140.method_5998(class07050.field_5808);
                  if (this.field_14140.method_75202(class06584x, 5)) {
                     return;
                  }

                  class08172 class08172 = class06584x.method_58694(class02484.c);
                  if (class08172 != null) {
                     class08172.N(this.field_14140, class07085.field_6173);
                  }

                  return;
               }
            case field_12969:
               if (!this.field_14140.method_7325()) {
                  class06584 class06584 = this.field_14140.method_5998(class07050.field_5810);
                  this.field_14140.method_6122(class07050.field_5810, this.field_14140.method_5998(class07050.field_5808));
                  this.field_14140.method_6122(class07050.field_5808, class06584);
                  this.field_14140.method_6021();
               }

               return;
            case field_12975:
               if (!this.field_14140.method_7325()) {
                  this.field_14140.method_37413(false);
               }

               return;
            case field_12970:
               if (!this.field_14140.method_7325()) {
                  this.field_14140.method_37413(true);
               }

               return;
            case field_12974:
               this.field_14140.method_6075();
               return;
            case field_12968:
            case field_12971:
            case field_12973:
               this.field_14140.field_13974.N(class07209, class07356, var1.y(), this.field_14140.method_51469().method_31600(), var1.u());
               this.method_41255(var1.u());
               return;
            default:
               throw new IllegalArgumentException("Invalid player action");
         }
      }
   }

   private void method_31276(class06068 var1, List<class06068> var2, int var3) {
      class06584 class06584x = this.field_14140.method_31548().method_5438(var3);
      if (class06584x.L(class02484.Ny)) {
         class06584 class06584x = class06584x.N((class07310)class06570.GE);
         class06584x.y(class02484.Ny);
         List list = var2.stream().map(var1x -> this.method_57142(var1x).N(class00392::y)).toList();
         class06584x.N(class02484.NL, new class02706(this.method_57142(var1), this.field_14140.method_74861(), 0, list, true));
         this.field_14140.method_31548().method_5447(var3, class06584x);
      }
   }

   private static boolean method_27913(class04770 var0, class06584 var1) {
      if (var1.R()) {
         return false;
      } else {
         class06581 class06581 = var1.B();
         return (class06581 instanceof class06918 || class06581 instanceof class06913 && ((class06913)class06581).N() != class04684.N)
            && !var0.method_7357().N(var1);
      }
   }

   private void method_52415() {
      this.field_39826.close();
      this.field_45012.NS();
      this.field_45012.Nm().N(class00392.N("multiplayer.player.left", this.field_14140.method_5476()).N(class06541.field_1054), false);
      this.field_14140.method_14231();
      this.field_45012.Nm().y(this.field_14140);
      this.field_14140.method_31273().y();
   }

   @Override
   public void method_12065(class07843 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.method_76685()) {
         this.method_41255(var1.y());
         class04782 class04782 = this.field_14140.method_51469();
         class07050 class07050 = var1.N();
         class06584 class06584 = this.field_14140.method_5998(class07050);
         this.field_14140.method_14234();
         if (!class06584.R() && class06584.N(class04782.method_45162())) {
            float f = class04995.R(var1.L());
            float f1 = class04995.R(var1.u());
            if (f1 != this.field_14140.method_36455() || f != this.field_14140.method_36454()) {
               this.field_14140.method_60608(f, f1);
            }

            class07082 class07082 = this.field_14140.field_13974.N(this.field_14140, class04782, class06584, class07050);
            if (class07082 instanceof class07041 && ((class07041)class07082).i() == class07064.field_52428) {
               this.field_14140.method_23667(class07050, true);
            }
         }
      }
   }

   @Override
   public void method_12056(class07335 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (var1.N() >= 0 && var1.N() < class08044.L()) {
         if (this.field_14140.method_31548().N() != var1.N() && this.field_14140.method_6058() == class07050.field_5808) {
            this.field_14140.method_6021();
         }

         this.field_14140.method_31548().N(var1.N());
         this.field_14140.method_14234();
      } else {
         field_14121.warn("{} tried to set an invalid carried item", this.field_14140.method_74861());
      }
   }

   @Override
   public void method_12046(class07828 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.method_76685()) {
         this.method_41255(var1.L());
         class04782 class04782 = this.field_14140.method_51469();
         class07050 class07050 = var1.N();
         class06584 class06584 = this.field_14140.method_5998(class07050);
         if (class06584.N(class04782.method_45162())) {
            class06183 class06183 = var1.y();
            class06889 class06889x = class06183.y();
            class07209 class07209 = class06183.u();
            if (this.field_14140.method_56093(class07209, 1.0)) {
               class06889 class06889x = class06889x.u(class06889.y(class07209));
               double d0 = 1.0000001;
               if (Math.abs(class06889x.N()) < 1.0000001 && Math.abs(class06889x.y()) < 1.0000001 && Math.abs(class06889x.L()) < 1.0000001) {
                  class07211 class07211 = class06183.i();
                  this.field_14140.method_14234();
                  int i = this.field_14140.method_51469().method_31600();
                  if (class07209.method_10264() <= i) {
                     if (this.field_14119 == null && class04782.method_8505(this.field_14140, class07209)) {
                        class07082 class07082 = this.field_14140.field_13974.N(this.field_14140, class04782, class06584, class07050, class06183);
                        if (class07082.N()) {
                           class06912.p.N(this.field_14140, class06183.u(), class06584.t());
                        }

                        if (class07211 == class07211.field_11036
                           && !class07082.N()
                           && class07209.method_10264() >= i
                           && method_27913(this.field_14140, class06584)) {
                           class05216 class05216x = class00392.N("build.tooHigh", i).N(class06541.field_1061);
                           this.field_14140.method_43502(class05216x, true);
                        } else if (class07082 instanceof class07041 && ((class07041)class07082).i() == class07064.field_52428) {
                           this.field_14140.method_23667(class07050, true);
                        }
                     }
                  } else {
                     class05216 class05216 = class00392.N("build.tooHigh", i).N(class06541.field_1061);
                     this.field_14140.method_43502(class05216, true);
                  }

                  this.method_14364(new class07259(class04782, class07209));
                  this.method_14364(new class07259(class04782, class07209.method_10093(class07211)));
               } else {
                  field_14121.warn(
                     "Rejecting UseItemOnPacket from {}: Location {} too far away from hit block {}.",
                     new Object[]{this.field_14140.method_7334().name(), class06889x, class07209}
                  );
               }
            }
         }
      }
   }

   private Optional<class03048> method_45169(class03058 var1) {
      synchronized (this.field_39825) {
         Optional optional;
         try {
            class03048 class03048 = this.field_39825.N(var1);
            optional = Optional.of(class03048);
         } catch (class10104 class10104) {
            field_14121.error("Failed to validate message acknowledgements from {}: {}", this.field_14140.method_74861(), class10104.getMessage());
            this.method_52396(field_39990);
            return Optional.empty();
         }

         return optional;
      }
   }

   @Override
   public void method_54436(class01735 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (!this.field_14140.method_7325() && var1.y() == ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b) {
         class07482 class07482 = (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
         if (class07482 instanceof class01712) {
            class06695 class06695 = ((class01712)class07482).W();
            if (class06695 instanceof class03145) {
               ((class03145)class06695).N(var1.N(), var1.L());
            }
         }
      }
   }

   @Override
   public void method_43667(class03961 var1) {
      this.method_44337(var1.N(), true, () -> {
         this.method_58590(var1.N());
         this.method_43669();
      });
   }

   @Override
   public void method_12048(class00573 var1) {
      Optional<class03048> optional = this.method_45169(var1.M());
      if (!optional.isEmpty()) {
         this.method_44337(var1.N(), false, () -> {
            class03926 class03926;
            try {
               class03926 = this.method_45011(var1, optional.get());
            } catch (class03083 class03083) {
               this.method_45171(class03083);
               return;
            }

            CompletableFuture<class06068> completablefuture = this.method_31277(class03926.L());
            class00392 class00392 = this.field_45012.yg().decorate(this.field_14140, class03926.u());
            this.field_39826.N(completablefuture, var3x -> {
               class03926 class03926x = class03926.N(class00392).N(var3x.i());
               this.method_44155(class03926x);
            });
         });
      }
   }

   public void method_41255(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Expected packet sequence nr >= 0");
      } else {
         this.field_37282 = Math.max(var1, this.field_37282);
      }
   }

   private boolean method_64962(boolean var1) {
      if (this.method_52402()) {
         return false;
      } else if (this.field_14140.method_14208()) {
         return false;
      } else {
         class07305 class07305 = this.field_14140.method_51469().method_64395();
         return !class07305.N(class07305.o) ? false : !var1 || class07305.N(class07305.Z);
      }
   }

   @Override
   public void method_19476(class06321 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_75004().hasPermission(class08162.y) || this.method_52402()) {
         this.field_45012.z(var1.N());
      }
   }

   public void method_52414() {
      this.field_45025 = true;
      this.method_52415();
      this.method_14364(class04190.N);
      this.field_45013.method_56329(class02868.u);
   }

   @Override
   public void method_12052(class07831 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14234();
      this.field_14140.method_6104(var1.N());
   }

   @Override
   public void method_71675(class09008 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (!class01557.N.N(this.field_14140.method_75004())) {
         field_14121.warn(
            "Player {} tried to change game mode to {} without required permissions", this.field_14140.method_7334().name(), var1.N().u().getString()
         );
      } else {
         class01557.N(this.field_14140, var1.N());
      }
   }

   @Override
   public void method_52278(class04175 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_45026.N(var1.N());
   }

   @Override
   public void method_56619(class02884 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_74537(var1.N());
   }

   private class03926 method_45011(class00573 var1, class03048 var2) throws class03083 {
      class03079 class03079 = new class03079(var1.N(), var1.y(), var1.L(), var2);
      return this.field_39805.unpack(var1.u(), class03079);
   }

   private void method_31282(class07807 var1, List<class06068> var2) {
      this.field_14140.method_14234();
      class04782 class04782 = this.field_14140.method_51469();
      class07209 class07209 = var1.N();
      if (class04782.E(class07209)) {
         if (!(class04782.method_8321(class07209) instanceof class07267 class07267)) {
            return;
         }

         class07267.N(this.field_14140, var1.y(), var2);
      }
   }

   @Override
   public void method_12083(class07343 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_31549().y = var1.N() && this.field_14140.method_31549().L;
   }

   private void method_46365(class02027 var1) {
      this.field_40720 = var1;
      this.field_39805 = var1.N(this.field_14140.method_5667());
      this.field_39826.N(() -> {
         this.field_14140.method_46364(var1);
         this.field_45012.Nm().N(new class06661(EnumSet.of(class06680.field_40699), List.of(this.field_14140)));
      });
   }

   @Override
   public void method_61219(class02574 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (!this.field_52364) {
         this.field_14140.method_52208(class06889.L);
      }

      this.field_52364 = false;
   }

   @Override
   public class04770 method_32311() {
      return this.field_14140;
   }

   private void method_43669() {
      this.field_54291.N();
      if (!this.field_54291.L() && !this.field_45012.Nm().R(this.field_14140.method_72498()) && !this.field_45012.N(this.field_14140.method_72498())) {
         this.method_52396(class00392.L("disconnect.spam"));
      }
   }

   @Override
   public void method_12055(class00546 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14234();
      if (((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == var1.N() && !this.field_14140.method_7325()) {
         if (!((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(this.field_14140)) {
            field_14121.debug(
               "Player {} interacted with invalid menu {}", this.field_14140, (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            );
         } else {
            if (((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).y(this.field_14140, var1.y())) {
               ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
            }
         }
      }
   }

   @Override
   public void method_12076(class00539 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      this.field_14140.method_14234();
      if (((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == var1.N()) {
         if (this.field_14140.method_7325()) {
            ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).y();
         } else if (!((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(this.field_14140)) {
            field_14121.debug(
               "Player {} interacted with invalid menu {}", this.field_14140, (class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3
            );
         } else {
            short short1 = var1.L();
            if (!((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).y(short1)) {
               field_14121.debug(
                  "Player {} clicked invalid slot index: {}, available slots: {}",
                  new Object[]{
                     this.field_14140.method_74861(),
                     Integer.valueOf(short1),
                     ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T.size()
                  }
               );
            } else {
               boolean flag = var1.y() != ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).z();
               ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).B();
               ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(short1, var1.u(), var1.M(), this.field_14140);
               ObjectIterator<Entry<class00176>> objectiterator = Int2ObjectMaps.fastIterable(var1.B()).iterator();

               while (objectiterator.hasNext()) {
                  Entry entry = (Entry)objectiterator.next();
                  ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(entry.getIntKey(), (class00176)entry.getValue());
               }

               ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(var1.Z());
               ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).Z();
               if (flag) {
                  ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).i();
               } else {
                  ((class07482)this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
               }
            }
         }
      }
   }

   @Override
   public void method_52279(class04183 var1) {
      if (!this.field_45025) {
         throw new IllegalStateException("Client acknowledged config, but none was requested");
      } else {
         class00642 class00642 = this.field_45013;
         class04275 class04275 = class02868.y;
         class04176 class04176 = new class04176(this.field_45012, this.field_45013, this.method_53825(this.field_14140.method_53823()));
         class04275<class01667> class04275x = class04275;
         class00642 class00642x = class00642;
         this.m_wrapOperation$zjl000$fabric_networking_api_v1$onAcknowledgeReconfiguration_16(class00642x, class04275x, class04176, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_2535, net.minecraft.class_9127, net.minecraft.class_2547]");
            ((class00642)var0[0]).method_56330((class04275)var0[1], (class00638)var0[2]);
            return (Void)null;
         });
      }
   }

   private static <S> class03083 method_58589(String var0, List<class10407> var1, List<class03067<S>> var2) {
      String s = var1.stream().map(class10407::y).collect(Collectors.joining(", "));
      String s1 = var2.stream().map(class03067::N).collect(Collectors.joining(", "));
      field_14121.error("Signed command mismatch between server and client ('{}'): got [{}] from client, but expected [{}]", new Object[]{var0, s, s1});
      return new class03083(field_50089);
   }

   @Override
   public void method_12045(class07375 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.method_76685()) {
         this.field_14140.method_14234();
         switch (var1.y()) {
            case field_12981:
               this.field_14140.method_5728(true);
               break;
            case field_12985:
               this.field_14140.method_5728(false);
               break;
            case field_12986:
               if (this.field_14140.method_6113()) {
                  this.field_14140.method_7358(false, true);
                  this.field_14119 = this.field_14140.method_73189();
               }
               break;
            case field_12987:
               if (this.field_14140.method_49694() instanceof class07431 class07431) {
                  int i = var1.L();
                  if (class07431.m() && i > 0) {
                     class07431.y(i);
                  }
               }
               break;
            case field_12980:
               if (this.field_14140.method_49694() instanceof class07431 class07431x) {
                  class07431x.t();
               }
               break;
            case field_12988:
               if (this.field_14140.method_5854() instanceof class03969 class03969) {
                  class03969.N(this.field_14140);
               }
               break;
            case field_12982:
               if (!this.field_14140.method_23668()) {
                  this.field_14140.method_66281();
               }
               break;
            default:
               throw new IllegalArgumentException("Invalid client command!");
         }
      }
   }

   @Override
   public void method_12070(class07346 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.field_14140.method_56992()) {
         boolean flag = var1.N() < 0;
         class06584 class06584 = var1.y();
         if (!class06584.N(this.field_14140.method_51469().method_45162())) {
            return;
         }

         boolean flag1 = var1.N() >= 1 && var1.N() <= 45;
         boolean flag2 = class06584.R() || class06584.c() <= class06584.U();
         if (flag1 && flag2) {
            this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(var1.N()).u(class06584);
            this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(var1.N(), class06584);
            this.field_14140.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
         } else if (flag && flag2) {
            if (this.field_54292.L()) {
               this.field_54292.N();
               this.field_14140.method_7328(class06584, true);
            } else {
               field_14121.warn("Player {} was dropping items too fast in creative mode, ignoring.", this.field_14140.method_74861());
            }
         }
      }
   }

   @Override
   public void method_46367(class02075 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      class02048 class02048 = var1.N();
      class04454 class04454x = this.field_40720 != null ? this.field_40720.u().y() : null;
      class04454 class04454x = class02048.y();
      if (!Objects.equals(class04454x, class04454x)) {
         if (class04454x != null && class04454x.y().isBefore(class04454x.y())) {
            this.method_52396(class04470.N);
         } else {
            try {
               class03962 class03962 = this.field_45012.Nf().N();
               if (class03962 == null) {
                  field_14121.warn("Ignoring chat session from {} due to missing Services public key", this.field_14140.method_7334().name());
                  return;
               }

               this.method_46365(class02048.N(this.field_14140.method_7334(), class03962));
            } catch (class10406 class10406) {
               field_14121.error("Failed to validate profile key: {}", class10406.getMessage());
               this.method_52396(class10406.N());
            }
         }
      }
   }

   @Override
   public void method_12062(class00556 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (this.method_76685()) {
         class04782 class04782 = this.field_14140.method_51469();
         class07049 class07049 = var1.N(class04782);
         this.field_14140.method_14234();
         this.field_14140.method_5660(var1.y());
         if (class07049 != null) {
            if (!class04782.method_8621().N(class07049.method_24515())) {
               return;
            }

            class00734 class00734 = class07049.method_5829();
            if (var1.N(this.field_14140, class00734, 3.0)) {
               var1.N(new class09485(this, class04782, class07049));
            }
         }
      }
   }

   public void method_45168(class00392 var1, class00649 var2) {
      this.method_14364(new class02046(var1, var2));
   }

   private void method_44155(class03926 var1) {
      this.field_45012.Nm().N(var1, this.field_14140, class00629.N(class00629.i, this.field_14140));
      this.method_43669();
   }

   @Override
   public void method_19475(class06287 var1) {
      class00417.N(var1, this, this.field_14140.method_51469());
      if (!this.field_14140.method_75004().hasPermission(class08162.y) && !this.method_52402()) {
         field_14121.warn("Player {} tried to change difficulty to {} without required permissions", this.field_14140.method_7334().name(), var1.N().y());
      } else {
         this.field_45012.N(var1.N(), false);
      }
   }

   @Override
   public void method_12071(class07807 var1) {
      List list = Stream.of(var1.L()).map(class06541::N).collect(Collectors.toList());
      this.method_31279(list).thenAcceptAsync(var2x -> this.method_31282(var1, (List<class06068>)var2x), this.field_45012);
   }

   private static boolean method_43508(String var0) {
      for (int i = 0; i < var0.length(); i++) {
         if (!class05018.N(var0.charAt(i))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void method_44898(class03076 var1) {
      synchronized (this.field_39825) {
         try {
            this.field_39825.N(var1.N());
         } catch (class10104 class10104) {
            field_14121.error("Failed to validate message acknowledgement offset from {}: {}", this.field_14140.method_74861(), class10104.getMessage());
            this.method_52396(field_39990);
         }
      }
   }
}
