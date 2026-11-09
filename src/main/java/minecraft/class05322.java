package minecraft;

import java.util.Optional;

public record class05322(class06584 primaryIcon, Optional<class06584> secondaryIcon, class00242 category) {
   public class00242 L() {
      return this.category;
   }

   public class05322(class00296 var1) {
      this(new class06584(class06570.jJ), Optional.empty(), var1);
   }

   public class05322(class06584 primaryIcon, Optional<class06584> secondaryIcon, class00242 category) {
      super();
      this.primaryIcon = primaryIcon;
      this.secondaryIcon = secondaryIcon;
      this.category = category;
   }

   public class05322(class06581 var1, class06581 var2, class00305 var3) {
      this(new class06584(var1), Optional.of(new class06584(var2)), var3);
   }

   public class05322(class06581 var1, class00305 var2) {
      this(new class06584(var1), Optional.empty(), var2);
   }

   public Optional<class06584> y() {
      return this.secondaryIcon;
   }

   public class06584 N() {
      return this.primaryIcon;
   }
}
