package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Function;

public record class00195<EnvironmentType>(
   EnvironmentType environment,
   class01894 structure,
   int maxTicks,
   int setupTicks,
   boolean required,
   class06993 rotation,
   boolean manualOnly,
   int maxAttempts,
   int requiredSuccesses,
   boolean skyAccess
) {
   public static final MapCodec<class00195<class03556<class00225>>> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00225.y.fieldOf("environment").forGetter(class00195::N),
            class01894.N.fieldOf("structure").forGetter(class00195::y),
            class06338.b.fieldOf("max_ticks").forGetter(class00195::L),
            class06338.T.optionalFieldOf("setup_ticks", 0).forGetter(class00195::u),
            Codec.BOOL.optionalFieldOf("required", true).forGetter(class00195::i),
            class06993.field_39313.optionalFieldOf("rotation", class06993.field_11467).forGetter(class00195::R),
            Codec.BOOL.optionalFieldOf("manual_only", false).forGetter(class00195::M),
            class06338.b.optionalFieldOf("max_attempts", 1).forGetter(class00195::B),
            class06338.b.optionalFieldOf("required_successes", 1).forGetter(class00195::Z),
            Codec.BOOL.optionalFieldOf("sky_access", false).forGetter(class00195::z)
         )
         .apply(var0, class00195::new)
   );

   public int L() {
      return this.maxTicks;
   }

   public boolean M() {
      return this.manualOnly;
   }

   public class00195(EnvironmentType var1, class01894 var2, int var3, int var4, boolean var5, class06993 var6) {
      this((EnvironmentType)var1, var2, var3, var4, var5, var6, false, 1, 1, false);
   }

   public class00195(
      EnvironmentType environment,
      class01894 structure,
      int maxTicks,
      int setupTicks,
      boolean required,
      class06993 rotation,
      boolean manualOnly,
      int maxAttempts,
      int requiredSuccesses,
      boolean skyAccess
   ) {
      super();
      this.environment = (EnvironmentType)environment;
      this.structure = structure;
      this.maxTicks = maxTicks;
      this.setupTicks = setupTicks;
      this.required = required;
      this.rotation = rotation;
      this.manualOnly = manualOnly;
      this.maxAttempts = maxAttempts;
      this.requiredSuccesses = requiredSuccesses;
      this.skyAccess = skyAccess;
   }

   public class00195(EnvironmentType var1, class01894 var2, int var3, int var4, boolean var5) {
      this((EnvironmentType)var1, var2, var3, var4, var5, class06993.field_11467);
   }

   public int B() {
      return this.maxAttempts;
   }

   public int Z() {
      return this.requiredSuccesses;
   }

   public boolean i() {
      return this.required;
   }

   public boolean z() {
      return this.skyAccess;
   }

   public int u() {
      return this.setupTicks;
   }

   public class01894 y() {
      return this.structure;
   }

   public <T> class00195<T> N(Function<EnvironmentType, T> var1) {
      return (class00195<T>)(new class00195<>(
         var1.apply(this.environment),
         this.structure,
         this.maxTicks,
         this.setupTicks,
         this.required,
         this.rotation,
         this.manualOnly,
         this.maxAttempts,
         this.requiredSuccesses,
         this.skyAccess
      ));
   }

   public EnvironmentType N() {
      return this.environment;
   }

   public class06993 R() {
      return this.rotation;
   }
}
