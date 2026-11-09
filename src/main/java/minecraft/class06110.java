package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class06110(
   Optional<class00845> head,
   Optional<class00845> chest,
   Optional<class00845> legs,
   Optional<class00845> feet,
   Optional<class00845> body,
   Optional<class00845> mainhand,
   Optional<class00845> offhand
) {
   public static final Codec<class06110> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00845.N.optionalFieldOf("head").forGetter(class06110::N),
            class00845.N.optionalFieldOf("chest").forGetter(class06110::y),
            class00845.N.optionalFieldOf("legs").forGetter(class06110::L),
            class00845.N.optionalFieldOf("feet").forGetter(class06110::u),
            class00845.N.optionalFieldOf("body").forGetter(class06110::i),
            class00845.N.optionalFieldOf("mainhand").forGetter(class06110::R),
            class00845.N.optionalFieldOf("offhand").forGetter(class06110::M)
         )
         .apply(var0, class06110::new)
   );

   public Optional<class00845> L() {
      return this.legs;
   }

   public Optional<class00845> M() {
      return this.offhand;
   }

   public class06110(
      Optional<class00845> head,
      Optional<class00845> chest,
      Optional<class00845> legs,
      Optional<class00845> feet,
      Optional<class00845> body,
      Optional<class00845> mainhand,
      Optional<class00845> offhand
   ) {
      this.head = head;
      this.chest = chest;
      this.legs = legs;
      this.feet = feet;
      this.body = body;
      this.mainhand = mainhand;
      this.offhand = offhand;
   }

   public Optional<class00845> i() {
      return this.body;
   }

   public Optional<class00845> u() {
      return this.feet;
   }

   public Optional<class00845> y() {
      return this.chest;
   }

   public static class06110 N(class02055<class06581> var0, class02055<class00412> var1) {
      return class06124.N()
         .N(class00837.N().N(var0, class06570.li).N(class00159.N().N(class02471.N(class04877.N(var1).y(), class02484.Nv, class02484.U)).y()))
         .y();
   }

   public boolean N(@Nullable class07049 var1) {
      if (var1 instanceof class07438 class07438) {
         if (this.head.isPresent() && !this.head.get().test(class07438.method_6118(class07085.field_6169))) {
            return false;
         } else if (this.chest.isPresent() && !this.chest.get().test(class07438.method_6118(class07085.field_6174))) {
            return false;
         } else if (this.legs.isPresent() && !this.legs.get().test(class07438.method_6118(class07085.field_6172))) {
            return false;
         } else if (this.feet.isPresent() && !this.feet.get().test(class07438.method_6118(class07085.field_6166))) {
            return false;
         } else if (this.body.isPresent() && !this.body.get().test(class07438.method_6118(class07085.field_48824))) {
            return false;
         } else {
            return this.mainhand.isPresent() && !this.mainhand.get().test(class07438.method_6118(class07085.field_6173))
               ? false
               : !this.offhand.isPresent() || this.offhand.get().test(class07438.method_6118(class07085.field_6171));
         }
      } else {
         return false;
      }
   }

   public Optional<class00845> N() {
      return this.head;
   }

   public Optional<class00845> R() {
      return this.mainhand;
   }
}
