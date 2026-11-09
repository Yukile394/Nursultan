package minecraft;

import com.google.common.collect.ImmutableBiMap;
import java.util.function.Consumer;
import java.util.function.Function;

public record class08129(
   class06581 unaffected,
   class06581 exposed,
   class06581 weathered,
   class06581 oxidized,
   class06581 waxed,
   class06581 waxedExposed,
   class06581 waxedWeathered,
   class06581 waxedOxidized
) {
   public class06581 L() {
      return this.exposed;
   }

   public class06581 M() {
      return this.waxedExposed;
   }

   public class08129(
      class06581 unaffected,
      class06581 exposed,
      class06581 weathered,
      class06581 oxidized,
      class06581 waxed,
      class06581 waxedExposed,
      class06581 waxedWeathered,
      class06581 waxedOxidized
   ) {
      super();
      this.unaffected = unaffected;
      this.exposed = exposed;
      this.weathered = weathered;
      this.oxidized = oxidized;
      this.waxed = waxed;
      this.waxedExposed = waxedExposed;
      this.waxedWeathered = waxedWeathered;
      this.waxedOxidized = waxedOxidized;
   }

   public class06581 B() {
      return this.waxedWeathered;
   }

   public class06581 Z() {
      return this.waxedOxidized;
   }

   public class06581 i() {
      return this.oxidized;
   }

   public class06581 u() {
      return this.weathered;
   }

   public class06581 y() {
      return this.unaffected;
   }

   public static class08129 N(class00948 var0, Function<class00891, class06581> var1) {
      return new class08129(
         (class06581)var1.apply(var0.u()),
         (class06581)var1.apply(var0.i()),
         (class06581)var1.apply(var0.R()),
         (class06581)var1.apply(var0.M()),
         (class06581)var1.apply(var0.B()),
         (class06581)var1.apply(var0.Z()),
         (class06581)var1.apply(var0.z()),
         (class06581)var1.apply(var0.U())
      );
   }

   public ImmutableBiMap<class06581, class06581> N() {
      return ImmutableBiMap.of(
         this.unaffected, this.waxed, this.exposed, this.waxedExposed, this.weathered, this.waxedWeathered, this.oxidized, this.waxedOxidized
      );
   }

   public void N(Consumer<class06581> var1) {
      var1.accept(this.unaffected);
      var1.accept(this.exposed);
      var1.accept(this.weathered);
      var1.accept(this.oxidized);
      var1.accept(this.waxed);
      var1.accept(this.waxedExposed);
      var1.accept(this.waxedWeathered);
      var1.accept(this.waxedOxidized);
   }

   public class06581 R() {
      return this.waxed;
   }
}
