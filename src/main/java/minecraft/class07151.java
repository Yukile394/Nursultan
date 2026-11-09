package minecraft;

import Nursultan.class10420;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;

public record class07151(
   Optional<class01894> parent,
   Optional<class06513> display,
   class07499 rewards,
   Map<String, class06915<?>> criteria,
   class03753 requirements,
   boolean sendsTelemetryEvent,
   Optional<class00392> name
) {
   private static final Codec<Map<String, class06915<?>>> z = Codec.unboundedMap(Codec.STRING, class06915.N)
      .validate(var0 -> var0.isEmpty() ? DataResult.error(() -> "Advancement criteria cannot be empty") : DataResult.success(var0));
   public static final Codec<class07151> N = RecordCodecBuilder.create(
         var0 -> var0.group(
               class01894.N.optionalFieldOf("parent").forGetter(class07151::y),
               class06513.N.optionalFieldOf("display").forGetter(class07151::L),
               class07499.N.optionalFieldOf("rewards", class07499.y).forGetter(class07151::u),
               z.fieldOf("criteria").forGetter(class07151::i),
               class03753.N.optionalFieldOf("requirements").forGetter(var0x -> Optional.of(var0x.R())),
               Codec.BOOL.optionalFieldOf("sends_telemetry_event", false).forGetter(class07151::M)
            )
            .apply(var0, (var0x, var1, var2, var3, var4, var5) -> {
               class03753 class03753 = var4.orElseGet(() -> class03753.N(var3.keySet()));
               return new class07151(var0x, var1, var2, var3, class03753, var5);
            })
      )
      .validate(class07151::N);
   public static final class02362<class04247, class07151> y = class02362.N_34(class07151::N, class07151::y);

   public Optional<class06513> L() {
      return this.display;
   }

   public boolean M() {
      return this.sendsTelemetryEvent;
   }

   public class07151(
      Optional<class01894> parent,
      Optional<class06513> display,
      class07499 rewards,
      Map<String, class06915<?>> criteria,
      class03753 requirements,
      boolean sendsTelemetryEvent,
      Optional<class00392> name
   ) {
      this.parent = parent;
      this.display = display;
      this.rewards = rewards;
      this.criteria = criteria;
      this.requirements = requirements;
      this.sendsTelemetryEvent = sendsTelemetryEvent;
      this.name = name;
   }

   public class07151(Optional<class01894> var1, Optional<class06513> var2, class07499 var3, Map<String, class06915<?>> var4, class03753 var5, boolean var6) {
      this(var1, var2, var3, Map.copyOf(var4), var5, var6, var2.map(class07151::N));
   }

   public Optional<class00392> B() {
      return this.name;
   }

   public Map<String, class06915<?>> i() {
      return this.criteria;
   }

   public class07499 u() {
      return this.rewards;
   }

   private static class07151 y(class04247 var0) {
      return new class07151(
         var0.y(class00667::T),
         (Optional<class06513>)class06513.y.N_33(class02389::N).decode(var0),
         class07499.y,
         Map.of(),
         new class03753(var0),
         var0.readBoolean()
      );
   }

   public Optional<class01894> y() {
      return this.parent;
   }

   private void N(class04247 var1) {
      var1.N_13(this.parent, class00667::N);
      class06513.y.N_33(class02389::N).encode(var1, this.display);
      this.requirements.N(var1);
      var1.writeBoolean(this.sendsTelemetryEvent);
   }

   private static class00392 N(class06513 var0) {
      class00392 class00392 = var0.N();
      class06541 class06541 = var0.i().N();
      class05216 class05216 = class00390.N(class00392.L(), class00405.N.N(class06541)).i("\n").y(var0.y());
      return class00390.N((class00392)class00392.L().N(var1x -> var1x.N(new class00401(class05216)))).N(class06541);
   }

   public static class00392 N(class03711 var0) {
      return var0.y().B().orElseGet(() -> class00392.y(var0.N().toString()));
   }

   public void N(class04490 var1, class02063 var2) {
      this.criteria.forEach((var2x, var3) -> {
         class04492 class04492 = new class04492(var1.N_46(new class10420(var2x)), var2);
         var3.y().N(class04492);
      });
   }

   public boolean N() {
      return this.parent.isEmpty();
   }

   private static DataResult<class07151> N(class07151 var0) {
      return var0.R().N(var0.i().keySet()).map(var1 -> var0);
   }

   public class03753 R() {
      return this.requirements;
   }
}
