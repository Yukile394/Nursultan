package minecraft;

import Nursultan.class10526;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import jerozgen.languagereload.LanguageReload;
import jerozgen.languagereload.config.Config;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.keybinding.KeyBindingRegistryImpl;
import net.fabricmc.fabric.impl.resource.client.DefaultResourcePackStorage;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.properties.CloudSetting;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class05630 {
   static Logger N = LogUtils.getLogger();
   static final Gson y = new Gson();
   private static final TypeToken<List<String>> Ng = new class05604();
   public static final int L = 4;
   public static final int u = 12;
   public static final int i = 16;
   public static final int R = 32;
   private static final Splitter NI = Splitter.on(':').limit(2);
   public static final String M = "";
   private static final class00392 NJ = class00392.L("options.darkMojangStudiosBackgroundColor.tooltip");
   private final class04370<Boolean> No = class04370.method_41749("options.darkMojangStudiosBackgroundColor", class04370.method_42717(NJ), false);
   private static final class00392 Nq = class00392.L("options.hideLightningFlashes.tooltip");
   private final class04370<Boolean> NK = class04370.method_41749("options.hideLightningFlashes", class04370.method_42717(Nq), false);
   private static final class00392 NV = class00392.L("options.hideSplashTexts.tooltip");
   private final class04370<Boolean> Ne = class04370.method_41749("options.hideSplashTexts", class04370.method_42717(NV), false);
   private final class04370<Double> NH = new class04370<>("options.sensitivity", class04370.method_42399(), (var0, var1x) -> {
      if (var1x == 0.0) {
         return N(var0, class00392.L("options.sensitivity.min"));
      } else {
         return var1x == 1.0 ? N(var0, class00392.L("options.sensitivity.max")) : N(var0, 2.0 * var1x);
      }
   }, class04350.field_37875, 0.5, var0 -> {});
   private final class04370<Integer> Nc;
   private final class04370<Integer> NX;
   private int Na = 0;
   private final class04370<Double> Np = new class04370<>(
      "options.entityDistanceScaling",
      class04370.method_42399(),
      class05630::N,
      new class04369(2, 20).N(var0 -> var0 / 4.0, var0 -> (int)(var0 * 4.0), true),
      Codec.doubleRange(0.5, 5.0),
      1.0,
      var1x -> this.yy()
   );
   public static final int B = 260;
   private final class04370<Integer> NF = new class04370<>(
      "options.framerateLimit",
      class04370.method_42399(),
      (var0, var1x) -> var1x == 260 ? N(var0, class00392.L("options.framerateLimit.max")) : N(var0, class00392.N("options.framerate", var1x)),
      new class04369(1, 26).N(var0 -> var0 * 10, var0 -> var0 / 10, true),
      Codec.intRange(10, 260),
      120,
      var0 -> class06202.Nq().NG().N(var0)
   );
   private boolean NA;
   private final class04370<class01241> Nf = new class04370<>(
      "options.graphics.preset",
      class04370.method_42717(class00392.L("options.graphics.preset.tooltip")),
      (var0, var1x) -> N(var0, class00392.L(var1x.N())),
      new class04362<>(List.of(class01241.values()), class01241.field_63462),
      class01241.field_63462,
      class01241.field_25428,
      this::N
   );
   private static final class00392 NC = class00392.L("options.inactivityFpsLimit.minimized.tooltip");
   private static final class00392 NS = class00392.L("options.inactivityFpsLimit.afk.tooltip");
   private final class04370<class02424> Nx = new class04370<>("options.inactivityFpsLimit", var0 -> {
      return switch (var0) {
         case field_52743 -> class04141.N(NC);
         case field_52744 -> class04141.N(NS);
      };
   }, (var0, var1x) -> var1x.N(), new class04380<>(Arrays.asList(class02424.values()), class02424.field_52745), class02424.field_52744, var0 -> {});
   private final class04370<class01301> ND = new class04370<>(
      "options.renderClouds",
      class04370.method_42399(),
      (var0, var1x) -> var1x.N(),
      new class04380<>(
         Arrays.asList(class01301.values()),
         Codec.withAlternative(class01301.field_45285, Codec.BOOL, var0 -> var0 ? class01301.field_18164 : class01301.field_18162)
      ),
      class01301.field_18164,
      var1x -> this.yy()
   );
   private final class04370<Integer> Nh = new class04370<>(
      "options.renderCloudsDistance",
      class04370.method_42399(),
      (var0, var1x) -> N(var0, class00392.N("options.chunks", var1x)),
      new class04369(2, 128, true),
      128,
      var1x -> {
         N((Consumer<class03063>)(var0 -> var0.G().N()));
         this.yy();
      }
   );
   private static final class00392 Nr = class00392.L("options.weatherRadius.tooltip");
   private final class04370<Integer> yN = new class04370<>(
      "options.weatherRadius",
      class04370.method_42717(Nr),
      (var0, var1x) -> N(var0, class00392.N("options.blocks", var1x)),
      new class04369(3, 10, true),
      10,
      var1x -> this.yy()
   );
   private static final class00392 yy = class00392.L("options.cutoutLeaves.tooltip");
   private final class04370<Boolean> yL = class04370.method_41750("options.cutoutLeaves", class04370.method_42717(yy), true, var1x -> {
      N(class03063::u);
      this.yy();
   });
   private static final class00392 yu = class00392.L("options.vignette.tooltip");
   private final class04370<Boolean> yi = class04370.method_41749("options.vignette", class04370.method_42717(yu), true);
   private static final class00392 yR = class00392.L("options.improvedTransparency.tooltip");
   private final class04370<Boolean> yM = class04370.method_41750("options.improvedTransparency", class04370.method_42717(yR), false, var1x -> {
      class01246 class01246 = class06202.Nq().Ns();
      if (var1x && class01246.y()) {
         class01246.L();
      } else {
         N(class03063::u);
         this.yy();
      }
   });
   private final class04370<Boolean> yB = class04370.method_41751("options.ao", true, var1x -> {
      N(class03063::u);
      this.yy();
   });
   private static final class00392 yZ = class00392.L("options.chunkFade.tooltip");
   private final class04370<Double> yz = new class04370<>(
      "options.chunkFade",
      class04370.method_42717(yZ),
      (var0, var1x) -> var1x <= 0.0
         ? class00392.L("options.chunkFade.none")
         : class00392.N("options.chunkFade.seconds", String.format(Locale.ROOT, "%.2f", var1x)),
      new class04369(0, 40).N(var0 -> var0 / 20.0, var0 -> (int)(var0 * 20.0), true),
      Codec.doubleRange(0.0, 2.0),
      0.75,
      var0 -> {}
   );
   private static final class00392 yU = class00392.L("options.prioritizeChunkUpdates.none.tooltip");
   private static final class00392 yE = class00392.L("options.prioritizeChunkUpdates.byPlayer.tooltip");
   private static final class00392 yW = class00392.L("options.prioritizeChunkUpdates.nearby.tooltip");
   private final class04370<class01825> ym = new class04370<>("options.prioritizeChunkUpdates", var0 -> {
      return switch (var0) {
         case field_34788 -> class04141.N(yU);
         case field_34789 -> class04141.N(yE);
         case field_34790 -> class04141.N(yW);
      };
   }, (var0, var1x) -> var1x.N(), new class04380<>(Arrays.asList(class01825.values()), class01825.field_64424), class01825.field_34788, var1x -> this.yy());
   public List<String> Z = Lists.newArrayList();
   public List<String> z = Lists.newArrayList();
   private final class04370<class08027> yP = new class04370<>(
      "options.chat.visibility",
      class04370.method_42399(),
      (var0, var1x) -> var1x.N(),
      new class04380<>(Arrays.asList(class08027.values()), class08027.field_64374),
      class08027.field_7538,
      var0 -> {}
   );
   private final class04370<Double> ys = new class04370<>(
      "options.chat.opacity",
      class04370.method_42399(),
      (var0, var1x) -> N(var0, var1x * 0.9 + 0.1),
      class04350.field_37875,
      1.0,
      var0 -> ((class01056)class06202.Nq().i_6).i().y()
   );
   private final class04370<Double> yT = new class04370<>(
      "options.chat.line_spacing", class04370.method_42399(), class05630::N, class04350.field_37875, 0.0, var0 -> {}
   );
   private static final class00392 yb = class00392.L("options.accessibility.menu_background_blurriness.tooltip");
   private static final int yj = 5;
   private final class04370<Integer> yv = new class04370<>(
      "options.accessibility.menu_background_blurriness", class04370.method_42717(yb), class05630::y, new class04369(0, 10), 5, var1x -> this.yy()
   );
   private final class04370<Double> yn = new class04370<>(
      "options.accessibility.text_background_opacity",
      class04370.method_42399(),
      class05630::N,
      class04350.field_37875,
      0.5,
      var0 -> ((class01056)class06202.Nq().i_6).i().y()
   );
   private final class04370<Double> yt = new class04370<>(
      "options.accessibility.panorama_speed", class04370.method_42399(), class05630::N, class04350.field_37875, 1.0, var0 -> {}
   );
   private static final class00392 yG = class00392.L("options.accessibility.high_contrast.tooltip");
   private final class04370<Boolean> yl = class04370.method_41750("options.accessibility.high_contrast", class04370.method_42717(yG), false, var1x -> {
      class01623 class01623 = class06202.Nq().t();
      boolean flag1 = class01623.i().contains("high_contrast");
      if (!flag1 && var1x) {
         if (class01623.N("high_contrast")) {
            this.N(class01623);
         }
      } else if (flag1 && !var1x && class01623.y("high_contrast")) {
         this.N(class01623);
      }
   });
   private static final class00392 yd = class00392.L("options.accessibility.high_contrast_block_outline.tooltip");
   private final class04370<Boolean> yw = class04370.method_41749("options.accessibility.high_contrast_block_outline", class04370.method_42717(yd), false);
   private final class04370<Boolean> yk = class04370.method_41749(
      "options.accessibility.narrator_hotkey",
      class04370.method_42717(
         class06604.N ? class00392.L("options.accessibility.narrator_hotkey.mac.tooltip") : class00392.L("options.accessibility.narrator_hotkey.tooltip")
      ),
      true
   );
   @Nullable
   public String U;
   public boolean E;
   public boolean W;
   public boolean m = true;
   private final Set<class08030> yY = EnumSet.allOf(class08030.class);
   private final class04370<class07070> yQ = new class04370<>(
      "options.mainHand",
      class04370.method_42399(),
      (var0, var1x) -> var1x.y(),
      new class04380<>(Arrays.asList(class07070.values()), class07070.field_45121),
      class07070.field_6183,
      var0 -> {}
   );
   public int P;
   public int s;
   private final class04370<Double> yO = new class04370<>(
      "options.chat.scale",
      class04370.method_42399(),
      (var0, var1x) -> (class00392)(var1x == 0.0 ? class05220.N(var0, false) : N(var0, var1x.doubleValue())),
      class04350.field_37875,
      1.0,
      var0 -> ((class01056)class06202.Nq().i_6).i().y()
   );
   private final class04370<Double> yg = new class04370<>(
      "options.chat.width",
      class04370.method_42399(),
      (var0, var1x) -> L(var0, class06451.N(var1x)),
      class04350.field_37875,
      1.0,
      var0 -> ((class01056)class06202.Nq().i_6).i().y()
   );
   private final class04370<Double> yI = new class04370<>(
      "options.chat.height.unfocused",
      class04370.method_42399(),
      (var0, var1x) -> L(var0, class06451.y(var1x)),
      class04350.field_37875,
      class06451.R(),
      var0 -> ((class01056)class06202.Nq().i_6).i().y()
   );
   private final class04370<Double> yJ = new class04370<>(
      "options.chat.height.focused",
      class04370.method_42399(),
      (var0, var1x) -> L(var0, class06451.y(var1x)),
      class04350.field_37875,
      1.0,
      var0 -> ((class01056)class06202.Nq().i_6).i().y()
   );
   private final class04370<Double> yo = new class04370<>(
      "options.chat.delay_instant",
      class04370.method_42399(),
      (var0, var1x) -> var1x <= 0.0 ? class00392.L("options.chat.delay_none") : class00392.N("options.chat.delay", String.format(Locale.ROOT, "%.1f", var1x)),
      new class04369(0, 60).N(var0 -> var0 / 10.0, var0 -> (int)(var0 * 10.0), true),
      Codec.doubleRange(0.0, 6.0),
      0.0,
      var0 -> class06202.Nq().N().N(var0)
   );
   private static final class00392 yq = class00392.L("options.notifications.display_time.tooltip");
   private final class04370<Double> yK = new class04370<>(
      "options.notifications.display_time",
      class04370.method_42717(yq),
      (var0, var1x) -> N(var0, class00392.N("options.multiplier", var1x)),
      new class04369(5, 100).N(var0 -> var0 / 10.0, var0 -> (int)(var0 * 10.0), true),
      Codec.doubleRange(0.5, 10.0),
      1.0,
      var0 -> {}
   );
   private final class04370<Integer> yV = new class04370<>(
      "options.mipmapLevels",
      class04370.method_42399(),
      (var0, var1x) -> (class00392)(var1x == 0 ? class05220.N(var0, false) : N(var0, var1x.intValue())),
      new class04369(0, 4),
      4,
      var1x -> this.yy()
   );
   private static final class00392 ye = class00392.L("options.maxAnisotropy.tooltip");
   private final class04370<Integer> yH = new class04370<>(
      "options.maxAnisotropy",
      class04370.method_42717(ye),
      (var0, var1x) -> (class00392)(var1x == 0 ? class05220.N(var0, false) : N(var0, class00392.N("options.multiplier", Integer.toString(1 << var1x)))),
      new class04369(1, 3),
      2,
      var1x -> {
         this.yy();
         N(class03063::B);
      }
   );
   private static final class00392 yc = class00392.L("options.textureFiltering.none.tooltip");
   private static final class00392 yX = class00392.L("options.textureFiltering.rgss.tooltip");
   private static final class00392 ya = class00392.L("options.textureFiltering.anisotropic.tooltip");
   private final class04370<class06532> yp = new class04370<>("options.textureFiltering", var0 -> {
      return switch (var0) {
         case field_64663 -> class04141.N(yc);
         case field_64664 -> class04141.N(yX);
         case field_64665 -> class04141.N(ya);
      };
   }, (var0, var1x) -> var1x.N(), new class04380<>(Arrays.asList(class06532.values()), class06532.field_64666), class06532.field_64663, var1x -> {
      this.yy();
      N(class03063::B);
   });
   private boolean yF = true;
   private final class04370<class01307> yA = new class04370<>(
      "options.attackIndicator",
      class04370.method_42399(),
      (var0, var1x) -> var1x.N(),
      new class04380<>(Arrays.asList(class01307.values()), class01307.field_64418),
      class01307.field_18152,
      var0 -> {}
   );
   public class08966 T = class08966.field_5650;
   public boolean b = false;
   private final class04370<Integer> yf = new class04370<>("options.biomeBlendRadius", class04370.method_42399(), (var0, var1x) -> {
      int ix = var1x * 2 + 1;
      return N(var0, class00392.L("options.biomeBlendRadius." + ix));
   }, new class04369(0, 7, false), 2, var1x -> {
      N(class03063::u);
      this.yy();
   });
   private final class04370<Double> yC = new class04370<>(
      "options.mouseWheelSensitivity",
      class04370.method_42399(),
      (var0, var1x) -> N(var0, class00392.y(String.format(Locale.ROOT, "%.2f", var1x))),
      new class04369(-200, 100).N(class05630::L, class05630::N, false),
      Codec.doubleRange(L(-200), L(100)),
      L(0),
      var0 -> {}
   );
   private final class04370<Boolean> yS = class04370.method_41751("options.rawMouseInput", true, var0 -> {
      class08844 class08844 = class06202.Nq().Nt();
      if (class08844 != null) {
         class08844.y(var0);
      }
   });
   private static final class00392 yx = class00392.L("options.allowCursorChanges.tooltip");
   private final class04370<Boolean> yD = class04370.method_41750("options.allowCursorChanges", class04370.method_42717(yx), true, var0 -> {
      class08844 class08844 = class06202.Nq().Nt();
      if (class08844 != null) {
         class08844.L(var0);
      }
   });
   public int j = 1;
   private final class04370<Boolean> yh = class04370.method_42402("options.autoJump", false);
   private static final class00392 yr = class00392.L("options.rotateWithMinecart.tooltip");
   private final class04370<Boolean> LN = class04370.method_41749("options.rotateWithMinecart", class04370.method_42717(yr), false);
   private final class04370<Boolean> Ly = class04370.method_42402("options.operatorItemsTab", false);
   private final class04370<Boolean> LL = class04370.method_42402("options.autoSuggestCommands", true);
   private final class04370<Boolean> Lu = class04370.method_42402("options.chat.color", true);
   private final class04370<Boolean> Li = class04370.method_42402("options.chat.links", true);
   private final class04370<Boolean> LR = class04370.method_42402("options.chat.links.prompt", true);
   private final class04370<Boolean> LM = class04370.method_41751("options.vsync", true, var0 -> {
      if (class06202.Nq().Nt() != null) {
         class06202.Nq().Nt().N(var0);
      }
   });
   private final class04370<Boolean> LB = class04370.method_41750("options.entityShadows", class04370.method_42399(), true, var1x -> this.yy());
   private final class04370<Boolean> LZ = class04370.method_41751("options.forceUnicodeFont", false, var0 -> Nr());
   private final class04370<Boolean> Lz = class04370.method_41750(
      "options.japaneseGlyphVariants", class04370.method_42717(class00392.L("options.japaneseGlyphVariants.tooltip")), yN(), var0 -> Nr()
   );
   private final class04370<Boolean> LU = class04370.method_42402("options.invertMouseX", false);
   private final class04370<Boolean> LE = class04370.method_42402("options.invertMouseY", false);
   private final class04370<Boolean> LW = class04370.method_42402("options.discrete_mouse_scroll", false);
   private static final class00392 Lm = class00392.L("options.realmsNotifications.tooltip");
   private final class04370<Boolean> LP = class04370.method_41749("options.realmsNotifications", class04370.method_42717(Lm), true);
   private static final class00392 Ls = class00392.L("options.allowServerListing.tooltip");
   private final class04370<Boolean> LT = class04370.method_41750("options.allowServerListing", class04370.method_42717(Ls), true, var0 -> {});
   private final class04370<Boolean> Lb = class04370.method_41750(
      "options.reducedDebugInfo", class04370.method_42399(), false, var0 -> ((class05731)class06202.Nq().L_0).i()
   );
   private final Map<class04911, class04370<Double>> Lj = class07536.N_74(class04911.class, var1x -> this.N("soundCategory." + var1x.N(), var1x));
   private static final class00392 Lv = class00392.L("options.showSubtitles.tooltip");
   private final class04370<Boolean> Ln = class04370.method_41749("options.showSubtitles", class04370.method_42717(Lv), false);
   private static final class00392 Lt = class00392.L("options.directionalAudio.on.tooltip");
   private static final class00392 LG = class00392.L("options.directionalAudio.off.tooltip");
   private final class04370<Boolean> Ll = class04370.method_41750(
      "options.directionalAudio", var0 -> var0 ? class04141.N(Lt) : class04141.N(LG), false, var0 -> {
         class09033 class09033 = class06202.Nq().Nr();
         class09033.Z();
         class09033.N(class00040.N(class04909.OK, 1.0F));
      }
   );
   private final class04370<Boolean> Ld = new class04370<>(
      "options.accessibility.text_background",
      class04370.method_42399(),
      (var0, var1x) -> var1x ? class00392.L("options.accessibility.text_background.chat") : class00392.L("options.accessibility.text_background.everywhere"),
      class04370.field_38278,
      true,
      var0 -> {}
   );
   private final class04370<Boolean> Lw = class04370.method_42402("options.touchscreen", false);
   private final class04370<Boolean> Lk = class04370.method_41751("options.fullscreen", false, var1x -> {
      class06202 class06202 = class06202.Nq();
      if (class06202.Nt() != null && class06202.Nt().Z() != var1x) {
         class06202.Nt().M();
         this.NP().method_41748(class06202.Nt().Z());
      }
   });
   private final class04370<Boolean> LY = class04370.method_42402("options.viewBobbing", true);
   private static final class00392 LQ = class00392.L("options.key.toggle");
   private static final class00392 LO = class00392.L("options.key.hold");
   private final class04370<Boolean> Lg = new class04370<>(
      "key.sneak", class04370.method_42399(), (var0, var1x) -> var1x ? LQ : LO, class04370.field_38278, false, var0 -> {}
   );
   private final class04370<Boolean> LI = new class04370<>(
      "key.sprint", class04370.method_42399(), (var0, var1x) -> var1x ? LQ : LO, class04370.field_38278, false, var0 -> {}
   );
   private final class04370<Boolean> LJ = new class04370<>(
      "key.attack", class04370.method_42399(), (var0, var1x) -> var1x ? LQ : LO, class04370.field_38278, false, var0 -> {}
   );
   private final class04370<Boolean> Lo = new class04370<>(
      "key.use", class04370.method_42399(), (var0, var1x) -> var1x ? LQ : LO, class04370.field_38278, false, var0 -> {}
   );
   private static final class00392 Lq = class00392.L("options.sprintWindow.tooltip");
   private final class04370<Integer> LK = new class04370<>(
      "options.sprintWindow",
      class04370.method_42717(Lq),
      (var0, var1x) -> var1x == 0 ? N(var0, class00392.L("options.off")) : N(var0, class00392.N("options.value", var1x)),
      new class04369(0, 10),
      7,
      var0 -> {}
   );
   public boolean v;
   private static final class00392 LV = class00392.L("options.hideMatchedNames.tooltip");
   private final class04370<Boolean> Le = class04370.method_41749("options.hideMatchedNames", class04370.method_42717(LV), true);
   private final class04370<Boolean> LH = class04370.method_42402("options.autosaveIndicator", true);
   private static final class00392 Lc = class00392.L("options.onlyShowSecureChat.tooltip");
   private final class04370<Boolean> LX = class04370.method_41749("options.onlyShowSecureChat", class04370.method_42717(Lc), false);
   private static final class00392 La = class00392.L("options.chat.drafts.tooltip");
   private final class04370<Boolean> Lp = class04370.method_41749("options.chat.drafts", class04370.method_42717(La), false);
   public final class06428 n = new class06428("key.forward", 87, class06384.y);
   public final class06428 t = new class06428("key.left", 65, class06384.y);
   public final class06428 G = new class06428("key.back", 83, class06384.y);
   public final class06428 l = new class06428("key.right", 68, class06384.y);
   public final class06428 d = new class06428("key.jump", 32, class06384.y);
   public final class06428 w = new class05926("key.sneak", 340, class06384.y, this.Lg::method_41753, true);
   public final class06428 k = new class05926("key.sprint", 341, class06384.y, this.LI::method_41753, true);
   public final class06428 Y = new class06428("key.inventory", 69, class06384.R);
   public final class06428 Q = new class06428("key.swapOffhand", 70, class06384.R);
   public final class06428 O = new class06428("key.drop", 81, class06384.R);
   public final class06428 g = new class05926("key.use", class04648.field_1672, 1, class06384.i, this.Lo::method_41753, false);
   public final class06428 I = new class05926("key.attack", class04648.field_1672, 0, class06384.i, this.LJ::method_41753, true);
   public final class06428 J = new class06428("key.pickItem", class04648.field_1672, 2, class06384.i);
   public final class06428 o = new class06428("key.chat", 84, class06384.u);
   public final class06428 q = new class06428("key.playerlist", 258, class06384.u);
   public final class06428 K = new class06428("key.command", 47, class06384.u);
   public final class06428 V = new class06428("key.socialInteractions", 80, class06384.u);
   public final class06428 e = new class06428("key.screenshot", 291, class06384.L);
   public final class06428 H = new class06428("key.togglePerspective", 294, class06384.L);
   public final class06428 c = new class06428("key.smoothCamera", class04655.yI.y(), class06384.L);
   public final class06428 X = new class06428("key.fullscreen", 300, class06384.L);
   public final class06428 a = new class06428("key.advancements", 76, class06384.L);
   public final class06428 p = new class06428("key.quickActions", 71, class06384.L);
   public final class06428 F = new class06428("key.toggleGui", 290, class06384.L);
   public final class06428 A = new class06428("key.toggleSpectatorShaderEffects", 293, class06384.L);
   public final class06428[] f = new class06428[]{
      new class06428("key.hotbar.1", 49, class06384.R),
      new class06428("key.hotbar.2", 50, class06384.R),
      new class06428("key.hotbar.3", 51, class06384.R),
      new class06428("key.hotbar.4", 52, class06384.R),
      new class06428("key.hotbar.5", 53, class06384.R),
      new class06428("key.hotbar.6", 54, class06384.R),
      new class06428("key.hotbar.7", 55, class06384.R),
      new class06428("key.hotbar.8", 56, class06384.R),
      new class06428("key.hotbar.9", 57, class06384.R)
   };
   public final class06428 C = new class06428("key.saveToolbarActivator", 67, class06384.M);
   public final class06428 S = new class06428("key.loadToolbarActivator", 88, class06384.M);
   public final class06428 x = new class06428("key.spectatorOutlines", class04655.yI.y(), class06384.B);
   public final class06428 D = new class06428("key.spectatorHotbar", class04648.field_1672, 2, class06384.B);
   public final class06428 h = new class06428("key.debug.overlay", class04648.field_1668, 292, class06384.Z, -2);
   public final class06428 r = new class06428("key.debug.modifier", class04648.field_1668, 292, class06384.Z, -1);
   public final class06428 NN = new class06428("key.debug.crash", class04648.field_1668, 67, class06384.Z);
   public final class06428 Ny = new class06428("key.debug.reloadChunk", class04648.field_1668, 65, class06384.Z);
   public final class06428 NL = new class06428("key.debug.showHitboxes", class04648.field_1668, 66, class06384.Z);
   public final class06428 Nu = new class06428("key.debug.clearChat", class04648.field_1668, 68, class06384.Z);
   public final class06428 Ni = new class06428("key.debug.showChunkBorders", class04648.field_1668, 71, class06384.Z);
   public final class06428 NR = new class06428("key.debug.showAdvancedTooltips", class04648.field_1668, 72, class06384.Z);
   public final class06428 NM = new class06428("key.debug.copyRecreateCommand", class04648.field_1668, 73, class06384.Z);
   public final class06428 NB = new class06428("key.debug.spectate", class04648.field_1668, 78, class06384.Z);
   public final class06428 NZ = new class06428("key.debug.switchGameMode", class04648.field_1668, 293, class06384.Z);
   public final class06428 Nz = new class06428("key.debug.debugOptions", class04648.field_1668, 295, class06384.Z);
   public final class06428 NU = new class06428("key.debug.focusPause", class04648.field_1668, 80, class06384.Z);
   public final class06428 NE = new class06428("key.debug.dumpDynamicTextures", class04648.field_1668, 83, class06384.Z);
   public final class06428 NW = new class06428("key.debug.reloadResourcePacks", class04648.field_1668, 84, class06384.Z);
   public final class06428 Nm = new class06428("key.debug.profiling", class04648.field_1668, 76, class06384.Z);
   public final class06428 NP = new class06428("key.debug.copyLocation", class04648.field_1668, 67, class06384.Z);
   public final class06428 Ns = new class06428("key.debug.dumpVersion", class04648.field_1668, 86, class06384.Z);
   public final class06428 NT = new class06428("key.debug.profilingChart", class04648.field_1668, 49, class06384.Z, 1);
   public final class06428 Nb = new class06428("key.debug.fpsCharts", class04648.field_1668, 50, class06384.Z, 2);
   public final class06428 Nj = new class06428("key.debug.networkCharts", class04648.field_1668, 51, class06384.Z, 3);
   public final class06428[] Nv = new class06428[]{
      this.Ny,
      this.NL,
      this.Nu,
      this.NN,
      this.Ni,
      this.NR,
      this.NM,
      this.NB,
      this.NZ,
      this.Nz,
      this.NU,
      this.NE,
      this.NW,
      this.Nm,
      this.NP,
      this.Ns,
      this.NT,
      this.Nb,
      this.Nj
   };
   public class06428[] Nn = Stream.of(
         new class06428[]{
            this.I,
            this.g,
            this.n,
            this.t,
            this.G,
            this.l,
            this.d,
            this.w,
            this.k,
            this.O,
            this.Y,
            this.o,
            this.q,
            this.J,
            this.K,
            this.V,
            this.F,
            this.A,
            this.e,
            this.H,
            this.c,
            this.X,
            this.x,
            this.D,
            this.Q,
            this.C,
            this.S,
            this.a,
            this.p,
            this.h,
            this.r
         },
         this.f,
         this.Nv
      )
      .flatMap(Stream::of)
      .toArray(class06428[]::new);
   protected class06202 Nt;
   private final File LF;
   public boolean NG;
   private class05455 LA = class05455.field_26664;
   public String Nl = "";
   public boolean Nd;
   private final class04370<Integer> Lf = new class04370<>("options.fov", class04370.method_42399(), (var0, var1x) -> {
      return switch (var1x) {
         case 70 -> N(var0, class00392.L("options.fov.min"));
         case 110 -> N(var0, class00392.L("options.fov.max"));
         default -> N(var0, var1x.intValue());
      };
   }, new class04369(30, 110), Codec.DOUBLE.xmap(var0 -> (int)(var0 * 40.0 + 70.0), var0 -> (var0.intValue() - 70.0) / 40.0), 70, var0 -> N(class03063::W));
   private static final class00392 LC = class00392.N(
      "options.telemetry.button.tooltip", class00392.L("options.telemetry.state.minimal"), class00392.L("options.telemetry.state.all")
   );
   private final class04370<Boolean> LS = class04370.method_47604("options.telemetry.button", class04370.method_42717(LC), (var0, var1x) -> {
      class06202 class06202 = class06202.Nq();
      if (!class06202.NC()) {
         return class00392.L("options.telemetry.state.none");
      } else {
         return var1x && class06202.Nk() ? class00392.L("options.telemetry.state.all") : class00392.L("options.telemetry.state.minimal");
      }
   }, false, var0 -> {});
   private static final class00392 Lx = class00392.L("options.screenEffectScale.tooltip");
   private final class04370<Double> LD = new class04370<>(
      "options.screenEffectScale", class04370.method_42717(Lx), class05630::y, class04350.field_37875, 1.0, var0 -> {}
   );
   private static final class00392 Lh = class00392.L("options.fovEffectScale.tooltip");
   private final class04370<Double> Lr = new class04370<>(
      "options.fovEffectScale",
      class04370.method_42717(Lh),
      class05630::y,
      class04350.field_37875.N(class04995::E, Math::sqrt),
      Codec.doubleRange(0.0, 1.0),
      1.0,
      var0 -> {}
   );
   private static final class00392 uN = class00392.L("options.darknessEffectScale.tooltip");
   private final class04370<Double> uy = new class04370<>(
      "options.darknessEffectScale", class04370.method_42717(uN), class05630::y, class04350.field_37875.N(class04995::E, Math::sqrt), 1.0, var0 -> {}
   );
   private static final class00392 uL = class00392.L("options.glintSpeed.tooltip");
   private final class04370<Double> uu = new class04370<>(
      "options.glintSpeed", class04370.method_42717(uL), class05630::y, class04350.field_37875, 0.5, var0 -> {}
   );
   private static final class00392 ui = class00392.L("options.glintStrength.tooltip");
   private final class04370<Double> uR = new class04370<>(
      "options.glintStrength", class04370.method_42717(ui), class05630::y, class04350.field_37875, 0.75, var0 -> {}
   );
   private static final class00392 uM = class00392.L("options.damageTiltStrength.tooltip");
   private final class04370<Double> uB = new class04370<>(
      "options.damageTiltStrength", class04370.method_42717(uM), class05630::y, class04350.field_37875, 1.0, var0 -> {}
   );
   private final class04370<Double> uZ = new class04370<>("options.gamma", class04370.method_42399(), (var0, var1x) -> {
      int ix = (int)(var1x * 100.0);
      if (ix == 0) {
         return N(var0, class00392.L("options.gamma.min"));
      } else if (ix == 50) {
         return N(var0, class00392.L("options.gamma.default"));
      } else {
         return ix == 100 ? N(var0, class00392.L("options.gamma.max")) : N(var0, ix);
      }
   }, class04350.field_37875, 0.5, var0 -> {});
   public static final int Nw = 0;
   private static final int uz = 2147483646;
   private final class04370<Integer> uU = new class04370<>(
      "options.guiScale",
      class04370.method_42399(),
      (var0, var1x) -> var1x == 0 ? class00392.L("options.guiScale.auto") : class00392.y(Integer.toString(var1x)),
      new class04343(0, () -> {
         class06202 class06202 = class06202.Nq();
         return !class06202.r() ? 2147483646 : class06202.Nt().N(0, class06202.NR());
      }, 2147483646),
      0,
      var1x -> this.Nt.V()
   );
   private final class04370<class01315> uE = new class04370<>(
      "options.particles",
      class04370.method_42399(),
      (var0, var1x) -> var1x.N(),
      new class04380<>(Arrays.asList(class01315.values()), class01315.field_64259),
      class01315.field_18197,
      var1x -> this.yy()
   );
   private final class04370<class01299> uW = new class04370<>(
      "options.narrator",
      class04370.method_42399(),
      (var1x, var2x) -> (class00392)(this.Nt.NT().N() ? var2x.y() : class00392.L("options.narrator.notavailable")),
      new class04380<>(Arrays.asList(class01299.values()), class01299.field_64423),
      class01299.field_18176,
      var1x -> this.Nt.NT().N(var1x)
   );
   public String Nk = "en_us";
   private final class04370<String> um = new class04370<>(
      "options.audioDevice",
      class04370.method_42399(),
      (var0, var1x) -> {
         if ("".equals(var1x)) {
            return class00392.L("options.audioDevice.default");
         } else {
            return var1x.startsWith("OpenAL Soft on ") ? class00392.y(var1x.substring(class09038.L)) : class00392.y(var1x);
         }
      },
      new class04346<>(
         () -> Stream.concat(Stream.of(""), class06202.Nq().Nr().N().stream()).toList(),
         var0 -> class06202.Nq().r() && var0 != "" && !class06202.Nq().Nr().N().contains(var0) ? Optional.empty() : Optional.of(var0),
         Codec.STRING
      ),
      "",
      var0 -> {
         class09033 class09033 = class06202.Nq().Nr();
         class09033.Z();
         class09033.N(class00040.N(class04909.OK, 1.0F));
      }
   );
   public boolean NY = true;
   private static final class00392 uP = class00392.L("options.music_frequency.tooltip");
   private final class04370<class09021> us = new class04370<>(
      "options.music_frequency",
      class04370.method_42717(uP),
      (var0, var1x) -> var1x.N(),
      new class04380<>(Arrays.asList(class09021.values()), class09021.field_60800),
      class09021.field_60797,
      var0 -> class06202.Nq().A().N(var0)
   );
   private final class04370<class06535> uT = new class04370<>(
      "options.musicToast",
      var0 -> class04141.N(var0.y()),
      (var0, var1x) -> var1x.N(),
      new class04380<>(Arrays.asList(class06535.values()), class06535.field_64528),
      class06535.field_64525,
      var1x -> this.Nt.m().N(var1x)
   );
   public boolean NQ;
   public boolean NO = true;

   public class04370<Double> w() {
      return this.yt;
   }

   public class04370<Double> NY() {
      return this.LD;
   }

   private static List<String> L(String var0) {
      List list = class05001.N(y, var0, Ng);
      return (List<String>)(list != null ? list : Lists.newArrayList());
   }

   private void L(CallbackInfo var1) {
      this.Z = DefaultResourcePackStorage.process(this.Z);
   }

   public final class04370<Double> L(class04911 var1) {
      return Objects.requireNonNull(this.Lj.get(var1));
   }

   private static double L(int var0) {
      return Math.pow(10.0, var0 / 100.0);
   }

   private static class00392 L(class00392 var0, int var1) {
      return class00392.N("options.pixel_value", var0, var1);
   }

   public class04370<Boolean> L() {
      return this.Ne;
   }

   public class04370<Boolean> Nd() {
      return this.Lp;
   }

   public class04370<Boolean> Nl() {
      return this.LX;
   }

   public class04370<Double> No() {
      return this.uZ;
   }

   private static void M(String var0) {
      Config config = Config.getInstance();
      if (!config.language.equals(var0)) {
         LanguageReload.LOGGER.info("Game language ({}) and config language ({}) are different. Updating config", var0, config.language);
         config.previousLanguage = config.language;
         config.previousFallbacks = config.fallbacks;
         config.language = var0;
         config.fallbacks.clear();
         if (!var0.equals("en_us")) {
            config.fallbacks.add("en_us");
         }

         Config.save();
      }
   }

   public class04370<Double> M() {
      return this.Np;
   }

   public class04370<Boolean> P() {
      return this.yi;
   }

   public class04370<Boolean> NP() {
      return this.Lk;
   }

   public class04370<class01307> X() {
      return this.yA;
   }

   public class04370<Double> K() {
      return this.yK;
   }

   public class04370<Boolean> T() {
      return this.yB;
   }

   public class04370<Boolean> Q() {
      return this.yk;
   }

   public class05630(class06202 var1, File var2) {
      super();
      this.Nt = var1;
      this.LF = new File(var2, "options.txt");
      boolean flag = Runtime.getRuntime().maxMemory() >= 1000000000L;
      this.Nc = new class04370<>(
         "options.renderDistance",
         class04370.method_42399(),
         (var0, var1x) -> N(var0, class00392.N("options.chunks", var1x)),
         new class04369(2, flag ? 32 : 16, false),
         12,
         var1x -> {
            N(class03063::W);
            this.yy();
         }
      );
      this.NX = new class04370<>(
         "options.simulationDistance",
         class04370.method_42399(),
         (var0, var1x) -> N(var0, class00392.N("options.chunks", var1x)),
         new class04369(class07529.n ? 2 : 5, flag ? 32 : 16, false),
         12,
         var1x -> this.yy()
      );
      this.NQ = class07536.m() == class07533.field_1133;
      this.Na();
      this.N(var1, var2, null);
   }

   public class04370<Integer> B() {
      return this.NF;
   }

   public class04370<Boolean> C() {
      return this.LN;
   }

   public class04370<Boolean> D() {
      return this.Lu;
   }

   public class04370<Boolean> F() {
      return this.yS;
   }

   public class04370<Double> I() {
      return this.yg;
   }

   public class04370<Double> J() {
      return this.yI;
   }

   public class04370<Boolean> S() {
      return this.Ly;
   }

   public class04370<class01241> Z() {
      return this.Nf;
   }

   public class04370<Integer> V() {
      return this.yV;
   }

   public class04370<Integer> e() {
      return this.yH;
   }

   public class04370<Integer> i() {
      return this.Nc;
   }

   public class04370<Double> b() {
      return this.yz;
   }

   public class04370<Boolean> x() {
      return this.LL;
   }

   public class04370<Boolean> s() {
      return this.yM;
   }

   public class04370<class06532> c() {
      return this.yp;
   }

   public class04370<Double> n() {
      return this.ys;
   }

   public class04370<Boolean> h() {
      return this.Li;
   }

   public class04370<Boolean> f() {
      return this.yh;
   }

   public int l() {
      return this.G().method_41753();
   }

   public class04370<Double> d() {
      return this.yn;
   }

   public class04370<Integer> a() {
      return this.yf;
   }

   public class04370<Boolean> m() {
      return this.yL;
   }

   public class04370<Double> o() {
      return this.yJ;
   }

   public class04370<Double> p() {
      return this.yC;
   }

   public class04370<Boolean> k() {
      return this.yl;
   }

   public class04370<Double> t() {
      return this.yT;
   }

   public class04370<Double> g() {
      return this.yO;
   }

   public class04370<class08027> v() {
      return this.yP;
   }

   public class04370<class01825> j() {
      return this.ym;
   }

   public class04370<Double> q() {
      return this.yo;
   }

   public class04370<class01301> U() {
      return this.ND;
   }

   private int z(int var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17_1) ? 0 : var1;
   }

   public class04370<class02424> z() {
      return this.Nx;
   }

   public class04370<Double> u() {
      return this.NH;
   }

   public class04370<Boolean> r() {
      return this.LR;
   }

   private static class00392 y(class00392 var0, double var1) {
      return var1 == 0.0 ? N(var0, class05220.L) : N(var0, var1);
   }

   static boolean y(String var0) {
      return "false".equals(var0);
   }

   public final float y(class04911 var1) {
      return this.L(var1).method_41753().floatValue();
   }

   public void y(class01623 var1) {
      LinkedHashSet linkedhashset = Sets.newLinkedHashSet();
      Iterator iterator = this.Z.iterator();

      while (iterator.hasNext()) {
         String sx = (String)iterator.next();
         class01055 class01055 = var1.L(sx);
         if (class01055 == null && !sx.startsWith("file/")) {
            class01055 = var1.L("file/" + sx);
         }

         if (class01055 == null) {
            N.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", sx);
            iterator.remove();
         } else if (!class01055.u().N() && !this.z.contains(sx)) {
            N.warn("Removed resource pack {} from options because it is no longer compatible", sx);
            iterator.remove();
         } else if (class01055.u().N() && this.z.contains(sx)) {
            N.info("Removed resource pack {} from incompatibility list because it's now compatible", sx);
            this.z.remove(sx);
         } else {
            linkedhashset.add(class01055.M());
         }
      }

      var1.y(linkedhashset);
   }

   public void y(int var1) {
      var1 = this.z(var1);
      this.Na = var1;
   }

   public int y(float var1) {
      return class02566.N(this.N(var1), 0.0F, 0.0F, 0.0F);
   }

   public class04370<Boolean> y() {
      return this.NK;
   }

   public static class00392 y(class00392 var0, int var1) {
      return var1 == 0 ? N(var0, class05220.L) : N(var0, var1);
   }

   void y(CallbackInfo var1) {
      if (!this.LF.exists()) {
         LanguageReload.shouldSetSystemLanguage = true;
      }
   }

   public class04370<Integer> E() {
      return this.Nh;
   }

   public class04370<Boolean> A() {
      return this.yD;
   }

   private void N(class05603 var1, String var2, class04370 var3) {
      if ((Integer)var3.method_41753() == 0) {
         var3.method_41748(120);
      }

      var1.N(var2, var3);
   }

   void N(class06202 var1, File var2, CallbackInfo var3) {
      if (!LanguageReload.shouldSetSystemLanguage) {
         M(this.Nk);
      }
   }

   private boolean N(class01055 var1, Operation var2) {
      return (Boolean)var2.call(new Object[]{var1}) || var1.fabric$isHidden();
   }

   public void N(CallbackInfo var1) {
      this.Nn = KeyBindingRegistryImpl.process(this.Nn);
   }

   private void N(CallbackInfoReturnable var1) {
      if (this.Nc.method_41753() >= 4) {
         Iris.getPipelineManager().getPipeline().ifPresent(var1x -> {
            CloudSetting cloudsetting = var1x.getCloudSetting();
            switch (cloudsetting) {
               case OFF:
                  var1.setReturnValue(class01301.field_18162);
                  return;
               case FAST:
                  var1.setReturnValue(class01301.field_18163);
                  return;
               case FANCY:
                  var1.setReturnValue(class01301.field_18164);
            }
         });
      }
   }

   void N(class07001 var1, CallbackInfoReturnable var2) {
      String sx = ((class07001)var2.getReturnValue()).y("lang", "");
      if (sx.isEmpty()) {
         LanguageReload.shouldSetSystemLanguage = true;
      } else {
         M(sx);
      }
   }

   public static class00392 N(class00392 var0, int var1) {
      return N(var0, class00392.y(Integer.toString(var1)));
   }

   public static class00392 N(class00392 var0, class00392 var1) {
      return class00392.N("options.generic_value", var0, var1);
   }

   private static class00392 N(class00392 var0, double var1) {
      return class00392.N("options.percent_value", var0, (int)(var1 * 100.0));
   }

   public final float N(class04911 var1) {
      return var1 == class04911.field_15250 ? this.y(var1) : this.y(var1) * this.y(class04911.field_15250);
   }

   private static void N(Consumer<class03063> var0) {
      class03063 class03063 = (class03063)class06202.Nq().B_2;
      if (class03063 != null) {
         var0.accept(class03063);
      }
   }

   public boolean N(class08030 var1) {
      return this.yY.contains(var1);
   }

   public void N(class08030 var1, boolean var2) {
      if (var2) {
         this.yY.add(var1);
      } else {
         this.yY.remove(var1);
      }
   }

   private void N(class05603 var1) {
      this.N((class05611)var1);
      var1.N("autoJump", this.yh);
      var1.N("rotateWithMinecart", this.LN);
      var1.N("operatorItemsTab", this.Ly);
      var1.N("autoSuggestions", this.LL);
      var1.N("chatColors", this.Lu);
      var1.N("chatLinks", this.Li);
      var1.N("chatLinksPrompt", this.LR);
      var1.N("discrete_mouse_scroll", this.LW);
      var1.N("invertXMouse", this.LU);
      var1.N("invertYMouse", this.LE);
      var1.N("realmsNotifications", this.LP);
      var1.N("showSubtitles", this.Ln);
      var1.N("directionalAudio", this.Ll);
      var1.N("touchscreen", this.Lw);
      var1.N("bobView", this.LY);
      var1.N("toggleCrouch", this.Lg);
      var1.N("toggleSprint", this.LI);
      var1.N("toggleAttack", this.LJ);
      var1.N("toggleUse", this.Lo);
      var1.N("sprintWindow", this.LK);
      var1.N("darkMojangStudiosBackground", this.No);
      var1.N("hideLightningFlashes", this.NK);
      var1.N("hideSplashTexts", this.Ne);
      var1.N("mouseSensitivity", this.NH);
      var1.N("damageTiltStrength", this.uB);
      var1.N("highContrast", this.yl);
      var1.N("highContrastBlockOutline", this.yw);
      var1.N("narratorHotkey", this.yk);
      this.Z = var1.N("resourcePacks", this.Z, class05630::L, y::toJson);
      this.z = var1.N("incompatibleResourcePacks", this.z, class05630::L, y::toJson);
      this.Nl = var1.N("lastServer", this.Nl);
      this.Nk = var1.N("lang", this.Nk);
      var1.N("chatVisibility", this.yP);
      var1.N("chatOpacity", this.ys);
      var1.N("chatLineSpacing", this.yT);
      var1.N("textBackgroundOpacity", this.yn);
      var1.N("backgroundForChatOnly", this.Ld);
      this.E = var1.N("hideServerAddress", this.E);
      this.W = var1.N("advancedItemTooltips", this.W);
      this.m = var1.N("pauseOnLostFocus", this.m);
      this.P = var1.N("overrideWidth", this.P);
      this.s = var1.N("overrideHeight", this.s);
      var1.N("chatHeightFocused", this.yJ);
      var1.N("chatDelay", this.yo);
      var1.N("chatHeightUnfocused", this.yI);
      var1.N("chatScale", this.yO);
      var1.N("chatWidth", this.yg);
      var1.N("notificationDisplayTime", this.yK);
      this.yF = var1.N("useNativeTransport", this.yF);
      var1.N("mainHand", this.yQ);
      var1.N("attackIndicator", this.yA);
      this.T = var1.N("tutorialStep", this.T, class08966::N, class08966::N);
      var1.N("mouseWheelSensitivity", this.yC);
      var1.N("rawMouseInput", this.yS);
      var1.N("allowCursorChanges", this.yD);
      this.j = var1.N("glDebugVerbosity", this.j);
      this.v = var1.N("skipMultiplayerWarning", this.v);
      var1.N("hideMatchedNames", this.Le);
      this.b = var1.N("joinedFirstServer", this.b);
      this.NQ = var1.N("syncChunkWrites", this.NQ);
      var1.N("showAutosaveIndicator", this.LH);
      var1.N("allowServerListing", this.LT);
      var1.N("onlyShowSecureChat", this.LX);
      var1.N("saveChatDrafts", this.Lp);
      var1.N("panoramaScrollSpeed", this.yt);
      var1.N("telemetryOptInExtra", this.LS);
      this.NY = var1.N("onboardAccessibility", this.NY);
      var1.N("menuBackgroundBlurriness", this.yv);
      this.NO = var1.N("startedCleanly", this.NO);
      var1.N("musicToast", this.uT);
      var1.N("musicFrequency", this.us);

      for (class06428 class06428 : this.Nn) {
         String sx = class06428.s();
         String s1 = var1.N("key_" + class06428.U(), sx);
         if (!sx.equals(s1)) {
            class06428.y(class04655.N(s1));
         }
      }

      for (class04911 class04911 : class04911.values()) {
         var1.N("soundCategory_" + class04911.N(), this.Lj.get(class04911));
      }

      for (class08030 class08030 : class08030.values()) {
         boolean flag = this.yY.contains(class08030);
         boolean flag1 = var1.N("modelPart_" + class08030.L(), flag);
         if (flag1 != flag) {
            this.N(class08030, flag1);
         }
      }
   }

   static boolean N(String var0) {
      return "true".equals(var0);
   }

   private class07001 N(class07001 var1) {
      int ix = 0;

      try {
         ix = var1.Z("version").map(Integer::parseInt).orElse(0);
      } catch (RuntimeException runtimeexception) {
      }

      class07001 class07001x;
      class07001 class07001x = class07001x = class05715.field_19216.N(this.Nt.Nh(), var1, ix);
      this.N(var1, new CallbackInfoReturnable("", false, class07001x));
      return class07001x;
   }

   private class04370<Double> N(String var1, class04911 var2) {
      return new class04370<>(var1, class04370.method_42399(), class05630::y, class04350.field_37875, 1.0, var2x -> {
         class06202 class06202 = class06202.Nq();
         class09033 class09033 = class06202.Nr();
         if ((var2 == class04911.field_15250 || var2 == class04911.field_15253) && this.N(class04911.field_15253) > 0.0F) {
            class06202.A().y();
         }

         class09033.N(var2);
         if ((class03448)class06202.T_3 == null) {
            class06977.N(class09033, var2, var2x.floatValue());
         }
      });
   }

   public void N(class05455 var1) {
      this.LA = var1;
   }

   public float N(float var1) {
      return this.Ld.method_41753() ? var1 : this.d().method_41753().floatValue();
   }

   public int N(int var1) {
      return this.Ld.method_41753() ? var1 : class02566.N(this.yn.method_41753().floatValue(), 0.0F, 0.0F, 0.0F);
   }

   private void N(class05611 var1) {
      var1.N("ao", this.yB);
      var1.N("biomeBlendRadius", this.yf);
      var1.N("chunkSectionFadeInTime", this.yz);
      var1.N("cutoutLeaves", this.yL);
      var1.N("enableVsync", this.LM);
      var1.N("entityDistanceScaling", this.Np);
      var1.N("entityShadows", this.LB);
      var1.N("forceUnicodeFont", this.LZ);
      var1.N("japaneseGlyphVariants", this.Lz);
      var1.N("fov", this.Lf);
      var1.N("fovEffectScale", this.Lr);
      var1.N("darknessEffectScale", this.uy);
      var1.N("glintSpeed", this.uu);
      var1.N("glintStrength", this.uR);
      var1.N("graphicsPreset", this.Nf);
      var1.N("prioritizeChunkUpdates", this.ym);
      var1.N("fullscreen", this.Lk);
      var1.N("gamma", this.uZ);
      var1.N("guiScale", this.uU);
      var1.N("maxAnisotropyBit", this.yH);
      var1.N("textureFiltering", this.yp);
      var1.N("maxFps", this.NF);
      var1.N("improvedTransparency", this.yM);
      var1.N("inactivityFpsLimit", this.Nx);
      var1.N("mipmapLevels", this.yV);
      var1.N("narrator", this.uW);
      var1.N("particles", this.uE);
      var1.N("reducedDebugInfo", this.Lb);
      var1.N("renderClouds", this.ND);
      var1.N("cloudRange", this.Nh);
      var1.N("renderDistance", this.Nc);
      var1.N("simulationDistance", this.NX);
      var1.N("screenEffectScale", this.LD);
      var1.N("soundDevice", this.um);
      var1.N("vignette", this.yi);
      var1.N("weatherRadius", this.yN);
   }

   public void N(class01241 var1) {
      this.NA = true;
      var1.N(this.Nt);
      this.NA = false;
   }

   public class04370<Boolean> N() {
      return this.No;
   }

   public void N(class01623 var1) {
      ImmutableList immutablelist = ImmutableList.copyOf(this.Z);
      this.Z.clear();
      this.z.clear();

      for (class01055 class01055 : var1.M()) {
         if (!this.N(class01055, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_3288]");
            return ((class01055)var0[0]).z();
         })) {
            this.Z.add(class01055.M());
            if (!class01055.u().N()) {
               this.z.add(class01055.M());
            }
         }
      }

      this.Np();
      ImmutableList immutablelist1 = ImmutableList.copyOf(this.Z);
      if (!immutablelist1.equals(immutablelist)) {
         this.Nt.yy();
      }
   }

   private static int N(double var0) {
      return class04995.N(Math.log10(var0) * 100.0);
   }

   public void NA() {
      if ((class04453)this.Nt.T_4 != null) {
         ((class01683)((class04453)this.Nt.T_4).y_0).N(this.NF());
      }
   }

   public class04370<Integer> W() {
      return this.yN;
   }

   public class04370<Integer> R() {
      return this.NX;
   }

   public class04370<Boolean> NT() {
      return this.Lg;
   }

   public class04370<Boolean> Ni() {
      return this.LU;
   }

   public class04370<class07070> O() {
      return this.yQ;
   }

   public class04370<Boolean> Nu() {
      return this.Lz;
   }

   public int H() {
      return Math.min(1 << this.yH.method_41753(), RenderSystem.getDevice().getMaxSupportedAnisotropy());
   }

   public String ND() {
      ArrayList arraylist = new ArrayList();
      this.N(new class10526(this, arraylist));
      arraylist.add(Pair.of("fullscreenResolution", String.valueOf(this.U)));
      arraylist.add(Pair.of("glDebugVerbosity", this.j));
      arraylist.add(Pair.of("overrideHeight", this.s));
      arraylist.add(Pair.of("overrideWidth", this.P));
      arraylist.add(Pair.of("syncChunkWrites", this.NQ));
      arraylist.add(Pair.of("useNativeTransport", this.yF));
      arraylist.add(Pair.of("resourcePacks", this.Z));
      return arraylist.stream()
         .sorted(Comparator.comparing(Pair::getFirst))
         .map(var0 -> (String)var0.getFirst() + ": " + var0.getSecond())
         .collect(Collectors.joining(System.lineSeparator()));
   }

   public class04370<Boolean> Nz() {
      return this.Lb;
   }

   public class04370<Integer> G() {
      return this.yv;
   }

   public class04370<Boolean> Nm() {
      return this.Lw;
   }

   public class04370<Boolean> NZ() {
      return this.LT;
   }

   public class04370<Boolean> NR() {
      return this.LE;
   }

   public class04370<Boolean> Y() {
      return this.yw;
   }

   public class04370<Boolean> NB() {
      return this.LP;
   }

   public class04370<Double> NO() {
      return this.uy;
   }

   public class04370<Boolean> NL() {
      return this.LZ;
   }

   public class04370<Boolean> NN() {
      return this.LM;
   }

   public class04370<Boolean> NM() {
      return this.LW;
   }

   public File Nx() {
      return this.LF;
   }

   public class04370<Boolean> Nb() {
      return this.LI;
   }

   public class04370<Double> NQ() {
      return this.Lr;
   }

   private static void Nr() {
      class06202 class06202 = class06202.Nq();
      if (class06202.Nt() != null) {
         class06202.NU();
         class06202.V();
      }
   }

   public int Nh() {
      return this.Na > 0 ? Math.min(this.Nc.method_41753(), this.Na) : this.Nc.method_41753();
   }

   public class04370<class01315> NK() {
      return this.uE;
   }

   public class04370<Boolean> NG() {
      return this.LH;
   }

   public class04370<Boolean> Nt() {
      return this.Le;
   }

   public class04370<Boolean> NE() {
      return this.Ll;
   }

   public class04370<Boolean> Nv() {
      return this.Lo;
   }

   public class04370<Boolean> Nk() {
      return this.LS;
   }

   public class04370<Boolean> Ns() {
      return this.LY;
   }

   public class04370<Boolean> NU() {
      return this.Ln;
   }

   public class04370<Boolean> NW() {
      return this.Ld;
   }

   public class04370<Integer> Nn() {
      return this.LK;
   }

   public class01301 Nf() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class01301)callbackinforeturnable.getReturnValue() : this.ND.method_41753();
   }

   public class04370<Integer> Nw() {
      return this.Lf;
   }

   public class05455 NS() {
      return this.LA;
   }

   public void NH() {
      this.NY = false;
      this.Np();
   }

   @Nullable
   private String yL() {
      class08844 class08844 = this.Nt.Nt();
      if (class08844 == null) {
         return this.U;
      } else {
         return class08844.i().isPresent() ? class08844.i().get().M() : null;
      }
   }

   private void yy() {
      if (!this.NA) {
         this.Nf.method_41748(class01241.field_63461);
         class05096 class05096 = (class05096)this.Nt.v_3;
         if (class05096 instanceof class05914) {
            ((class05914)class05096).method_75370(this.Nf);
         }
      }
   }

   public class04370<class09021> Nc() {
      return this.us;
   }

   public class04370<Boolean> Ny() {
      return this.LB;
   }

   public void Np() {
      try (PrintWriter printwriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.LF), StandardCharsets.UTF_8))) {
         printwriter.println("version:" + class07529.y().comp_4026().y());
         this.N((class05603)(new class05606(this, printwriter)));
         String sx = this.yL();
         if (sx != null) {
            printwriter.println("fullscreenResolution:" + sx);
         }
      } catch (Exception exception) {
         N.error("Failed to save options", exception);
      }

      this.NA();
   }

   private static boolean yN() {
      return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
   }

   public class04370<String> Ne() {
      return this.um;
   }

   public class04370<Boolean> Nj() {
      return this.LJ;
   }

   public class04370<class06535> NX() {
      return this.uT;
   }

   public class03737 NF() {
      int ix = 0;

      for (class08030 class08030 : this.yY) {
         ix |= class08030.N();
      }

      return new class03737(
         this.Nk,
         this.Nc.method_41753(),
         this.yP.method_41753(),
         this.Lu.method_41753(),
         ix,
         this.yQ.method_41753(),
         this.Nt.yi(),
         this.LT.method_41753(),
         this.uE.method_41753()
      );
   }

   public class04370<Double> Ng() {
      return this.uu;
   }

   public class04370<Double> NJ() {
      return this.uB;
   }

   public class04370<Double> NI() {
      return this.uR;
   }

   public class04370<class01299> NV() {
      return this.uW;
   }

   public class04370<Integer> Nq() {
      return this.uU;
   }

   public boolean NC() {
      return this.yF;
   }

   public void Na() {
      this.N(null);
      this.y(null);

      label40: {
         try {
            if (!this.LF.exists()) {
               break label40;
            }

            class07001 class07001x = new class07001();

            try (BufferedReader bufferedreader = Files.newReader(this.LF, StandardCharsets.UTF_8)) {
               bufferedreader.lines().forEach(var1x -> {
                  try {
                     Iterator iterator = NI.split(var1x).iterator();
                     class07001x.N_67((String)iterator.next(), (String)iterator.next());
                  } catch (Exception exceptionx) {
                     N.warn("Skipping bad option: {}", var1x);
                  }
               });
            }

            class07001 class07001x = this.N(class07001x);
            this.N((class05603)(new class05590(this, class07001x)));
            class07001x.Z("fullscreenResolution").ifPresent(var1x -> this.U = var1x);
            class06428.i();
         } catch (Exception exception) {
            N.error("Failed to load options", exception);
         }

         this.L(null);
         return;
      }

      this.L(null);
   }
}
