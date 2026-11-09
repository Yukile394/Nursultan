package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class05911 {
   public static final class01894 N = class01894.y("textures/atlas/shulker_boxes.png");
   public static final class01894 y = class01894.y("textures/atlas/beds.png");
   public static final class01894 L = class01894.y("textures/atlas/banner_patterns.png");
   public static final class01894 u = class01894.y("textures/atlas/shield_patterns.png");
   public static final class01894 i = class01894.y("textures/atlas/signs.png");
   public static final class01894 R = class01894.y("textures/atlas/chest.png");
   public static final class01894 M = class01894.y("textures/atlas/armor_trims.png");
   public static final class01894 B = class01894.y("textures/atlas/decorated_pot.png");
   public static final class01894 Z = class01894.y("textures/atlas/gui.png");
   public static final class01894 z = class01894.y("textures/atlas/map_decorations.png");
   public static final class01894 U = class01894.y("textures/atlas/paintings.png");
   public static final class01894 E = class01894.y("textures/atlas/celestials.png");
   private static final class07311 NL = class06851.M(N);
   private static final class07311 Nu = class06851.u(y);
   private static final class07311 Ni = class06851.m(L);
   private static final class07311 NR = class06851.m(u);
   private static final class07311 NM = class06851.M(i);
   private static final class07311 NB = class06851.R(R);
   private static final class07311 NZ = class06851.N(M);
   private static final class07311 Nz = class06851.y(M);
   private static final class07311 NU = class06851.u(class08626.N);
   private static final class07311 NE = class06851.R(class08626.N);
   private static final class07311 NW = class06851.Z(class08626.N);
   private static final class07311 Nm = class06851.Z(class08626.y);
   public static final class08571 W = new class08571(class08626.y, "item");
   public static final class08571 m = new class08571(class08626.N, "block");
   public static final class08571 P = new class08571(class08626.N, "entity");
   public static final class08571 s = new class08571(L, "entity/banner");
   public static final class08571 T = new class08571(u, "entity/shield");
   public static final class08571 b = new class08571(R, "entity/chest");
   public static final class08571 j = new class08571(B, "entity/decorated_pot");
   public static final class08571 v = new class08571(y, "entity/bed");
   public static final class08571 n = new class08571(N, "entity/shulker");
   public static final class08571 t = new class08571(i, "entity/signs");
   public static final class08571 G = new class08571(i, "entity/signs/hanging");
   public static final class05913 l = n.N("shulker");
   public static final List<class05913> d = Arrays.stream(class06563.values())
      .sorted(Comparator.comparingInt(class06563::N))
      .map(class05911::R)
      .collect(ImmutableList.toImmutableList());
   public static final Map<class05904, class05913> w = class05904.N().collect(Collectors.toMap(Function.identity(), class05911::L));
   public static final Map<class05904, class05913> k = class05904.N().collect(Collectors.toMap(Function.identity(), class05911::u));
   public static final class05913 Y = s.N("base");
   public static final class05913 Q = T.N("base");
   private static final Map<class01894, class05913> NP = new HashMap<>();
   private static final Map<class01894, class05913> Ns = new HashMap<>();
   public static final Map<class05946<class02246>, class05913> O = class04206.NZ.z().collect(Collectors.toMap(class03529::B, var0 -> j.N(var0.N().N())));
   public static final class05913 g = j.N("decorated_pot_base");
   public static final class05913 I = j.N("decorated_pot_side");
   private static final class05913[] NT = Arrays.stream(class06563.values())
      .sorted(Comparator.comparingInt(class06563::N))
      .map(class05911::L)
      .toArray(class05913[]::new);
   public static final class05913 J = b.N("trapped");
   public static final class05913 o = b.N("trapped_left");
   public static final class05913 q = b.N("trapped_right");
   public static final class05913 K = b.N("christmas");
   public static final class05913 V = b.N("christmas_left");
   public static final class05913 e = b.N("christmas_right");
   public static final class05913 H = b.N("normal");
   public static final class05913 c = b.N("normal_left");
   public static final class05913 X = b.N("normal_right");
   public static final class05913 a = b.N("ender");
   public static final class05913 p = b.N("copper");
   public static final class05913 F = b.N("copper_left");
   public static final class05913 A = b.N("copper_right");
   public static final class05913 f = b.N("copper_exposed");
   public static final class05913 C = b.N("copper_exposed_left");
   public static final class05913 S = b.N("copper_exposed_right");
   public static final class05913 x = b.N("copper_weathered");
   public static final class05913 D = b.N("copper_weathered_left");
   public static final class05913 h = b.N("copper_weathered_right");
   public static final class05913 r = b.N("copper_oxidized");
   public static final class05913 NN = b.N("copper_oxidized_left");
   public static final class05913 Ny = b.N("copper_oxidized_right");

   public static class05913 L(class06563 var0) {
      return v.N(y(var0));
   }

   private static class05913 L(class05904 var0) {
      return N(t, var0.y());
   }

   public static class07311 L() {
      return Nu;
   }

   public static class07311 M() {
      return NB;
   }

   public class05911() {
      super();
   }

   public static class07311 B() {
      return NU;
   }

   public static class07311 Z() {
      return NE;
   }

   public static class01894 i(class06563 var0) {
      return class01894.y("shulker_" + var0.y());
   }

   public static class07311 i() {
      return NM;
   }

   public static class07311 U() {
      return NW;
   }

   public static class07311 z() {
      return Nm;
   }

   private static class05913 u(class05904 var0) {
      return y(G, var0.y());
   }

   public static class07311 u() {
      return NL;
   }

   public static class05913 u(class06563 var0) {
      return d.get(var0.N());
   }

   public static class07311 y() {
      return NR;
   }

   public static class05913 y(class03556<class00412> var0) {
      return Ns.computeIfAbsent(((class00412)var0.N()).N(), T::N);
   }

   public static class05913 y(class05904 var0) {
      return k.get(var0);
   }

   private static class05913 y(class08571 var0, String var1) {
      return var0.N(class01894.N(var1));
   }

   public static class01894 y(class06563 var0) {
      return class01894.y(var0.y());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static class05913 N(class06638 var0, class05913 var1, class05913 var2, class05913 var3) {
      switch (var0) {
         case field_12574:
            return var2;
         case field_12571:
            return var3;
         case field_12569:
         default:
            return var1;
      }
   }

   public static class07311 N(boolean var0) {
      return var0 ? Nz : NZ;
   }

   private static class05913 N(class08571 var0, String var1) {
      return var0.N(class01894.N(var1));
   }

   private static void N(CallbackInfo var0) {
      SignTypeTextureHelper.shouldAddTextures = true;
   }

   public static class07311 N() {
      return Ni;
   }

   public static class05913 N(class06563 var0) {
      return NT[var0.N()];
   }

   public static class05913 N(class05904 var0) {
      return w.get(var0);
   }

   public static class05913 N(class03556<class00412> var0) {
      return NP.computeIfAbsent(((class00412)var0.N()).N(), s::N);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class05913 N(class00959 var0, class06638 var1) {
      return switch (var0) {
         case field_62697 -> a;
         case field_62698 -> N(var1, K, V, e);
         case field_62699 -> N(var1, J, o, q);
         case field_62700 -> N(var1, p, F, A);
         case field_62701 -> N(var1, f, C, S);
         case field_62702 -> N(var1, x, D, h);
         case field_62703 -> N(var1, r, NN, Ny);
         case field_62704 -> N(var1, H, c, X);
      };
   }

   @Nullable
   public static class05913 N(@Nullable class05946<class02246> var0) {
      return var0 == null ? null : O.get(var0);
   }

   public static class05913 R(class06563 var0) {
      return n.N(i(var0));
   }

   public static class07311 R() {
      return NM;
   }
}
