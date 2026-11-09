package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public record class00295(class00329 id, class00265 display, OptionalInt group, class00305 category, Optional<List<class06510>> craftingRequirements) {
   public static final class02362<class04247, class00295> N = class02362.N(
      class00329.N,
      class00295::N,
      class00265.i,
      class00295::y,
      class02389.Z,
      class00295::L,
      class02389.N(class04227.Nm),
      class00295::u,
      class06510.field_48355.N_33(class02389.N()).N_33(class02389::N),
      class00295::i,
      class00295::new
   );

   public OptionalInt L() {
      return this.group;
   }

   public class00295(class00329 id, class00265 display, OptionalInt group, class00305 category, Optional<List<class06510>> craftingRequirements) {
      super();
      this.id = id;
      this.display = display;
      this.group = group;
      this.category = category;
      this.craftingRequirements = craftingRequirements;
   }

   public Optional<List<class06510>> i() {
      return this.craftingRequirements;
   }

   public class00305 u() {
      return this.category;
   }

   public class00265 y() {
      return this.display;
   }

   public class00329 N() {
      return this.id;
   }

   public boolean N(class02741 var1) {
      return this.craftingRequirements.isEmpty() ? false : var1.N(this.craftingRequirements.get(), null);
   }

   public List<class06584> N(class00311 var1) {
      return this.display.u().N(var1);
   }
}
