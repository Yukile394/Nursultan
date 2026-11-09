package minecraft;

import org.jspecify.annotations.Nullable;

public record class07066(class07072 source, float damage, class04192 fallLocation, float fallDistance) {
   @Nullable
   public class04192 L() {
      return this.fallLocation;
   }

   public class07066(class07072 source, float damage, @Nullable class04192 fallLocation, float fallDistance) {
      super();
      this.source = source;
      this.damage = damage;
      this.fallLocation = fallLocation;
      this.fallDistance = fallDistance;
   }

   public float u() {
      return this.fallDistance;
   }

   public float y() {
      return this.damage;
   }

   public class07072 N() {
      return this.source;
   }
}
