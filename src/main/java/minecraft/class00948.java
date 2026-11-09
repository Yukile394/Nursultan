package minecraft;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.function.TriFunction;

public record class00948(
   class00891 unaffected,
   class00891 exposed,
   class00891 weathered,
   class00891 oxidized,
   class00891 waxed,
   class00891 waxedExposed,
   class00891 waxedWeathered,
   class00891 waxedOxidized
) {
   public ImmutableList<class00891> L() {
      return ImmutableList.of(
         this.unaffected, this.waxed, this.exposed, this.waxedExposed, this.weathered, this.waxedWeathered, this.oxidized, this.waxedOxidized
      );
   }

   public class00891 M() {
      return this.oxidized;
   }

   public class00948(
      class00891 unaffected,
      class00891 exposed,
      class00891 weathered,
      class00891 oxidized,
      class00891 waxed,
      class00891 waxedExposed,
      class00891 waxedWeathered,
      class00891 waxedOxidized
   ) {
      this.unaffected = unaffected;
      this.exposed = exposed;
      this.weathered = weathered;
      this.oxidized = oxidized;
      this.waxed = waxed;
      this.waxedExposed = waxedExposed;
      this.waxedWeathered = waxedWeathered;
      this.waxedOxidized = waxedOxidized;
   }

   public class00891 B() {
      return this.waxed;
   }

   public class00891 Z() {
      return this.waxedExposed;
   }

   public class00891 i() {
      return this.exposed;
   }

   public class00891 U() {
      return this.waxedOxidized;
   }

   public class00891 z() {
      return this.waxedWeathered;
   }

   public class00891 u() {
      return this.unaffected;
   }

   public ImmutableBiMap<class00891, class00891> y() {
      return ImmutableBiMap.of(
         this.unaffected, this.waxed, this.exposed, this.waxedExposed, this.weathered, this.waxedWeathered, this.oxidized, this.waxedOxidized
      );
   }

   public static <WaxedBlock extends class00891, WeatheringBlock extends class00891 & class02674> class00948 N(
      String var0,
      TriFunction<String, Function<class01362, class00891>, class01362, class00891> var1,
      Function<class01362, WaxedBlock> var2,
      BiFunction<class02774, class01362, WeatheringBlock> var3,
      Function<class02774, class01362> var4
   ) {
      return new class00948(
         (class00891)var1.apply(
            var0, (Function)var1x -> (class00891)var3.apply(class02774.field_28704, var1x), (class01362)var4.apply(class02774.field_28704)
         ),
         (class00891)var1.apply(
            "exposed_" + var0,
            (Function)var1x -> (class00891)var3.apply(class02774.field_28705, var1x),
            (class01362)var4.apply(class02774.field_28705)
         ),
         (class00891)var1.apply(
            "weathered_" + var0,
            (Function)var1x -> (class00891)var3.apply(class02774.field_28706, var1x),
            (class01362)var4.apply(class02774.field_28706)
         ),
         (class00891)var1.apply(
            "oxidized_" + var0,
            (Function)var1x -> (class00891)var3.apply(class02774.field_28707, var1x),
            (class01362)var4.apply(class02774.field_28707)
         ),
         (class00891)var1.apply("waxed_" + var0, var2::apply, (class01362)var4.apply(class02774.field_28704)),
         (class00891)var1.apply("waxed_exposed_" + var0, var2::apply, (class01362)var4.apply(class02774.field_28705)),
         (class00891)var1.apply("waxed_weathered_" + var0, var2::apply, (class01362)var4.apply(class02774.field_28706)),
         (class00891)var1.apply("waxed_oxidized_" + var0, var2::apply, (class01362)var4.apply(class02774.field_28707))
      );
   }

   public void N(Consumer<class00891> var1) {
      var1.accept(this.unaffected);
      var1.accept(this.exposed);
      var1.accept(this.weathered);
      var1.accept(this.oxidized);
      var1.accept(this.waxed);
      var1.accept(this.waxedExposed);
      var1.accept(this.waxedWeathered);
      var1.accept(this.waxedOxidized);
   }

   public ImmutableBiMap<class00891, class00891> N() {
      return ImmutableBiMap.of(this.unaffected, this.exposed, this.exposed, this.weathered, this.weathered, this.oxidized);
   }

   public class00891 R() {
      return this.weathered;
   }
}
