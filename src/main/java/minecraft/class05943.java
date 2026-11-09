package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class05943(
   class05967 noiseSettings,
   class00500 defaultBlock,
   class00500 defaultFluid,
   class03866 noiseRouter,
   class03028 surfaceRule,
   List<class03229> spawnTarget,
   int seaLevel,
   boolean disableMobGeneration,
   boolean aquifersEnabled,
   boolean oreVeinsEnabled,
   boolean useLegacyRandomSource
) {
   public static final Codec<class05943> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class05967.N.fieldOf("noise").forGetter(class05943::R),
            class00500.N.fieldOf("default_block").forGetter(class05943::M),
            class00500.N.fieldOf("default_fluid").forGetter(class05943::B),
            class03866.N.fieldOf("noise_router").forGetter(class05943::Z),
            class03028.y.fieldOf("surface_rule").forGetter(class05943::z),
            class03229.N.listOf().fieldOf("spawn_target").forGetter(class05943::U),
            Codec.INT.fieldOf("sea_level").forGetter(class05943::E),
            Codec.BOOL.fieldOf("disable_mob_generation").forGetter(class05943::N),
            Codec.BOOL.fieldOf("aquifers_enabled").forGetter(class05943::y),
            Codec.BOOL.fieldOf("ore_veins_enabled").forGetter(class05943::L),
            Codec.BOOL.fieldOf("legacy_random_source").forGetter(class05943::m)
         )
         .apply(var0, class05943::new)
   );
   public static final Codec<class03556<class05943>> y = class01281.N(class04227.yE, N);
   public static final class05946<class05943> L = class05946.N(class04227.yE, class01894.y("overworld"));
   public static final class05946<class05943> u = class05946.N(class04227.yE, class01894.y("large_biomes"));
   public static final class05946<class05943> i = class05946.N(class04227.yE, class01894.y("amplified"));
   public static final class05946<class05943> R = class05946.N(class04227.yE, class01894.y("nether"));
   public static final class05946<class05943> M = class05946.N(class04227.yE, class01894.y("end"));
   public static final class05946<class05943> B = class05946.N(class04227.yE, class01894.y("caves"));
   public static final class05946<class05943> Z = class05946.N(class04227.yE, class01894.y("floating_islands"));

   private static class05943 L(class04116<?> var0) {
      return new class05943(
         class05967.L,
         class00869.id.W(),
         class00869.V.W(),
         class03882.N(var0.N(class04227.yy), var0.N(class04227.yW)),
         class03012.y(),
         List.of(),
         32,
         false,
         false,
         false,
         true
      );
   }

   public boolean L() {
      return this.oreVeinsEnabled && !class07529.Ng;
   }

   public class00500 M() {
      return this.defaultBlock;
   }

   public class05943(
      class05967 noiseSettings,
      class00500 defaultBlock,
      class00500 defaultFluid,
      class03866 noiseRouter,
      class03028 surfaceRule,
      List<class03229> spawnTarget,
      int seaLevel,
      boolean disableMobGeneration,
      boolean aquifersEnabled,
      boolean oreVeinsEnabled,
      boolean useLegacyRandomSource
   ) {
      this.noiseSettings = noiseSettings;
      this.defaultBlock = defaultBlock;
      this.defaultFluid = defaultFluid;
      this.noiseRouter = noiseRouter;
      this.surfaceRule = surfaceRule;
      this.spawnTarget = spawnTarget;
      this.seaLevel = seaLevel;
      this.disableMobGeneration = disableMobGeneration;
      this.aquifersEnabled = aquifersEnabled;
      this.oreVeinsEnabled = oreVeinsEnabled;
      this.useLegacyRandomSource = useLegacyRandomSource;
   }

   public class00500 B() {
      return this.defaultFluid;
   }

   public class03866 Z() {
      return this.noiseRouter;
   }

   public static class05943 i() {
      return new class05943(class05967.y, class00869.y.W(), class00869.N.W(), class03882.N(), class03012.u(), List.of(), 63, true, false, false, false);
   }

   private static class05943 i(class04116<?> var0) {
      return new class05943(
         class05967.R,
         class00869.y.W(),
         class00869.K.W(),
         class03882.L(var0.N(class04227.yy), var0.N(class04227.yW)),
         class03012.N(false, false, false),
         List.of(),
         -64,
         false,
         false,
         false,
         true
      );
   }

   public boolean m() {
      return this.useLegacyRandomSource;
   }

   public List<class03229> U() {
      return this.spawnTarget;
   }

   public class03028 z() {
      return this.surfaceRule;
   }

   public class07813 u() {
      return this.useLegacyRandomSource ? class07813.field_35142 : class07813.field_35143;
   }

   private static class05943 u(class04116<?> var0) {
      return new class05943(
         class05967.i,
         class00869.y.W(),
         class00869.K.W(),
         class03882.y(var0.N(class04227.yy), var0.N(class04227.yW)),
         class03012.N(false, true, true),
         List.of(),
         32,
         false,
         false,
         false,
         true
      );
   }

   public boolean y() {
      return this.aquifersEnabled && !class07529.Nw;
   }

   private static class05943 y(class04116<?> var0) {
      return new class05943(
         class05967.u, class00869.MP.W(), class00869.N.W(), class03882.N(var0.N(class04227.yy)), class03012.L(), List.of(), 0, true, false, false, true
      );
   }

   public int E() {
      return this.seaLevel;
   }

   private static class05943 N(class04116<?> var0, boolean var1, boolean var2) {
      return new class05943(
         class05967.y,
         class00869.y.W(),
         class00869.K.W(),
         class03882.N(var0.N(class04227.yy), var0.N(class04227.yW), var2, var1),
         class03012.N(),
         new class01835().N(),
         63,
         false,
         true,
         true,
         false
      );
   }

   public static void N(class04116<class05943> var0) {
      var0.N(L, N(var0, false, false));
      var0.N(u, N(var0, false, true));
      var0.N(i, N(var0, true, false));
      var0.N(R, L(var0));
      var0.N(M, y(var0));
      var0.N(B, u(var0));
      var0.N(Z, i(var0));
   }

   @Deprecated
   public boolean N() {
      return this.disableMobGeneration;
   }

   public boolean W() {
      return this.aquifersEnabled;
   }

   public class05967 R() {
      return this.noiseSettings;
   }
}
